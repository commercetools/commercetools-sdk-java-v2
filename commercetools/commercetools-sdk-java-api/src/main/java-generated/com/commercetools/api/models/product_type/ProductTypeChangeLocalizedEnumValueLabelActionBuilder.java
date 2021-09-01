
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeChangeLocalizedEnumValueLabelActionBuilder
        implements Builder<ProductTypeChangeLocalizedEnumValueLabelAction> {

    private String attributeName;

    private com.commercetools.api.models.product_type.AttributeLocalizedEnumValue newValue;

    public ProductTypeChangeLocalizedEnumValueLabelActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public ProductTypeChangeLocalizedEnumValueLabelActionBuilder newValue(
            Function<com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder, com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder> builder) {
        this.newValue = builder.apply(com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder.of())
                .build();
        return this;
    }

    public ProductTypeChangeLocalizedEnumValueLabelActionBuilder newValue(
            final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue newValue) {
        this.newValue = newValue;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.api.models.product_type.AttributeLocalizedEnumValue getNewValue() {
        return this.newValue;
    }

    public ProductTypeChangeLocalizedEnumValueLabelAction build() {
        Objects.requireNonNull(attributeName,
            ProductTypeChangeLocalizedEnumValueLabelAction.class + ": attributeName is missing");
        Objects.requireNonNull(newValue,
            ProductTypeChangeLocalizedEnumValueLabelAction.class + ": newValue is missing");
        return new ProductTypeChangeLocalizedEnumValueLabelActionImpl(attributeName, newValue);
    }

    /**
     * builds ProductTypeChangeLocalizedEnumValueLabelAction without checking for non null required values
     */
    public ProductTypeChangeLocalizedEnumValueLabelAction buildUnchecked() {
        return new ProductTypeChangeLocalizedEnumValueLabelActionImpl(attributeName, newValue);
    }

    public static ProductTypeChangeLocalizedEnumValueLabelActionBuilder of() {
        return new ProductTypeChangeLocalizedEnumValueLabelActionBuilder();
    }

    public static ProductTypeChangeLocalizedEnumValueLabelActionBuilder of(
            final ProductTypeChangeLocalizedEnumValueLabelAction template) {
        ProductTypeChangeLocalizedEnumValueLabelActionBuilder builder = new ProductTypeChangeLocalizedEnumValueLabelActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.newValue = template.getNewValue();
        return builder;
    }

}
