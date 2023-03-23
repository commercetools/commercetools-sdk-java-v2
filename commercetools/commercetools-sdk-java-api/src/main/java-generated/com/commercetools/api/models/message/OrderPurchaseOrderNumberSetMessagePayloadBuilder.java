
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderPurchaseOrderNumberSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPurchaseOrderNumberSetMessagePayload orderPurchaseOrderNumberSetMessagePayload = OrderPurchaseOrderNumberSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderPurchaseOrderNumberSetMessagePayloadBuilder
        implements Builder<OrderPurchaseOrderNumberSetMessagePayload> {

    @Nullable
    private String purchaseOrderNumber;

    @Nullable
    private String oldPurchaseOrderNumber;

    /**
     *  <p>Purchase order number on the Order after the Set PurchaseOrderNumber update action.</p>
     * @param purchaseOrderNumber
     * @return Builder
     */

    public OrderPurchaseOrderNumberSetMessagePayloadBuilder purchaseOrderNumber(
            @Nullable final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
        return this;
    }

    /**
     *  <p>Purchase order number on the Order before the Set PurchaseOrderNumber update action.</p>
     * @param oldPurchaseOrderNumber
     * @return Builder
     */

    public OrderPurchaseOrderNumberSetMessagePayloadBuilder oldPurchaseOrderNumber(
            @Nullable final String oldPurchaseOrderNumber) {
        this.oldPurchaseOrderNumber = oldPurchaseOrderNumber;
        return this;
    }

    @Nullable
    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    @Nullable
    public String getOldPurchaseOrderNumber() {
        return this.oldPurchaseOrderNumber;
    }

    public OrderPurchaseOrderNumberSetMessagePayload build() {
        return new OrderPurchaseOrderNumberSetMessagePayloadImpl(purchaseOrderNumber, oldPurchaseOrderNumber);
    }

    /**
     * builds OrderPurchaseOrderNumberSetMessagePayload without checking for non null required values
     */
    public OrderPurchaseOrderNumberSetMessagePayload buildUnchecked() {
        return new OrderPurchaseOrderNumberSetMessagePayloadImpl(purchaseOrderNumber, oldPurchaseOrderNumber);
    }

    public static OrderPurchaseOrderNumberSetMessagePayloadBuilder of() {
        return new OrderPurchaseOrderNumberSetMessagePayloadBuilder();
    }

    public static OrderPurchaseOrderNumberSetMessagePayloadBuilder of(
            final OrderPurchaseOrderNumberSetMessagePayload template) {
        OrderPurchaseOrderNumberSetMessagePayloadBuilder builder = new OrderPurchaseOrderNumberSetMessagePayloadBuilder();
        builder.purchaseOrderNumber = template.getPurchaseOrderNumber();
        builder.oldPurchaseOrderNumber = template.getOldPurchaseOrderNumber();
        return builder;
    }

}
