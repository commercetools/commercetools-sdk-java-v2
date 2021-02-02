
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListLineItemImpl implements ShoppingListLineItem {

    private java.time.ZonedDateTime addedAt;

    private com.commercetools.api.models.type.CustomFields custom;

    private java.time.ZonedDateTime deactivatedAt;

    private String id;

    private com.commercetools.api.models.common.LocalizedString name;

    private String productId;

    private com.commercetools.api.models.common.LocalizedString productSlug;

    private com.commercetools.api.models.product_type.ProductTypeReference productType;

    private Integer quantity;

    private com.commercetools.api.models.product.ProductVariant variant;

    private Long variantId;

    @JsonCreator
    ShoppingListLineItemImpl(@JsonProperty("addedAt") final java.time.ZonedDateTime addedAt,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("deactivatedAt") final java.time.ZonedDateTime deactivatedAt,
            @JsonProperty("id") final String id,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("productId") final String productId,
            @JsonProperty("productSlug") final com.commercetools.api.models.common.LocalizedString productSlug,
            @JsonProperty("productType") final com.commercetools.api.models.product_type.ProductTypeReference productType,
            @JsonProperty("quantity") final Integer quantity,
            @JsonProperty("variant") final com.commercetools.api.models.product.ProductVariant variant,
            @JsonProperty("variantId") final Long variantId) {
        this.addedAt = addedAt;
        this.custom = custom;
        this.deactivatedAt = deactivatedAt;
        this.id = id;
        this.name = name;
        this.productId = productId;
        this.productSlug = productSlug;
        this.productType = productType;
        this.quantity = quantity;
        this.variant = variant;
        this.variantId = variantId;
    }

    public ShoppingListLineItemImpl() {
    }

    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

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

    public com.commercetools.api.models.common.LocalizedString getProductSlug() {
        return this.productSlug;
    }

    public com.commercetools.api.models.product_type.ProductTypeReference getProductType() {
        return this.productType;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public com.commercetools.api.models.product.ProductVariant getVariant() {
        return this.variant;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    public void setAddedAt(final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setDeactivatedAt(final java.time.ZonedDateTime deactivatedAt) {
        this.deactivatedAt = deactivatedAt;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public void setProductSlug(final com.commercetools.api.models.common.LocalizedString productSlug) {
        this.productSlug = productSlug;
    }

    public void setProductType(final com.commercetools.api.models.product_type.ProductTypeReference productType) {
        this.productType = productType;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }

    public void setVariant(final com.commercetools.api.models.product.ProductVariant variant) {
        this.variant = variant;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShoppingListLineItemImpl that = (ShoppingListLineItemImpl) o;

        return new EqualsBuilder().append(addedAt, that.addedAt).append(custom, that.custom).append(deactivatedAt,
            that.deactivatedAt).append(id, that.id).append(name, that.name).append(productId, that.productId).append(
                productSlug, that.productSlug).append(productType, that.productType).append(quantity,
                    that.quantity).append(variant, that.variant).append(variantId, that.variantId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(addedAt).append(custom).append(deactivatedAt).append(id).append(
            name).append(productId).append(productSlug).append(productType).append(quantity).append(variant).append(
                variantId).toHashCode();
    }

}
