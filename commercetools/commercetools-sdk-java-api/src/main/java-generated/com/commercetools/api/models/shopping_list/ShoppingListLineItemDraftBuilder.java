
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListLineItemDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListLineItemDraft shoppingListLineItemDraft = ShoppingListLineItemDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListLineItemDraftBuilder implements Builder<ShoppingListLineItemDraft> {

    @Nullable
    private String productId;

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    @Nullable
    private java.time.ZonedDateTime addedAt;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private Long quantity;

    /**
     *  <p>Unique identifier of a Product.</p>
     * @param productId
     * @return Builder
     */

    public ShoppingListLineItemDraftBuilder productId(@Nullable final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p><code>id</code> of the ProductVariant. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     * @param variantId
     * @return Builder
     */

    public ShoppingListLineItemDraftBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p><code>sku</code> of the ProductVariant.</p>
     * @param sku
     * @return Builder
     */

    public ShoppingListLineItemDraftBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Date and time the ShoppingListLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     * @param addedAt
     * @return Builder
     */

    public ShoppingListLineItemDraftBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    /**
     *  <p>Custom Fields of the ShoppingListLineItem.</p>
     * @return Builder
     */

    public ShoppingListLineItemDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the ShoppingListLineItem.</p>
     * @param custom
     * @return Builder
     */

    public ShoppingListLineItemDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     * @param quantity
     * @return Builder
     */

    public ShoppingListLineItemDraftBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
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
    public String getSku() {
        return this.sku;
    }

    @Nullable
    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public Long getQuantity() {
        return this.quantity;
    }

    public ShoppingListLineItemDraft build() {
        return new ShoppingListLineItemDraftImpl(productId, variantId, sku, addedAt, custom, quantity);
    }

    /**
     * builds ShoppingListLineItemDraft without checking for non null required values
     */
    public ShoppingListLineItemDraft buildUnchecked() {
        return new ShoppingListLineItemDraftImpl(productId, variantId, sku, addedAt, custom, quantity);
    }

    public static ShoppingListLineItemDraftBuilder of() {
        return new ShoppingListLineItemDraftBuilder();
    }

    public static ShoppingListLineItemDraftBuilder of(final ShoppingListLineItemDraft template) {
        ShoppingListLineItemDraftBuilder builder = new ShoppingListLineItemDraftBuilder();
        builder.productId = template.getProductId();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.addedAt = template.getAddedAt();
        builder.custom = template.getCustom();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
