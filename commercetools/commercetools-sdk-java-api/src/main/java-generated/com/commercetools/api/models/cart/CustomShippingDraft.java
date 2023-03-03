
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.DeliveryDraft;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the custom Shipping Method.</p>
     */
    @NotNull
    @JsonProperty("shippingMethodName")
    public String getShippingMethodName();

    /**
     *  <p>Determines the shipping rate and Tax Rate of the associated Line Items.</p>
     */
    @Valid
    @JsonProperty("shippingAddress")
    public BaseAddress getShippingAddress();

    /**
     *  <p>Determines the shipping price.</p>
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
     */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInputDraft getShippingRateInput();

    /**
     *  <p>Tax Category used to determine a shipping Tax Rate if the Cart has the <code>Platform</code> TaxMode.</p>
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <p>Tax Rate used to tax a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p>Deliveries to be shipped with the custom Shipping Method.</p>
     */
    @Valid
    @JsonProperty("deliveries")
    public List<DeliveryDraft> getDeliveries();

    /**
     *  <p>Custom Fields for the custom Shipping Method.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setKey(final String key);

    public void setShippingMethodName(final String shippingMethodName);

    public void setShippingAddress(final BaseAddress shippingAddress);

    public void setShippingRate(final ShippingRateDraft shippingRate);

    public void setShippingRateInput(final ShippingRateInputDraft shippingRateInput);

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    @JsonIgnore
    public void setDeliveries(final DeliveryDraft... deliveries);

    public void setDeliveries(final List<DeliveryDraft> deliveries);

    public void setCustom(final CustomFieldsDraft custom);

    public static CustomShippingDraft of() {
        return new CustomShippingDraftImpl();
    }

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

    public static CustomShippingDraftBuilder builder() {
        return CustomShippingDraftBuilder.of();
    }

    public static CustomShippingDraftBuilder builder(final CustomShippingDraft template) {
        return CustomShippingDraftBuilder.of(template);
    }

    default <T> T withCustomShippingDraft(Function<CustomShippingDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomShippingDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomShippingDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CustomShippingDraft>";
            }
        };
    }
}
