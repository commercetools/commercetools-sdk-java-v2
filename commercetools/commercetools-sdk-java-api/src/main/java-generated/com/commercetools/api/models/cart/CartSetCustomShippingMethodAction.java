package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.cart.CartSetCustomShippingMethodActionImpl;

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
 *  <p>To set the Cart's custom Shipping Method (independent of the ShippingMethods managed through the Shipping Methods API) the Cart must have the <code>Single</code> ShippingMode and a <code>shippingAddress</code>.</p>
 *  <p>To unset a custom Shipping Method on a Cart, use the Set ShippingMethod update action without the <code>shippingMethod</code> field instead.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomShippingMethodAction cartSetCustomShippingMethodAction = CartSetCustomShippingMethodAction.builder()
 *             .shippingMethodName("{shippingMethodName}")
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartSetCustomShippingMethodActionImpl.class)
public interface CartSetCustomShippingMethodAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetCustomShippingMethodAction
     */
    String SET_CUSTOM_SHIPPING_METHOD = "setCustomShippingMethod";

    /**
     *  <p>Name of the custom Shipping Method.</p>
     * @return shippingMethodName
     */
    @NotNull
    @JsonProperty("shippingMethodName")
    public String getShippingMethodName();
    /**
     *  <p>Determines the shipping price.</p>
     * @return shippingRate
     */
    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRateDraft getShippingRate();
    /**
     *  <p>Tax Category used to determine the Tax Rate when the Cart has the <code>Platform</code> TaxMode.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();
    /**
     *  <p>External Tax Rate for the <code>shippingRate</code> to be set if the Cart has the <code>External</code> TaxMode.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p>Name of the custom Shipping Method.</p>
     * @param shippingMethodName value to be set
     */
    
    public void setShippingMethodName(final String shippingMethodName);
    
    
    /**
     *  <p>Determines the shipping price.</p>
     * @param shippingRate value to be set
     */
    
    public void setShippingRate(final ShippingRateDraft shippingRate);
    
    
    /**
     *  <p>Tax Category used to determine the Tax Rate when the Cart has the <code>Platform</code> TaxMode.</p>
     * @param taxCategory value to be set
     */
    
    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);
    
    
    /**
     *  <p>External Tax Rate for the <code>shippingRate</code> to be set if the Cart has the <code>External</code> TaxMode.</p>
     * @param externalTaxRate value to be set
     */
    
    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);
    

    /**
     * factory method
     * @return instance of CartSetCustomShippingMethodAction
     */
    public static CartSetCustomShippingMethodAction of(){
        return new CartSetCustomShippingMethodActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CartSetCustomShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetCustomShippingMethodAction of(final CartSetCustomShippingMethodAction template) {
        CartSetCustomShippingMethodActionImpl instance = new CartSetCustomShippingMethodActionImpl();
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setShippingRate(template.getShippingRate());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetCustomShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetCustomShippingMethodAction deepCopy(@Nullable final CartSetCustomShippingMethodAction template) {
        if (template == null) {
            return null;
        }
        CartSetCustomShippingMethodActionImpl instance = new CartSetCustomShippingMethodActionImpl();
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setShippingRate(com.commercetools.api.models.shipping_method.ShippingRateDraft.deepCopy(template.getShippingRate()));
        instance.setTaxCategory(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier.deepCopy(template.getTaxCategory()));
        instance.setExternalTaxRate(com.commercetools.api.models.cart.ExternalTaxRateDraft.deepCopy(template.getExternalTaxRate()));
        return instance;
    }

    /**
     * builder factory method for CartSetCustomShippingMethodAction
     * @return builder
     */
    public static CartSetCustomShippingMethodActionBuilder builder() {
        return CartSetCustomShippingMethodActionBuilder.of();
    }
    
    /**
     * create builder for CartSetCustomShippingMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCustomShippingMethodActionBuilder builder(final CartSetCustomShippingMethodAction template) {
        return CartSetCustomShippingMethodActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetCustomShippingMethodAction(Function<CartSetCustomShippingMethodAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCustomShippingMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCustomShippingMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCustomShippingMethodAction>";
            }
        };
    }
}
