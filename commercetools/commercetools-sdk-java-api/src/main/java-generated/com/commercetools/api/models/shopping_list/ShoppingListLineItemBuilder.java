
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

    @Nullable
    private com.commercetools.api.models.common.LocalizedString productSlug;

    private com.commercetools.api.models.product_type.ProductTypeReference productType;

    private Integer quantity;

    @Nullable
    private com.commercetools.api.models.product.ProductVariant variant;

    @Nullable
    private Long variantId;

    /**
     *
     */

    public ShoppingListLineItemBuilder addedAt(final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    /**
     *  <p>Serves as value of the <code>custom</code> field on a resource or data type customized with a Type.</p>
     */

    public ShoppingListLineItemBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Serves as value of the <code>custom</code> field on a resource or data type customized with a Type.</p>
     */

    public ShoppingListLineItemBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *
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
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ShoppingListLineItemBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ShoppingListLineItemBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *
     */

    public ShoppingListLineItemBuilder productId(final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ShoppingListLineItemBuilder productSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.productSlug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ShoppingListLineItemBuilder productSlug(
            @Nullable final com.commercetools.api.models.common.LocalizedString productSlug) {
        this.productSlug = productSlug;
        return this;
    }

    /**
     *  <p>Reference to a ProductType.</p>
     */

    public ShoppingListLineItemBuilder productType(
            Function<com.commercetools.api.models.product_type.ProductTypeReferenceBuilder, com.commercetools.api.models.product_type.ProductTypeReferenceBuilder> builder) {
        this.productType = builder.apply(com.commercetools.api.models.product_type.ProductTypeReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a ProductType.</p>
     */

    public ShoppingListLineItemBuilder productType(
            final com.commercetools.api.models.product_type.ProductTypeReference productType) {
        this.productType = productType;
        return this;
    }

    /**
     *
     */

    public ShoppingListLineItemBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *
     */

    public ShoppingListLineItemBuilder variant(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        this.variant = builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ShoppingListLineItemBuilder variant(
            @Nullable final com.commercetools.api.models.product.ProductVariant variant) {
        this.variant = variant;
        return this;
    }

    /**
     *
     */

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
        Objects.requireNonNull(addedAt, ShoppingListLineItem.class + ": addedAt is missing");
        Objects.requireNonNull(id, ShoppingListLineItem.class + ": id is missing");
        Objects.requireNonNull(name, ShoppingListLineItem.class + ": name is missing");
        Objects.requireNonNull(productId, ShoppingListLineItem.class + ": productId is missing");
        Objects.requireNonNull(productType, ShoppingListLineItem.class + ": productType is missing");
        Objects.requireNonNull(quantity, ShoppingListLineItem.class + ": quantity is missing");
        return new ShoppingListLineItemImpl(addedAt, custom, deactivatedAt, id, name, productId, productSlug,
            productType, quantity, variant, variantId);
    }

    /**
     * builds ShoppingListLineItem without checking for non null required values
     */
    public ShoppingListLineItem buildUnchecked() {
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
