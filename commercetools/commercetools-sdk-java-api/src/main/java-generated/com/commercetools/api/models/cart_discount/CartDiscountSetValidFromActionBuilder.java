
package com.commercetools.api.models.cart_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountSetValidFromActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetValidFromAction cartDiscountSetValidFromAction = CartDiscountSetValidFromAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountSetValidFromActionBuilder implements Builder<CartDiscountSetValidFromAction> {

    @Nullable
    private java.time.ZonedDateTime validFrom;

    /**
     <*  <p>If absent, the field with the value is removed in case a value was set before.</p>>
     */

    public CartDiscountSetValidFromActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    public CartDiscountSetValidFromAction build() {
        return new CartDiscountSetValidFromActionImpl(validFrom);
    }

    /**
     * builds CartDiscountSetValidFromAction without checking for non null required values
     */
    public CartDiscountSetValidFromAction buildUnchecked() {
        return new CartDiscountSetValidFromActionImpl(validFrom);
    }

    public static CartDiscountSetValidFromActionBuilder of() {
        return new CartDiscountSetValidFromActionBuilder();
    }

    public static CartDiscountSetValidFromActionBuilder of(final CartDiscountSetValidFromAction template) {
        CartDiscountSetValidFromActionBuilder builder = new CartDiscountSetValidFromActionBuilder();
        builder.validFrom = template.getValidFrom();
        return builder;
    }

}
