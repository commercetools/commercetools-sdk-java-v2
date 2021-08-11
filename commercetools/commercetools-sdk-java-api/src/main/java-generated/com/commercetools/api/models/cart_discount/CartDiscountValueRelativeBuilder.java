
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountValueRelativeBuilder implements Builder<CartDiscountValueRelative> {

    private Long permyriad;

    public CartDiscountValueRelativeBuilder permyriad(final Long permyriad) {
        this.permyriad = permyriad;
        return this;
    }

    public Long getPermyriad() {
        return this.permyriad;
    }

    public CartDiscountValueRelative build() {
        Objects.requireNonNull(permyriad, CartDiscountValueRelative.class + ": permyriad is missing");
        return new CartDiscountValueRelativeImpl(permyriad);
    }

    /**
     * builds CartDiscountValueRelative without checking for non null required values
     */
    public CartDiscountValueRelative buildUnchecked() {
        return new CartDiscountValueRelativeImpl(permyriad);
    }

    public static CartDiscountValueRelativeBuilder of() {
        return new CartDiscountValueRelativeBuilder();
    }

    public static CartDiscountValueRelativeBuilder of(final CartDiscountValueRelative template) {
        CartDiscountValueRelativeBuilder builder = new CartDiscountValueRelativeBuilder();
        builder.permyriad = template.getPermyriad();
        return builder;
    }

}
