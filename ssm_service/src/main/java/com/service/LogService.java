package com.service;

import com.domain.Log;

import java.util.List;

public interface LogService {
     void insertLog(Log log);
     List<Log> findLogAll();
}
