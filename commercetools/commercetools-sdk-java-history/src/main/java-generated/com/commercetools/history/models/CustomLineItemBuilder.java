
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomLineItemBuilder {

    private String id;

    private com.commercetools.history.models.LocalizedString name;

    private com.commercetools.history.models.Money money;

    private com.commercetools.history.models.TaxedItemPrice taxedPrice;

    private com.commercetools.history.models.Money totalPrice;

    private String slug;

    private Integer quantity;

    public CustomLineItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public CustomLineItemBuilder name(final com.commercetools.history.models.LocalizedString name) {
        this.name = name;
        return this;
    }

    public CustomLineItemBuilder money(final com.commercetools.history.models.Money money) {
        this.money = money;
        return this;
    }

    public CustomLineItemBuilder taxedPrice(final com.commercetools.history.models.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    public CustomLineItemBuilder totalPrice(final com.commercetools.history.models.Money totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public CustomLineItemBuilder slug(final String slug) {
        this.slug = slug;
        return this;
    }

    public CustomLineItemBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.history.models.LocalizedString getName() {
        return this.name;
    }

    public com.commercetools.history.models.Money getMoney() {
        return this.money;
    }

    public com.commercetools.history.models.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    public com.commercetools.history.models.Money getTotalPrice() {
        return this.totalPrice;
    }

    public String getSlug() {
        return this.slug;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public CustomLineItem build() {
        return new CustomLineItemImpl(id, name, money, taxedPrice, totalPrice, slug, quantity);
    }

    public static CustomLineItemBuilder of() {
        return new CustomLineItemBuilder();
    }

    public static CustomLineItemBuilder of(final CustomLineItem template) {
        CustomLineItemBuilder builder = new CustomLineItemBuilder();
        builder.id = template.getId();
        builder.name = template.getName();
        builder.money = template.getMoney();
        builder.taxedPrice = template.getTaxedPrice();
        builder.totalPrice = template.getTotalPrice();
        builder.slug = template.getSlug();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
