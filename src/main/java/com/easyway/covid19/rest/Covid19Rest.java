package com.easyway.covid19.rest;


import com.easyway.covid19.model.*;
import com.easyway.covid19.model.ErrorCodeEnum;
import com.easyway.covid19.model.LoginResponse;
import com.easyway.covid19.model.UserResponse;
import com.easyway.covid19.model.UserSessionResponse;
import com.easyway.covid19.model.RecordsResponse;
import com.easyway.covid19.service.Covid19Service;
import com.easyway.covid19.util.Constants;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import static com.easyway.covid19.util.RestUtil.*;

@Path("/jpa")
public class Covid19Rest {

    private static final Logger LOGGER = Logger.getLogger(Covid19Rest.class);

    private Covid19Service covid19Service;

    @Inject
    public Covid19Rest(Covid19Service covid19Service) {
        this.covid19Service = covid19Service;
    }


    @POST
    @Path("/login")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public Response addLoginResponse(String loginRequest) {

        String userName = null;
        String password = null;
        try {
            if (StringUtils.isBlank(loginRequest)) {
                return processErrorResponse(new LoginResponse(), ErrorCodeEnum.REQUEST_INVALID, Constants.USER_NAME_IS_REQUIRED, LOGGER);
            }
            ObjectMapper objectMapper = new ObjectMapper();
            HashMap<String, String> map = objectMapper.readValue(loginRequest, HashMap.class);
            userName = map.get("userName");
            password = map.get("password");
            LOGGER.info("************* Adding Login response  ************" + userName + password);
            if (StringUtils.isNotBlank(userName) && (StringUtils.isNotBlank(password))) {
                return covid19Service.getUserByUserName(userName, password);
            } else {
                return processErrorResponseCode(new LoginResponse(), ErrorCodeEnum.REQUEST_INVALID, Constants.USER_NAME_IS_REQUIRED, LOGGER);
            }
        } catch (Exception e) {
            LOGGER.error(Constants.ADD_LOGIN_RESPONSE_API, e);
            return processErrorResponse(e, new LoginResponse(),
                    LOGGER);

        }
    }

    @POST
    @Path("/addUser")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public Response addUserRegistration(String userInfo) {

        LOGGER.info("#######userInfo Object is ####" + userInfo);
        try {
            if (StringUtils.isNotBlank(userInfo)) {
                return covid19Service.addUserInfo(userInfo);
            } else {
                return processErrorResponse(new UserResponse(), ErrorCodeEnum.REQUEST_INVALID, Constants.USER_REQUEST_REQUIRED, LOGGER);
            }
        } catch (Exception e) {
            LOGGER.error(Constants.ADD_USER_RESPONSE_API, e);
            return processErrorResponse(e, new UserResponse(),
                    LOGGER);
        }

    }

    @DELETE
    @Path("/logout")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public Response logout(@QueryParam("userSessionToken") String userSessionToken) {
        try {
            System.out.println("&&&&&&&&&&&&&" + userSessionToken);
            if (StringUtils.isNotBlank(userSessionToken)) {
                return covid19Service.logout(userSessionToken);
            } else {
                return processErrorResponseCode(new UserSessionResponse(), ErrorCodeEnum.REQUEST_INVALID, Constants.USER_SESSION_TOKEN_IS_REQUIRED, LOGGER);
            }
        } catch
        (Exception e) {
            LOGGER.error(Constants.DELETE_LOGOUT_RESPONSE_API, e);
            return processErrorResponse(e, new UserSessionResponse(),
                    LOGGER);
        }
    }

    @POST
    @Path("/addRecordsDetails")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public Response addRecordsDetails(String recordsInfo) {
        try {
            System.out.println("#####records recordsInfo###" +recordsInfo);
            if (StringUtils.isNotEmpty(recordsInfo)) {
                return covid19Service.addRecordsDetails(recordsInfo);
            } else {

                return processErrorResponseCode(new RecordsResponse(), ErrorCodeEnum.REQUEST_INVALID, Constants.RECORDS_DETAILS_MUST_REQUIRED, LOGGER);
            }
        } catch (Exception e) {
            LOGGER.error(Constants.ADD_LOGIN_RESPONSE_API, e);
            return processErrorResponse(e, new RecordsResponse(),
                    LOGGER);
        }
    }

    @PUT
    @Path("/updateRecordsDetailsByState")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public Response updateInsureDetailsByState(String recordsString) {
        try {
            System.out.println("##### recordsObject size###" + recordsString);

            return covid19Service.updateRecordsDetailsByState(recordsString);

        } catch (Exception e) {
            LOGGER.error(Constants.ADD_UPDATERECORDS_RESPONSE_API, e);
            return processErrorResponse(e, new RecordsResponse(),
                    LOGGER);
        }

    }


    @GET
    @Path("/getRecordDetailsByState")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public Response getInsurerDetailsByState(@Context HttpServletRequest httpServletRequest, @QueryParam("state") String state) {

        LOGGER.info("*************list of records by using state**" + state);
        RecordsResponse recordsResponse = new RecordsResponse();
        try {
            return covid19Service.getRecordDetailsByState(state);
        } catch (Exception e) {
            LOGGER.error(Constants.ERROR_IN_GET_RECORDS_DETAILS_API, e);
            return processErrorResponse(e, new RecordsResponse(), LOGGER);
        }
    }


    @GET
    @Path("/getAllRecordDetails")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getAllRecordDetails() {

        LOGGER.info("************* record details  ************");
        try {
            return covid19Service.getAllRecordDetails();
        } catch (Exception e) {
            LOGGER.error(Constants.ERROR_IN_GET_ALL_RECAORD_DETAILS_API, e);
            return processErrorResponse(e, new RecordsResponse(), LOGGER);
        }
    }


}
