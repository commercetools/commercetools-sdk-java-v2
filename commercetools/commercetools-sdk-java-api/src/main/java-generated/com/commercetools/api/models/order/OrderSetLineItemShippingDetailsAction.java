
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * OrderSetLineItemShippingDetailsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetLineItemShippingDetailsAction orderSetLineItemShippingDetailsAction = OrderSetLineItemShippingDetailsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLineItemShippingDetails")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetLineItemShippingDetailsActionImpl.class)
public interface OrderSetLineItemShippingDetailsAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetLineItemShippingDetailsAction
     */
    String SET_LINE_ITEM_SHIPPING_DETAILS = "setLineItemShippingDetails";

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @JsonProperty("lineItemKey")
    public String getLineItemKey();

    /**
     *  <p>Value to set. If empty, the existing value is removed.</p>
     * @return shippingDetails
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     */

    public void setLineItemKey(final String lineItemKey);

    /**
     *  <p>Value to set. If empty, the existing value is removed.</p>
     * @param shippingDetails value to be set
     */

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    /**
     * factory method
     * @return instance of OrderSetLineItemShippingDetailsAction
     */
    public static OrderSetLineItemShippingDetailsAction of() {
        return new OrderSetLineItemShippingDetailsActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetLineItemShippingDetailsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetLineItemShippingDetailsAction of(final OrderSetLineItemShippingDetailsAction template) {
        OrderSetLineItemShippingDetailsActionImpl instance = new OrderSetLineItemShippingDetailsActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    public OrderSetLineItemShippingDetailsAction copyDeep();

    /**
     * factory method to create a deep copy of OrderSetLineItemShippingDetailsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetLineItemShippingDetailsAction deepCopy(
            @Nullable final OrderSetLineItemShippingDetailsAction template) {
        if (template == null) {
            return null;
        }
        OrderSetLineItemShippingDetailsActionImpl instance = new OrderSetLineItemShippingDetailsActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setShippingDetails(
            com.commercetools.api.models.cart.ItemShippingDetailsDraft.deepCopy(template.getShippingDetails()));
        return instance;
    }

    /**
     * builder factory method for OrderSetLineItemShippingDetailsAction
     * @return builder
     */
    public static OrderSetLineItemShippingDetailsActionBuilder builder() {
        return OrderSetLineItemShippingDetailsActionBuilder.of();
    }

    /**
     * create builder for OrderSetLineItemShippingDetailsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetLineItemShippingDetailsActionBuilder builder(
            final OrderSetLineItemShippingDetailsAction template) {
        return OrderSetLineItemShippingDetailsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetLineItemShippingDetailsAction(Function<OrderSetLineItemShippingDetailsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetLineItemShippingDetailsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetLineItemShippingDetailsAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetLineItemShippingDetailsAction>";
            }
        };
    }
}
