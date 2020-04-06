package com.service;

import com.domain.Mobile;
import com.domain.PageBean;

import java.util.List;
import java.util.Map;

public interface MobileService{
    List<Mobile> findAllPhone();

    PageBean<Mobile> findPhoneByPage(String currentPage, String rows, String mobile_made);

    Mobile findPhoneByVersion(String mobile_version);

    double newOrder(String username, Map<Integer, Mobile> map);
}
