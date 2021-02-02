
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListAddLineItemActionImpl implements MyShoppingListAddLineItemAction {

    private String action;

    private String sku;

    private String productId;

    private Long variantId;

    private Long quantity;

    private java.time.ZonedDateTime addedAt;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @JsonCreator
    MyShoppingListAddLineItemActionImpl(@JsonProperty("sku") final String sku,
            @JsonProperty("productId") final String productId, @JsonProperty("variantId") final Long variantId,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("addedAt") final java.time.ZonedDateTime addedAt,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.sku = sku;
        this.productId = productId;
        this.variantId = variantId;
        this.quantity = quantity;
        this.addedAt = addedAt;
        this.custom = custom;
        this.action = ADD_LINE_ITEM;
    }

    public MyShoppingListAddLineItemActionImpl() {
        this.action = ADD_LINE_ITEM;
    }

    public String getAction() {
        return this.action;
    }

    public String getSku() {
        return this.sku;
    }

    public String getProductId() {
        return this.productId;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setAddedAt(final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyShoppingListAddLineItemActionImpl that = (MyShoppingListAddLineItemActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(sku, that.sku).append(productId,
            that.productId).append(variantId, that.variantId).append(quantity, that.quantity).append(addedAt,
                that.addedAt).append(custom, that.custom).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(sku).append(productId).append(variantId).append(
            quantity).append(addedAt).append(custom).toHashCode();
    }

}
