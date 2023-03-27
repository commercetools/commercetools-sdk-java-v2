
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
 *  <p>Wraps all shipping-related information (such as address, rate, deliveries) per Shipping Method for Carts with multiple Shipping Methods.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingDraftImpl implements ShippingDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.shipping_method.ShippingMethodReference shippingMethod;

    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    private java.util.List<com.commercetools.api.models.order.DeliveryDraft> deliveries;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("shippingMethod") final com.commercetools.api.models.shipping_method.ShippingMethodReference shippingMethod,
            @JsonProperty("shippingAddress") final com.commercetools.api.models.common.BaseAddress shippingAddress,
            @JsonProperty("shippingRateInput") final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate,
            @JsonProperty("deliveries") final java.util.List<com.commercetools.api.models.order.DeliveryDraft> deliveries,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.key = key;
        this.shippingMethod = shippingMethod;
        this.shippingAddress = shippingAddress;
        this.shippingRateInput = shippingRateInput;
        this.externalTaxRate = externalTaxRate;
        this.deliveries = deliveries;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public ShippingDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier for the Shipping in a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Shipping Methods added to the Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public com.commercetools.api.models.shipping_method.ShippingMethodReference getShippingMethod() {
        return this.shippingMethod;
    }

    /**
     *  <p>Determines the shipping rate and Tax Rate of the associated Line Items.</p>
     */

    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *  <p>Input used to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     */

    public com.commercetools.api.models.cart.ShippingRateInputDraft getShippingRateInput() {
        return this.shippingRateInput;
    }

    /**
     *  <p>Tax Rate used for taxing a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     */

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     *  <p>Deliveries to be shipped with the Shipping Method.</p>
     */

    public java.util.List<com.commercetools.api.models.order.DeliveryDraft> getDeliveries() {
        return this.deliveries;
    }

    /**
     *  <p>Custom Fields for Shipping.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
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

    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
    }

    public void setDeliveries(final com.commercetools.api.models.order.DeliveryDraft... deliveries) {
        this.deliveries = new ArrayList<>(Arrays.asList(deliveries));
    }

    public void setDeliveries(final java.util.List<com.commercetools.api.models.order.DeliveryDraft> deliveries) {
        this.deliveries = deliveries;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingDraftImpl that = (ShippingDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
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
        return new HashCodeBuilder(17, 37).append(key)
                .append(shippingMethod)
                .append(shippingAddress)
                .append(shippingRateInput)
                .append(externalTaxRate)
                .append(deliveries)
                .append(custom)
                .toHashCode();
    }

}
