
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomLineItemImpl implements CustomLineItem {

    private String id;

    private com.commercetools.history.models.common.LocalizedString name;

    private com.commercetools.history.models.common.Money money;

    private com.commercetools.history.models.common.TaxedItemPrice taxedPrice;

    private com.commercetools.history.models.common.Money totalPrice;

    private String slug;

    private Integer quantity;

    @JsonCreator
    CustomLineItemImpl(@JsonProperty("id") final String id,
            @JsonProperty("name") final com.commercetools.history.models.common.LocalizedString name,
            @JsonProperty("money") final com.commercetools.history.models.common.Money money,
            @JsonProperty("taxedPrice") final com.commercetools.history.models.common.TaxedItemPrice taxedPrice,
            @JsonProperty("totalPrice") final com.commercetools.history.models.common.Money totalPrice,
            @JsonProperty("slug") final String slug, @JsonProperty("quantity") final Integer quantity) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.taxedPrice = taxedPrice;
        this.totalPrice = totalPrice;
        this.slug = slug;
        this.quantity = quantity;
    }

    public CustomLineItemImpl() {
    }

    /**
    *  <p>The unique ID of this CustomLineItem.</p>
    */
    public String getId() {
        return this.id;
    }

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    public com.commercetools.history.models.common.Money getMoney() {
        return this.money;
    }

    public com.commercetools.history.models.common.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    public com.commercetools.history.models.common.Money getTotalPrice() {
        return this.totalPrice;
    }

    /**
    *  <p>A unique String in the cart to identify this CustomLineItem.</p>
    */
    public String getSlug() {
        return this.slug;
    }

    /**
    *  <p>The amount of a CustomLineItem in the cart. Must be a positive integer.</p>
    */
    public Integer getQuantity() {
        return this.quantity;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setMoney(final com.commercetools.history.models.common.Money money) {
        this.money = money;
    }

    public void setTaxedPrice(final com.commercetools.history.models.common.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    public void setTotalPrice(final com.commercetools.history.models.common.Money totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setSlug(final String slug) {
        this.slug = slug;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomLineItemImpl that = (CustomLineItemImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(name, that.name)
                .append(money, that.money)
                .append(taxedPrice, that.taxedPrice)
                .append(totalPrice, that.totalPrice)
                .append(slug, that.slug)
                .append(quantity, that.quantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(name)
                .append(money)
                .append(taxedPrice)
                .append(totalPrice)
                .append(slug)
                .append(quantity)
                .toHashCode();
    }

}
