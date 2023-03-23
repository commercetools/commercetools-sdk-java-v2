
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListAddLineItemActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListAddLineItemAction myShoppingListAddLineItemAction = MyShoppingListAddLineItemAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListAddLineItemActionBuilder implements Builder<MyShoppingListAddLineItemAction> {

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

    /**
     *  <p><code>sku</code> of the ProductVariant.</p>
     * @param sku
     * @return Builder
     */

    public MyShoppingListAddLineItemActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Unique identifier of a Product.</p>
     * @param productId
     * @return Builder
     */

    public MyShoppingListAddLineItemActionBuilder productId(@Nullable final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p><code>id</code> of the ProductVariant. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     * @param variantId
     * @return Builder
     */

    public MyShoppingListAddLineItemActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     * @param quantity
     * @return Builder
     */

    public MyShoppingListAddLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Date and time the TextLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     * @param addedAt
     * @return Builder
     */

    public MyShoppingListAddLineItemActionBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    /**
     *  <p>Custom Fields defined for the ShoppingListLineItem.</p>
     * @return Builder
     */

    public MyShoppingListAddLineItemActionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields defined for the ShoppingListLineItem.</p>
     * @param custom
     * @return Builder
     */

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

    /**
     * builds MyShoppingListAddLineItemAction without checking for non null required values
     */
    public MyShoppingListAddLineItemAction buildUnchecked() {
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
