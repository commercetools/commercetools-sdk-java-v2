
package com.commercetools.api.json;

import com.commercetools.api.models.product.AttributeImpl;
import com.commercetools.api.models.product.FacetResultsImpl;
import com.commercetools.api.models.type.FieldContainerImpl;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class ApiModule extends SimpleModule {
    private static final long serialVersionUID = 0L;

    public ApiModule() {
        addDeserializer(FacetResultsImpl.class, new FacetResultsDeserializer());
        addDeserializer(AttributeImpl.class, new AtrributeDeserializer());
        addDeserializer(FieldContainerImpl.class, new CustomFieldDeserializer());
    }
}
