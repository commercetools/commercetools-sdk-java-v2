
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeChangeAttributeOrderByNameActionBuilder {

    private java.util.List<String> attributeNames;

    public ProductTypeChangeAttributeOrderByNameActionBuilder attributeNames(final String... attributeNames) {
        this.attributeNames = new ArrayList<>(Arrays.asList(attributeNames));
        return this;
    }

    public ProductTypeChangeAttributeOrderByNameActionBuilder attributeNames(
            final java.util.List<String> attributeNames) {
        this.attributeNames = attributeNames;
        return this;
    }

    public java.util.List<String> getAttributeNames() {
        return this.attributeNames;
    }

    public ProductTypeChangeAttributeOrderByNameAction build() {
        return new ProductTypeChangeAttributeOrderByNameActionImpl(attributeNames);
    }

    public static ProductTypeChangeAttributeOrderByNameActionBuilder of() {
        return new ProductTypeChangeAttributeOrderByNameActionBuilder();
    }

    public static ProductTypeChangeAttributeOrderByNameActionBuilder of(
            final ProductTypeChangeAttributeOrderByNameAction template) {
        ProductTypeChangeAttributeOrderByNameActionBuilder builder = new ProductTypeChangeAttributeOrderByNameActionBuilder();
        builder.attributeNames = template.getAttributeNames();
        return builder;
    }

}
