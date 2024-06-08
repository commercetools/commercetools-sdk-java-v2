
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.DeliveryDraft;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * CustomShippingDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomShippingDraft customShippingDraft = CustomShippingDraft.builder()
 *             .key("{key}")
 *             .shippingMethodName("{shippingMethodName}")
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomShippingDraftImpl.class)
public interface CustomShippingDraft
        extends com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<CustomShippingDraft> {

    /**
     *  <p>User-defined unique identifier of the custom Shipping Method in the Cart with <code>Multiple</code> ShippingMode.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the custom Shipping Method.</p>
     * @return shippingMethodName
     */
    @NotNull
    @JsonProperty("shippingMethodName")
    public String getShippingMethodName();

    /**
     *  <p>Determines the shipping rate and Tax Rate of the associated Line Items.</p>
     * @return shippingAddress
     */
    @Valid
    @JsonProperty("shippingAddress")
    public BaseAddress getShippingAddress();

    /**
     *  <p>Determines the shipping price.</p>
     * @return shippingRate
     */
    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRateDraft getShippingRate();

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
     *  <p>Tax Category used to determine a shipping Tax Rate if the Cart has the <code>Platform</code> TaxMode.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <p>Tax Rate used to tax a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p>Deliveries to be shipped with the custom Shipping Method.</p>
     * @return deliveries
     */
    @Valid
    @JsonProperty("deliveries")
    public List<DeliveryDraft> getDeliveries();

    /**
     *  <p>Custom Fields for the custom Shipping Method.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>User-defined unique identifier of the custom Shipping Method in the Cart with <code>Multiple</code> ShippingMode.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the custom Shipping Method.</p>
     * @param shippingMethodName value to be set
     */

    public void setShippingMethodName(final String shippingMethodName);

    /**
     *  <p>Determines the shipping rate and Tax Rate of the associated Line Items.</p>
     * @param shippingAddress value to be set
     */

    public void setShippingAddress(final BaseAddress shippingAddress);

    /**
     *  <p>Determines the shipping price.</p>
     * @param shippingRate value to be set
     */

    public void setShippingRate(final ShippingRateDraft shippingRate);

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
     *  <p>Tax Category used to determine a shipping Tax Rate if the Cart has the <code>Platform</code> TaxMode.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    /**
     *  <p>Tax Rate used to tax a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     * @param externalTaxRate value to be set
     */

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    /**
     *  <p>Deliveries to be shipped with the custom Shipping Method.</p>
     * @param deliveries values to be set
     */

    @JsonIgnore
    public void setDeliveries(final DeliveryDraft... deliveries);

    /**
     *  <p>Deliveries to be shipped with the custom Shipping Method.</p>
     * @param deliveries values to be set
     */

    public void setDeliveries(final List<DeliveryDraft> deliveries);

    /**
     *  <p>Custom Fields for the custom Shipping Method.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of CustomShippingDraft
     */
    public static CustomShippingDraft of() {
        return new CustomShippingDraftImpl();
    }

    /**
     * factory method to create a shallow copy CustomShippingDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomShippingDraft of(final CustomShippingDraft template) {
        CustomShippingDraftImpl instance = new CustomShippingDraftImpl();
        instance.setKey(template.getKey());
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setShippingRate(template.getShippingRate());
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        instance.setDeliveries(template.getDeliveries());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomShippingDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomShippingDraft deepCopy(@Nullable final CustomShippingDraft template) {
        if (template == null) {
            return null;
        }
        CustomShippingDraftImpl instance = new CustomShippingDraftImpl();
        instance.setKey(template.getKey());
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setShippingAddress(
            com.commercetools.api.models.common.BaseAddress.deepCopy(template.getShippingAddress()));
        instance.setShippingRate(
            com.commercetools.api.models.shipping_method.ShippingRateDraft.deepCopy(template.getShippingRate()));
        instance.setShippingRateInput(
            com.commercetools.api.models.cart.ShippingRateInputDraft.deepCopy(template.getShippingRateInput()));
        instance.setTaxCategory(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier
                .deepCopy(template.getTaxCategory()));
        instance.setExternalTaxRate(
            com.commercetools.api.models.cart.ExternalTaxRateDraft.deepCopy(template.getExternalTaxRate()));
        instance.setDeliveries(Optional.ofNullable(template.getDeliveries())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.DeliveryDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for CustomShippingDraft
     * @return builder
     */
    public static CustomShippingDraftBuilder builder() {
        return CustomShippingDraftBuilder.of();
    }

    /**
     * create builder for CustomShippingDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomShippingDraftBuilder builder(final CustomShippingDraft template) {
        return CustomShippingDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomShippingDraft(Function<CustomShippingDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomShippingDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomShippingDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CustomShippingDraft>";
            }
        };
    }
}
