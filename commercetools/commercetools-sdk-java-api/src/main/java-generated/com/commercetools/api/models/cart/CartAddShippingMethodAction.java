
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.DeliveryDraft;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adds a Shipping Method for a specified shipping address to a Cart with <code>Multiple</code> ShippingMode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartAddShippingMethodAction cartAddShippingMethodAction = CartAddShippingMethodAction.builder()
 *             .shippingKey("{shippingKey}")
 *             .shippingMethod(shippingMethodBuilder -> shippingMethodBuilder)
 *             .shippingAddress(shippingAddressBuilder -> shippingAddressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartAddShippingMethodActionImpl.class)
public interface CartAddShippingMethodAction extends CartUpdateAction {

    String ADD_SHIPPING_METHOD = "addShippingMethod";

    /**
     *  <p>User-defined identifier for the Shipping that must be unique across the Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */
    @NotNull
    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>RecourceIdentifier to a ShippingMethod to add to the Cart with <code>Multiple</code> ShippingMode. If the referenced Shipping Method has a predicate that does not match the Cart, an InvalidOperation error is returned.</p>
     * @return shippingMethod
     */
    @NotNull
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodResourceIdentifier getShippingMethod();

    /**
     *  <p>Determines the shipping rate and Tax Rate of the Line Items.</p>
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
     *  <p>Tax Rate used to tax a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p>Deliveries to be shipped with the referenced Shipping Method.</p>
     * @return deliveries
     */
    @Valid
    @JsonProperty("deliveries")
    public List<DeliveryDraft> getDeliveries();

    /**
     *  <p>Custom Fields for the Shipping Method.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setShippingKey(final String shippingKey);

    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);

    public void setShippingAddress(final BaseAddress shippingAddress);

    public void setShippingRateInput(final ShippingRateInputDraft shippingRateInput);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    @JsonIgnore
    public void setDeliveries(final DeliveryDraft... deliveries);

    public void setDeliveries(final List<DeliveryDraft> deliveries);

    public void setCustom(final CustomFieldsDraft custom);

    public static CartAddShippingMethodAction of() {
        return new CartAddShippingMethodActionImpl();
    }

    public static CartAddShippingMethodAction of(final CartAddShippingMethodAction template) {
        CartAddShippingMethodActionImpl instance = new CartAddShippingMethodActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setShippingMethod(template.getShippingMethod());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        instance.setDeliveries(template.getDeliveries());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static CartAddShippingMethodActionBuilder builder() {
        return CartAddShippingMethodActionBuilder.of();
    }

    public static CartAddShippingMethodActionBuilder builder(final CartAddShippingMethodAction template) {
        return CartAddShippingMethodActionBuilder.of(template);
    }

    default <T> T withCartAddShippingMethodAction(Function<CartAddShippingMethodAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartAddShippingMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartAddShippingMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartAddShippingMethodAction>";
            }
        };
    }
}
