
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountValueRelativeDraftBuilder implements Builder<CartDiscountValueRelativeDraft> {

    private Long permyriad;

    public CartDiscountValueRelativeDraftBuilder permyriad(final Long permyriad) {
        this.permyriad = permyriad;
        return this;
    }

    public Long getPermyriad() {
        return this.permyriad;
    }

    public CartDiscountValueRelativeDraft build() {
        Objects.requireNonNull(permyriad, CartDiscountValueRelativeDraft.class + ": permyriad is missing");
        return new CartDiscountValueRelativeDraftImpl(permyriad);
    }

    /**
     * builds CartDiscountValueRelativeDraft without checking for non null required values
     */
    public CartDiscountValueRelativeDraft buildUnchecked() {
        return new CartDiscountValueRelativeDraftImpl(permyriad);
    }

    public static CartDiscountValueRelativeDraftBuilder of() {
        return new CartDiscountValueRelativeDraftBuilder();
    }

    public static CartDiscountValueRelativeDraftBuilder of(final CartDiscountValueRelativeDraft template) {
        CartDiscountValueRelativeDraftBuilder builder = new CartDiscountValueRelativeDraftBuilder();
        builder.permyriad = template.getPermyriad();
        return builder;
    }

}
