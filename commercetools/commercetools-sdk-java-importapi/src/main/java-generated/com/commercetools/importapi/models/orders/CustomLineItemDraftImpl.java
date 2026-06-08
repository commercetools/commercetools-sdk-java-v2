
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
 * CustomLineItemDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomLineItemDraftImpl implements CustomLineItemDraft, ModelBase {

    private com.commercetools.importapi.models.common.LocalizedString name;

    private com.commercetools.importapi.models.common.TypedMoney money;

    private com.commercetools.importapi.models.orders.CustomLineItemTaxedPrice taxedPrice;

    private com.commercetools.importapi.models.common.TypedMoney totalPrice;

    private String slug;

    private Long quantity;

    private java.util.List<com.commercetools.importapi.models.orders.ItemState> state;

    private com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory;

    private com.commercetools.importapi.models.prices.TaxRate taxRate;

    private com.commercetools.importapi.models.orders.ExternalTaxRateDraft externalTaxRate;

    private java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft> discountedPricePerQuantity;

    private com.commercetools.importapi.models.orders.ItemShippingDetailsDraft shippingDetails;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomLineItemDraftImpl(@JsonProperty("name") final com.commercetools.importapi.models.common.LocalizedString name,
            @JsonProperty("money") final com.commercetools.importapi.models.common.TypedMoney money,
            @JsonProperty("taxedPrice") final com.commercetools.importapi.models.orders.CustomLineItemTaxedPrice taxedPrice,
            @JsonProperty("totalPrice") final com.commercetools.importapi.models.common.TypedMoney totalPrice,
            @JsonProperty("slug") final String slug, @JsonProperty("quantity") final Long quantity,
            @JsonProperty("state") final java.util.List<com.commercetools.importapi.models.orders.ItemState> state,
            @JsonProperty("taxCategory") final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory,
            @JsonProperty("taxRate") final com.commercetools.importapi.models.prices.TaxRate taxRate,
            @JsonProperty("externalTaxRate") final com.commercetools.importapi.models.orders.ExternalTaxRateDraft externalTaxRate,
            @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft> discountedPricePerQuantity,
            @JsonProperty("shippingDetails") final com.commercetools.importapi.models.orders.ItemShippingDetailsDraft shippingDetails) {
        this.name = name;
        this.money = money;
        this.taxedPrice = taxedPrice;
        this.totalPrice = totalPrice;
        this.slug = slug;
        this.quantity = quantity;
        this.state = state;
        this.taxCategory = taxCategory;
        this.taxRate = taxRate;
        this.externalTaxRate = externalTaxRate;
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        this.shippingDetails = shippingDetails;
    }

    /**
     * create empty instance
     */
    public CustomLineItemDraftImpl() {
    }

    /**
     *  <p>Maps to <code>CustomLineItem.name</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.money</code>.</p>
     */

    public com.commercetools.importapi.models.common.TypedMoney getMoney() {
        return this.money;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.taxedPrice</code>.</p>
     */

    public com.commercetools.importapi.models.orders.CustomLineItemTaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.totalPrice</code>.</p>
     */

    public com.commercetools.importapi.models.common.TypedMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.slug</code>.</p>
     */

    public String getSlug() {
        return this.slug;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.quantity</code>.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.state</code>.</p>
     */

    public java.util.List<com.commercetools.importapi.models.orders.ItemState> getState() {
        return this.state;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.taxCategory</code>. References a tax category by key. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced TaxCategory is created.</p>
     */

    public com.commercetools.importapi.models.common.TaxCategoryKeyReference getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.taxRate</code>.</p>
     */

    public com.commercetools.importapi.models.prices.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     *  <p>External Tax Rate for the Custom Line Item if the Cart has the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     */

    public com.commercetools.importapi.models.orders.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.discountedPricePerQuantity</code>.</p>
     */

    public java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.shippingDetails</code>.</p>
     */

    public com.commercetools.importapi.models.orders.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    public void setName(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setMoney(final com.commercetools.importapi.models.common.TypedMoney money) {
        this.money = money;
    }

    public void setTaxedPrice(final com.commercetools.importapi.models.orders.CustomLineItemTaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    public void setTotalPrice(final com.commercetools.importapi.models.common.TypedMoney totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setSlug(final String slug) {
        this.slug = slug;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setState(final com.commercetools.importapi.models.orders.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
    }

    public void setState(final java.util.List<com.commercetools.importapi.models.orders.ItemState> state) {
        this.state = state;
    }

    public void setTaxCategory(final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory) {
        this.taxCategory = taxCategory;
    }

    public void setTaxRate(final com.commercetools.importapi.models.prices.TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    public void setExternalTaxRate(
            final com.commercetools.importapi.models.orders.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
    }

    public void setDiscountedPricePerQuantity(
            final com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
    }

    public void setDiscountedPricePerQuantity(
            final java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
    }

    public void setShippingDetails(
            final com.commercetools.importapi.models.orders.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomLineItemDraftImpl that = (CustomLineItemDraftImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(money, that.money)
                .append(taxedPrice, that.taxedPrice)
                .append(totalPrice, that.totalPrice)
                .append(slug, that.slug)
                .append(quantity, that.quantity)
                .append(state, that.state)
                .append(taxCategory, that.taxCategory)
                .append(taxRate, that.taxRate)
                .append(externalTaxRate, that.externalTaxRate)
                .append(discountedPricePerQuantity, that.discountedPricePerQuantity)
                .append(shippingDetails, that.shippingDetails)
                .append(name, that.name)
                .append(money, that.money)
                .append(taxedPrice, that.taxedPrice)
                .append(totalPrice, that.totalPrice)
                .append(slug, that.slug)
                .append(quantity, that.quantity)
                .append(state, that.state)
                .append(taxCategory, that.taxCategory)
                .append(taxRate, that.taxRate)
                .append(externalTaxRate, that.externalTaxRate)
                .append(discountedPricePerQuantity, that.discountedPricePerQuantity)
                .append(shippingDetails, that.shippingDetails)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(money)
                .append(taxedPrice)
                .append(totalPrice)
                .append(slug)
                .append(quantity)
                .append(state)
                .append(taxCategory)
                .append(taxRate)
                .append(externalTaxRate)
                .append(discountedPricePerQuantity)
                .append(shippingDetails)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("money", money)
                .append("taxedPrice", taxedPrice)
                .append("totalPrice", totalPrice)
                .append("slug", slug)
                .append("quantity", quantity)
                .append("state", state)
                .append("taxCategory", taxCategory)
                .append("taxRate", taxRate)
                .append("externalTaxRate", externalTaxRate)
                .append("discountedPricePerQuantity", discountedPricePerQuantity)
                .append("shippingDetails", shippingDetails)
                .build();
    }

    @Override
    public CustomLineItemDraft copyDeep() {
        return CustomLineItemDraft.deepCopy(this);
    }
}
