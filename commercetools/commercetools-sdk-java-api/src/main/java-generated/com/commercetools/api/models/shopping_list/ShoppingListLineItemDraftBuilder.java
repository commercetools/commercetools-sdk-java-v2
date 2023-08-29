
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
    private String key;

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
     *  <p>User-defined identifier of the ShoppingListLineItem. Must be unique per ShoppingList.</p>
     * @param key value to be set
     * @return Builder
     */

    public ShoppingListLineItemDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of a Product.</p>
     * @param productId value to be set
     * @return Builder
     */

    public ShoppingListLineItemDraftBuilder productId(@Nullable final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p><code>id</code> of the ProductVariant. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ShoppingListLineItemDraftBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p><code>sku</code> of the ProductVariant.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ShoppingListLineItemDraftBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Date and time the ShoppingListLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     * @param addedAt value to be set
     * @return Builder
     */

    public ShoppingListLineItemDraftBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    /**
     *  <p>Custom Fields of the ShoppingListLineItem.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ShoppingListLineItemDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the ShoppingListLineItem.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ShoppingListLineItemDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the ShoppingListLineItem.</p>
     * @param custom value to be set
     * @return Builder
     */

    public ShoppingListLineItemDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public ShoppingListLineItemDraftBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>User-defined identifier of the ShoppingListLineItem. Must be unique per ShoppingList.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Unique identifier of a Product.</p>
     * @return productId
     */

    @Nullable
    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p><code>id</code> of the ProductVariant. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     * @return variantId
     */

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p><code>sku</code> of the ProductVariant.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Date and time the ShoppingListLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     * @return addedAt
     */

    @Nullable
    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    /**
     *  <p>Custom Fields of the ShoppingListLineItem.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     * @return quantity
     */

    @Nullable
    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * builds ShoppingListLineItemDraft with checking for non-null required values
     * @return ShoppingListLineItemDraft
     */
    public ShoppingListLineItemDraft build() {
        return new ShoppingListLineItemDraftImpl(key, productId, variantId, sku, addedAt, custom, quantity);
    }

    /**
     * builds ShoppingListLineItemDraft without checking for non-null required values
     * @return ShoppingListLineItemDraft
     */
    public ShoppingListLineItemDraft buildUnchecked() {
        return new ShoppingListLineItemDraftImpl(key, productId, variantId, sku, addedAt, custom, quantity);
    }

    /**
     * factory method for an instance of ShoppingListLineItemDraftBuilder
     * @return builder
     */
    public static ShoppingListLineItemDraftBuilder of() {
        return new ShoppingListLineItemDraftBuilder();
    }

    /**
     * create builder for ShoppingListLineItemDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListLineItemDraftBuilder of(final ShoppingListLineItemDraft template) {
        ShoppingListLineItemDraftBuilder builder = new ShoppingListLineItemDraftBuilder();
        builder.key = template.getKey();
        builder.productId = template.getProductId();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.addedAt = template.getAddedAt();
        builder.custom = template.getCustom();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
