
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListAddLineItemActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListAddLineItemAction shoppingListAddLineItemAction = ShoppingListAddLineItemAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListAddLineItemActionBuilder implements Builder<ShoppingListAddLineItemAction> {

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
     * @param sku value to be set
     * @return Builder
     */

    public ShoppingListAddLineItemActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Unique identifier of a Product.</p>
     * @param productId value to be set
     * @return Builder
     */

    public ShoppingListAddLineItemActionBuilder productId(@Nullable final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p><code>id</code> of the ProductVariant. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ShoppingListAddLineItemActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public ShoppingListAddLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Date and time the TextLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     * @param addedAt value to be set
     * @return Builder
     */

    public ShoppingListAddLineItemActionBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    /**
     *  <p>Custom Fields defined for the ShoppingListLineItem.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ShoppingListAddLineItemActionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields defined for the ShoppingListLineItem.</p>
     * @param custom value to be set
     * @return Builder
     */

    public ShoppingListAddLineItemActionBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
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
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     * @return quantity
     */

    @Nullable
    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Date and time the TextLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     * @return addedAt
     */

    @Nullable
    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    /**
     *  <p>Custom Fields defined for the ShoppingListLineItem.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds ShoppingListAddLineItemAction with checking for non-null required values
     * @return ShoppingListAddLineItemAction
     */
    public ShoppingListAddLineItemAction build() {
        return new ShoppingListAddLineItemActionImpl(sku, productId, variantId, quantity, addedAt, custom);
    }

    /**
     * builds ShoppingListAddLineItemAction without checking for non-null required values
     * @return ShoppingListAddLineItemAction
     */
    public ShoppingListAddLineItemAction buildUnchecked() {
        return new ShoppingListAddLineItemActionImpl(sku, productId, variantId, quantity, addedAt, custom);
    }

    /**
     * factory method for an instance of ShoppingListAddLineItemActionBuilder
     * @return builder
     */
    public static ShoppingListAddLineItemActionBuilder of() {
        return new ShoppingListAddLineItemActionBuilder();
    }

    /**
     * create builder for ShoppingListAddLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListAddLineItemActionBuilder of(final ShoppingListAddLineItemAction template) {
        ShoppingListAddLineItemActionBuilder builder = new ShoppingListAddLineItemActionBuilder();
        builder.sku = template.getSku();
        builder.productId = template.getProductId();
        builder.variantId = template.getVariantId();
        builder.quantity = template.getQuantity();
        builder.addedAt = template.getAddedAt();
        builder.custom = template.getCustom();
        return builder;
    }

}
