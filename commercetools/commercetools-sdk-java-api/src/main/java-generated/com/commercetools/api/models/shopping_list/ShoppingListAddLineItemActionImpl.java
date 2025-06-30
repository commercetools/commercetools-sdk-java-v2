
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
 *  <p>The ProductVariant to be included in the ShoppingListLineItem must be specified using the <code>productID</code> and <code>variantID</code>, or by the <code>sku</code>. If the ShoppingList already contains a ShoppingListLineItem for the same Product Variant with the same Custom Fields, then only the quantity of the existing ShoppingListLineItem is increased. A ShoppingListLineItem with an empty <code>variantId</code> is not considered the same as a ShoppingListLineItem with a <code>variantId</code> currently referring to the Master Variant.</p>
 *  <p>Product Attributes are merged with Variant Attributes to ensure the full Attribute context of the Product Variant.</p>
 *  <p>Produces the Shopping List Line Item Added Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListAddLineItemActionImpl implements ShoppingListAddLineItemAction, ModelBase {

    private String action;

    private String key;

    private String sku;

    private String productId;

    private Long variantId;

    private Long quantity;

    private java.time.ZonedDateTime addedAt;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShoppingListAddLineItemActionImpl(@JsonProperty("key") final String key, @JsonProperty("sku") final String sku,
            @JsonProperty("productId") final String productId, @JsonProperty("variantId") final Long variantId,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("addedAt") final java.time.ZonedDateTime addedAt,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.key = key;
        this.sku = sku;
        this.productId = productId;
        this.variantId = variantId;
        this.quantity = quantity;
        this.addedAt = addedAt;
        this.custom = custom;
        this.action = ADD_LINE_ITEM;
    }

    /**
     * create empty instance
     */
    public ShoppingListAddLineItemActionImpl() {
        this.action = ADD_LINE_ITEM;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>User-defined identifier of the ShoppingListLineItem. Must be unique per ShoppingList.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p><code>sku</code> of the ProductVariant.</p>
     */

    public String getSku() {
        return this.sku;
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
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Date and time the ShoppingListLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     */

    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    /**
     *  <p>Custom Fields defined for the ShoppingListLineItem.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
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

        ShoppingListAddLineItemActionImpl that = (ShoppingListAddLineItemActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(key, that.key)
                .append(sku, that.sku)
                .append(productId, that.productId)
                .append(variantId, that.variantId)
                .append(quantity, that.quantity)
                .append(addedAt, that.addedAt)
                .append(custom, that.custom)
                .append(action, that.action)
                .append(key, that.key)
                .append(sku, that.sku)
                .append(productId, that.productId)
                .append(variantId, that.variantId)
                .append(quantity, that.quantity)
                .append(addedAt, that.addedAt)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(key)
                .append(sku)
                .append(productId)
                .append(variantId)
                .append(quantity)
                .append(addedAt)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("key", key)
                .append("sku", sku)
                .append("productId", productId)
                .append("variantId", variantId)
                .append("quantity", quantity)
                .append("addedAt", addedAt)
                .append("custom", custom)
                .build();
    }

    @Override
    public ShoppingListAddLineItemAction copyDeep() {
        return ShoppingListAddLineItemAction.deepCopy(this);
    }
}
