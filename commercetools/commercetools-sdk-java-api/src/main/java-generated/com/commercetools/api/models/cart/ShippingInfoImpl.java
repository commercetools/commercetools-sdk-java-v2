
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
 * ShippingInfo
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingInfoImpl implements ShippingInfo, ModelBase {

    private String shippingMethodName;

    private com.commercetools.api.models.common.CentPrecisionMoney price;

    private com.commercetools.api.models.shipping_method.ShippingRate shippingRate;

    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    private com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory;

    private com.commercetools.api.models.shipping_method.ShippingMethodReference shippingMethod;

    private java.util.List<com.commercetools.api.models.order.Delivery> deliveries;

    private com.commercetools.api.models.cart.DiscountedLineItemPrice discountedPrice;

    private com.commercetools.api.models.cart.ShippingMethodState shippingMethodState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingInfoImpl(@JsonProperty("shippingMethodName") final String shippingMethodName,
            @JsonProperty("price") final com.commercetools.api.models.common.CentPrecisionMoney price,
            @JsonProperty("shippingRate") final com.commercetools.api.models.shipping_method.ShippingRate shippingRate,
            @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice,
            @JsonProperty("taxRate") final com.commercetools.api.models.tax_category.TaxRate taxRate,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory,
            @JsonProperty("shippingMethod") final com.commercetools.api.models.shipping_method.ShippingMethodReference shippingMethod,
            @JsonProperty("deliveries") final java.util.List<com.commercetools.api.models.order.Delivery> deliveries,
            @JsonProperty("discountedPrice") final com.commercetools.api.models.cart.DiscountedLineItemPrice discountedPrice,
            @JsonProperty("shippingMethodState") final com.commercetools.api.models.cart.ShippingMethodState shippingMethodState) {
        this.shippingMethodName = shippingMethodName;
        this.price = price;
        this.shippingRate = shippingRate;
        this.taxedPrice = taxedPrice;
        this.taxRate = taxRate;
        this.taxCategory = taxCategory;
        this.shippingMethod = shippingMethod;
        this.deliveries = deliveries;
        this.discountedPrice = discountedPrice;
        this.shippingMethodState = shippingMethodState;
    }

    /**
     * create empty instance
     */
    public ShippingInfoImpl() {
    }

    /**
     *  <p>Name of the Shipping Method.</p>
     */

    public String getShippingMethodName() {
        return this.shippingMethodName;
    }

    /**
     *  <p>Determined based on the ShippingRate and its tiered prices, and either the sum of LineItem prices or the <code>shippingRateInput</code> field.</p>
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getPrice() {
        return this.price;
    }

    /**
     *  <p>Used to determine the price.</p>
     */

    public com.commercetools.api.models.shipping_method.ShippingRate getShippingRate() {
        return this.shippingRate;
    }

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     */

    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Automatically set in the <code>Platform</code> TaxMode after the shipping address is set.</p>
     *  <p>For the <code>External</code> TaxMode the Tax Rate must be set explicitly with the ExternalTaxRateDraft.</p>
     */

    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode.</p>
     */

    public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>Not set if a custom Shipping Method is used.</p>
     */

    public com.commercetools.api.models.shipping_method.ShippingMethodReference getShippingMethod() {
        return this.shippingMethod;
    }

    /**
     *  <p>Information on how items are delivered to customers.</p>
     */

    public java.util.List<com.commercetools.api.models.order.Delivery> getDeliveries() {
        return this.deliveries;
    }

    /**
     *  <p>Discounted price of the Shipping Method.</p>
     */

    public com.commercetools.api.models.cart.DiscountedLineItemPrice getDiscountedPrice() {
        return this.discountedPrice;
    }

    /**
     *  <p>Indicates whether the ShippingMethod referenced in this ShippingInfo is allowed for the Cart.</p>
     */

    public com.commercetools.api.models.cart.ShippingMethodState getShippingMethodState() {
        return this.shippingMethodState;
    }

    public void setShippingMethodName(final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
    }

    public void setPrice(final com.commercetools.api.models.common.CentPrecisionMoney price) {
        this.price = price;
    }

    public void setShippingRate(final com.commercetools.api.models.shipping_method.ShippingRate shippingRate) {
        this.shippingRate = shippingRate;
    }

    public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    public void setTaxRate(final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    public void setTaxCategory(final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory) {
        this.taxCategory = taxCategory;
    }

    public void setShippingMethod(
            final com.commercetools.api.models.shipping_method.ShippingMethodReference shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public void setDeliveries(final com.commercetools.api.models.order.Delivery... deliveries) {
        this.deliveries = new ArrayList<>(Arrays.asList(deliveries));
    }

    public void setDeliveries(final java.util.List<com.commercetools.api.models.order.Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    public void setDiscountedPrice(final com.commercetools.api.models.cart.DiscountedLineItemPrice discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public void setShippingMethodState(
            final com.commercetools.api.models.cart.ShippingMethodState shippingMethodState) {
        this.shippingMethodState = shippingMethodState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingInfoImpl that = (ShippingInfoImpl) o;

        return new EqualsBuilder().append(shippingMethodName, that.shippingMethodName)
                .append(price, that.price)
                .append(shippingRate, that.shippingRate)
                .append(taxedPrice, that.taxedPrice)
                .append(taxRate, that.taxRate)
                .append(taxCategory, that.taxCategory)
                .append(shippingMethod, that.shippingMethod)
                .append(deliveries, that.deliveries)
                .append(discountedPrice, that.discountedPrice)
                .append(shippingMethodState, that.shippingMethodState)
                .append(shippingMethodName, that.shippingMethodName)
                .append(price, that.price)
                .append(shippingRate, that.shippingRate)
                .append(taxedPrice, that.taxedPrice)
                .append(taxRate, that.taxRate)
                .append(taxCategory, that.taxCategory)
                .append(shippingMethod, that.shippingMethod)
                .append(deliveries, that.deliveries)
                .append(discountedPrice, that.discountedPrice)
                .append(shippingMethodState, that.shippingMethodState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(shippingMethodName)
                .append(price)
                .append(shippingRate)
                .append(taxedPrice)
                .append(taxRate)
                .append(taxCategory)
                .append(shippingMethod)
                .append(deliveries)
                .append(discountedPrice)
                .append(shippingMethodState)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("shippingMethodName", shippingMethodName)
                .append("price", price)
                .append("shippingRate", shippingRate)
                .append("taxedPrice", taxedPrice)
                .append("taxRate", taxRate)
                .append("taxCategory", taxCategory)
                .append("shippingMethod", shippingMethod)
                .append("deliveries", deliveries)
                .append("discountedPrice", discountedPrice)
                .append("shippingMethodState", shippingMethodState)
                .build();
    }

}
