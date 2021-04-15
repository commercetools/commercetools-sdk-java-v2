
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeChangeAttributeConstraintActionBuilder {

    private String attributeName;

    private com.commercetools.api.models.product_type.AttributeConstraintEnumDraft newValue;

    public ProductTypeChangeAttributeConstraintActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public ProductTypeChangeAttributeConstraintActionBuilder newValue(
            final com.commercetools.api.models.product_type.AttributeConstraintEnumDraft newValue) {
        this.newValue = newValue;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.api.models.product_type.AttributeConstraintEnumDraft getNewValue() {
        return this.newValue;
    }

    public ProductTypeChangeAttributeConstraintAction build() {
        return new ProductTypeChangeAttributeConstraintActionImpl(attributeName, newValue);
    }

    public static ProductTypeChangeAttributeConstraintActionBuilder of() {
        return new ProductTypeChangeAttributeConstraintActionBuilder();
    }

    public static ProductTypeChangeAttributeConstraintActionBuilder of(
            final ProductTypeChangeAttributeConstraintAction template) {
        ProductTypeChangeAttributeConstraintActionBuilder builder = new ProductTypeChangeAttributeConstraintActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.newValue = template.getNewValue();
        return builder;
    }

}
