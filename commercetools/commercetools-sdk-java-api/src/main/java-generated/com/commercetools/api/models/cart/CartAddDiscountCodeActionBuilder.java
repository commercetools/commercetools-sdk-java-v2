
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartAddDiscountCodeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartAddDiscountCodeAction cartAddDiscountCodeAction = CartAddDiscountCodeAction.builder()
 *             .code("{code}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartAddDiscountCodeActionBuilder implements Builder<CartAddDiscountCodeAction> {

    private String code;

    /**
     *  <p><code>code</code> of a DiscountCode.</p>
     * @param code value to be set
     * @return Builder
     */

    public CartAddDiscountCodeActionBuilder code(final String code) {
        this.code = code;
        return this;
    }

    /**
     *  <p><code>code</code> of a DiscountCode.</p>
     * @return code
     */

    public String getCode() {
        return this.code;
    }

    /**
     * builds CartAddDiscountCodeAction with checking for non-null required values
     * @return CartAddDiscountCodeAction
     */
    public CartAddDiscountCodeAction build() {
        Objects.requireNonNull(code, CartAddDiscountCodeAction.class + ": code is missing");
        return new CartAddDiscountCodeActionImpl(code);
    }

    /**
     * builds CartAddDiscountCodeAction without checking for non-null required values
     * @return CartAddDiscountCodeAction
     */
    public CartAddDiscountCodeAction buildUnchecked() {
        return new CartAddDiscountCodeActionImpl(code);
    }

    /**
     * factory method for an instance of CartAddDiscountCodeActionBuilder
     * @return builder
     */
    public static CartAddDiscountCodeActionBuilder of() {
        return new CartAddDiscountCodeActionBuilder();
    }

    /**
     * create builder for CartAddDiscountCodeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartAddDiscountCodeActionBuilder of(final CartAddDiscountCodeAction template) {
        CartAddDiscountCodeActionBuilder builder = new CartAddDiscountCodeActionBuilder();
        builder.code = template.getCode();
        return builder;
    }

}
