package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart.CartRemoveLineItemActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>The LineItem price is updated as described in LineItem Price selection.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartRemoveLineItemAction cartRemoveLineItemAction = CartRemoveLineItemAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartRemoveLineItemActionImpl.class)
public interface CartRemoveLineItemAction extends CartUpdateAction {

    /**
     * discriminator value for CartRemoveLineItemAction
     */
    String REMOVE_LINE_ITEM = "removeLineItem";

    /**
     *  <p><code>id</code> of the Line Item to remove.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    /**
     *  <p>New value to set. If absent or <code>0</code>, the Line Item is removed from the Cart.</p>
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
     *  <p><code>id</code> of the Line Item to remove.</p>
     * @param lineItemId value to be set
     */
    
    public void setLineItemId(final String lineItemId);
    
    
    /**
     *  <p>New value to set. If absent or <code>0</code>, the Line Item is removed from the Cart.</p>
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
     * @return instance of CartRemoveLineItemAction
     */
    public static CartRemoveLineItemAction of(){
        return new CartRemoveLineItemActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CartRemoveLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartRemoveLineItemAction of(final CartRemoveLineItemAction template) {
        CartRemoveLineItemActionImpl instance = new CartRemoveLineItemActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setExternalPrice(template.getExternalPrice());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        instance.setShippingDetailsToRemove(template.getShippingDetailsToRemove());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartRemoveLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartRemoveLineItemAction deepCopy(@Nullable final CartRemoveLineItemAction template) {
        if (template == null) {
            return null;
        }
        CartRemoveLineItemActionImpl instance = new CartRemoveLineItemActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setExternalPrice(com.commercetools.api.models.common.Money.deepCopy(template.getExternalPrice()));
        instance.setExternalTotalPrice(com.commercetools.api.models.cart.ExternalLineItemTotalPrice.deepCopy(template.getExternalTotalPrice()));
        instance.setShippingDetailsToRemove(com.commercetools.api.models.cart.ItemShippingDetailsDraft.deepCopy(template.getShippingDetailsToRemove()));
        return instance;
    }

    /**
     * builder factory method for CartRemoveLineItemAction
     * @return builder
     */
    public static CartRemoveLineItemActionBuilder builder() {
        return CartRemoveLineItemActionBuilder.of();
    }
    
    /**
     * create builder for CartRemoveLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartRemoveLineItemActionBuilder builder(final CartRemoveLineItemAction template) {
        return CartRemoveLineItemActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartRemoveLineItemAction(Function<CartRemoveLineItemAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartRemoveLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartRemoveLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartRemoveLineItemAction>";
            }
        };
    }
}
