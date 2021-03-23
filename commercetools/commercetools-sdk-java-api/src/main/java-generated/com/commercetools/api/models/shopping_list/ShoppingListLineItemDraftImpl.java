
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
public final class ShoppingListLineItemDraftImpl implements ShoppingListLineItemDraft {

    private java.time.ZonedDateTime addedAt;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private String sku;

    private String productId;

    private Integer quantity;

    private Long variantId;

    @JsonCreator
    ShoppingListLineItemDraftImpl(@JsonProperty("addedAt") final java.time.ZonedDateTime addedAt,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("sku") final String sku, @JsonProperty("productId") final String productId,
            @JsonProperty("quantity") final Integer quantity, @JsonProperty("variantId") final Long variantId) {
        this.addedAt = addedAt;
        this.custom = custom;
        this.sku = sku;
        this.productId = productId;
        this.quantity = quantity;
        this.variantId = variantId;
    }

    public ShoppingListLineItemDraftImpl() {
    }

    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public String getSku() {
        return this.sku;
    }

    public String getProductId() {
        return this.productId;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    public void setAddedAt(final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
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

        ShoppingListLineItemDraftImpl that = (ShoppingListLineItemDraftImpl) o;

        return new EqualsBuilder().append(addedAt, that.addedAt)
                .append(custom, that.custom)
                .append(sku, that.sku)
                .append(productId, that.productId)
                .append(quantity, that.quantity)
                .append(variantId, that.variantId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(addedAt)
                .append(custom)
                .append(sku)
                .append(productId)
                .append(quantity)
                .append(variantId)
                .toHashCode();
    }

}
