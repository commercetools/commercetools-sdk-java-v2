
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>This update action fails with an InvalidOperation error if the referenced shipping method has a predicate that does not match the Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartAddShippingMethodActionImpl implements CartAddShippingMethodAction, ModelBase {

    private String action;

    private String shippingKey;

    private com.commercetools.api.models.shipping_method.ShippingMethodReference shippingMethod;

    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    private String externalTaxRate;

    private java.util.List<com.commercetools.api.models.order.Delivery> deliveries;

    private String custom;

    @JsonCreator
    CartAddShippingMethodActionImpl(@JsonProperty("shippingKey") final String shippingKey,
            @JsonProperty("shippingMethod") final com.commercetools.api.models.shipping_method.ShippingMethodReference shippingMethod,
            @JsonProperty("shippingAddress") final com.commercetools.api.models.common.BaseAddress shippingAddress,
            @JsonProperty("shippingRateInput") final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput,
            @JsonProperty("externalTaxRate") final String externalTaxRate,
            @JsonProperty("deliveries") final java.util.List<com.commercetools.api.models.order.Delivery> deliveries,
            @JsonProperty("custom") final String custom) {
        this.shippingKey = shippingKey;
        this.shippingMethod = shippingMethod;
        this.shippingAddress = shippingAddress;
        this.shippingRateInput = shippingRateInput;
        this.externalTaxRate = externalTaxRate;
        this.deliveries = deliveries;
        this.custom = custom;
        this.action = ADD_SHIPPING_METHOD;
    }

    public CartAddShippingMethodActionImpl() {
        this.action = ADD_SHIPPING_METHOD;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public com.commercetools.api.models.shipping_method.ShippingMethodReference getShippingMethod() {
        return this.shippingMethod;
    }

    /**
     *  <p>Determines the shipping rate and Tax Rate of the Line Items.</p>
     */

    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *  <p>Used as an input to select a ShippingRatePriceTier.</p>
     *  <ul>
     *   <li>Must be ClassificationShippingRateInput if ShippingRateInputType is CartClassificationType.</li>
     *   <li>Must be ScoreShippingRateInput if ShippingRateInputType is CartScoreType.</li>
     *  </ul>
     *  <p>The <code>shippingRateInput</code> cannot be set on the Cart if CartValueType is defined.</p>
     */

    public com.commercetools.api.models.cart.ShippingRateInputDraft getShippingRateInput() {
        return this.shippingRateInput;
    }

    /**
     *  <p>Tax Rate used to tax a shipping expense if a Cart has the <code>External</code> TaxMode.</p>
     */

    public String getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     *  <p>Deliveries tied to a Shipping Method in a multi-shipping method Cart. It holds information on how items are delivered to customers.</p>
     */

    public java.util.List<com.commercetools.api.models.order.Delivery> getDeliveries() {
        return this.deliveries;
    }

    /**
     *  <p>Custom Fields for the Shipping Method.</p>
     */

    public String getCustom() {
        return this.custom;
    }

    public void setShippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
    }

    public void setShippingMethod(
            final com.commercetools.api.models.shipping_method.ShippingMethodReference shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public void setShippingAddress(final com.commercetools.api.models.common.BaseAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setShippingRateInput(final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
    }

    public void setExternalTaxRate(final String externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
    }

    public void setDeliveries(final com.commercetools.api.models.order.Delivery... deliveries) {
        this.deliveries = new ArrayList<>(Arrays.asList(deliveries));
    }

    public void setDeliveries(final java.util.List<com.commercetools.api.models.order.Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    public void setCustom(final String custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartAddShippingMethodActionImpl that = (CartAddShippingMethodActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(shippingKey, that.shippingKey)
                .append(shippingMethod, that.shippingMethod)
                .append(shippingAddress, that.shippingAddress)
                .append(shippingRateInput, that.shippingRateInput)
                .append(externalTaxRate, that.externalTaxRate)
                .append(deliveries, that.deliveries)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(shippingKey)
                .append(shippingMethod)
                .append(shippingAddress)
                .append(shippingRateInput)
                .append(externalTaxRate)
                .append(deliveries)
                .append(custom)
                .toHashCode();
    }

}
