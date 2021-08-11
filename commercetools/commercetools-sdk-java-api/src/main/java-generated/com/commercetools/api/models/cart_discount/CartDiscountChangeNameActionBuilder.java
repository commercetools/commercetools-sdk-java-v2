
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountChangeNameActionBuilder implements Builder<CartDiscountChangeNameAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    public CartDiscountChangeNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public CartDiscountChangeNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public CartDiscountChangeNameAction build() {
        Objects.requireNonNull(name, CartDiscountChangeNameAction.class + ": name is missing");
        return new CartDiscountChangeNameActionImpl(name);
    }

    /**
     * builds CartDiscountChangeNameAction without checking for non null required values
     */
    public CartDiscountChangeNameAction buildUnchecked() {
        return new CartDiscountChangeNameActionImpl(name);
    }

    public static CartDiscountChangeNameActionBuilder of() {
        return new CartDiscountChangeNameActionBuilder();
    }

    public static CartDiscountChangeNameActionBuilder of(final CartDiscountChangeNameAction template) {
        CartDiscountChangeNameActionBuilder builder = new CartDiscountChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
