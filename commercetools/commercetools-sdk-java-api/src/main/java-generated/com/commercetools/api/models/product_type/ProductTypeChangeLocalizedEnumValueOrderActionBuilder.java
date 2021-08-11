
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeChangeLocalizedEnumValueOrderActionBuilder
        implements Builder<ProductTypeChangeLocalizedEnumValueOrderAction> {

    private String attributeName;

    private java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> values;

    public ProductTypeChangeLocalizedEnumValueOrderActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public ProductTypeChangeLocalizedEnumValueOrderActionBuilder values(
            final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    public ProductTypeChangeLocalizedEnumValueOrderActionBuilder values(
            final java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> values) {
        this.values = values;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> getValues() {
        return this.values;
    }

    public ProductTypeChangeLocalizedEnumValueOrderAction build() {
        Objects.requireNonNull(attributeName,
            ProductTypeChangeLocalizedEnumValueOrderAction.class + ": attributeName is missing");
        Objects.requireNonNull(values, ProductTypeChangeLocalizedEnumValueOrderAction.class + ": values is missing");
        return new ProductTypeChangeLocalizedEnumValueOrderActionImpl(attributeName, values);
    }

    /**
     * builds ProductTypeChangeLocalizedEnumValueOrderAction without checking for non null required values
     */
    public ProductTypeChangeLocalizedEnumValueOrderAction buildUnchecked() {
        return new ProductTypeChangeLocalizedEnumValueOrderActionImpl(attributeName, values);
    }

    public static ProductTypeChangeLocalizedEnumValueOrderActionBuilder of() {
        return new ProductTypeChangeLocalizedEnumValueOrderActionBuilder();
    }

    public static ProductTypeChangeLocalizedEnumValueOrderActionBuilder of(
            final ProductTypeChangeLocalizedEnumValueOrderAction template) {
        ProductTypeChangeLocalizedEnumValueOrderActionBuilder builder = new ProductTypeChangeLocalizedEnumValueOrderActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.values = template.getValues();
        return builder;
    }

}
