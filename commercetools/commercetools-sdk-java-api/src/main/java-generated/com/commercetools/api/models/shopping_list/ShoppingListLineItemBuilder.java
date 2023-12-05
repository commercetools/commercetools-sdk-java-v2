
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

    @Nullable
    private String key;

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
     * @param addedAt value to be set
     * @return Builder
     */

    public ShoppingListLineItemBuilder addedAt(final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    /**
     *  <p>Custom Fields of the ShoppingListLineItem.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ShoppingListLineItemBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the ShoppingListLineItem.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ShoppingListLineItemBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the ShoppingListLineItem.</p>
     * @param custom value to be set
     * @return Builder
     */

    public ShoppingListLineItemBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>If the Product or Product Variant is deleted, <code>deactivatedAt</code> is the date and time (UTC) of deletion.</p>
     *  <p>This data is updated in an eventual consistent manner when the Product Variant cannot be ordered anymore.</p>
     * @param deactivatedAt value to be set
     * @return Builder
     */

    public ShoppingListLineItemBuilder deactivatedAt(@Nullable final java.time.ZonedDateTime deactivatedAt) {
        this.deactivatedAt = deactivatedAt;
        return this;
    }

    /**
     *  <p>Unique identifier of the ShoppingListLineItem.</p>
     * @param id value to be set
     * @return Builder
     */

    public ShoppingListLineItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined identifier of the ShoppingListLineItem. It is unique per ShoppingList.</p>
     * @param key value to be set
     * @return Builder
     */

    public ShoppingListLineItemBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the Product.</p>
     *  <p>This data is updated in an eventual consistent manner when the Product's name changes.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ShoppingListLineItemBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Product.</p>
     *  <p>This data is updated in an eventual consistent manner when the Product's name changes.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ShoppingListLineItemBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Product.</p>
     *  <p>This data is updated in an eventual consistent manner when the Product's name changes.</p>
     * @param name value to be set
     * @return Builder
     */

    public ShoppingListLineItemBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Unique identifier of a Product.</p>
     * @param productId value to be set
     * @return Builder
     */

    public ShoppingListLineItemBuilder productId(final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p>The Product Type defining the Attributes of the Product.</p>
     * @param builder function to build the productType value
     * @return Builder
     */

    public ShoppingListLineItemBuilder productType(
            Function<com.commercetools.api.models.product_type.ProductTypeReferenceBuilder, com.commercetools.api.models.product_type.ProductTypeReferenceBuilder> builder) {
        this.productType = builder.apply(com.commercetools.api.models.product_type.ProductTypeReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Product Type defining the Attributes of the Product.</p>
     * @param builder function to build the productType value
     * @return Builder
     */

    public ShoppingListLineItemBuilder withProductType(
            Function<com.commercetools.api.models.product_type.ProductTypeReferenceBuilder, com.commercetools.api.models.product_type.ProductTypeReference> builder) {
        this.productType = builder.apply(com.commercetools.api.models.product_type.ProductTypeReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Product Type defining the Attributes of the Product.</p>
     * @param productType value to be set
     * @return Builder
     */

    public ShoppingListLineItemBuilder productType(
            final com.commercetools.api.models.product_type.ProductTypeReference productType) {
        this.productType = productType;
        return this;
    }

    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public ShoppingListLineItemBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p><code>id</code> of the ProductVariant the ShoppingListLineItem refers to. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ShoppingListLineItemBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Data of the ProductVariant.</p>
     *  <p>Returned when expanded using <code>expand=lineItems[*].variant</code>. You cannot expand only a single element of the array.</p>
     * @param builder function to build the variant value
     * @return Builder
     */

    public ShoppingListLineItemBuilder variant(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        this.variant = builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Data of the ProductVariant.</p>
     *  <p>Returned when expanded using <code>expand=lineItems[*].variant</code>. You cannot expand only a single element of the array.</p>
     * @param builder function to build the variant value
     * @return Builder
     */

    public ShoppingListLineItemBuilder withVariant(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariant> builder) {
        this.variant = builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of());
        return this;
    }

    /**
     *  <p>Data of the ProductVariant.</p>
     *  <p>Returned when expanded using <code>expand=lineItems[*].variant</code>. You cannot expand only a single element of the array.</p>
     * @param variant value to be set
     * @return Builder
     */

    public ShoppingListLineItemBuilder variant(
            @Nullable final com.commercetools.api.models.product.ProductVariant variant) {
        this.variant = variant;
        return this;
    }

    /**
     *  <p>Slug of the current ProductData.</p>
     *  <p>Returned when expanded using <code>expand=lineItems[*].productSlug</code>. You cannot expand only a single element of the array.</p>
     * @param builder function to build the productSlug value
     * @return Builder
     */

    public ShoppingListLineItemBuilder productSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.productSlug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Slug of the current ProductData.</p>
     *  <p>Returned when expanded using <code>expand=lineItems[*].productSlug</code>. You cannot expand only a single element of the array.</p>
     * @param builder function to build the productSlug value
     * @return Builder
     */

    public ShoppingListLineItemBuilder withProductSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.productSlug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Slug of the current ProductData.</p>
     *  <p>Returned when expanded using <code>expand=lineItems[*].productSlug</code>. You cannot expand only a single element of the array.</p>
     * @param productSlug value to be set
     * @return Builder
     */

    public ShoppingListLineItemBuilder productSlug(
            @Nullable final com.commercetools.api.models.common.LocalizedString productSlug) {
        this.productSlug = productSlug;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ShoppingListLineItem was added to the ShoppingList.</p>
     * @return addedAt
     */

    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    /**
     *  <p>Custom Fields of the ShoppingListLineItem.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>If the Product or Product Variant is deleted, <code>deactivatedAt</code> is the date and time (UTC) of deletion.</p>
     *  <p>This data is updated in an eventual consistent manner when the Product Variant cannot be ordered anymore.</p>
     * @return deactivatedAt
     */

    @Nullable
    public java.time.ZonedDateTime getDeactivatedAt() {
        return this.deactivatedAt;
    }

    /**
     *  <p>Unique identifier of the ShoppingListLineItem.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined identifier of the ShoppingListLineItem. It is unique per ShoppingList.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the Product.</p>
     *  <p>This data is updated in an eventual consistent manner when the Product's name changes.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Unique identifier of a Product.</p>
     * @return productId
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p>The Product Type defining the Attributes of the Product.</p>
     * @return productType
     */

    public com.commercetools.api.models.product_type.ProductTypeReference getProductType() {
        return this.productType;
    }

    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p><code>id</code> of the ProductVariant the ShoppingListLineItem refers to. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     * @return variantId
     */

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Data of the ProductVariant.</p>
     *  <p>Returned when expanded using <code>expand=lineItems[*].variant</code>. You cannot expand only a single element of the array.</p>
     * @return variant
     */

    @Nullable
    public com.commercetools.api.models.product.ProductVariant getVariant() {
        return this.variant;
    }

    /**
     *  <p>Slug of the current ProductData.</p>
     *  <p>Returned when expanded using <code>expand=lineItems[*].productSlug</code>. You cannot expand only a single element of the array.</p>
     * @return productSlug
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getProductSlug() {
        return this.productSlug;
    }

    /**
     * builds ShoppingListLineItem with checking for non-null required values
     * @return ShoppingListLineItem
     */
    public ShoppingListLineItem build() {
        Objects.requireNonNull(addedAt, ShoppingListLineItem.class + ": addedAt is missing");
        Objects.requireNonNull(id, ShoppingListLineItem.class + ": id is missing");
        Objects.requireNonNull(name, ShoppingListLineItem.class + ": name is missing");
        Objects.requireNonNull(productId, ShoppingListLineItem.class + ": productId is missing");
        Objects.requireNonNull(productType, ShoppingListLineItem.class + ": productType is missing");
        Objects.requireNonNull(quantity, ShoppingListLineItem.class + ": quantity is missing");
        return new ShoppingListLineItemImpl(addedAt, custom, deactivatedAt, id, key, name, productId, productType,
            quantity, variantId, variant, productSlug);
    }

    /**
     * builds ShoppingListLineItem without checking for non-null required values
     * @return ShoppingListLineItem
     */
    public ShoppingListLineItem buildUnchecked() {
        return new ShoppingListLineItemImpl(addedAt, custom, deactivatedAt, id, key, name, productId, productType,
            quantity, variantId, variant, productSlug);
    }

    /**
     * factory method for an instance of ShoppingListLineItemBuilder
     * @return builder
     */
    public static ShoppingListLineItemBuilder of() {
        return new ShoppingListLineItemBuilder();
    }

    /**
     * create builder for ShoppingListLineItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListLineItemBuilder of(final ShoppingListLineItem template) {
        ShoppingListLineItemBuilder builder = new ShoppingListLineItemBuilder();
        builder.addedAt = template.getAddedAt();
        builder.custom = template.getCustom();
        builder.deactivatedAt = template.getDeactivatedAt();
        builder.id = template.getId();
        builder.key = template.getKey();
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
