package com.dao;

import com.domain.Log;

import java.util.List;

public interface LogDao {
    void insertLog(Log log);
    List<Log> findLogAll();
}
