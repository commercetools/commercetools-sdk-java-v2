
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
 *  <p>Custom Line Items contain generic user-defined items that are not linked to Products.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomLineItemImportDraftImpl implements CustomLineItemImportDraft, ModelBase {

    private com.commercetools.api.models.common.LocalizedString name;

    private String key;

    private String slug;

    private Long quantity;

    private com.commercetools.api.models.common.Money money;

    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    private com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode;

    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomLineItemImportDraftImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("key") final String key, @JsonProperty("slug") final String slug,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("money") final com.commercetools.api.models.common.Money money,
            @JsonProperty("taxRate") final com.commercetools.api.models.tax_category.TaxRate taxRate,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory,
            @JsonProperty("priceMode") final com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode,
            @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails,
            @JsonProperty("state") final java.util.List<com.commercetools.api.models.order.ItemState> state,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.name = name;
        this.key = key;
        this.slug = slug;
        this.quantity = quantity;
        this.money = money;
        this.taxRate = taxRate;
        this.taxCategory = taxCategory;
        this.priceMode = priceMode;
        this.shippingDetails = shippingDetails;
        this.state = state;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public CustomLineItemImportDraftImpl() {
    }

    /**
     *  <p>Name of the Custom Line Item.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Custom Line Item. This value should match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     */

    public String getSlug() {
        return this.slug;
    }

    /**
     *  <p>The number of items in the Custom Line Item. Can be a negative value.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>The cost of individual items in the Custom Line Item. The amount can be negative.</p>
     */

    public com.commercetools.api.models.common.Money getMoney() {
        return this.money;
    }

    /**
     *  <p>The tax rate used to calculate the <code>taxedPrice</code> of the Order.</p>
     */

    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     *  <p>Include a value to associate a Tax Category with the Custom Line Item.</p>
     */

    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <ul>
     *   <li>If <code>Standard</code>, Cart Discounts with a matching CartDiscountCustomLineItemsTarget, MultiBuyCustomLineItemsTarget, or CartDiscountPatternTarget are applied to the Custom Line Item.</li>
     *   <li>If <code>External</code>, Cart Discounts are not considered on the Custom Line Item.</li>
     *  </ul>
     */

    public com.commercetools.api.models.cart.CustomLineItemPriceMode getPriceMode() {
        return this.priceMode;
    }

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     */

    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     *  <p>State of the Custom Line Items.</p>
     */

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    /**
     *  <p>Custom Fields of the CustomLineItem.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setSlug(final String slug) {
        this.slug = slug;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setMoney(final com.commercetools.api.models.common.Money money) {
        this.money = money;
    }

    public void setTaxRate(final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    public void setTaxCategory(
            final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
    }

    public void setPriceMode(final com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode) {
        this.priceMode = priceMode;
    }

    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public void setState(final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
    }

    public void setState(final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
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

        CustomLineItemImportDraftImpl that = (CustomLineItemImportDraftImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(key, that.key)
                .append(slug, that.slug)
                .append(quantity, that.quantity)
                .append(money, that.money)
                .append(taxRate, that.taxRate)
                .append(taxCategory, that.taxCategory)
                .append(priceMode, that.priceMode)
                .append(shippingDetails, that.shippingDetails)
                .append(state, that.state)
                .append(custom, that.custom)
                .append(name, that.name)
                .append(key, that.key)
                .append(slug, that.slug)
                .append(quantity, that.quantity)
                .append(money, that.money)
                .append(taxRate, that.taxRate)
                .append(taxCategory, that.taxCategory)
                .append(priceMode, that.priceMode)
                .append(shippingDetails, that.shippingDetails)
                .append(state, that.state)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(key)
                .append(slug)
                .append(quantity)
                .append(money)
                .append(taxRate)
                .append(taxCategory)
                .append(priceMode)
                .append(shippingDetails)
                .append(state)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("key", key)
                .append("slug", slug)
                .append("quantity", quantity)
                .append("money", money)
                .append("taxRate", taxRate)
                .append("taxCategory", taxCategory)
                .append("priceMode", priceMode)
                .append("shippingDetails", shippingDetails)
                .append("state", state)
                .append("custom", custom)
                .build();
    }

    @Override
    public CustomLineItemImportDraft copyDeep() {
        return CustomLineItemImportDraft.deepCopy(this);
    }
}
