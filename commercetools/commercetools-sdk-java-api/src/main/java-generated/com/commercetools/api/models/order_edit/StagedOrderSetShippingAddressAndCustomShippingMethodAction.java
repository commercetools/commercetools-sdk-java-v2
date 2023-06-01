package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl;

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
 * StagedOrderSetShippingAddressAndCustomShippingMethodAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingAddressAndCustomShippingMethodAction stagedOrderSetShippingAddressAndCustomShippingMethodAction = StagedOrderSetShippingAddressAndCustomShippingMethodAction.builder()
 *             .address(addressBuilder -> addressBuilder)
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
@JsonDeserialize(as = StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl.class)
public interface StagedOrderSetShippingAddressAndCustomShippingMethodAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetShippingAddressAndCustomShippingMethodAction
     */
    String SET_SHIPPING_ADDRESS_AND_CUSTOM_SHIPPING_METHOD = "setShippingAddressAndCustomShippingMethod";

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();
    /**
     *
     * @return shippingMethodName
     */
    @NotNull
    @JsonProperty("shippingMethodName")
    public String getShippingMethodName();
    /**
     *
     * @return shippingRate
     */
    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRateDraft getShippingRate();
    /**
     *  <p>ResourceIdentifier to a TaxCategory.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();
    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param address value to be set
     */
    
    public void setAddress(final BaseAddress address);
    
    
    /**
     * set shippingMethodName
     * @param shippingMethodName value to be set
     */
    
    public void setShippingMethodName(final String shippingMethodName);
    
    
    /**
     * set shippingRate
     * @param shippingRate value to be set
     */
    
    public void setShippingRate(final ShippingRateDraft shippingRate);
    
    
    /**
     *  <p>ResourceIdentifier to a TaxCategory.</p>
     * @param taxCategory value to be set
     */
    
    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);
    
    
    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param externalTaxRate value to be set
     */
    
    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);
    

    /**
     * factory method
     * @return instance of StagedOrderSetShippingAddressAndCustomShippingMethodAction
     */
    public static StagedOrderSetShippingAddressAndCustomShippingMethodAction of(){
        return new StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl();
    }
    

    /**
     * factory method to create a shallow copy StagedOrderSetShippingAddressAndCustomShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetShippingAddressAndCustomShippingMethodAction of(final StagedOrderSetShippingAddressAndCustomShippingMethodAction template) {
        StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl instance = new StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl();
        instance.setAddress(template.getAddress());
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setShippingRate(template.getShippingRate());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetShippingAddressAndCustomShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetShippingAddressAndCustomShippingMethodAction deepCopy(@Nullable final StagedOrderSetShippingAddressAndCustomShippingMethodAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl instance = new StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl();
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setShippingRate(com.commercetools.api.models.shipping_method.ShippingRateDraft.deepCopy(template.getShippingRate()));
        instance.setTaxCategory(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier.deepCopy(template.getTaxCategory()));
        instance.setExternalTaxRate(com.commercetools.api.models.cart.ExternalTaxRateDraft.deepCopy(template.getExternalTaxRate()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetShippingAddressAndCustomShippingMethodAction
     * @return builder
     */
    public static StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder builder() {
        return StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder.of();
    }
    
    /**
     * create builder for StagedOrderSetShippingAddressAndCustomShippingMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder builder(final StagedOrderSetShippingAddressAndCustomShippingMethodAction template) {
        return StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetShippingAddressAndCustomShippingMethodAction(Function<StagedOrderSetShippingAddressAndCustomShippingMethodAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingAddressAndCustomShippingMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingAddressAndCustomShippingMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetShippingAddressAndCustomShippingMethodAction>";
            }
        };
    }
}
