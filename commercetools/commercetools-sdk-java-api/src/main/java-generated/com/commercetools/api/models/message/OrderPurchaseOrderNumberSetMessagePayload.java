
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set PurchaseOrderNumber update action.</p>
 *
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
@JsonDeserialize(as = OrderPurchaseOrderNumberSetMessagePayloadImpl.class)
public interface OrderPurchaseOrderNumberSetMessagePayload extends OrderMessagePayload {

    String ORDER_PURCHASE_ORDER_NUMBER_SET = "OrderPurchaseOrderNumberSet";

    /**
     *  <p>Purchase order number on the Order after the Set PurchaseOrderNumber update action.</p>
     * @return purchaseOrderNumber
     */

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();

    /**
     *  <p>Purchase order number on the Order before the Set PurchaseOrderNumber update action.</p>
     * @return oldPurchaseOrderNumber
     */

    @JsonProperty("oldPurchaseOrderNumber")
    public String getOldPurchaseOrderNumber();

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    public void setOldPurchaseOrderNumber(final String oldPurchaseOrderNumber);

    public static OrderPurchaseOrderNumberSetMessagePayload of() {
        return new OrderPurchaseOrderNumberSetMessagePayloadImpl();
    }

    public static OrderPurchaseOrderNumberSetMessagePayload of(
            final OrderPurchaseOrderNumberSetMessagePayload template) {
        OrderPurchaseOrderNumberSetMessagePayloadImpl instance = new OrderPurchaseOrderNumberSetMessagePayloadImpl();
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setOldPurchaseOrderNumber(template.getOldPurchaseOrderNumber());
        return instance;
    }

    public static OrderPurchaseOrderNumberSetMessagePayloadBuilder builder() {
        return OrderPurchaseOrderNumberSetMessagePayloadBuilder.of();
    }

    public static OrderPurchaseOrderNumberSetMessagePayloadBuilder builder(
            final OrderPurchaseOrderNumberSetMessagePayload template) {
        return OrderPurchaseOrderNumberSetMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderPurchaseOrderNumberSetMessagePayload(
            Function<OrderPurchaseOrderNumberSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderPurchaseOrderNumberSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPurchaseOrderNumberSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPurchaseOrderNumberSetMessagePayload>";
            }
        };
    }
}
