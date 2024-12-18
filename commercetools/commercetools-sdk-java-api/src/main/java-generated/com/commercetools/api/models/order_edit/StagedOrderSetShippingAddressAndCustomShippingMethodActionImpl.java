
package com.commercetools.api.models.order_edit;

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
 *  <p>Sets the shipping address and a custom Shipping Method together to prevent an inconsistent state.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl
        implements StagedOrderSetShippingAddressAndCustomShippingMethodAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.BaseAddress address;

    private String shippingMethodName;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl(
            @JsonProperty("address") final com.commercetools.api.models.common.BaseAddress address,
            @JsonProperty("shippingMethodName") final String shippingMethodName,
            @JsonProperty("shippingRate") final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.address = address;
        this.shippingMethodName = shippingMethodName;
        this.shippingRate = shippingRate;
        this.taxCategory = taxCategory;
        this.externalTaxRate = externalTaxRate;
        this.custom = custom;
        this.action = SET_SHIPPING_ADDRESS_AND_CUSTOM_SHIPPING_METHOD;
    }

    /**
     * create empty instance
     */
    public StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl() {
        this.action = SET_SHIPPING_ADDRESS_AND_CUSTOM_SHIPPING_METHOD;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set for <code>shippingAddress</code>.</p>
     */

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     *  <p>Value to set.</p>
     */

    public String getShippingMethodName() {
        return this.shippingMethodName;
    }

    /**
     *  <p>Value to set.</p>
     */

    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate() {
        return this.shippingRate;
    }

    /**
     *  <p>Used to select a Tax Rate when the Order has the <code>Platform</code> TaxMode.</p>
     */

    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> TaxMode.</p>
     */

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     *  <p>Custom Fields for the custom Shipping Method.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setAddress(final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
    }

    public void setShippingMethodName(final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
    }

    public void setShippingRate(final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
    }

    public void setTaxCategory(
            final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
    }

    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
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

        StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl that = (StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(address, that.address)
                .append(shippingMethodName, that.shippingMethodName)
                .append(shippingRate, that.shippingRate)
                .append(taxCategory, that.taxCategory)
                .append(externalTaxRate, that.externalTaxRate)
                .append(custom, that.custom)
                .append(action, that.action)
                .append(address, that.address)
                .append(shippingMethodName, that.shippingMethodName)
                .append(shippingRate, that.shippingRate)
                .append(taxCategory, that.taxCategory)
                .append(externalTaxRate, that.externalTaxRate)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(address)
                .append(shippingMethodName)
                .append(shippingRate)
                .append(taxCategory)
                .append(externalTaxRate)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("address", address)
                .append("shippingMethodName", shippingMethodName)
                .append("shippingRate", shippingRate)
                .append("taxCategory", taxCategory)
                .append("externalTaxRate", externalTaxRate)
                .append("custom", custom)
                .build();
    }

}
