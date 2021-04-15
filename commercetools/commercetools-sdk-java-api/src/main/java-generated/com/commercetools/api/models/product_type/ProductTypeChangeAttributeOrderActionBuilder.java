
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeChangeAttributeOrderActionBuilder {

    private java.util.List<com.commercetools.api.models.product_type.AttributeDefinition> attributes;

    public ProductTypeChangeAttributeOrderActionBuilder attributes(
            final com.commercetools.api.models.product_type.AttributeDefinition... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
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
