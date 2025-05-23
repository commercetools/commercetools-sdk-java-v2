
package com.commercetools.api.models.product;

import java.util.Map;
import java.util.Optional;

import com.commercetools.api.RegisterSimpleModuleMixin;
import com.commercetools.api.SimpleModuleMixin;
import com.commercetools.api.json.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.module.SimpleModule;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

@RegisterSimpleModuleMixin
public class ProductModuleMixin implements SimpleModuleMixin {
    public void mixin(SimpleModule module, ModuleOptions options) {
        boolean attributeAsDateString = Boolean.parseBoolean(
            Optional.ofNullable(options.getOption(ApiModuleOptions.DESERIALIZE_DATE_ATTRIBUTE_AS_STRING))
                    .orElse(System.getProperty(ApiModuleOptions.DESERIALIZE_DATE_ATTRIBUTE_AS_STRING)));
        boolean attributeAsJsonNode = Boolean.parseBoolean(
            Optional.ofNullable(options.getOption(ApiModuleOptions.DESERIALIZE_ATTRIBUTE_AS_JSON_NODE))
                    .orElse(System.getProperty(ApiModuleOptions.DESERIALIZE_ATTRIBUTE_AS_JSON_NODE)));
        boolean attributeNumberAsDouble = Boolean.parseBoolean(
            Optional.ofNullable(options.getOption(ApiModuleOptions.DESERIALIZE_ATTRIBUTE_NUMBER_AS_DOUBLE))
                    .orElse(System.getProperty(ApiModuleOptions.DESERIALIZE_ATTRIBUTE_NUMBER_AS_DOUBLE)));

        final Map<String, TypeReference<?>> attributeTypes;
        if (options instanceof ApiModuleOptions) {
            attributeTypes = ((ApiModuleOptions) options).getAttributeTypes();
        }
        else {
            attributeTypes = null;
        }
        if (attributeAsJsonNode) {
            module.setMixInAnnotation(AttributeImpl.class, AttributeJsonNodeMixin.class);
        }
        else {
            module.addDeserializer(AttributeImpl.class,
                new AttributeDeserializer(attributeAsDateString, attributeNumberAsDouble, attributeTypes));
        }
    }
}
