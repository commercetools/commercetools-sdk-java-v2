
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeChangeEnumKeyActionBuilder {

    private String attributeName;

    private String key;

    private String newKey;

    public ProductTypeChangeEnumKeyActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public ProductTypeChangeEnumKeyActionBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public ProductTypeChangeEnumKeyActionBuilder newKey(final String newKey) {
        this.newKey = newKey;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public String getKey() {
        return this.key;
    }

    public String getNewKey() {
        return this.newKey;
    }

    public ProductTypeChangeEnumKeyAction build() {
        return new ProductTypeChangeEnumKeyActionImpl(attributeName, key, newKey);
    }

    public static ProductTypeChangeEnumKeyActionBuilder of() {
        return new ProductTypeChangeEnumKeyActionBuilder();
    }

    public static ProductTypeChangeEnumKeyActionBuilder of(final ProductTypeChangeEnumKeyAction template) {
        ProductTypeChangeEnumKeyActionBuilder builder = new ProductTypeChangeEnumKeyActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.key = template.getKey();
        builder.newKey = template.getNewKey();
        return builder;
    }

}
