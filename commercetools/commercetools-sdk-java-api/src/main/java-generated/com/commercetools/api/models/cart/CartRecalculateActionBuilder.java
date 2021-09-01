
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartRecalculateActionBuilder implements Builder<CartRecalculateAction> {

    @Nullable
    private Boolean updateProductData;

    public CartRecalculateActionBuilder updateProductData(@Nullable final Boolean updateProductData) {
        this.updateProductData = updateProductData;
        return this;
    }

    @Nullable
    public Boolean getUpdateProductData() {
        return this.updateProductData;
    }

    public CartRecalculateAction build() {
        return new CartRecalculateActionImpl(updateProductData);
    }

    /**
     * builds CartRecalculateAction without checking for non null required values
     */
    public CartRecalculateAction buildUnchecked() {
        return new CartRecalculateActionImpl(updateProductData);
    }

    public static CartRecalculateActionBuilder of() {
        return new CartRecalculateActionBuilder();
    }

    public static CartRecalculateActionBuilder of(final CartRecalculateAction template) {
        CartRecalculateActionBuilder builder = new CartRecalculateActionBuilder();
        builder.updateProductData = template.getUpdateProductData();
        return builder;
    }

}
