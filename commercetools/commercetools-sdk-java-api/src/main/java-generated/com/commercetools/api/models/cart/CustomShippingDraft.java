
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
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
 *             .plusDeliveries(deliveriesBuilder -> deliveriesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomShippingDraftImpl.class)
public interface CustomShippingDraft {

    /**
     *  <p>User-defined unique identifier of the custom Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
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
     *  <p>Used as an input to select a ShippingRatePriceTier.</p>
     *  <ul>
     *   <li>Must be ClassificationShippingRateInput if ShippingRateInputType is CartClassificationType.</li>
     *   <li>Must be ScoreShippingRateInput if ShippingRateInputType is CartScoreType.</li>
     *  </ul>
     *  <p>The <code>shippingRateInput</code> cannot be set on the Cart if CartValueType is defined.</p>
     */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInputDraft getShippingRateInput();

    /**
     *  <p>Tax Category used to determine a shipping Tax Rate if a Cart has the <code>Platform</code> TaxMode.</p>
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <p>Tax Rate used to tax a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     */

    @JsonProperty("externalTaxRate")
    public String getExternalTaxRate();

    /**
     *  <p>Deliveries tied to a Shipping Method in a multi-shipping method Cart. It holds information on how items are delivered to customers.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("deliveries")
    public List<Delivery> getDeliveries();

    /**
     *  <p>Custom Fields for the custom Shipping Method.</p>
     */

    @JsonProperty("custom")
    public String getCustom();

    public void setKey(final String key);

    public void setShippingMethodName(final String shippingMethodName);

    public void setShippingAddress(final BaseAddress shippingAddress);

    public void setShippingRate(final ShippingRateDraft shippingRate);

    public void setShippingRateInput(final ShippingRateInputDraft shippingRateInput);

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    public void setExternalTaxRate(final String externalTaxRate);

    @JsonIgnore
    public void setDeliveries(final Delivery... deliveries);

    public void setDeliveries(final List<Delivery> deliveries);

    public void setCustom(final String custom);

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
