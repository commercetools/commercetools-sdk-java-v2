
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CartAddCustomLineItemActionImpl implements CartAddCustomLineItemAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.Money money;

    private com.commercetools.api.models.common.LocalizedString name;

    private Long quantity;

    private String slug;

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @JsonCreator
    CartAddCustomLineItemActionImpl(@JsonProperty("money") final com.commercetools.api.models.common.Money money,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("quantity") final Long quantity, @JsonProperty("slug") final String slug,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.money = money;
        this.name = name;
        this.quantity = quantity;
        this.slug = slug;
        this.taxCategory = taxCategory;
        this.custom = custom;
        this.externalTaxRate = externalTaxRate;
        this.action = ADD_CUSTOM_LINE_ITEM;
    }

    public CartAddCustomLineItemActionImpl() {
        this.action = ADD_CUSTOM_LINE_ITEM;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.
    *  For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
    */
    public com.commercetools.api.models.common.Money getMoney() {
        return this.money;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public String getSlug() {
        return this.slug;
    }

    /**
    *  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:TaxCategory">TaxCategory</a>.</p>
    */
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
    *  <p>The representation used when creating or updating a <a href="/../api/projects/types#list-of-customizable-data-types">customizable data type</a> with Custom Fields.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    public void setMoney(final com.commercetools.api.models.common.Money money) {
        this.money = money;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
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

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
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

        CartAddCustomLineItemActionImpl that = (CartAddCustomLineItemActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(money, that.money)
                .append(name, that.name)
                .append(quantity, that.quantity)
                .append(slug, that.slug)
                .append(taxCategory, that.taxCategory)
                .append(custom, that.custom)
                .append(externalTaxRate, that.externalTaxRate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(money)
                .append(name)
                .append(quantity)
                .append(slug)
                .append(taxCategory)
                .append(custom)
                .append(externalTaxRate)
                .toHashCode();
    }

}
