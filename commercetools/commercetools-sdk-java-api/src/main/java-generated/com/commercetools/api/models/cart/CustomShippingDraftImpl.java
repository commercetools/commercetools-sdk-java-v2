
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
 * CustomShippingDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomShippingDraftImpl implements CustomShippingDraft, ModelBase {

    private String key;

    private String shippingMethodName;

    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    private String externalTaxRate;

    private java.util.List<com.commercetools.api.models.order.Delivery> deliveries;

    private String custom;

    @JsonCreator
    CustomShippingDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("shippingMethodName") final String shippingMethodName,
            @JsonProperty("shippingAddress") final com.commercetools.api.models.common.BaseAddress shippingAddress,
            @JsonProperty("shippingRate") final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate,
            @JsonProperty("shippingRateInput") final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory,
            @JsonProperty("externalTaxRate") final String externalTaxRate,
            @JsonProperty("deliveries") final java.util.List<com.commercetools.api.models.order.Delivery> deliveries,
            @JsonProperty("custom") final String custom) {
        this.key = key;
        this.shippingMethodName = shippingMethodName;
        this.shippingAddress = shippingAddress;
        this.shippingRate = shippingRate;
        this.shippingRateInput = shippingRateInput;
        this.taxCategory = taxCategory;
        this.externalTaxRate = externalTaxRate;
        this.deliveries = deliveries;
        this.custom = custom;
    }

    public CustomShippingDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier of the custom Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the custom Shipping Method.</p>
     */

    public String getShippingMethodName() {
        return this.shippingMethodName;
    }

    /**
     *  <p>Determines the shipping rate and Tax Rate of the associated Line Items.</p>
     */

    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *  <p>Determines the shipping price.</p>
     */

    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate() {
        return this.shippingRate;
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
     *  <p>Tax Category used to determine a shipping Tax Rate if a Cart has the <code>Platform</code> TaxMode.</p>
     */

    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>Tax Rate used to tax a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
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
     *  <p>Custom Fields for the custom Shipping Method.</p>
     */

    public String getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setShippingMethodName(final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
    }

    public void setShippingAddress(final com.commercetools.api.models.common.BaseAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setShippingRate(final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
    }

    public void setShippingRateInput(final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
    }

    public void setTaxCategory(
            final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
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

        CustomShippingDraftImpl that = (CustomShippingDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(shippingMethodName, that.shippingMethodName)
                .append(shippingAddress, that.shippingAddress)
                .append(shippingRate, that.shippingRate)
                .append(shippingRateInput, that.shippingRateInput)
                .append(taxCategory, that.taxCategory)
                .append(externalTaxRate, that.externalTaxRate)
                .append(deliveries, that.deliveries)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(shippingMethodName)
                .append(shippingAddress)
                .append(shippingRate)
                .append(shippingRateInput)
                .append(taxCategory)
                .append(externalTaxRate)
                .append(deliveries)
                .append(custom)
                .toHashCode();
    }

}
