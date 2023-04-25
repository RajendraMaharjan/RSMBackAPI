package com.miu.pmtbackendapi.domain.enums;

public enum PropertyTypeEnum {
    SINGLE_FAMILY("SINGLE FAMILY"), MULTI_FAMILY("MULTI FAMILY"), CONDO("CONDO"), MOBILE("MOBILE"), LAND("LAND"), FARM("FARM"), OTHER("OTHER");

    String value;

    private PropertyTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
