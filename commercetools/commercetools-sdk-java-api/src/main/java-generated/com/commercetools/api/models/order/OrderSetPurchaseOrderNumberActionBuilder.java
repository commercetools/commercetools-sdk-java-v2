
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetPurchaseOrderNumberActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetPurchaseOrderNumberAction orderSetPurchaseOrderNumberAction = OrderSetPurchaseOrderNumberAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetPurchaseOrderNumberActionBuilder implements Builder<OrderSetPurchaseOrderNumberAction> {

    @Nullable
    private String purchaseOrderNumber;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param purchaseOrderNumber value to be set
     * @return Builder
     */

    public OrderSetPurchaseOrderNumberActionBuilder purchaseOrderNumber(@Nullable final String purchaseOrderNumber) {
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
     * builds OrderSetPurchaseOrderNumberAction with checking for non-null required values
     * @return OrderSetPurchaseOrderNumberAction
     */
    public OrderSetPurchaseOrderNumberAction build() {
        return new OrderSetPurchaseOrderNumberActionImpl(purchaseOrderNumber);
    }

    /**
     * builds OrderSetPurchaseOrderNumberAction without checking for non-null required values
     * @return OrderSetPurchaseOrderNumberAction
     */
    public OrderSetPurchaseOrderNumberAction buildUnchecked() {
        return new OrderSetPurchaseOrderNumberActionImpl(purchaseOrderNumber);
    }

    /**
     * factory method for an instance of OrderSetPurchaseOrderNumberActionBuilder
     * @return builder
     */
    public static OrderSetPurchaseOrderNumberActionBuilder of() {
        return new OrderSetPurchaseOrderNumberActionBuilder();
    }

    /**
     * create builder for OrderSetPurchaseOrderNumberAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetPurchaseOrderNumberActionBuilder of(final OrderSetPurchaseOrderNumberAction template) {
        OrderSetPurchaseOrderNumberActionBuilder builder = new OrderSetPurchaseOrderNumberActionBuilder();
        builder.purchaseOrderNumber = template.getPurchaseOrderNumber();
        return builder;
    }

}
