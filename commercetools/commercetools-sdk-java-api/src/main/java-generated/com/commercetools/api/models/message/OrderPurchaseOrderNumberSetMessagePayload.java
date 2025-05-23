
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Purchase Order Number update action.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("OrderPurchaseOrderNumberSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderPurchaseOrderNumberSetMessagePayloadImpl.class)
public interface OrderPurchaseOrderNumberSetMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderPurchaseOrderNumberSetMessagePayload
     */
    String ORDER_PURCHASE_ORDER_NUMBER_SET = "OrderPurchaseOrderNumberSet";

    /**
     *  <p>Purchase order number on the Order after the Set Purchase Order Number update action.</p>
     * @return purchaseOrderNumber
     */

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();

    /**
     *  <p>Purchase order number on the Order before the Set Purchase Order Number update action.</p>
     * @return oldPurchaseOrderNumber
     */

    @JsonProperty("oldPurchaseOrderNumber")
    public String getOldPurchaseOrderNumber();

    /**
     *  <p>Purchase order number on the Order after the Set Purchase Order Number update action.</p>
     * @param purchaseOrderNumber value to be set
     */

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    /**
     *  <p>Purchase order number on the Order before the Set Purchase Order Number update action.</p>
     * @param oldPurchaseOrderNumber value to be set
     */

    public void setOldPurchaseOrderNumber(final String oldPurchaseOrderNumber);

    /**
     * factory method
     * @return instance of OrderPurchaseOrderNumberSetMessagePayload
     */
    public static OrderPurchaseOrderNumberSetMessagePayload of() {
        return new OrderPurchaseOrderNumberSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderPurchaseOrderNumberSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderPurchaseOrderNumberSetMessagePayload of(
            final OrderPurchaseOrderNumberSetMessagePayload template) {
        OrderPurchaseOrderNumberSetMessagePayloadImpl instance = new OrderPurchaseOrderNumberSetMessagePayloadImpl();
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setOldPurchaseOrderNumber(template.getOldPurchaseOrderNumber());
        return instance;
    }

    public OrderPurchaseOrderNumberSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of OrderPurchaseOrderNumberSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderPurchaseOrderNumberSetMessagePayload deepCopy(
            @Nullable final OrderPurchaseOrderNumberSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderPurchaseOrderNumberSetMessagePayloadImpl instance = new OrderPurchaseOrderNumberSetMessagePayloadImpl();
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setOldPurchaseOrderNumber(template.getOldPurchaseOrderNumber());
        return instance;
    }

    /**
     * builder factory method for OrderPurchaseOrderNumberSetMessagePayload
     * @return builder
     */
    public static OrderPurchaseOrderNumberSetMessagePayloadBuilder builder() {
        return OrderPurchaseOrderNumberSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderPurchaseOrderNumberSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderPurchaseOrderNumberSetMessagePayloadBuilder builder(
            final OrderPurchaseOrderNumberSetMessagePayload template) {
        return OrderPurchaseOrderNumberSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderPurchaseOrderNumberSetMessagePayload(
            Function<OrderPurchaseOrderNumberSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderPurchaseOrderNumberSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPurchaseOrderNumberSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPurchaseOrderNumberSetMessagePayload>";
            }
        };
    }
}
