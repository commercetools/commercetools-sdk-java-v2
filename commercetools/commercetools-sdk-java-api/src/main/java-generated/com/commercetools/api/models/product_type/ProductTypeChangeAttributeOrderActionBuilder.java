
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeChangeAttributeOrderActionBuilder
        implements Builder<ProductTypeChangeAttributeOrderAction> {

    private java.util.List<com.commercetools.api.models.product_type.AttributeDefinition> attributes;

    public ProductTypeChangeAttributeOrderActionBuilder attributes(
            final com.commercetools.api.models.product_type.AttributeDefinition... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    public ProductTypeChangeAttributeOrderActionBuilder withAttributes(
            Function<com.commercetools.api.models.product_type.AttributeDefinitionBuilder, com.commercetools.api.models.product_type.AttributeDefinitionBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes
                .add(builder.apply(com.commercetools.api.models.product_type.AttributeDefinitionBuilder.of()).build());
        return this;
    }

    public ProductTypeChangeAttributeOrderActionBuilder plusAttributes(
            Function<com.commercetools.api.models.product_type.AttributeDefinitionBuilder, com.commercetools.api.models.product_type.AttributeDefinitionBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes
                .add(builder.apply(com.commercetools.api.models.product_type.AttributeDefinitionBuilder.of()).build());
        return this;
    }

    public ProductTypeChangeAttributeOrderActionBuilder attributes(
            final java.util.List<com.commercetools.api.models.product_type.AttributeDefinition> attributes) {
        this.attributes = attributes;
        return this;
    }

    public java.util.List<com.commercetools.api.models.product_type.AttributeDefinition> getAttributes() {
        return this.attributes;
    }

    public ProductTypeChangeAttributeOrderAction build() {
        Objects.requireNonNull(attributes, ProductTypeChangeAttributeOrderAction.class + ": attributes is missing");
        return new ProductTypeChangeAttributeOrderActionImpl(attributes);
    }

    /**
     * builds ProductTypeChangeAttributeOrderAction without checking for non null required values
     */
    public ProductTypeChangeAttributeOrderAction buildUnchecked() {
        return new ProductTypeChangeAttributeOrderActionImpl(attributes);
    }

    public static ProductTypeChangeAttributeOrderActionBuilder of() {
        return new ProductTypeChangeAttributeOrderActionBuilder();
    }

    public static ProductTypeChangeAttributeOrderActionBuilder of(
            final ProductTypeChangeAttributeOrderAction template) {
        ProductTypeChangeAttributeOrderActionBuilder builder = new ProductTypeChangeAttributeOrderActionBuilder();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
