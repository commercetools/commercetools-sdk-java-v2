
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class VariantBuilder {

    private Integer id;

    private String sku;

    private String key;

    public VariantBuilder id(final Integer id) {
        this.id = id;
        return this;
    }

    public VariantBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    public VariantBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public Integer getId() {
        return this.id;
    }

    public String getSku() {
        return this.sku;
    }

    public String getKey() {
        return this.key;
    }

    public Variant build() {
        return new VariantImpl(id, sku, key);
    }

    public static VariantBuilder of() {
        return new VariantBuilder();
    }

    public static VariantBuilder of(final Variant template) {
        VariantBuilder builder = new VariantBuilder();
        builder.id = template.getId();
        builder.sku = template.getSku();
        builder.key = template.getKey();
        return builder;
    }

}
