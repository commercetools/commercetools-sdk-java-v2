
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListLineItemBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListLineItem shoppingListLineItem = ShoppingListLineItem.builder()
 *             .addedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .productId("{productId}")
 *             .productType(productTypeBuilder -> productTypeBuilder)
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListLineItemBuilder implements Builder<ShoppingListLineItem> {

    private java.time.ZonedDateTime addedAt;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private java.time.ZonedDateTime deactivatedAt;

    private String id;

    private com.commercetools.api.models.common.LocalizedString name;

    private String productId;

    private com.commercetools.api.models.product_type.ProductTypeReference productType;

    private Long quantity;

    @Nullable
    private Long variantId;

    @Nullable
    private com.commercetools.api.models.product.ProductVariant variant;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString productSlug;

    /**
     *  <p>Date and time (UTC) the ShoppingListLineItem was added to the ShoppingList.</p>
     */

    public ShoppingListLineItemBuilder addedAt(final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    /**
     *  <p>Custom Fields of the ShoppingListLineItem.</p>
     */

    public ShoppingListLineItemBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the ShoppingListLineItem.</p>
     */

    public ShoppingListLineItemBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>If the Product or Product Variant is deleted, <code>deactivatedAt</code> is the date and time (UTC) of deletion.</p>
     *  <p>This data is updated in an eventual consistent manner when the Product Variant cannot be ordered anymore.</p>
     */

    public ShoppingListLineItemBuilder deactivatedAt(@Nullable final java.time.ZonedDateTime deactivatedAt) {
        this.deactivatedAt = deactivatedAt;
        return this;
    }

    /**
     *  <p>Unique identifier of the ShoppingListLineItem.</p>
     */

    public ShoppingListLineItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Name of the Product.</p>
     *  <p>This data is updated in an eventual consistent manner when the Product's name changes.</p>
     */

    public ShoppingListLineItemBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Product.</p>
     *  <p>This data is updated in an eventual consistent manner when the Product's name changes.</p>
     */

    public ShoppingListLineItemBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Unique identifier of a Product.</p>
     */

    public ShoppingListLineItemBuilder productId(final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p>The Product Type defining the Attributes of the Product.</p>
     */

    public ShoppingListLineItemBuilder productType(
            Function<com.commercetools.api.models.product_type.ProductTypeReferenceBuilder, com.commercetools.api.models.product_type.ProductTypeReferenceBuilder> builder) {
        this.productType = builder.apply(com.commercetools.api.models.product_type.ProductTypeReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Product Type defining the Attributes of the Product.</p>
     */

    public ShoppingListLineItemBuilder productType(
            final com.commercetools.api.models.product_type.ProductTypeReference productType) {
        this.productType = productType;
        return this;
    }

    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     */

    public ShoppingListLineItemBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p><code>id</code> of the ProductVariant the ShoppingListLineItem refers to. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     */

    public ShoppingListLineItemBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Data of the ProductVariant. Returned when expanded using <code>expand=lineItems[*].variant</code>.</p>
     *  <p><em>Limitation: <code>expand=lineItems[0].variant</code> is not supported.</em></p>
     */

    public ShoppingListLineItemBuilder variant(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        this.variant = builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Data of the ProductVariant. Returned when expanded using <code>expand=lineItems[*].variant</code>.</p>
     *  <p><em>Limitation: <code>expand=lineItems[0].variant</code> is not supported.</em></p>
     */

    public ShoppingListLineItemBuilder variant(
            @Nullable final com.commercetools.api.models.product.ProductVariant variant) {
        this.variant = variant;
        return this;
    }

    /**
     *  <p>Slug of the current ProductData. Only returned when expanded using <code>expand=lineItems[*].productSlug</code>.</p>
     *  <p><em>Limitation: <code>expand=lineItems[0].productSlug</code> is not supported.</em></p>
     */

    public ShoppingListLineItemBuilder productSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.productSlug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Slug of the current ProductData. Only returned when expanded using <code>expand=lineItems[*].productSlug</code>.</p>
     *  <p><em>Limitation: <code>expand=lineItems[0].productSlug</code> is not supported.</em></p>
     */

    public ShoppingListLineItemBuilder productSlug(
            @Nullable final com.commercetools.api.models.common.LocalizedString productSlug) {
        this.productSlug = productSlug;
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

    public com.commercetools.api.models.product_type.ProductTypeReference getProductType() {
        return this.productType;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    @Nullable
    public com.commercetools.api.models.product.ProductVariant getVariant() {
        return this.variant;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getProductSlug() {
        return this.productSlug;
    }

    public ShoppingListLineItem build() {
        Objects.requireNonNull(addedAt, ShoppingListLineItem.class + ": addedAt is missing");
        Objects.requireNonNull(id, ShoppingListLineItem.class + ": id is missing");
        Objects.requireNonNull(name, ShoppingListLineItem.class + ": name is missing");
        Objects.requireNonNull(productId, ShoppingListLineItem.class + ": productId is missing");
        Objects.requireNonNull(productType, ShoppingListLineItem.class + ": productType is missing");
        Objects.requireNonNull(quantity, ShoppingListLineItem.class + ": quantity is missing");
        return new ShoppingListLineItemImpl(addedAt, custom, deactivatedAt, id, name, productId, productType, quantity,
            variantId, variant, productSlug);
    }

    /**
     * builds ShoppingListLineItem without checking for non null required values
     */
    public ShoppingListLineItem buildUnchecked() {
        return new ShoppingListLineItemImpl(addedAt, custom, deactivatedAt, id, name, productId, productType, quantity,
            variantId, variant, productSlug);
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
        builder.productType = template.getProductType();
        builder.quantity = template.getQuantity();
        builder.variantId = template.getVariantId();
        builder.variant = template.getVariant();
        builder.productSlug = template.getProductSlug();
        return builder;
    }

}
