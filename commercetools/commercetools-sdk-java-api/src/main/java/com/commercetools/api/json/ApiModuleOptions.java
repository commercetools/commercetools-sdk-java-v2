
package com.commercetools.api.json;

import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

public class ApiModuleOptions implements ModuleOptions {
    public static final String DESERIALIZE_DATE_ATTRIBUTE_AS_STRING = "commercetools.deserializeDateAttributeAsString";
    public static final String DESERIALIZE_DATE_FIELD_AS_STRING = "commercetools.deserializeDateFieldAsString";

    public static final String DESERIALIZE_ATTRIBUTE_AS_JSON_NODE = "commercetools.deserializeAttributeAsJsonNode";

    public static final String DESERIALIZE_CUSTOM_FIELD_AS_JSON_NODE = "commercetools.deserializeCustomFieldAsJsonNode";

    public static final String DESERIALIZE_CUSTOM_FIELD_NUMBER_AS_DOUBLE = "commercetools.deserializeCustomFieldNumberAsDouble";

    public static final String DESERIALIZE_ATTRIBUTE_NUMBER_AS_DOUBLE = "commercetools.deserializeAttributeNumberAsDouble";

    private final Boolean dateAttributeAsString;
    private final Boolean dateCustomFieldAsString;

    private final Boolean attributeAsJsonNode;
    private final Boolean customFieldAsJsonNode;

    private final Boolean attributeNumberAsDouble;
    private final Boolean customFieldNumberAsDouble;

    private final Map<String, TypeReference<?>> attributeTypes;
    private final Map<String, TypeReference<?>> customFieldTypes;

    private ApiModuleOptions() {
        this.dateAttributeAsString = false;
        this.dateCustomFieldAsString = false;
        this.attributeAsJsonNode = false;
        this.customFieldAsJsonNode = false;
        this.attributeNumberAsDouble = false;
        this.customFieldNumberAsDouble = false;
        this.attributeTypes = null;
        this.customFieldTypes = null;
    }

    private ApiModuleOptions(final Boolean dateAttributeAsString, final Boolean dateCustomFieldAsString,
            final Boolean attributeAsJsonNode, final Boolean customFieldAsJsonNode,
            final Boolean attributeNumberAsDouble, final Boolean customFieldNumberAsDouble,
            final Map<String, TypeReference<?>> attributeTypes, final Map<String, TypeReference<?>> customFieldTypes) {
        this.dateAttributeAsString = dateAttributeAsString;
        this.dateCustomFieldAsString = dateCustomFieldAsString;
        this.attributeAsJsonNode = attributeAsJsonNode;
        this.customFieldAsJsonNode = customFieldAsJsonNode;
        this.attributeNumberAsDouble = attributeNumberAsDouble;
        this.customFieldNumberAsDouble = customFieldNumberAsDouble;
        this.attributeTypes = attributeTypes;
        this.customFieldTypes = customFieldTypes;
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

    public Boolean getAttributeNumberAsDouble() {
        return attributeNumberAsDouble;
    }

    public Boolean getCustomFieldNumberAsDouble() {
        return customFieldNumberAsDouble;
    }

    public Map<String, TypeReference<?>> getAttributeTypes() {
        return attributeTypes;
    }

    public Map<String, TypeReference<?>> getCustomFieldTypes() {
        return customFieldTypes;
    }

    public ApiModuleOptions withDateCustomFieldAsString(Boolean dateCustomFieldAsString) {
        return new ApiModuleOptions(dateAttributeAsString, dateCustomFieldAsString, attributeAsJsonNode,
            customFieldAsJsonNode, attributeNumberAsDouble, customFieldNumberAsDouble, attributeTypes,
            customFieldTypes);
    }

    public ApiModuleOptions withDateAttributeAsString(Boolean dateAttributeAsString) {
        return new ApiModuleOptions(dateAttributeAsString, dateCustomFieldAsString, attributeAsJsonNode,
            customFieldAsJsonNode, attributeNumberAsDouble, customFieldNumberAsDouble, attributeTypes,
            customFieldTypes);
    }

    public ApiModuleOptions withAttributeAsJsonNode(Boolean attributeAsJsonNode) {
        return new ApiModuleOptions(dateAttributeAsString, dateCustomFieldAsString, attributeAsJsonNode,
            customFieldAsJsonNode, attributeNumberAsDouble, customFieldNumberAsDouble, attributeTypes,
            customFieldTypes);
    }

    public ApiModuleOptions withCustomFieldAsJsonNode(Boolean customFieldAsJsonNode) {
        return new ApiModuleOptions(dateAttributeAsString, dateCustomFieldAsString, attributeAsJsonNode,
            customFieldAsJsonNode, attributeNumberAsDouble, customFieldNumberAsDouble, attributeTypes,
            customFieldTypes);
    }

    public ApiModuleOptions withCustomFieldNumberAsDouble(Boolean customFieldNumberAsDouble) {
        return new ApiModuleOptions(dateAttributeAsString, dateCustomFieldAsString, attributeAsJsonNode,
            customFieldAsJsonNode, attributeNumberAsDouble, customFieldNumberAsDouble, attributeTypes,
            customFieldTypes);
    }

    public ApiModuleOptions withAttributeNumberAsDouble(Boolean attributeNumberAsDouble) {
        return new ApiModuleOptions(dateAttributeAsString, dateCustomFieldAsString, attributeAsJsonNode,
            customFieldAsJsonNode, attributeNumberAsDouble, customFieldNumberAsDouble, attributeTypes,
            customFieldTypes);
    }

    public ApiModuleOptions withCustomFieldTypes(Map<String, TypeReference<?>> customFieldTypes) {
        return new ApiModuleOptions(dateAttributeAsString, dateCustomFieldAsString, attributeAsJsonNode,
            customFieldAsJsonNode, attributeNumberAsDouble, customFieldNumberAsDouble, attributeTypes,
            customFieldTypes);
    }

    public ApiModuleOptions withAttributeTypes(Map<String, TypeReference<?>> attributeTypes) {
        return new ApiModuleOptions(dateAttributeAsString, dateCustomFieldAsString, attributeAsJsonNode,
            customFieldAsJsonNode, attributeNumberAsDouble, customFieldNumberAsDouble, attributeTypes,
            customFieldTypes);
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
        if (name.equals(DESERIALIZE_ATTRIBUTE_NUMBER_AS_DOUBLE)) {
            return attributeNumberAsDouble.toString();
        }
        if (name.equals(DESERIALIZE_CUSTOM_FIELD_NUMBER_AS_DOUBLE)) {
            return customFieldNumberAsDouble.toString();
        }
        return null;
    }
}
