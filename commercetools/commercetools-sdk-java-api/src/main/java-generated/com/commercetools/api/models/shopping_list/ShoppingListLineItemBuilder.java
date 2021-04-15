
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListLineItemBuilder {

    private java.time.ZonedDateTime addedAt;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private java.time.ZonedDateTime deactivatedAt;

    private String id;

    private com.commercetools.api.models.common.LocalizedString name;

    private String productId;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString productSlug;

    private com.commercetools.api.models.product_type.ProductTypeReference productType;

    private Integer quantity;

    @Nullable
    private com.commercetools.api.models.product.ProductVariant variant;

    @Nullable
    private Long variantId;

    public ShoppingListLineItemBuilder addedAt(final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    public ShoppingListLineItemBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public ShoppingListLineItemBuilder deactivatedAt(@Nullable final java.time.ZonedDateTime deactivatedAt) {
        this.deactivatedAt = deactivatedAt;
        return this;
    }

    public ShoppingListLineItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ShoppingListLineItemBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public ShoppingListLineItemBuilder productId(final String productId) {
        this.productId = productId;
        return this;
    }

    public ShoppingListLineItemBuilder productSlug(
            @Nullable final com.commercetools.api.models.common.LocalizedString productSlug) {
        this.productSlug = productSlug;
        return this;
    }

    public ShoppingListLineItemBuilder productType(
            final com.commercetools.api.models.product_type.ProductTypeReference productType) {
        this.productType = productType;
        return this;
    }

    public ShoppingListLineItemBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public ShoppingListLineItemBuilder variant(
            @Nullable final com.commercetools.api.models.product.ProductVariant variant) {
        this.variant = variant;
        return this;
    }

    public ShoppingListLineItemBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    @Nullable
    public java.time.ZonedDateTime getDeactivatedAt() {
        return this.deactivatedAt;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public String getProductId() {
        return this.productId;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getProductSlug() {
        return this.productSlug;
    }

    public com.commercetools.api.models.product_type.ProductTypeReference getProductType() {
        return this.productType;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    @Nullable
    public com.commercetools.api.models.product.ProductVariant getVariant() {
        return this.variant;
    }

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    public ShoppingListLineItem build() {
        return new ShoppingListLineItemImpl(addedAt, custom, deactivatedAt, id, name, productId, productSlug,
            productType, quantity, variant, variantId);
    }

    public static ShoppingListLineItemBuilder of() {
        return new ShoppingListLineItemBuilder();
    }

    public static ShoppingListLineItemBuilder of(final ShoppingListLineItem template) {
        ShoppingListLineItemBuilder builder = new ShoppingListLineItemBuilder();
        builder.addedAt = template.getAddedAt();
        builder.custom = template.getCustom();
        builder.deactivatedAt = template.getDeactivatedAt();
        builder.id = template.getId();
        builder.name = template.getName();
        builder.productId = template.getProductId();
        builder.productSlug = template.getProductSlug();
        builder.productType = template.getProductType();
        builder.quantity = template.getQuantity();
        builder.variant = template.getVariant();
        builder.variantId = template.getVariantId();
        return builder;
    }

}
