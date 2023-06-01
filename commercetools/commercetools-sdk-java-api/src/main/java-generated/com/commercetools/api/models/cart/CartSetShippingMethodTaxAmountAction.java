package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalTaxAmountDraft;
import com.commercetools.api.models.cart.CartSetShippingMethodTaxAmountActionImpl;

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
 *  <p>A Shipping Method tax amount can be set if the Cart has the <code>ExternalAmount</code> TaxMode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingMethodTaxAmountAction cartSetShippingMethodTaxAmountAction = CartSetShippingMethodTaxAmountAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartSetShippingMethodTaxAmountActionImpl.class)
public interface CartSetShippingMethodTaxAmountAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetShippingMethodTaxAmountAction
     */
    String SET_SHIPPING_METHOD_TAX_AMOUNT = "setShippingMethodTaxAmount";

    /**
     *  <p><code>key</code> of the ShippingMethod to update. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */
    
    @JsonProperty("shippingKey")
    public String getShippingKey();
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return externalTaxAmount
     */
    @Valid
    @JsonProperty("externalTaxAmount")
    public ExternalTaxAmountDraft getExternalTaxAmount();

    /**
     *  <p><code>key</code> of the ShippingMethod to update. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */
    
    public void setShippingKey(final String shippingKey);
    
    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param externalTaxAmount value to be set
     */
    
    public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);
    

    /**
     * factory method
     * @return instance of CartSetShippingMethodTaxAmountAction
     */
    public static CartSetShippingMethodTaxAmountAction of(){
        return new CartSetShippingMethodTaxAmountActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CartSetShippingMethodTaxAmountAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetShippingMethodTaxAmountAction of(final CartSetShippingMethodTaxAmountAction template) {
        CartSetShippingMethodTaxAmountActionImpl instance = new CartSetShippingMethodTaxAmountActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setExternalTaxAmount(template.getExternalTaxAmount());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetShippingMethodTaxAmountAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetShippingMethodTaxAmountAction deepCopy(@Nullable final CartSetShippingMethodTaxAmountAction template) {
        if (template == null) {
            return null;
        }
        CartSetShippingMethodTaxAmountActionImpl instance = new CartSetShippingMethodTaxAmountActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setExternalTaxAmount(com.commercetools.api.models.cart.ExternalTaxAmountDraft.deepCopy(template.getExternalTaxAmount()));
        return instance;
    }

    /**
     * builder factory method for CartSetShippingMethodTaxAmountAction
     * @return builder
     */
    public static CartSetShippingMethodTaxAmountActionBuilder builder() {
        return CartSetShippingMethodTaxAmountActionBuilder.of();
    }
    
    /**
     * create builder for CartSetShippingMethodTaxAmountAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetShippingMethodTaxAmountActionBuilder builder(final CartSetShippingMethodTaxAmountAction template) {
        return CartSetShippingMethodTaxAmountActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetShippingMethodTaxAmountAction(Function<CartSetShippingMethodTaxAmountAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetShippingMethodTaxAmountAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetShippingMethodTaxAmountAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetShippingMethodTaxAmountAction>";
            }
        };
    }
}
