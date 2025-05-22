
package com.commercetools.api.models.type;

import java.util.Map;
import java.util.Optional;

import com.commercetools.api.RegisterSimpleModuleMixin;
import com.commercetools.api.SimpleModuleMixin;
import com.commercetools.api.json.ApiModuleOptions;
import com.commercetools.api.json.CustomFieldDeserializer;
import com.commercetools.api.json.CustomFieldJsonNodeDeserializer;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.module.SimpleModule;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

@RegisterSimpleModuleMixin
public class TypeModuleMixin implements SimpleModuleMixin {
    public void mixin(SimpleModule module, ModuleOptions options) {
        boolean customFieldNumberAsDouble = Boolean.parseBoolean(
            Optional.ofNullable(options.getOption(ApiModuleOptions.DESERIALIZE_CUSTOM_FIELD_NUMBER_AS_DOUBLE))
                    .orElse(System.getProperty(ApiModuleOptions.DESERIALIZE_CUSTOM_FIELD_NUMBER_AS_DOUBLE)));
        boolean customFieldAsJsonNode = Boolean.parseBoolean(
            Optional.ofNullable(options.getOption(ApiModuleOptions.DESERIALIZE_CUSTOM_FIELD_AS_JSON_NODE))
                    .orElse(System.getProperty(ApiModuleOptions.DESERIALIZE_CUSTOM_FIELD_AS_JSON_NODE)));
        boolean customFieldAsDateString = Boolean
                .parseBoolean(Optional.ofNullable(options.getOption(ApiModuleOptions.DESERIALIZE_DATE_FIELD_AS_STRING))
                        .orElse(System.getProperty(ApiModuleOptions.DESERIALIZE_DATE_FIELD_AS_STRING)));
        final Map<String, TypeReference<?>> customFieldTypes;
        if (options instanceof ApiModuleOptions) {
            customFieldTypes = ((ApiModuleOptions) options).getCustomFieldTypes();
        }
        else {
            customFieldTypes = null;
        }

        if (customFieldAsJsonNode) {
            module.addDeserializer(FieldContainerImpl.class, new CustomFieldJsonNodeDeserializer());
        }
        else {
            module.addDeserializer(FieldContainerImpl.class,
                new CustomFieldDeserializer(customFieldAsDateString, customFieldNumberAsDouble, customFieldTypes));
        }
    }
}
