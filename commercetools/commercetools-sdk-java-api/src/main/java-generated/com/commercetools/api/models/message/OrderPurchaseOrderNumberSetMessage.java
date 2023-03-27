
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
 *     OrderPurchaseOrderNumberSetMessage orderPurchaseOrderNumberSetMessage = OrderPurchaseOrderNumberSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderPurchaseOrderNumberSetMessageImpl.class)
public interface OrderPurchaseOrderNumberSetMessage extends OrderMessage {

    /**
     * discriminator value for OrderPurchaseOrderNumberSetMessage
     */
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

    /**
     *  <p>Purchase order number on the Order after the Set PurchaseOrderNumber update action.</p>
     * @param purchaseOrderNumber value to be set
     */

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    /**
     *  <p>Purchase order number on the Order before the Set PurchaseOrderNumber update action.</p>
     * @param oldPurchaseOrderNumber value to be set
     */

    public void setOldPurchaseOrderNumber(final String oldPurchaseOrderNumber);

    /**
     * factory method
     * @return instance of OrderPurchaseOrderNumberSetMessage
     */
    public static OrderPurchaseOrderNumberSetMessage of() {
        return new OrderPurchaseOrderNumberSetMessageImpl();
    }

    /**
     * factory method to copy an instance of OrderPurchaseOrderNumberSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderPurchaseOrderNumberSetMessage of(final OrderPurchaseOrderNumberSetMessage template) {
        OrderPurchaseOrderNumberSetMessageImpl instance = new OrderPurchaseOrderNumberSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setOldPurchaseOrderNumber(template.getOldPurchaseOrderNumber());
        return instance;
    }

    /**
     * builder factory method for OrderPurchaseOrderNumberSetMessage
     * @return builder
     */
    public static OrderPurchaseOrderNumberSetMessageBuilder builder() {
        return OrderPurchaseOrderNumberSetMessageBuilder.of();
    }

    /**
     * create builder for OrderPurchaseOrderNumberSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderPurchaseOrderNumberSetMessageBuilder builder(final OrderPurchaseOrderNumberSetMessage template) {
        return OrderPurchaseOrderNumberSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderPurchaseOrderNumberSetMessage(Function<OrderPurchaseOrderNumberSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderPurchaseOrderNumberSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPurchaseOrderNumberSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPurchaseOrderNumberSetMessage>";
            }
        };
    }
}
