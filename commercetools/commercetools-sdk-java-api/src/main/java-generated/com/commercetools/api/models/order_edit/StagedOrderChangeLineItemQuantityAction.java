
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>When multiple shipping addresses are set for a Line Item, use the Remove LineItem and Add LineItem update action to change the shipping details. Since it is not possible for the API to infer how the overall change in the Line Item quantity should be distributed over the sub-quantities, the <code>shippingDetails</code> field is kept in its current state to avoid data loss.</p>
 *  <p>To change the Line Item quantity and shipping details together, use this update action in combination with the Set LineItem ShippingDetails update action in a single Order update command.</p>
 *  <p>The LineItem price is updated as described in LineItem Price selection.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeLineItemQuantityAction stagedOrderChangeLineItemQuantityAction = StagedOrderChangeLineItemQuantityAction.builder()
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderChangeLineItemQuantityActionImpl.class)
public interface StagedOrderChangeLineItemQuantityAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderChangeLineItemQuantityAction
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
     *  <p>New value to set. If <code>0</code>, the LineItem is removed from the Order.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Sets the LineItem <code>price</code> to the given value when changing the quantity of a Line Item with the <code>ExternalPrice</code> LineItemPriceMode.</p>
     *  <p>The LineItem price is updated as described in LineItem Price selection.</p>
     * @return externalPrice
     */
    @Valid
    @JsonProperty("externalPrice")
    public Money getExternalPrice();

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> to the given value when changing the quantity of a Line Item with the <code>ExternalTotal</code> LineItemPriceMode.</p>
     * @return externalTotalPrice
     */
    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

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
     *  <p>New value to set. If <code>0</code>, the LineItem is removed from the Order.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>Sets the LineItem <code>price</code> to the given value when changing the quantity of a Line Item with the <code>ExternalPrice</code> LineItemPriceMode.</p>
     *  <p>The LineItem price is updated as described in LineItem Price selection.</p>
     * @param externalPrice value to be set
     */

    public void setExternalPrice(final Money externalPrice);

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> to the given value when changing the quantity of a Line Item with the <code>ExternalTotal</code> LineItemPriceMode.</p>
     * @param externalTotalPrice value to be set
     */

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    /**
     * factory method
     * @return instance of StagedOrderChangeLineItemQuantityAction
     */
    public static StagedOrderChangeLineItemQuantityAction of() {
        return new StagedOrderChangeLineItemQuantityActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderChangeLineItemQuantityAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderChangeLineItemQuantityAction of(final StagedOrderChangeLineItemQuantityAction template) {
        StagedOrderChangeLineItemQuantityActionImpl instance = new StagedOrderChangeLineItemQuantityActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setQuantity(template.getQuantity());
        instance.setExternalPrice(template.getExternalPrice());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderChangeLineItemQuantityAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderChangeLineItemQuantityAction deepCopy(
            @Nullable final StagedOrderChangeLineItemQuantityAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderChangeLineItemQuantityActionImpl instance = new StagedOrderChangeLineItemQuantityActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setQuantity(template.getQuantity());
        instance.setExternalPrice(com.commercetools.api.models.common.Money.deepCopy(template.getExternalPrice()));
        instance.setExternalTotalPrice(
            com.commercetools.api.models.cart.ExternalLineItemTotalPrice.deepCopy(template.getExternalTotalPrice()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderChangeLineItemQuantityAction
     * @return builder
     */
    public static StagedOrderChangeLineItemQuantityActionBuilder builder() {
        return StagedOrderChangeLineItemQuantityActionBuilder.of();
    }

    /**
     * create builder for StagedOrderChangeLineItemQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangeLineItemQuantityActionBuilder builder(
            final StagedOrderChangeLineItemQuantityAction template) {
        return StagedOrderChangeLineItemQuantityActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderChangeLineItemQuantityAction(
            Function<StagedOrderChangeLineItemQuantityAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangeLineItemQuantityAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangeLineItemQuantityAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderChangeLineItemQuantityAction>";
            }
        };
    }
}
