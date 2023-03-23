
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
     *  <p>Identifier for a purchase order, usually in a B2B context. The Purchase Order Number is typically entered by the Buyer and can also be used with Quotes.</p>
     * @param purchaseOrderNumber
     * @return Builder
     */

    public OrderSetPurchaseOrderNumberActionBuilder purchaseOrderNumber(@Nullable final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
        return this;
    }

    @Nullable
    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    public OrderSetPurchaseOrderNumberAction build() {
        return new OrderSetPurchaseOrderNumberActionImpl(purchaseOrderNumber);
    }

    /**
     * builds OrderSetPurchaseOrderNumberAction without checking for non null required values
     */
    public OrderSetPurchaseOrderNumberAction buildUnchecked() {
        return new OrderSetPurchaseOrderNumberActionImpl(purchaseOrderNumber);
    }

    public static OrderSetPurchaseOrderNumberActionBuilder of() {
        return new OrderSetPurchaseOrderNumberActionBuilder();
    }

    public static OrderSetPurchaseOrderNumberActionBuilder of(final OrderSetPurchaseOrderNumberAction template) {
        OrderSetPurchaseOrderNumberActionBuilder builder = new OrderSetPurchaseOrderNumberActionBuilder();
        builder.purchaseOrderNumber = template.getPurchaseOrderNumber();
        return builder;
    }

}
