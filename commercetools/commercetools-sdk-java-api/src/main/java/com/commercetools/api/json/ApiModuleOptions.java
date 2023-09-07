
package com.commercetools.api.json;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

public class ApiModuleOptions implements ModuleOptions {
    public static final String DESERIALIZE_DATE_ATTRIBUTE_AS_STRING = "commercetools.deserializeDateAttributeAsString";
    public static final String DESERIALIZE_DATE_FIELD_AS_STRING = "commercetools.deserializeDateFieldAsString";

    public static final String DESERIALIZE_ATTRIBUTE_AS_JSON_NODE = "commercetools.deserializeAttributeAsJsonNode";

    public static final String DESERIALIZE_CUSTOM_FIELD_AS_JSON_NODE = "commercetools.deserializeCustomFieldAsJsonNode";

    private final Boolean dateAttributeAsString;
    private final Boolean dateCustomFieldAsString;

    private final Boolean attributeAsJsonNode;
    private final Boolean customFieldAsJsonNode;

    private ApiModuleOptions() {
        this.dateAttributeAsString = false;
        this.dateCustomFieldAsString = false;
        this.attributeAsJsonNode = false;
        this.customFieldAsJsonNode = false;
    }

    private ApiModuleOptions(final Boolean dateAttributeAsString, final Boolean dateCustomFieldAsString,
            final Boolean attributeAsJsonNode, final Boolean customFieldAsJsonNode) {
        this.dateAttributeAsString = dateAttributeAsString;
        this.dateCustomFieldAsString = dateCustomFieldAsString;
        this.attributeAsJsonNode = attributeAsJsonNode;
        this.customFieldAsJsonNode = customFieldAsJsonNode;
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

    public Boolean getAttributeAsJsonNode() {
        return attributeAsJsonNode;
    }

    public Boolean getCustomFieldAsJsonNode() {
        return customFieldAsJsonNode;
    }

    public ApiModuleOptions withDateCustomFieldAsString(Boolean dateCustomFieldAsString) {
        return new ApiModuleOptions(dateAttributeAsString, dateCustomFieldAsString, attributeAsJsonNode,
            customFieldAsJsonNode);
    }

    public ApiModuleOptions withDateAttributeAsString(Boolean dateAttributeAsString) {
        return new ApiModuleOptions(dateAttributeAsString, dateCustomFieldAsString, attributeAsJsonNode,
            customFieldAsJsonNode);
    }

    public ApiModuleOptions withAttributeAsJsonNode(Boolean attributeAsJsonNode) {
        return new ApiModuleOptions(dateAttributeAsString, dateCustomFieldAsString, attributeAsJsonNode,
            customFieldAsJsonNode);
    }

    public ApiModuleOptions withCustomFieldAsJsonNode(Boolean customFieldAsJsonNode) {
        return new ApiModuleOptions(dateAttributeAsString, dateCustomFieldAsString, attributeAsJsonNode,
            customFieldAsJsonNode);
    }

    @Override
    public String getOption(String name) {
        if (name.equals(DESERIALIZE_DATE_ATTRIBUTE_AS_STRING)) {
            return dateAttributeAsString.toString();
        }
        if (name.equals(DESERIALIZE_DATE_FIELD_AS_STRING)) {
            return dateCustomFieldAsString.toString();
        }
        if (name.equals(DESERIALIZE_ATTRIBUTE_AS_JSON_NODE)) {
            return attributeAsJsonNode.toString();
        }
        if (name.equals(DESERIALIZE_CUSTOM_FIELD_AS_JSON_NODE)) {
            return customFieldAsJsonNode.toString();
        }
        return null;
    }
}
