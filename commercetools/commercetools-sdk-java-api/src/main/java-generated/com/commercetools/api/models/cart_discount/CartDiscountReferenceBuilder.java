
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountReferenceBuilder implements Builder<CartDiscountReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.cart_discount.CartDiscount obj;

    public CartDiscountReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public CartDiscountReferenceBuilder obj(
            Function<com.commercetools.api.models.cart_discount.CartDiscountBuilder, com.commercetools.api.models.cart_discount.CartDiscountBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountBuilder.of()).build();
        return this;
    }

    public CartDiscountReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.cart_discount.CartDiscount obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.cart_discount.CartDiscount getObj() {
        return this.obj;
    }

    public CartDiscountReference build() {
        Objects.requireNonNull(id, CartDiscountReference.class + ": id is missing");
        return new CartDiscountReferenceImpl(id, obj);
    }

    /**
     * builds CartDiscountReference without checking for non null required values
     */
    public CartDiscountReference buildUnchecked() {
        return new CartDiscountReferenceImpl(id, obj);
    }

    public static CartDiscountReferenceBuilder of() {
        return new CartDiscountReferenceBuilder();
    }

    public static CartDiscountReferenceBuilder of(final CartDiscountReference template) {
        CartDiscountReferenceBuilder builder = new CartDiscountReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
