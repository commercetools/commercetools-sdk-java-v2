
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>The LineItem price is updated as described in Line Item price selection.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartRemoveLineItemAction myCartRemoveLineItemAction = MyCartRemoveLineItemAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeLineItem")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartRemoveLineItemActionImpl.class)
public interface MyCartRemoveLineItemAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartRemoveLineItemAction
     */
    String REMOVE_LINE_ITEM = "removeLineItem";

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
     *  <p>Amount to subtract from the LineItem's <code>quantity</code>. If absent, the LineItem is removed from the Cart.</p>
     * @return quantity
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Sets the LineItem <code>price</code> to the given value when decreasing the quantity of a Line Item with the <code>ExternalPrice</code> LineItemPriceMode.</p>
     * @return externalPrice
     */
    @Valid
    @JsonProperty("externalPrice")
    public Money getExternalPrice();

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> to the given value when decreasing the quantity of a Line Item with the <code>ExternalTotal</code> LineItemPriceMode.</p>
     * @return externalTotalPrice
     */
    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    /**
     *  <p>Container for Line Item-specific addresses to remove.</p>
     * @return shippingDetailsToRemove
     */
    @Valid
    @JsonProperty("shippingDetailsToRemove")
    public ItemShippingDetailsDraft getShippingDetailsToRemove();

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
     *  <p>Amount to subtract from the LineItem's <code>quantity</code>. If absent, the LineItem is removed from the Cart.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>Sets the LineItem <code>price</code> to the given value when decreasing the quantity of a Line Item with the <code>ExternalPrice</code> LineItemPriceMode.</p>
     * @param externalPrice value to be set
     */

    public void setExternalPrice(final Money externalPrice);

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> to the given value when decreasing the quantity of a Line Item with the <code>ExternalTotal</code> LineItemPriceMode.</p>
     * @param externalTotalPrice value to be set
     */

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    /**
     *  <p>Container for Line Item-specific addresses to remove.</p>
     * @param shippingDetailsToRemove value to be set
     */

    public void setShippingDetailsToRemove(final ItemShippingDetailsDraft shippingDetailsToRemove);

    /**
     * factory method
     * @return instance of MyCartRemoveLineItemAction
     */
    public static MyCartRemoveLineItemAction of() {
        return new MyCartRemoveLineItemActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartRemoveLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartRemoveLineItemAction of(final MyCartRemoveLineItemAction template) {
        MyCartRemoveLineItemActionImpl instance = new MyCartRemoveLineItemActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setQuantity(template.getQuantity());
        instance.setExternalPrice(template.getExternalPrice());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        instance.setShippingDetailsToRemove(template.getShippingDetailsToRemove());
        return instance;
    }

    public MyCartRemoveLineItemAction copyDeep();

    /**
     * factory method to create a deep copy of MyCartRemoveLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartRemoveLineItemAction deepCopy(@Nullable final MyCartRemoveLineItemAction template) {
        if (template == null) {
            return null;
        }
        MyCartRemoveLineItemActionImpl instance = new MyCartRemoveLineItemActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setQuantity(template.getQuantity());
        instance.setExternalPrice(com.commercetools.api.models.common.Money.deepCopy(template.getExternalPrice()));
        instance.setExternalTotalPrice(
            com.commercetools.api.models.cart.ExternalLineItemTotalPrice.deepCopy(template.getExternalTotalPrice()));
        instance.setShippingDetailsToRemove(
            com.commercetools.api.models.cart.ItemShippingDetailsDraft.deepCopy(template.getShippingDetailsToRemove()));
        return instance;
    }

    /**
     * builder factory method for MyCartRemoveLineItemAction
     * @return builder
     */
    public static MyCartRemoveLineItemActionBuilder builder() {
        return MyCartRemoveLineItemActionBuilder.of();
    }

    /**
     * create builder for MyCartRemoveLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartRemoveLineItemActionBuilder builder(final MyCartRemoveLineItemAction template) {
        return MyCartRemoveLineItemActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartRemoveLineItemAction(Function<MyCartRemoveLineItemAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartRemoveLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartRemoveLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartRemoveLineItemAction>";
            }
        };
    }
}
