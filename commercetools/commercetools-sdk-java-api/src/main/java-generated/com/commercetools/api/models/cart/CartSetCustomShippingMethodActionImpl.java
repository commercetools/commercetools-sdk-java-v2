
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
 *  <p>To set the Cart's custom Shipping Method (independent of the ShippingMethods managed through the Shipping Methods API) the Cart must have the <code>Single</code> ShippingMode and a <code>shippingAddress</code>.</p>
 *  <p>To unset a custom Shipping Method on a Cart, use the Set ShippingMethod update action without the <code>shippingMethod</code> field instead.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomShippingMethodActionImpl implements CartSetCustomShippingMethodAction, ModelBase {

    private String action;

    private String shippingMethodName;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @JsonCreator
    CartSetCustomShippingMethodActionImpl(@JsonProperty("shippingMethodName") final String shippingMethodName,
            @JsonProperty("shippingRate") final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.shippingMethodName = shippingMethodName;
        this.shippingRate = shippingRate;
        this.taxCategory = taxCategory;
        this.externalTaxRate = externalTaxRate;
        this.action = SET_CUSTOM_SHIPPING_METHOD;
    }

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
     *  <p>Tax Category used to determine the Tax Rate when the Cart has the <code>Platform</code> TaxMode.</p>
     */

    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>External Tax Rate for the <code>shippingRate</code> to be set if the Cart has the <code>External</code> TaxMode.</p>
     */

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(shippingMethodName)
                .append(shippingRate)
                .append(taxCategory)
                .append(externalTaxRate)
                .toHashCode();
    }

}
