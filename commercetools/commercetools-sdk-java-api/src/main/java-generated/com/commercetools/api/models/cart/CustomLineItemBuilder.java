
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomLineItemBuilder {

    private String id;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.TypedMoney money;

    @Nullable
    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    private com.commercetools.api.models.common.TypedMoney totalPrice;

    private String slug;

    private Long quantity;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetails shippingDetails;

    public CustomLineItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public CustomLineItemBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public CustomLineItemBuilder money(final com.commercetools.api.models.common.TypedMoney money) {
        this.money = money;
        return this;
    }

    public CustomLineItemBuilder taxedPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    public CustomLineItemBuilder totalPrice(final com.commercetools.api.models.common.TypedMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public CustomLineItemBuilder slug(final String slug) {
        this.slug = slug;
        return this;
    }

    public CustomLineItemBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public CustomLineItemBuilder state(final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    public CustomLineItemBuilder state(final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }

    public CustomLineItemBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    public CustomLineItemBuilder taxRate(@Nullable final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    public CustomLineItemBuilder discountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    public CustomLineItemBuilder discountedPricePerQuantity(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        return this;
    }

    public CustomLineItemBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public CustomLineItemBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public com.commercetools.api.models.common.TypedMoney getMoney() {
        return this.money;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    public com.commercetools.api.models.common.TypedMoney getTotalPrice() {
        return this.totalPrice;
    }

    public String getSlug() {
        return this.slug;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory() {
        return this.taxCategory;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetails getShippingDetails() {
        return this.shippingDetails;
    }

    public CustomLineItem build() {
        return new CustomLineItemImpl(id, name, money, taxedPrice, totalPrice, slug, quantity, state, taxCategory,
            taxRate, discountedPricePerQuantity, custom, shippingDetails);
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
        builder.state = template.getState();
        builder.taxCategory = template.getTaxCategory();
        builder.taxRate = template.getTaxRate();
        builder.discountedPricePerQuantity = template.getDiscountedPricePerQuantity();
        builder.custom = template.getCustom();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
