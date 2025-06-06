
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Produces the PurchaseOrderNumberSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetPurchaseOrderNumberAction orderSetPurchaseOrderNumberAction = OrderSetPurchaseOrderNumberAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setPurchaseOrderNumber")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetPurchaseOrderNumberActionImpl.class)
public interface OrderSetPurchaseOrderNumberAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetPurchaseOrderNumberAction
     */
    String SET_PURCHASE_ORDER_NUMBER = "setPurchaseOrderNumber";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return purchaseOrderNumber
     */

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param purchaseOrderNumber value to be set
     */

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    /**
     * factory method
     * @return instance of OrderSetPurchaseOrderNumberAction
     */
    public static OrderSetPurchaseOrderNumberAction of() {
        return new OrderSetPurchaseOrderNumberActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetPurchaseOrderNumberAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetPurchaseOrderNumberAction of(final OrderSetPurchaseOrderNumberAction template) {
        OrderSetPurchaseOrderNumberActionImpl instance = new OrderSetPurchaseOrderNumberActionImpl();
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        return instance;
    }

    public OrderSetPurchaseOrderNumberAction copyDeep();

    /**
     * factory method to create a deep copy of OrderSetPurchaseOrderNumberAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetPurchaseOrderNumberAction deepCopy(
            @Nullable final OrderSetPurchaseOrderNumberAction template) {
        if (template == null) {
            return null;
        }
        OrderSetPurchaseOrderNumberActionImpl instance = new OrderSetPurchaseOrderNumberActionImpl();
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        return instance;
    }

    /**
     * builder factory method for OrderSetPurchaseOrderNumberAction
     * @return builder
     */
    public static OrderSetPurchaseOrderNumberActionBuilder builder() {
        return OrderSetPurchaseOrderNumberActionBuilder.of();
    }

    /**
     * create builder for OrderSetPurchaseOrderNumberAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetPurchaseOrderNumberActionBuilder builder(final OrderSetPurchaseOrderNumberAction template) {
        return OrderSetPurchaseOrderNumberActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetPurchaseOrderNumberAction(Function<OrderSetPurchaseOrderNumberAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetPurchaseOrderNumberAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetPurchaseOrderNumberAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetPurchaseOrderNumberAction>";
            }
        };
    }
}
