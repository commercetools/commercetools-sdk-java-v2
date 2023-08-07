
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

/**
 *  <p>If the Cart already contains a CustomLineItem with the same <code>slug</code>, <code>name</code>, <code>money</code>, <code>taxCategory</code>, <code>state</code>, and Custom Fields, then only the quantity of the existing Custom Line Item is increased. If CustomLineItem <code>shippingDetails</code> are set, they are merged with the <code>targets</code> that already exist on the ItemShippingDetails of the Custom Line Item. In case of overlapping address keys the ItemShippingTarget <code>quantity</code> is summed up.</p>
 *  <p>If the Cart already contains a Custom Line Item with the same slug that is otherwise not identical, an InvalidOperation error is returned.</p>
 *  <p>If the Tax Rate is not set, a MissingTaxRateForCountry error is returned.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderAddCustomLineItemActionImpl implements StagedOrderAddCustomLineItemAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.Money money;

    private com.commercetools.api.models.common.LocalizedString name;

    private String key;

    private Long quantity;

    private String slug;

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    private com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderAddCustomLineItemActionImpl(@JsonProperty("money") final com.commercetools.api.models.common.Money money,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("key") final String key, @JsonProperty("quantity") final Long quantity,
            @JsonProperty("slug") final String slug,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate,
            @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails,
            @JsonProperty("priceMode") final com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.money = money;
        this.name = name;
        this.key = key;
        this.quantity = quantity;
        this.slug = slug;
        this.taxCategory = taxCategory;
        this.externalTaxRate = externalTaxRate;
        this.shippingDetails = shippingDetails;
        this.priceMode = priceMode;
        this.custom = custom;
        this.action = ADD_CUSTOM_LINE_ITEM;
    }

    /**
     * create empty instance
     */
    public StagedOrderAddCustomLineItemActionImpl() {
        this.action = ADD_CUSTOM_LINE_ITEM;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Money value of the Custom Line Item. The value can be negative.</p>
     */

    public com.commercetools.api.models.common.Money getMoney() {
        return this.money;
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
     *  <p>Number of Custom Line Items to add to the Cart.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Custom Line Item. It must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     */

    public String getSlug() {
        return this.slug;
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode. If TaxMode is <code>Platform</code>, this field must not be empty.</p>
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
     *  <p>Container for Custom Line Item-specific addresses.</p>
     */

    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     *  <ul>
     *   <li>If <code>Standard</code>, Cart Discounts with a matching CartDiscountCustomLineItemsTarget are applied to the Custom Line Item.</li>
     *   <li>If <code>External</code>, Cart Discounts are not considered on the Custom Line Item.</li>
     *  </ul>
     */

    public com.commercetools.api.models.cart.CustomLineItemPriceMode getPriceMode() {
        return this.priceMode;
    }

    /**
     *  <p>Custom Fields for the Custom Line Item.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setMoney(final com.commercetools.api.models.common.Money money) {
        this.money = money;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setSlug(final String slug) {
        this.slug = slug;
    }

    public void setTaxCategory(
            final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
    }

    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
    }

    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public void setPriceMode(final com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode) {
        this.priceMode = priceMode;
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

        StagedOrderAddCustomLineItemActionImpl that = (StagedOrderAddCustomLineItemActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(money, that.money)
                .append(name, that.name)
                .append(key, that.key)
                .append(quantity, that.quantity)
                .append(slug, that.slug)
                .append(taxCategory, that.taxCategory)
                .append(externalTaxRate, that.externalTaxRate)
                .append(shippingDetails, that.shippingDetails)
                .append(priceMode, that.priceMode)
                .append(custom, that.custom)
                .append(action, that.action)
                .append(money, that.money)
                .append(name, that.name)
                .append(key, that.key)
                .append(quantity, that.quantity)
                .append(slug, that.slug)
                .append(taxCategory, that.taxCategory)
                .append(externalTaxRate, that.externalTaxRate)
                .append(shippingDetails, that.shippingDetails)
                .append(priceMode, that.priceMode)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(money)
                .append(name)
                .append(key)
                .append(quantity)
                .append(slug)
                .append(taxCategory)
                .append(externalTaxRate)
                .append(shippingDetails)
                .append(priceMode)
                .append(custom)
                .toHashCode();
    }

}
