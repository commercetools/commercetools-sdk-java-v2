
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.shipping_method.ShippingMethodReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Wraps all shipping-related information (such as address, rate, deliveries) per Shipping Method for Carts with multiple Shipping Methods.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingDraft shippingDraft = ShippingDraft.builder()
 *             .key("{key}")
 *             .plusDeliveries(deliveriesBuilder -> deliveriesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingDraftImpl.class)
public interface ShippingDraft {

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Shipping Methods added to the Cart with <code>Multiple</code> ShippingMode.</p>
     */
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodReference getShippingMethod();

    /**
     *  <p>Determines the shipping rate and Tax Rate of the associated Line Items.</p>
     */
    @Valid
    @JsonProperty("shippingAddress")
    public BaseAddress getShippingAddress();

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
     *  <p>Tax Rate used for taxing a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     */

    @JsonProperty("externalTaxRate")
    public String getExternalTaxRate();

    /**
     *  <p>Holds information on how items are delivered to customers.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("deliveries")
    public List<Delivery> getDeliveries();

    /**
     *  <p>Custom Fields for Shipping.</p>
     */

    @JsonProperty("custom")
    public String getCustom();

    public void setKey(final String key);

    public void setShippingMethod(final ShippingMethodReference shippingMethod);

    public void setShippingAddress(final BaseAddress shippingAddress);

    public void setShippingRateInput(final ShippingRateInputDraft shippingRateInput);

    public void setExternalTaxRate(final String externalTaxRate);

    @JsonIgnore
    public void setDeliveries(final Delivery... deliveries);

    public void setDeliveries(final List<Delivery> deliveries);

    public void setCustom(final String custom);

    public static ShippingDraft of() {
        return new ShippingDraftImpl();
    }

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

    public static ShippingDraftBuilder builder() {
        return ShippingDraftBuilder.of();
    }

    public static ShippingDraftBuilder builder(final ShippingDraft template) {
        return ShippingDraftBuilder.of(template);
    }

    default <T> T withShippingDraft(Function<ShippingDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingDraft>";
            }
        };
    }
}
