
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
 *  <p>To set the Cart's custom Shipping Method (independent of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethods</a> managed through the <span>Shipping Methods API</span>) the Cart must have the <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a> and a <code>shippingAddress</code>.</p>
 *  <p>To unset a custom Shipping Method on a Cart, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingMethodAction" rel="nofollow">Set ShippingMethod</a> update action without the <code>shippingMethod</code> field instead.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomShippingMethodActionImpl implements CartSetCustomShippingMethodAction, ModelBase {

    private String action;

    private String shippingMethodName;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetCustomShippingMethodActionImpl(@JsonProperty("shippingMethodName") final String shippingMethodName,
            @JsonProperty("shippingRate") final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.shippingMethodName = shippingMethodName;
        this.shippingRate = shippingRate;
        this.taxCategory = taxCategory;
        this.externalTaxRate = externalTaxRate;
        this.custom = custom;
        this.action = SET_CUSTOM_SHIPPING_METHOD;
    }

    /**
     * create empty instance
     */
    public CartSetCustomShippingMethodActionImpl() {
        this.action = SET_CUSTOM_SHIPPING_METHOD;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Name of the custom Shipping Method.</p>
     */

    public String getShippingMethodName() {
        return this.shippingMethodName;
    }

    /**
     *  <p>Determines the shipping price.</p>
     */

    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate() {
        return this.shippingRate;
    }

    /**
     *  <p>Tax Category used to determine the Tax Rate when the Cart has the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     */

    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>External Tax Rate for the <code>shippingRate</code> to be set if the Cart has the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
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

        CartSetCustomShippingMethodActionImpl that = (CartSetCustomShippingMethodActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(shippingMethodName, that.shippingMethodName)
                .append(shippingRate, that.shippingRate)
                .append(taxCategory, that.taxCategory)
                .append(externalTaxRate, that.externalTaxRate)
                .append(custom, that.custom)
                .append(action, that.action)
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
                .append("shippingMethodName", shippingMethodName)
                .append("shippingRate", shippingRate)
                .append("taxCategory", taxCategory)
                .append("externalTaxRate", externalTaxRate)
                .append("custom", custom)
                .build();
    }

    @Override
    public CartSetCustomShippingMethodAction copyDeep() {
        return CartSetCustomShippingMethodAction.deepCopy(this);
    }
}
