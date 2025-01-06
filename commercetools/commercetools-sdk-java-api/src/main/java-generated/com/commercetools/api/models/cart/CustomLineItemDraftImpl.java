
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
 * CustomLineItemDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomLineItemDraftImpl implements CustomLineItemDraft, ModelBase {

    private com.commercetools.api.models.common.LocalizedString name;

    private String key;

    private Long quantity;

    private com.commercetools.api.models.common.Money money;

    private String slug;

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    private com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomLineItemDraftImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("key") final String key, @JsonProperty("quantity") final Long quantity,
            @JsonProperty("money") final com.commercetools.api.models.common.Money money,
            @JsonProperty("slug") final String slug,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails,
            @JsonProperty("priceMode") final com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode) {
        this.name = name;
        this.key = key;
        this.quantity = quantity;
        this.money = money;
        this.slug = slug;
        this.taxCategory = taxCategory;
        this.externalTaxRate = externalTaxRate;
        this.custom = custom;
        this.shippingDetails = shippingDetails;
        this.priceMode = priceMode;
    }

    /**
     * create empty instance
     */
    public CustomLineItemDraftImpl() {
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
     *  <p>Money value of the Custom Line Item. The value can be negative.</p>
     */

    public com.commercetools.api.models.common.Money getMoney() {
        return this.money;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Custom Line Item. It must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     */

    public String getSlug() {
        return this.slug;
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode. This field is required for <code>Platform</code> TaxMode.</p>
     */

    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>External Tax Rate for the Custom Line Item if the Cart has the <code>External</code> TaxMode.</p>
     */

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     *  <p>Custom Fields for the Custom Line Item.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     */

    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
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

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setMoney(final com.commercetools.api.models.common.Money money) {
        this.money = money;
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

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public void setPriceMode(final com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode) {
        this.priceMode = priceMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomLineItemDraftImpl that = (CustomLineItemDraftImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(key, that.key)
                .append(quantity, that.quantity)
                .append(money, that.money)
                .append(slug, that.slug)
                .append(taxCategory, that.taxCategory)
                .append(externalTaxRate, that.externalTaxRate)
                .append(custom, that.custom)
                .append(shippingDetails, that.shippingDetails)
                .append(priceMode, that.priceMode)
                .append(name, that.name)
                .append(key, that.key)
                .append(quantity, that.quantity)
                .append(money, that.money)
                .append(slug, that.slug)
                .append(taxCategory, that.taxCategory)
                .append(externalTaxRate, that.externalTaxRate)
                .append(custom, that.custom)
                .append(shippingDetails, that.shippingDetails)
                .append(priceMode, that.priceMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(key)
                .append(quantity)
                .append(money)
                .append(slug)
                .append(taxCategory)
                .append(externalTaxRate)
                .append(custom)
                .append(shippingDetails)
                .append(priceMode)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("key", key)
                .append("quantity", quantity)
                .append("money", money)
                .append("slug", slug)
                .append("taxCategory", taxCategory)
                .append("externalTaxRate", externalTaxRate)
                .append("custom", custom)
                .append("shippingDetails", shippingDetails)
                .append("priceMode", priceMode)
                .build();
    }

}
