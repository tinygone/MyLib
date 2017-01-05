package com.ty.prop.scan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.common.IDUtil;
import com.ty.prop.scan.dao.AMapper;
import com.ty.prop.scan.domain.A;

@Component
public class ScanService {
    @Autowired
    AMapper aMapper;

    public void insert() {
        A a = new A();
        a.setaId(IDUtil.generateUUID());
        aMapper.insert(a);
    }
}
