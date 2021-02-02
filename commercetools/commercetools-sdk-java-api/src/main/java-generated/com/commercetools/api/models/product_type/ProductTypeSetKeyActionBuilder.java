
package com.commercetools.api.models.product_type;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeSetKeyActionBuilder {

    @Nullable
    private String key;

    public ProductTypeSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ProductTypeSetKeyAction build() {
        return new ProductTypeSetKeyActionImpl(key);
    }

    public static ProductTypeSetKeyActionBuilder of() {
        return new ProductTypeSetKeyActionBuilder();
    }

    public static ProductTypeSetKeyActionBuilder of(final ProductTypeSetKeyAction template) {
        ProductTypeSetKeyActionBuilder builder = new ProductTypeSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
