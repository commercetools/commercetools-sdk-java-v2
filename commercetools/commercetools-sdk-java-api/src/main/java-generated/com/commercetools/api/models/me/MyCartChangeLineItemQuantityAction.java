
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>When multiple shipping addresses are set for a Line Item, use the Remove LineItem and Add LineItem update action to change the shipping details. Since it is not possible for the API to infer how the overall change in the Line Item quantity should be distributed over the sub-quantities, the <code>shippingDetails</code> field is kept in its current state to avoid data loss.</p>
 *  <p>To change the Line Item quantity and shipping details together, use this update action in combination with the Set LineItem ShippingDetails update action in a single Cart update command.</p>
 *  <p>When the action applies to LineItems with <code>ExternalTotal</code> LineItemPriceMode, it will be changed to <code>ExternalPrice</code> and the existing <code>externalPrice</code> value, i.e. <code>LineItem.price</code>, will be retained. The LineItem total will be calculated by the system instead, so that the <code>externalTotalPrice</code> will be dropped.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartChangeLineItemQuantityAction myCartChangeLineItemQuantityAction = MyCartChangeLineItemQuantityAction.builder()
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartChangeLineItemQuantityActionImpl.class)
public interface MyCartChangeLineItemQuantityAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartChangeLineItemQuantityAction
     */
    String CHANGE_LINE_ITEM_QUANTITY = "changeLineItemQuantity";

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
     *  <p>New value to set.</p>
     *  <p>If <code>0</code>, the Line Item is removed from the Cart.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

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
     *  <p>New value to set.</p>
     *  <p>If <code>0</code>, the Line Item is removed from the Cart.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     * factory method
     * @return instance of MyCartChangeLineItemQuantityAction
     */
    public static MyCartChangeLineItemQuantityAction of() {
        return new MyCartChangeLineItemQuantityActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartChangeLineItemQuantityAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartChangeLineItemQuantityAction of(final MyCartChangeLineItemQuantityAction template) {
        MyCartChangeLineItemQuantityActionImpl instance = new MyCartChangeLineItemQuantityActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCartChangeLineItemQuantityAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartChangeLineItemQuantityAction deepCopy(
            @Nullable final MyCartChangeLineItemQuantityAction template) {
        if (template == null) {
            return null;
        }
        MyCartChangeLineItemQuantityActionImpl instance = new MyCartChangeLineItemQuantityActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for MyCartChangeLineItemQuantityAction
     * @return builder
     */
    public static MyCartChangeLineItemQuantityActionBuilder builder() {
        return MyCartChangeLineItemQuantityActionBuilder.of();
    }

    /**
     * create builder for MyCartChangeLineItemQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartChangeLineItemQuantityActionBuilder builder(final MyCartChangeLineItemQuantityAction template) {
        return MyCartChangeLineItemQuantityActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartChangeLineItemQuantityAction(Function<MyCartChangeLineItemQuantityAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartChangeLineItemQuantityAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartChangeLineItemQuantityAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartChangeLineItemQuantityAction>";
            }
        };
    }
}
