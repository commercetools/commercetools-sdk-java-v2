
package com.commercetools.api.models.me;

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
 * MyCartSetLineItemShippingDetailsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetLineItemShippingDetailsAction myCartSetLineItemShippingDetailsAction = MyCartSetLineItemShippingDetailsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetLineItemShippingDetailsActionImpl.class)
public interface MyCartSetLineItemShippingDetailsAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartSetLineItemShippingDetailsAction
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
     * @return instance of MyCartSetLineItemShippingDetailsAction
     */
    public static MyCartSetLineItemShippingDetailsAction of() {
        return new MyCartSetLineItemShippingDetailsActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartSetLineItemShippingDetailsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartSetLineItemShippingDetailsAction of(final MyCartSetLineItemShippingDetailsAction template) {
        MyCartSetLineItemShippingDetailsActionImpl instance = new MyCartSetLineItemShippingDetailsActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCartSetLineItemShippingDetailsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartSetLineItemShippingDetailsAction deepCopy(
            @Nullable final MyCartSetLineItemShippingDetailsAction template) {
        if (template == null) {
            return null;
        }
        MyCartSetLineItemShippingDetailsActionImpl instance = new MyCartSetLineItemShippingDetailsActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setShippingDetails(
            com.commercetools.api.models.cart.ItemShippingDetailsDraft.deepCopy(template.getShippingDetails()));
        return instance;
    }

    /**
     * builder factory method for MyCartSetLineItemShippingDetailsAction
     * @return builder
     */
    public static MyCartSetLineItemShippingDetailsActionBuilder builder() {
        return MyCartSetLineItemShippingDetailsActionBuilder.of();
    }

    /**
     * create builder for MyCartSetLineItemShippingDetailsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetLineItemShippingDetailsActionBuilder builder(
            final MyCartSetLineItemShippingDetailsAction template) {
        return MyCartSetLineItemShippingDetailsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartSetLineItemShippingDetailsAction(
            Function<MyCartSetLineItemShippingDetailsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetLineItemShippingDetailsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetLineItemShippingDetailsAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetLineItemShippingDetailsAction>";
            }
        };
    }
}
