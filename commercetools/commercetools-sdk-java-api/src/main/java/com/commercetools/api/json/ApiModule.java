
package com.commercetools.api.json;

import com.commercetools.api.models.product.AttributeImpl;
import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.type.FieldContainerImpl;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class ApiModule extends SimpleModule {
    private static final long serialVersionUID = 0L;

    public static final String DESERIALIZE_ATTRIBUTE_AS_DATE = "commercetools.deserializeAttributeAsDate";

    public ApiModule() {
        boolean asDate = Boolean.parseBoolean(System.getProperty(DESERIALIZE_ATTRIBUTE_AS_DATE, "true"));
        addDeserializer(AttributeImpl.class, new AtrributeDeserializer(asDate));
        addDeserializer(FieldContainerImpl.class, new CustomFieldDeserializer());
        setMixInAnnotation(Review.class, ReviewMixin.class);
    }
}
