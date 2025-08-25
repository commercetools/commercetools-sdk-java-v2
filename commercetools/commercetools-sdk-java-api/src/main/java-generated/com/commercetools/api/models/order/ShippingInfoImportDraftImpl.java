
package com.commercetools.api.models.order;

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
 *  <p>Becomes the <code>shippingInfo</code> of the imported Order.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingInfoImportDraftImpl implements ShippingInfoImportDraft, ModelBase {

    private String shippingMethodName;

    private com.commercetools.api.models.common.Money price;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    private java.util.List<com.commercetools.api.models.order.DeliveryDraft> deliveries;

    private com.commercetools.api.models.order.DiscountedLineItemPriceDraft discountedPrice;

    private com.commercetools.api.models.cart.ShippingMethodState shippingMethodState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingInfoImportDraftImpl(@JsonProperty("shippingMethodName") final String shippingMethodName,
            @JsonProperty("price") final com.commercetools.api.models.common.Money price,
            @JsonProperty("shippingRate") final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate,
            @JsonProperty("taxRate") final com.commercetools.api.models.tax_category.TaxRate taxRate,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory,
            @JsonProperty("shippingMethod") final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod,
            @JsonProperty("deliveries") final java.util.List<com.commercetools.api.models.order.DeliveryDraft> deliveries,
            @JsonProperty("discountedPrice") final com.commercetools.api.models.order.DiscountedLineItemPriceDraft discountedPrice,
            @JsonProperty("shippingMethodState") final com.commercetools.api.models.cart.ShippingMethodState shippingMethodState) {
        this.shippingMethodName = shippingMethodName;
        this.price = price;
        this.shippingRate = shippingRate;
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
    public ShippingInfoImportDraftImpl() {
    }

    /**
     *  <p>Name of the Shipping Method.</p>
     */

    public String getShippingMethodName() {
        return this.shippingMethodName;
    }

    /**
     *  <p>The base price for the Shipping Method.</p>
     */

    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    /**
     *  <p>Shipping rate information for the Order.</p>
     */

    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate() {
        return this.shippingRate;
    }

    /**
     *  <p>Include a Tax Rate for the Shipping Method.</p>
     */

    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     *  <p>Include a value to associate a Tax Category with the shipping information.</p>
     */

    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>Include a value to associate a Shipping Method with the Order.</p>
     */

    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    /**
     *  <p>Information on how items are to be delivered to customers.</p>
     */

    public java.util.List<com.commercetools.api.models.order.DeliveryDraft> getDeliveries() {
        return this.deliveries;
    }

    /**
     *  <p>Discounted Price of the Shipping Method.</p>
     */

    public com.commercetools.api.models.order.DiscountedLineItemPriceDraft getDiscountedPrice() {
        return this.discountedPrice;
    }

    /**
     *  <p>Indicates if the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> referenced is allowed for the Order or not.</p>
     */

    public com.commercetools.api.models.cart.ShippingMethodState getShippingMethodState() {
        return this.shippingMethodState;
    }

    public void setShippingMethodName(final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
    }

    public void setPrice(final com.commercetools.api.models.common.Money price) {
        this.price = price;
    }

    public void setShippingRate(final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
    }

    public void setTaxRate(final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    public void setTaxCategory(
            final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
    }

    public void setShippingMethod(
            final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public void setDeliveries(final com.commercetools.api.models.order.DeliveryDraft... deliveries) {
        this.deliveries = new ArrayList<>(Arrays.asList(deliveries));
    }

    public void setDeliveries(final java.util.List<com.commercetools.api.models.order.DeliveryDraft> deliveries) {
        this.deliveries = deliveries;
    }

    public void setDiscountedPrice(
            final com.commercetools.api.models.order.DiscountedLineItemPriceDraft discountedPrice) {
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

        ShippingInfoImportDraftImpl that = (ShippingInfoImportDraftImpl) o;

        return new EqualsBuilder().append(shippingMethodName, that.shippingMethodName)
                .append(price, that.price)
                .append(shippingRate, that.shippingRate)
                .append(taxRate, that.taxRate)
                .append(taxCategory, that.taxCategory)
                .append(shippingMethod, that.shippingMethod)
                .append(deliveries, that.deliveries)
                .append(discountedPrice, that.discountedPrice)
                .append(shippingMethodState, that.shippingMethodState)
                .append(shippingMethodName, that.shippingMethodName)
                .append(price, that.price)
                .append(shippingRate, that.shippingRate)
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
                .append("taxRate", taxRate)
                .append("taxCategory", taxCategory)
                .append("shippingMethod", shippingMethod)
                .append("deliveries", deliveries)
                .append("discountedPrice", discountedPrice)
                .append("shippingMethodState", shippingMethodState)
                .build();
    }

    @Override
    public ShippingInfoImportDraft copyDeep() {
        return ShippingInfoImportDraft.deepCopy(this);
    }
}
