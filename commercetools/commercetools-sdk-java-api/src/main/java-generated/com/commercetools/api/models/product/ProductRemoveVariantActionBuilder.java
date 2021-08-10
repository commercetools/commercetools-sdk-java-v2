
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductRemoveVariantActionBuilder implements Builder<ProductRemoveVariantAction> {

    @Nullable
    private Long id;

    @Nullable
    private String sku;

    @Nullable
    private Boolean staged;

    public ProductRemoveVariantActionBuilder id(@Nullable final Long id) {
        this.id = id;
        return this;
    }

    public ProductRemoveVariantActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductRemoveVariantActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    @Nullable
    public Long getId() {
        return this.id;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductRemoveVariantAction build() {
        return new ProductRemoveVariantActionImpl(id, sku, staged);
    }

    /**
     * builds ProductRemoveVariantAction without checking for non null required values
     */
    public ProductRemoveVariantAction buildUnchecked() {
        return new ProductRemoveVariantActionImpl(id, sku, staged);
    }

    public static ProductRemoveVariantActionBuilder of() {
        return new ProductRemoveVariantActionBuilder();
    }

    public static ProductRemoveVariantActionBuilder of(final ProductRemoveVariantAction template) {
        ProductRemoveVariantActionBuilder builder = new ProductRemoveVariantActionBuilder();
        builder.id = template.getId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        return builder;
    }

}
