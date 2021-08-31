
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomLineItemBuilder implements Builder<CustomLineItem> {

    private String id;

    private com.commercetools.history.models.common.LocalizedString name;

    private com.commercetools.history.models.common.Money money;

    private com.commercetools.history.models.common.TaxedItemPrice taxedPrice;

    private com.commercetools.history.models.common.Money totalPrice;

    private String slug;

    private Integer quantity;

    public CustomLineItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public CustomLineItemBuilder name(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public CustomLineItemBuilder name(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public CustomLineItemBuilder money(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.money = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public CustomLineItemBuilder money(final com.commercetools.history.models.common.Money money) {
        this.money = money;
        return this;
    }

    public CustomLineItemBuilder taxedPrice(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    public CustomLineItemBuilder taxedPrice(final com.commercetools.history.models.common.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    public CustomLineItemBuilder totalPrice(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.totalPrice = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public CustomLineItemBuilder totalPrice(final com.commercetools.history.models.common.Money totalPrice) {
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

    public String getSlug() {
        return this.slug;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public CustomLineItem build() {
        Objects.requireNonNull(id, CustomLineItem.class + ": id is missing");
        Objects.requireNonNull(name, CustomLineItem.class + ": name is missing");
        Objects.requireNonNull(money, CustomLineItem.class + ": money is missing");
        Objects.requireNonNull(taxedPrice, CustomLineItem.class + ": taxedPrice is missing");
        Objects.requireNonNull(totalPrice, CustomLineItem.class + ": totalPrice is missing");
        Objects.requireNonNull(slug, CustomLineItem.class + ": slug is missing");
        Objects.requireNonNull(quantity, CustomLineItem.class + ": quantity is missing");
        return new CustomLineItemImpl(id, name, money, taxedPrice, totalPrice, slug, quantity);
    }

    /**
     * builds CustomLineItem without checking for non null required values
     */
    public CustomLineItem buildUnchecked() {
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
