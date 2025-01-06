
package com.commercetools.api.json;

import java.util.Optional;

import com.commercetools.api.models.product.AttributeImpl;
import com.commercetools.api.models.product_search.ProductSearchFacetResult;
import com.commercetools.api.models.type.FieldContainerImpl;
import com.fasterxml.jackson.databind.module.SimpleModule;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

/**
 * Module to configure the default jackson {@link com.fasterxml.jackson.databind.ObjectMapper} e.g. to deserialize attributes and custom fields
 */
public class ApiModule extends SimpleModule {
    private static final long serialVersionUID = 0L;

    public ApiModule(ModuleOptions options) {
        boolean attributeAsDateString = Boolean.parseBoolean(
            Optional.ofNullable(options.getOption(ApiModuleOptions.DESERIALIZE_DATE_ATTRIBUTE_AS_STRING))
                    .orElse(System.getProperty(ApiModuleOptions.DESERIALIZE_DATE_ATTRIBUTE_AS_STRING)));
        boolean customFieldAsDateString = Boolean
                .parseBoolean(Optional.ofNullable(options.getOption(ApiModuleOptions.DESERIALIZE_DATE_FIELD_AS_STRING))
                        .orElse(System.getProperty(ApiModuleOptions.DESERIALIZE_DATE_FIELD_AS_STRING)));
        boolean attributeAsJsonNode = Boolean.parseBoolean(
            Optional.ofNullable(options.getOption(ApiModuleOptions.DESERIALIZE_ATTRIBUTE_AS_JSON_NODE))
                    .orElse(System.getProperty(ApiModuleOptions.DESERIALIZE_ATTRIBUTE_AS_JSON_NODE)));
        boolean customFieldAsJsonNode = Boolean.parseBoolean(
            Optional.ofNullable(options.getOption(ApiModuleOptions.DESERIALIZE_CUSTOM_FIELD_AS_JSON_NODE))
                    .orElse(System.getProperty(ApiModuleOptions.DESERIALIZE_CUSTOM_FIELD_AS_JSON_NODE)));
        boolean attributeNumberAsDouble = Boolean.parseBoolean(
            Optional.ofNullable(options.getOption(ApiModuleOptions.DESERIALIZE_ATTRIBUTE_NUMBER_AS_DOUBLE))
                    .orElse(System.getProperty(ApiModuleOptions.DESERIALIZE_ATTRIBUTE_NUMBER_AS_DOUBLE)));
        boolean customFieldNumberAsDouble = Boolean.parseBoolean(
            Optional.ofNullable(options.getOption(ApiModuleOptions.DESERIALIZE_CUSTOM_FIELD_NUMBER_AS_DOUBLE))
                    .orElse(System.getProperty(ApiModuleOptions.DESERIALIZE_CUSTOM_FIELD_NUMBER_AS_DOUBLE)));

        setMixInAnnotation(ProductSearchFacetResult.class, ProductSearchFacetResultMixin.class);
        if (attributeAsJsonNode) {
            setMixInAnnotation(AttributeImpl.class, AttributeJsonNodeMixin.class);
        }
        else {
            addDeserializer(AttributeImpl.class,
                new AttributeDeserializer(attributeAsDateString, attributeNumberAsDouble));
        }
        if (customFieldAsJsonNode) {
            addDeserializer(FieldContainerImpl.class, new CustomFieldJsonNodeDeserializer());
        }
        else {
            addDeserializer(FieldContainerImpl.class,
                new CustomFieldDeserializer(customFieldAsDateString, customFieldNumberAsDouble));
        }
    }
}
