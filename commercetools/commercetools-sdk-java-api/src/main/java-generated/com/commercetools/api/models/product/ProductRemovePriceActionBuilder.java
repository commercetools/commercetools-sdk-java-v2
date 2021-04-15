
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductRemovePriceActionBuilder {

    private String priceId;

    @Nullable
    private Boolean staged;

    public ProductRemovePriceActionBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    public ProductRemovePriceActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public String getPriceId() {
        return this.priceId;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductRemovePriceAction build() {
        return new ProductRemovePriceActionImpl(priceId, staged);
    }

    public static ProductRemovePriceActionBuilder of() {
        return new ProductRemovePriceActionBuilder();
    }

    public static ProductRemovePriceActionBuilder of(final ProductRemovePriceAction template) {
        ProductRemovePriceActionBuilder builder = new ProductRemovePriceActionBuilder();
        builder.priceId = template.getPriceId();
        builder.staged = template.getStaged();
        return builder;
    }

}
