
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeAddLocalizedEnumValueActionBuilder
        implements Builder<ProductTypeAddLocalizedEnumValueAction> {

    private String attributeName;

    private com.commercetools.api.models.product_type.AttributeLocalizedEnumValue value;

    public ProductTypeAddLocalizedEnumValueActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public ProductTypeAddLocalizedEnumValueActionBuilder value(
            Function<com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder, com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder.of())
                .build();
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
        Objects.requireNonNull(attributeName,
            ProductTypeAddLocalizedEnumValueAction.class + ": attributeName is missing");
        Objects.requireNonNull(value, ProductTypeAddLocalizedEnumValueAction.class + ": value is missing");
        return new ProductTypeAddLocalizedEnumValueActionImpl(attributeName, value);
    }

    /**
     * builds ProductTypeAddLocalizedEnumValueAction without checking for non null required values
     */
    public ProductTypeAddLocalizedEnumValueAction buildUnchecked() {
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
