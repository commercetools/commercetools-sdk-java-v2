
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartPurchaseOrderNumberSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartPurchaseOrderNumberSetMessagePayload cartPurchaseOrderNumberSetMessagePayload = CartPurchaseOrderNumberSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartPurchaseOrderNumberSetMessagePayloadBuilder
        implements Builder<CartPurchaseOrderNumberSetMessagePayload> {

    @Nullable
    private String purchaseOrderNumber;

    @Nullable
    private String oldPurchaseOrderNumber;

    /**
     *  <p>Purchase order number on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetPurchaseOrderNumberAction" rel="nofollow">Set Purchase Order Number</a> update action.</p>
     * @param purchaseOrderNumber value to be set
     * @return Builder
     */

    public CartPurchaseOrderNumberSetMessagePayloadBuilder purchaseOrderNumber(
            @Nullable final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
        return this;
    }

    /**
     *  <p>Purchase order number on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetPurchaseOrderNumberAction" rel="nofollow">Set Purchase Order Number</a> update action.</p>
     * @param oldPurchaseOrderNumber value to be set
     * @return Builder
     */

    public CartPurchaseOrderNumberSetMessagePayloadBuilder oldPurchaseOrderNumber(
            @Nullable final String oldPurchaseOrderNumber) {
        this.oldPurchaseOrderNumber = oldPurchaseOrderNumber;
        return this;
    }

    /**
     *  <p>Purchase order number on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetPurchaseOrderNumberAction" rel="nofollow">Set Purchase Order Number</a> update action.</p>
     * @return purchaseOrderNumber
     */

    @Nullable
    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    /**
     *  <p>Purchase order number on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetPurchaseOrderNumberAction" rel="nofollow">Set Purchase Order Number</a> update action.</p>
     * @return oldPurchaseOrderNumber
     */

    @Nullable
    public String getOldPurchaseOrderNumber() {
        return this.oldPurchaseOrderNumber;
    }

    /**
     * builds CartPurchaseOrderNumberSetMessagePayload with checking for non-null required values
     * @return CartPurchaseOrderNumberSetMessagePayload
     */
    public CartPurchaseOrderNumberSetMessagePayload build() {
        return new CartPurchaseOrderNumberSetMessagePayloadImpl(purchaseOrderNumber, oldPurchaseOrderNumber);
    }

    /**
     * builds CartPurchaseOrderNumberSetMessagePayload without checking for non-null required values
     * @return CartPurchaseOrderNumberSetMessagePayload
     */
    public CartPurchaseOrderNumberSetMessagePayload buildUnchecked() {
        return new CartPurchaseOrderNumberSetMessagePayloadImpl(purchaseOrderNumber, oldPurchaseOrderNumber);
    }

    /**
     * factory method for an instance of CartPurchaseOrderNumberSetMessagePayloadBuilder
     * @return builder
     */
    public static CartPurchaseOrderNumberSetMessagePayloadBuilder of() {
        return new CartPurchaseOrderNumberSetMessagePayloadBuilder();
    }

    /**
     * create builder for CartPurchaseOrderNumberSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartPurchaseOrderNumberSetMessagePayloadBuilder of(
            final CartPurchaseOrderNumberSetMessagePayload template) {
        CartPurchaseOrderNumberSetMessagePayloadBuilder builder = new CartPurchaseOrderNumberSetMessagePayloadBuilder();
        builder.purchaseOrderNumber = template.getPurchaseOrderNumber();
        builder.oldPurchaseOrderNumber = template.getOldPurchaseOrderNumber();
        return builder;
    }

}
