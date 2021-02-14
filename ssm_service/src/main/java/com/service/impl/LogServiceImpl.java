package com.service.impl;

import com.dao.LogDao;
import com.domain.Log;
import com.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    LogDao logDao;

    @Override
    public void insertLog(Log log) {
        logDao.insertLog(log);
    }

    @Override
    public List<Log> findLogAll() {
        List<Log> logList=logDao.findLogAll();
        return logList;
    }
}
