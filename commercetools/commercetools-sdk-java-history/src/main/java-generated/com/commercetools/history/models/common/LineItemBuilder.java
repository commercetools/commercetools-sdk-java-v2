
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LineItemBuilder {

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

    public LineItemBuilder custom(final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public LineItemBuilder id(final String id) {
        this.id = id;
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

    public LineItemBuilder productSlug(final com.commercetools.history.models.common.LocalizedString productSlug) {
        this.productSlug = productSlug;
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
