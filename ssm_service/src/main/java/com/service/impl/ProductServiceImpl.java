package com.service.impl;

import com.dao.ProductDao;
import com.domain.PageBean;
import com.domain.Product;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    public List<Product> findAll() {
        List<Product> productList=this.productDao.findProductAll();
        return productList;
    }

    @Override
    public void insert(Product product) {
        productDao.insertProduct(product);
    }

    @Override
    public Product findById(Integer id) {
        return productDao.findById(id);
    }

    @Override
    public void update(Product product) {
        productDao.updateProduct(product);
    }

    @Override
    public void delById(Integer id) {
        productDao.delById(id);
    }

    @Override
    public void delSome(Integer[] ids) {
        if(ids !=null) {
            for (Integer id : ids) {
                productDao.delById(id);
            }
        }
    }

    @Override
    public PageBean<Product> findByPage(Integer currPage, Integer pageSize) {
        //创建PageBean
        PageBean<Product> pageBean=new PageBean<>();
        //封装PageBean

        //当前页面
        pageBean.setCurrPage(currPage);
        //每页条数
        pageBean.setPageSize(pageSize);
        //总条数
        Integer totalCount=productDao.findTotalCount();
        pageBean.setTotalCount(totalCount);
        //总页数
        pageBean.setTotalPage((int)Math.ceil(totalCount *1.0/pageSize));
        //页面展示的数据
        //mysql: limit m,n
        // m:每页起时索引 n:每页条数
        // 第一页 0
        // 第二页 5
        // 第三页  10
        // 第n页 （n-1）*5=(currPage -1)*pageSize
        //oracle的分页思路:先排序，作为表，再来生成行号，再作为表，再分页参数查询
        //rownum between 1 and 3;
        //          起时行号     结束行号
        //第一页       1           5
        //第二页       6           10
        //第三页       11           15
        //第n页       n*5-（5-1）    n*5
//        currPage * pageSize -(pageSize-1)
//      =currPage * pageSize -pageSize + 1
//      =pageSize *(currPage -1) +1
       List<Product> productList =productDao.findByPage((currPage -1)*pageSize,pageSize);
        pageBean.setList(productList);
       //        返回PageBean
        return pageBean;
    }


    //测试分页助手
    public void testPageHelper(Integer currPage ,Integer pageSize){
        //开始分页
        PageHelper.startPage(currPage,pageSize);
        //查询全部
        List<Product> productList=productDao.findProductAll();
//        System.out.println(productList.size());
//        创建PageInfo对象，相当于PageBean
//        参数1:把查询的数据传入构造方法
//        参数2:可以指定页面要显示的最多的页码数
        PageInfo<Product> pageInfo=new PageInfo<>(productList);
        System.out.println("总页数:"+pageInfo.getPages());
        System.out.println("总条数:"+pageInfo.getTotal());
        System.out.println("每页条数:"+pageInfo.getPageSize());
        System.out.println("当前页:"+pageInfo.getPageNum());
        System.out.println("数据:"+pageInfo.getList());
        System.out.println("上一页:"+pageInfo.getPrePage());
        System.out.println("下一页:"+pageInfo.getNextPage());
        System.out.println("是否第一页:"+pageInfo.isIsFirstPage());
        System.out.println("是否最后一页:"+pageInfo.isIsLastPage());
        System.out.println("页面上显示的第一个页码"+pageInfo.getNavigateFirstPage());
        System.out.println("页面上显示的最后一个页码"+pageInfo.getNavigateLastPage());
        System.out.println(pageInfo);
    }

    @Override
    public PageInfo<Product> findByPageHelper(Integer currPage, Integer pageSize) {
        //开始分页
        PageHelper.startPage(currPage,pageSize);
//        查询所有
        List<Product> productList=productDao.findProductAll();
//        创建PageInfo对象
        PageInfo<Product> pageInfo=new PageInfo<>(productList,5);
        return pageInfo;
    }

}
