
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomLineItemImportDraftImpl implements CustomLineItemImportDraft {

    private com.commercetools.api.models.common.LocalizedString name;

    private Long quantity;

    private com.commercetools.api.models.common.Money money;

    private String slug;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    @JsonCreator
    CustomLineItemImportDraftImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("money") final com.commercetools.api.models.common.Money money,
            @JsonProperty("slug") final String slug,
            @JsonProperty("state") final java.util.List<com.commercetools.api.models.order.ItemState> state,
            @JsonProperty("taxRate") final com.commercetools.api.models.tax_category.TaxRate taxRate,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.name = name;
        this.quantity = quantity;
        this.money = money;
        this.slug = slug;
        this.state = state;
        this.taxRate = taxRate;
        this.taxCategory = taxCategory;
        this.custom = custom;
        this.shippingDetails = shippingDetails;
    }

    public CustomLineItemImportDraftImpl() {
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
    *  <p>The amount of a CustomLineItem in the cart.
    *  Must be a positive integer.</p>
    */
    public Long getQuantity() {
        return this.quantity;
    }

    /**
    *  <p>The cost to add to the cart. The amount can be negative.</p>
    */
    public com.commercetools.api.models.common.Money getMoney() {
        return this.money;
    }

    public String getSlug() {
        return this.slug;
    }

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
    *  <p>The custom fields.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
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

    public void setState(final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
    }

    public void setState(final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
    }

    public void setTaxRate(final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    public void setTaxCategory(
            final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomLineItemImportDraftImpl that = (CustomLineItemImportDraftImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(quantity, that.quantity)
                .append(money, that.money)
                .append(slug, that.slug)
                .append(state, that.state)
                .append(taxRate, that.taxRate)
                .append(taxCategory, that.taxCategory)
                .append(custom, that.custom)
                .append(shippingDetails, that.shippingDetails)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(quantity)
                .append(money)
                .append(slug)
                .append(state)
                .append(taxRate)
                .append(taxCategory)
                .append(custom)
                .append(shippingDetails)
                .toHashCode();
    }

}
