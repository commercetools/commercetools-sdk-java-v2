
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
 *  <p>To add a custom Shipping Method (independent of the ShippingMethods managed through the Shipping Methods API) to the Cart, it <strong>must have</strong> the <code>Multiple</code> ShippingMode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartAddCustomShippingMethodAction cartAddCustomShippingMethodAction = CartAddCustomShippingMethodAction.builder()
 *             .shippingKey("{shippingKey}")
 *             .shippingMethodName("{shippingMethodName}")
 *             .shippingAddress(shippingAddressBuilder -> shippingAddressBuilder)
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartAddCustomShippingMethodActionImpl.class)
public interface CartAddCustomShippingMethodAction extends CartUpdateAction {

    String ADD_CUSTOM_SHIPPING_METHOD = "addCustomShippingMethod";

    /**
     *  <p>User-defined identifier for the custom Shipping Method that must be unique across the Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */
    @NotNull
    @JsonProperty("shippingKey")
    public String getShippingKey();

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
    @NotNull
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

    public void setShippingKey(final String shippingKey);

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

    public static CartAddCustomShippingMethodAction of() {
        return new CartAddCustomShippingMethodActionImpl();
    }

    public static CartAddCustomShippingMethodAction of(final CartAddCustomShippingMethodAction template) {
        CartAddCustomShippingMethodActionImpl instance = new CartAddCustomShippingMethodActionImpl();
        instance.setShippingKey(template.getShippingKey());
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

    public static CartAddCustomShippingMethodActionBuilder builder() {
        return CartAddCustomShippingMethodActionBuilder.of();
    }

    public static CartAddCustomShippingMethodActionBuilder builder(final CartAddCustomShippingMethodAction template) {
        return CartAddCustomShippingMethodActionBuilder.of(template);
    }

    default <T> T withCartAddCustomShippingMethodAction(Function<CartAddCustomShippingMethodAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartAddCustomShippingMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartAddCustomShippingMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartAddCustomShippingMethodAction>";
            }
        };
    }
}
