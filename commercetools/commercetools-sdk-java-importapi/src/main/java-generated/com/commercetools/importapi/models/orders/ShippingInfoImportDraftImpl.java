
package com.commercetools.importapi.models.orders;

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
 *  <p>Maps to an Order's <code>shippingInfo</code> property. This field is usually populated by the Cart associated with the Order, but when importing Orders you must provide a draft representation as a part of the OrderImport.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingInfoImportDraftImpl implements ShippingInfoImportDraft, ModelBase {

    private String shippingMethodName;

    private com.commercetools.importapi.models.common.TypedMoney price;

    private com.commercetools.importapi.models.orders.ShippingRateDraft shippingRate;

    private com.commercetools.importapi.models.prices.TaxRate taxRate;

    private com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory;

    private com.commercetools.importapi.models.common.ShippingMethodKeyReference shippingMethod;

    private java.util.List<com.commercetools.importapi.models.orders.Delivery> deliveries;

    private com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft discountedPrice;

    private com.commercetools.importapi.models.orders.ShippingMethodState shippingMethodState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingInfoImportDraftImpl(@JsonProperty("shippingMethodName") final String shippingMethodName,
            @JsonProperty("price") final com.commercetools.importapi.models.common.TypedMoney price,
            @JsonProperty("shippingRate") final com.commercetools.importapi.models.orders.ShippingRateDraft shippingRate,
            @JsonProperty("taxRate") final com.commercetools.importapi.models.prices.TaxRate taxRate,
            @JsonProperty("taxCategory") final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory,
            @JsonProperty("shippingMethod") final com.commercetools.importapi.models.common.ShippingMethodKeyReference shippingMethod,
            @JsonProperty("deliveries") final java.util.List<com.commercetools.importapi.models.orders.Delivery> deliveries,
            @JsonProperty("discountedPrice") final com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft discountedPrice,
            @JsonProperty("shippingMethodState") final com.commercetools.importapi.models.orders.ShippingMethodState shippingMethodState) {
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
     *  <p>Maps to <code>shippingInfo.shippingMethodName</code>.</p>
     */

    public String getShippingMethodName() {
        return this.shippingMethodName;
    }

    /**
     *  <p>Maps to <code>shippingInfo.price</code>.</p>
     */

    public com.commercetools.importapi.models.common.TypedMoney getPrice() {
        return this.price;
    }

    /**
     *  <p>Used to determine the price.</p>
     */

    public com.commercetools.importapi.models.orders.ShippingRateDraft getShippingRate() {
        return this.shippingRate;
    }

    /**
     *  <p>Maps to <code>shippingInfo.taxRate</code>.</p>
     */

    public com.commercetools.importapi.models.prices.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     *  <p>Maps to <code>shippingInfo.taxCategory</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced TaxCategory is created.</p>
     */

    public com.commercetools.importapi.models.common.TaxCategoryKeyReference getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>Maps to <code>shippingInfo.shippingMethod</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced ShippingMethod is created.</p>
     */

    public com.commercetools.importapi.models.common.ShippingMethodKeyReference getShippingMethod() {
        return this.shippingMethod;
    }

    /**
     *  <p>Maps to <code>shippingInfo.deliveries</code>. You cannot add a <code>DeliveryItem</code> on import, as <code>LineItems</code> and <code>CustomLineItems</code> are not yet referenceable by an <code>id</code>.</p>
     */

    public java.util.List<com.commercetools.importapi.models.orders.Delivery> getDeliveries() {
        return this.deliveries;
    }

    /**
     *  <p>Maps to <code>shippingInfo.discountedPrice</code>.</p>
     */

    public com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft getDiscountedPrice() {
        return this.discountedPrice;
    }

    /**
     *  <p>Maps to <code>shippingInfo.shippingMethodState</code>.</p>
     */

    public com.commercetools.importapi.models.orders.ShippingMethodState getShippingMethodState() {
        return this.shippingMethodState;
    }

    public void setShippingMethodName(final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
    }

    public void setPrice(final com.commercetools.importapi.models.common.TypedMoney price) {
        this.price = price;
    }

    public void setShippingRate(final com.commercetools.importapi.models.orders.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
    }

    public void setTaxRate(final com.commercetools.importapi.models.prices.TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    public void setTaxCategory(final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory) {
        this.taxCategory = taxCategory;
    }

    public void setShippingMethod(
            final com.commercetools.importapi.models.common.ShippingMethodKeyReference shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public void setDeliveries(final com.commercetools.importapi.models.orders.Delivery... deliveries) {
        this.deliveries = new ArrayList<>(Arrays.asList(deliveries));
    }

    public void setDeliveries(final java.util.List<com.commercetools.importapi.models.orders.Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    public void setDiscountedPrice(
            final com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public void setShippingMethodState(
            final com.commercetools.importapi.models.orders.ShippingMethodState shippingMethodState) {
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
