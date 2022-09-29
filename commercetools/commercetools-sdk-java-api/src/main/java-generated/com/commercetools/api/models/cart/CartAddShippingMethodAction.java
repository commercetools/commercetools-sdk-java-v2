
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
 *  <p>This update action fails with an InvalidOperation error if the referenced shipping method has a predicate that does not match the Cart.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartAddShippingMethodAction cartAddShippingMethodAction = CartAddShippingMethodAction.builder()
 *             .shippingKey("{shippingKey}")
 *             .shippingMethod(shippingMethodBuilder -> shippingMethodBuilder)
 *             .shippingAddress(shippingAddressBuilder -> shippingAddressBuilder)
 *             .plusDeliveries(deliveriesBuilder -> deliveriesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartAddShippingMethodActionImpl.class)
public interface CartAddShippingMethodAction extends CartUpdateAction {

    String ADD_SHIPPING_METHOD = "addShippingMethod";

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     */
    @NotNull
    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodReference getShippingMethod();

    /**
     *  <p>Determines the shipping rate and Tax Rate of the Line Items.</p>
     */
    @NotNull
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
     *  <p>Tax Rate used to tax a shipping expense if a Cart has the <code>External</code> TaxMode.</p>
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
     *  <p>Custom Fields for the Shipping Method.</p>
     */

    @JsonProperty("custom")
    public String getCustom();

    public void setShippingKey(final String shippingKey);

    public void setShippingMethod(final ShippingMethodReference shippingMethod);

    public void setShippingAddress(final BaseAddress shippingAddress);

    public void setShippingRateInput(final ShippingRateInputDraft shippingRateInput);

    public void setExternalTaxRate(final String externalTaxRate);

    @JsonIgnore
    public void setDeliveries(final Delivery... deliveries);

    public void setDeliveries(final List<Delivery> deliveries);

    public void setCustom(final String custom);

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
