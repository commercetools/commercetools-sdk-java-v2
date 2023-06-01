package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.cart.ShippingRateInputDraft;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.DeliveryDraft;
import com.commercetools.api.models.shipping_method.ShippingMethodReference;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.cart.ShippingDraftImpl;

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
 *  <p>Wraps all shipping-related information (such as address, rate, deliveries) per Shipping Method for Carts with multiple Shipping Methods.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingDraft shippingDraft = ShippingDraft.builder()
 *             .key("{key}")
 *             .shippingAddress(shippingAddressBuilder -> shippingAddressBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ShippingDraftImpl.class)
public interface ShippingDraft extends com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<ShippingDraft> {


    /**
     *  <p>User-defined unique identifier for the Shipping in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();
    /**
     *  <p>Shipping Methods added to the Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shippingMethod
     */
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodReference getShippingMethod();
    /**
     *  <p>Determines the shipping rate and Tax Rate of the associated Line Items.</p>
     * @return shippingAddress
     */
    @NotNull
    @Valid
    @JsonProperty("shippingAddress")
    public BaseAddress getShippingAddress();
    /**
     *  <p>Input used to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @return shippingRateInput
     */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInputDraft getShippingRateInput();
    /**
     *  <p>Tax Rate used for taxing a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();
    /**
     *  <p>Deliveries to be shipped with the Shipping Method.</p>
     * @return deliveries
     */
    @Valid
    @JsonProperty("deliveries")
    public List<DeliveryDraft> getDeliveries();
    /**
     *  <p>Custom Fields for Shipping.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>User-defined unique identifier for the Shipping in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    
    
    /**
     *  <p>Shipping Methods added to the Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingMethod value to be set
     */
    
    public void setShippingMethod(final ShippingMethodReference shippingMethod);
    
    
    /**
     *  <p>Determines the shipping rate and Tax Rate of the associated Line Items.</p>
     * @param shippingAddress value to be set
     */
    
    public void setShippingAddress(final BaseAddress shippingAddress);
    
    
    /**
     *  <p>Input used to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @param shippingRateInput value to be set
     */
    
    public void setShippingRateInput(final ShippingRateInputDraft shippingRateInput);
    
    
    /**
     *  <p>Tax Rate used for taxing a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     * @param externalTaxRate value to be set
     */
    
    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);
    
    
    /**
     *  <p>Deliveries to be shipped with the Shipping Method.</p>
     * @param deliveries values to be set
     */
    
    @JsonIgnore
    public void setDeliveries(final DeliveryDraft ...deliveries);
    /**
     *  <p>Deliveries to be shipped with the Shipping Method.</p>
     * @param deliveries values to be set
     */
    
    public void setDeliveries(final List<DeliveryDraft> deliveries);
    
    /**
     *  <p>Custom Fields for Shipping.</p>
     * @param custom value to be set
     */
    
    public void setCustom(final CustomFieldsDraft custom);
    

    /**
     * factory method
     * @return instance of ShippingDraft
     */
    public static ShippingDraft of(){
        return new ShippingDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy ShippingDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingDraft of(final ShippingDraft template) {
        ShippingDraftImpl instance = new ShippingDraftImpl();
        instance.setKey(template.getKey());
        instance.setShippingMethod(template.getShippingMethod());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        instance.setDeliveries(template.getDeliveries());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShippingDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingDraft deepCopy(@Nullable final ShippingDraft template) {
        if (template == null) {
            return null;
        }
        ShippingDraftImpl instance = new ShippingDraftImpl();
        instance.setKey(template.getKey());
        instance.setShippingMethod(com.commercetools.api.models.shipping_method.ShippingMethodReference.deepCopy(template.getShippingMethod()));
        instance.setShippingAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getShippingAddress()));
        instance.setShippingRateInput(com.commercetools.api.models.cart.ShippingRateInputDraft.deepCopy(template.getShippingRateInput()));
        instance.setExternalTaxRate(com.commercetools.api.models.cart.ExternalTaxRateDraft.deepCopy(template.getExternalTaxRate()));
        instance.setDeliveries(Optional.ofNullable(template.getDeliveries())
                .map(t -> t.stream().map(com.commercetools.api.models.order.DeliveryDraft::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for ShippingDraft
     * @return builder
     */
    public static ShippingDraftBuilder builder() {
        return ShippingDraftBuilder.of();
    }
    
    /**
     * create builder for ShippingDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingDraftBuilder builder(final ShippingDraft template) {
        return ShippingDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingDraft(Function<ShippingDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingDraft>";
            }
        };
    }
}
