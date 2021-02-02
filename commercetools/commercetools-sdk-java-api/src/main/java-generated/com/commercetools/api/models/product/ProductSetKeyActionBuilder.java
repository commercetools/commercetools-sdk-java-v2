
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetKeyActionBuilder {

    @Nullable
    private String key;

    public ProductSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ProductSetKeyAction build() {
        return new ProductSetKeyActionImpl(key);
    }

    public static ProductSetKeyActionBuilder of() {
        return new ProductSetKeyActionBuilder();
    }

    public static ProductSetKeyActionBuilder of(final ProductSetKeyAction template) {
        ProductSetKeyActionBuilder builder = new ProductSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
