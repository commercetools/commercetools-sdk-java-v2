
package com.commercetools.api.json;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

public class ApiModuleOptions implements ModuleOptions {
    public static final String DESERIALIZE_DATE_ATTRIBUTE_AS_STRING = "commercetools.deserializeDateAttributeAsString";
    public static final String DESERIALIZE_DATE_FIELD_AS_STRING = "commercetools.deserializeDateFieldAsString";

    private final Boolean dateAttributeAsString;
    private final Boolean dateCustomFieldAsString;

    private ApiModuleOptions() {
        this.dateAttributeAsString = false;
        this.dateCustomFieldAsString = false;
    }

    private ApiModuleOptions(Boolean dateAttributeAsString, Boolean dateCustomFieldAsString) {
        this.dateAttributeAsString = dateAttributeAsString;
        this.dateCustomFieldAsString = dateCustomFieldAsString;
    }

    public static ApiModuleOptions of() {
        return new ApiModuleOptions();
    }

    public Boolean getDateAttributeAsString() {
        return dateAttributeAsString;
    }

    public Boolean getDateCustomFieldAsString() {
        return dateCustomFieldAsString;
    }

    public ApiModuleOptions withDateCustomFieldAsString(Boolean dateCustomFieldAsString) {
        return new ApiModuleOptions(dateAttributeAsString, dateCustomFieldAsString);
    }

    public ApiModuleOptions withDateAttributeAsString(Boolean dateAttributeAsString) {
        return new ApiModuleOptions(dateAttributeAsString, dateCustomFieldAsString);
    }

    @Override
    public String getOption(String name) {
        if (name.equals(DESERIALIZE_DATE_ATTRIBUTE_AS_STRING)) {
            return dateAttributeAsString.toString();
        }
        if (name.equals(DESERIALIZE_DATE_FIELD_AS_STRING)) {
            return dateCustomFieldAsString.toString();
        }
        return null;
    }
}
