package com.easyway.covid19.service;

import com.easyway.covid19.model.Records;

import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.List;

public interface Covid19Service {
    Response getUserByUserName(String userName, String password);

    Response addUserInfo(String userInfo);

    Response logout(String userSessionToken);

    Response addRecordsDetails(String recordsInfo) throws IOException;

    Response updateRecordsDetailsByState(String recordsString);

    Response getRecordDetailsByState(String state);

    Response getAllRecordDetails() throws Exception;

}
