
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeAddLocalizedEnumValueActionBuilder {

    private String attributeName;

    private com.commercetools.api.models.product_type.AttributeLocalizedEnumValue value;

    public ProductTypeAddLocalizedEnumValueActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public ProductTypeAddLocalizedEnumValueActionBuilder value(
            final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue value) {
        this.value = value;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.api.models.product_type.AttributeLocalizedEnumValue getValue() {
        return this.value;
    }

    public ProductTypeAddLocalizedEnumValueAction build() {
        return new ProductTypeAddLocalizedEnumValueActionImpl(attributeName, value);
    }

    public static ProductTypeAddLocalizedEnumValueActionBuilder of() {
        return new ProductTypeAddLocalizedEnumValueActionBuilder();
    }

    public static ProductTypeAddLocalizedEnumValueActionBuilder of(
            final ProductTypeAddLocalizedEnumValueAction template) {
        ProductTypeAddLocalizedEnumValueActionBuilder builder = new ProductTypeAddLocalizedEnumValueActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.value = template.getValue();
        return builder;
    }

}
