
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>To add a custom Shipping Method (independent of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethods</a> managed through the <span>Shipping Methods API</span>) to the Cart, it <strong>must have</strong> the <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartAddCustomShippingMethodActionImpl implements CartAddCustomShippingMethodAction, ModelBase {

    private String action;

    private String shippingKey;

    private String shippingMethodName;

    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    private java.util.List<com.commercetools.api.models.order.DeliveryDraft> deliveries;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartAddCustomShippingMethodActionImpl(@JsonProperty("shippingKey") final String shippingKey,
            @JsonProperty("shippingMethodName") final String shippingMethodName,
            @JsonProperty("shippingAddress") final com.commercetools.api.models.common.BaseAddress shippingAddress,
            @JsonProperty("shippingRate") final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate,
            @JsonProperty("shippingRateInput") final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate,
            @JsonProperty("deliveries") final java.util.List<com.commercetools.api.models.order.DeliveryDraft> deliveries,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.shippingKey = shippingKey;
        this.shippingMethodName = shippingMethodName;
        this.shippingAddress = shippingAddress;
        this.shippingRate = shippingRate;
        this.shippingRateInput = shippingRateInput;
        this.taxCategory = taxCategory;
        this.externalTaxRate = externalTaxRate;
        this.deliveries = deliveries;
        this.custom = custom;
        this.action = ADD_CUSTOM_SHIPPING_METHOD;
    }

    /**
     * create empty instance
     */
    public CartAddCustomShippingMethodActionImpl() {
        this.action = ADD_CUSTOM_SHIPPING_METHOD;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>User-defined identifier for the custom Shipping Method that must be unique across the Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     */

    public String getShippingKey() {
        return this.shippingKey;
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
     *  <p>Input used to select a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRatePriceTier" rel="nofollow">ShippingRatePriceTier</a>. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be <a href="https://docs.commercetools.com/apis/ctp:api:type:ClassificationShippingRateInputDraft" rel="nofollow">ClassificationShippingRateInputDraft</a>.</li>
     *   <li>If <code>CartScore</code>, it must be <a href="https://docs.commercetools.com/apis/ctp:api:type:ScoreShippingRateInputDraft" rel="nofollow">ScoreShippingRateInputDraft</a>.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     */

    public com.commercetools.api.models.cart.ShippingRateInputDraft getShippingRateInput() {
        return this.shippingRateInput;
    }

    /**
     *  <p>Tax Category used to determine a shipping Tax Rate if the Cart has the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     */

    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>Tax Rate used to tax a shipping expense if the Cart has the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     */

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     *  <p>Deliveries to be shipped with the custom Shipping Method.</p>
     */

    public java.util.List<com.commercetools.api.models.order.DeliveryDraft> getDeliveries() {
        return this.deliveries;
    }

    /**
     *  <p>Custom Fields for the custom Shipping Method.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setShippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
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

        CartAddCustomShippingMethodActionImpl that = (CartAddCustomShippingMethodActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(shippingKey, that.shippingKey)
                .append(shippingMethodName, that.shippingMethodName)
                .append(shippingAddress, that.shippingAddress)
                .append(shippingRate, that.shippingRate)
                .append(shippingRateInput, that.shippingRateInput)
                .append(taxCategory, that.taxCategory)
                .append(externalTaxRate, that.externalTaxRate)
                .append(deliveries, that.deliveries)
                .append(custom, that.custom)
                .append(action, that.action)
                .append(shippingKey, that.shippingKey)
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
        return new HashCodeBuilder(17, 37).append(action)
                .append(shippingKey)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("shippingKey", shippingKey)
                .append("shippingMethodName", shippingMethodName)
                .append("shippingAddress", shippingAddress)
                .append("shippingRate", shippingRate)
                .append("shippingRateInput", shippingRateInput)
                .append("taxCategory", taxCategory)
                .append("externalTaxRate", externalTaxRate)
                .append("deliveries", deliveries)
                .append("custom", custom)
                .build();
    }

    @Override
    public CartAddCustomShippingMethodAction copyDeep() {
        return CartAddCustomShippingMethodAction.deepCopy(this);
    }
}
