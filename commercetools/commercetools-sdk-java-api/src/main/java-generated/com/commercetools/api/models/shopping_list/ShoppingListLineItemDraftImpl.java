
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>The ProductVariant to be included in the ShoppingListLineItem must be specified using the <code>productID</code> and <code>variantID</code>, or by the <code>sku</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListLineItemDraftImpl implements ShoppingListLineItemDraft, ModelBase {

    private String key;

    private String productId;

    private Long variantId;

    private String sku;

    private java.time.ZonedDateTime addedAt;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private Long quantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShoppingListLineItemDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("productId") final String productId, @JsonProperty("variantId") final Long variantId,
            @JsonProperty("sku") final String sku, @JsonProperty("addedAt") final java.time.ZonedDateTime addedAt,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("quantity") final Long quantity) {
        this.key = key;
        this.productId = productId;
        this.variantId = variantId;
        this.sku = sku;
        this.addedAt = addedAt;
        this.custom = custom;
        this.quantity = quantity;
    }

    /**
     * create empty instance
     */
    public ShoppingListLineItemDraftImpl() {
    }

    /**
     *  <p>User-defined identifier of the ShoppingListLineItem. Must be unique per ShoppingList.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Unique identifier of a Product.</p>
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p><code>id</code> of the ProductVariant. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p><code>sku</code> of the ProductVariant.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Date and time the ShoppingListLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     */

    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    /**
     *  <p>Custom Fields of the ShoppingListLineItem.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setAddedAt(final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShoppingListLineItemDraftImpl that = (ShoppingListLineItemDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(productId, that.productId)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(addedAt, that.addedAt)
                .append(custom, that.custom)
                .append(quantity, that.quantity)
                .append(key, that.key)
                .append(productId, that.productId)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(addedAt, that.addedAt)
                .append(custom, that.custom)
                .append(quantity, that.quantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(productId)
                .append(variantId)
                .append(sku)
                .append(addedAt)
                .append(custom)
                .append(quantity)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("productId", productId)
                .append("variantId", variantId)
                .append("sku", sku)
                .append("addedAt", addedAt)
                .append("custom", custom)
                .append("quantity", quantity)
                .build();
    }

}
