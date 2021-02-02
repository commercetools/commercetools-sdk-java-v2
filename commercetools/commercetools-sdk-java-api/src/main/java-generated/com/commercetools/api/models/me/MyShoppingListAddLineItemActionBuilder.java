
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListAddLineItemActionBuilder {

    @Nullable
    private String sku;

    @Nullable
    private String productId;

    @Nullable
    private Long variantId;

    @Nullable
    private Long quantity;

    @Nullable
    private java.time.ZonedDateTime addedAt;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    public MyShoppingListAddLineItemActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public MyShoppingListAddLineItemActionBuilder productId(@Nullable final String productId) {
        this.productId = productId;
        return this;
    }

    public MyShoppingListAddLineItemActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public MyShoppingListAddLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public MyShoppingListAddLineItemActionBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    public MyShoppingListAddLineItemActionBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    @Nullable
    public String getProductId() {
        return this.productId;
    }

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    @Nullable
    public Long getQuantity() {
        return this.quantity;
    }

    @Nullable
    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public MyShoppingListAddLineItemAction build() {
        return new MyShoppingListAddLineItemActionImpl(sku, productId, variantId, quantity, addedAt, custom);
    }

    public static MyShoppingListAddLineItemActionBuilder of() {
        return new MyShoppingListAddLineItemActionBuilder();
    }

    public static MyShoppingListAddLineItemActionBuilder of(final MyShoppingListAddLineItemAction template) {
        MyShoppingListAddLineItemActionBuilder builder = new MyShoppingListAddLineItemActionBuilder();
        builder.sku = template.getSku();
        builder.productId = template.getProductId();
        builder.variantId = template.getVariantId();
        builder.quantity = template.getQuantity();
        builder.addedAt = template.getAddedAt();
        builder.custom = template.getCustom();
        return builder;
    }

}
