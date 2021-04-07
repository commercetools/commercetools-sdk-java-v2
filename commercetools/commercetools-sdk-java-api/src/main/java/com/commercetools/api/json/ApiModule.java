
package com.commercetools.api.json;

import java.util.Optional;

import com.commercetools.api.models.product.AttributeImpl;
import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.type.FieldContainerImpl;
import com.fasterxml.jackson.databind.module.SimpleModule;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

public class ApiModule extends SimpleModule {
    private static final long serialVersionUID = 0L;

    public ApiModule(ModuleOptions options) {
        boolean attributeAsDateString = Boolean.parseBoolean(
            Optional.ofNullable(options.getOption(ApiModuleOptions.DESERIALIZE_DATE_ATTRIBUTE_AS_STRING))
                    .orElse(System.getProperty(ApiModuleOptions.DESERIALIZE_DATE_ATTRIBUTE_AS_STRING)));
        boolean customFieldAsDateString = Boolean
                .parseBoolean(Optional.ofNullable(options.getOption(ApiModuleOptions.DESERIALIZE_DATE_FIELD_AS_STRING))
                        .orElse(System.getProperty(ApiModuleOptions.DESERIALIZE_DATE_FIELD_AS_STRING)));
        addDeserializer(AttributeImpl.class, new AtrributeDeserializer(attributeAsDateString));
        addDeserializer(FieldContainerImpl.class, new CustomFieldDeserializer(customFieldAsDateString));
        setMixInAnnotation(Review.class, ReviewMixin.class);
    }
}
