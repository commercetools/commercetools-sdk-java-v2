
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductPublishActionBuilder implements Builder<ProductPublishAction> {

    @Nullable
    private com.commercetools.api.models.cart.ProductPublishScope scope;

    public ProductPublishActionBuilder scope(
            @Nullable final com.commercetools.api.models.cart.ProductPublishScope scope) {
        this.scope = scope;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.cart.ProductPublishScope getScope() {
        return this.scope;
    }

    public ProductPublishAction build() {
        return new ProductPublishActionImpl(scope);
    }

    /**
     * builds ProductPublishAction without checking for non null required values
     */
    public ProductPublishAction buildUnchecked() {
        return new ProductPublishActionImpl(scope);
    }

    public static ProductPublishActionBuilder of() {
        return new ProductPublishActionBuilder();
    }

    public static ProductPublishActionBuilder of(final ProductPublishAction template) {
        ProductPublishActionBuilder builder = new ProductPublishActionBuilder();
        builder.scope = template.getScope();
        return builder;
    }

}
