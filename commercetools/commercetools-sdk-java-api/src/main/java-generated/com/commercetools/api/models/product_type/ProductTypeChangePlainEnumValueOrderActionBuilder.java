
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductTypeChangePlainEnumValueOrderActionBuilder
        implements Builder<ProductTypeChangePlainEnumValueOrderAction> {

    private String attributeName;

    private java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> values;

    public ProductTypeChangePlainEnumValueOrderActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public ProductTypeChangePlainEnumValueOrderActionBuilder values(
            final com.commercetools.api.models.product_type.AttributePlainEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    public ProductTypeChangePlainEnumValueOrderActionBuilder values(
            final java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> values) {
        this.values = values;
        return this;
    }

    public ProductTypeChangePlainEnumValueOrderActionBuilder plusValues(
            final com.commercetools.api.models.product_type.AttributePlainEnumValue... values) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.addAll(Arrays.asList(values));
        return this;
    }

    public ProductTypeChangePlainEnumValueOrderActionBuilder plusValues(
            Function<com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder, com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder> builder) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(
            builder.apply(com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder.of()).build());
        return this;
    }

    public ProductTypeChangePlainEnumValueOrderActionBuilder withValues(
            Function<com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder, com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder> builder) {
        this.values = new ArrayList<>();
        this.values.add(
            builder.apply(com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder.of()).build());
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> getValues() {
        return this.values;
    }

    public ProductTypeChangePlainEnumValueOrderAction build() {
        Objects.requireNonNull(attributeName,
            ProductTypeChangePlainEnumValueOrderAction.class + ": attributeName is missing");
        Objects.requireNonNull(values, ProductTypeChangePlainEnumValueOrderAction.class + ": values is missing");
        return new ProductTypeChangePlainEnumValueOrderActionImpl(attributeName, values);
    }

    /**
     * builds ProductTypeChangePlainEnumValueOrderAction without checking for non null required values
     */
    public ProductTypeChangePlainEnumValueOrderAction buildUnchecked() {
        return new ProductTypeChangePlainEnumValueOrderActionImpl(attributeName, values);
    }

    public static ProductTypeChangePlainEnumValueOrderActionBuilder of() {
        return new ProductTypeChangePlainEnumValueOrderActionBuilder();
    }

    public static ProductTypeChangePlainEnumValueOrderActionBuilder of(
            final ProductTypeChangePlainEnumValueOrderAction template) {
        ProductTypeChangePlainEnumValueOrderActionBuilder builder = new ProductTypeChangePlainEnumValueOrderActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.values = template.getValues();
        return builder;
    }

}
