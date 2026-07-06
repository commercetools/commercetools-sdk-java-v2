
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetPurchaseOrderNumberActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetPurchaseOrderNumberAction cartSetPurchaseOrderNumberAction = CartSetPurchaseOrderNumberAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetPurchaseOrderNumberActionBuilder implements Builder<CartSetPurchaseOrderNumberAction> {

    @Nullable
    private String purchaseOrderNumber;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param purchaseOrderNumber value to be set
     * @return Builder
     */

    public CartSetPurchaseOrderNumberActionBuilder purchaseOrderNumber(@Nullable final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return purchaseOrderNumber
     */

    @Nullable
    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    /**
     * builds CartSetPurchaseOrderNumberAction with checking for non-null required values
     * @return CartSetPurchaseOrderNumberAction
     */
    public CartSetPurchaseOrderNumberAction build() {
        return new CartSetPurchaseOrderNumberActionImpl(purchaseOrderNumber);
    }

    /**
     * builds CartSetPurchaseOrderNumberAction without checking for non-null required values
     * @return CartSetPurchaseOrderNumberAction
     */
    public CartSetPurchaseOrderNumberAction buildUnchecked() {
        return new CartSetPurchaseOrderNumberActionImpl(purchaseOrderNumber);
    }

    /**
     * factory method for an instance of CartSetPurchaseOrderNumberActionBuilder
     * @return builder
     */
    public static CartSetPurchaseOrderNumberActionBuilder of() {
        return new CartSetPurchaseOrderNumberActionBuilder();
    }

    /**
     * create builder for CartSetPurchaseOrderNumberAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetPurchaseOrderNumberActionBuilder of(final CartSetPurchaseOrderNumberAction template) {
        CartSetPurchaseOrderNumberActionBuilder builder = new CartSetPurchaseOrderNumberActionBuilder();
        builder.purchaseOrderNumber = template.getPurchaseOrderNumber();
        return builder;
    }

}
