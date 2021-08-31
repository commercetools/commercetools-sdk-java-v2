
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LineItemBuilder implements Builder<LineItem> {

    private String addedAt;

    private com.commercetools.history.models.common.CustomFields custom;

    private String id;

    private com.commercetools.history.models.common.LocalizedString name;

    private String productId;

    private com.commercetools.history.models.common.LocalizedString productSlug;

    private com.commercetools.history.models.common.Reference productType;

    private Integer quantity;

    private com.commercetools.history.models.common.Variant variant;

    private Integer variantId;

    public LineItemBuilder addedAt(final String addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    public LineItemBuilder custom(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    public LineItemBuilder custom(final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public LineItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public LineItemBuilder name(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public LineItemBuilder name(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public LineItemBuilder productId(final String productId) {
        this.productId = productId;
        return this;
    }

    public LineItemBuilder productSlug(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.productSlug = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public LineItemBuilder productSlug(final com.commercetools.history.models.common.LocalizedString productSlug) {
        this.productSlug = productSlug;
        return this;
    }

    public LineItemBuilder productType(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.productType = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public LineItemBuilder productType(final com.commercetools.history.models.common.Reference productType) {
        this.productType = productType;
        return this;
    }

    public LineItemBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public LineItemBuilder variant(
            Function<com.commercetools.history.models.common.VariantBuilder, com.commercetools.history.models.common.VariantBuilder> builder) {
        this.variant = builder.apply(com.commercetools.history.models.common.VariantBuilder.of()).build();
        return this;
    }

    public LineItemBuilder variant(final com.commercetools.history.models.common.Variant variant) {
        this.variant = variant;
        return this;
    }

    public LineItemBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    public String getAddedAt() {
        return this.addedAt;
    }

    public com.commercetools.history.models.common.CustomFields getCustom() {
        return this.custom;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    public String getProductId() {
        return this.productId;
    }

    public com.commercetools.history.models.common.LocalizedString getProductSlug() {
        return this.productSlug;
    }

    public com.commercetools.history.models.common.Reference getProductType() {
        return this.productType;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public com.commercetools.history.models.common.Variant getVariant() {
        return this.variant;
    }

    public Integer getVariantId() {
        return this.variantId;
    }

    public LineItem build() {
        Objects.requireNonNull(addedAt, LineItem.class + ": addedAt is missing");
        Objects.requireNonNull(custom, LineItem.class + ": custom is missing");
        Objects.requireNonNull(id, LineItem.class + ": id is missing");
        Objects.requireNonNull(name, LineItem.class + ": name is missing");
        Objects.requireNonNull(productId, LineItem.class + ": productId is missing");
        Objects.requireNonNull(productSlug, LineItem.class + ": productSlug is missing");
        Objects.requireNonNull(productType, LineItem.class + ": productType is missing");
        Objects.requireNonNull(quantity, LineItem.class + ": quantity is missing");
        Objects.requireNonNull(variant, LineItem.class + ": variant is missing");
        Objects.requireNonNull(variantId, LineItem.class + ": variantId is missing");
        return new LineItemImpl(addedAt, custom, id, name, productId, productSlug, productType, quantity, variant,
            variantId);
    }

    /**
     * builds LineItem without checking for non null required values
     */
    public LineItem buildUnchecked() {
        return new LineItemImpl(addedAt, custom, id, name, productId, productSlug, productType, quantity, variant,
            variantId);
    }

    public static LineItemBuilder of() {
        return new LineItemBuilder();
    }

    public static LineItemBuilder of(final LineItem template) {
        LineItemBuilder builder = new LineItemBuilder();
        builder.addedAt = template.getAddedAt();
        builder.custom = template.getCustom();
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
