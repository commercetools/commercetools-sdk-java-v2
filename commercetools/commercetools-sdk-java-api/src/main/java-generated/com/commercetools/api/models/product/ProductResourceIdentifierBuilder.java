
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductResourceIdentifierBuilder {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public ProductResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public ProductResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ProductResourceIdentifier build() {
        return new ProductResourceIdentifierImpl(id, key);
    }

    public static ProductResourceIdentifierBuilder of() {
        return new ProductResourceIdentifierBuilder();
    }

    public static ProductResourceIdentifierBuilder of(final ProductResourceIdentifier template) {
        ProductResourceIdentifierBuilder builder = new ProductResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
