package com.easyway.covid19.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "StatusCodeEnum")
@XmlEnum
public enum StatusCodeEnum {

    @XmlEnumValue("Ok")
    OK("Ok"),
    @XmlEnumValue("Warn")
    WARN("Warn"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    DVR_NOT_REACHABLE("DVR_NOT_REACHABLE"),
    NO_TARGET_PROGRAM_EXISTS("NO_TARGET_PROGRAM_EXISTS"),
    SCHEDULE_CONFLICT("SCHEDULE_CONFLICT"),
    DVR_IS_FULL("DVR_IS_FULL"),
    CONFLICT_RESOLUTION_IN_PROGRESS("CONFLICT_RESOLUTION_IN_PROGRESS"),
    DVR_NOT_READY("DVR_NOT_READY"),
    ALREADY_SCHEDULED("ALREADY_SCHEDULED"),
    PPV_PROGRAM_NOT_PURCHASED("PPV_PROGRAM_NOT_PURCHASED"),
    INVALID_PARAMETER("INVALID_PARAMETER"),
    NO_PROGRAMS_SCHEDULED("NO_PROGRAMS_SCHEDULED"),
    NO_SUBSCRIPTION_TO_CHANNEL("NO_SUBSCRIPTION_TO_CHANNEL"),
    NO_EPG_AVAILABLE_FOR_PROGRAM("NO_EPG_AVAILABLE_FOR_PROGRAM"),
    AMS_ERROR("AMS_ERROR");
    private final String value;

    StatusCodeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusCodeEnum fromValue(String v) {
        for (StatusCodeEnum c: StatusCodeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
