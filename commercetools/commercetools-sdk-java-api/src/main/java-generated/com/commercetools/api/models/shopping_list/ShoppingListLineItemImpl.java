
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
 *  <p>ShoppingListLineItems are Line Items that contain references to <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariants</a> in a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
 *  <p>In addition to standard <span>Reference Expansion</span>, a ShoppingListLineItem offers expansion on <code>productSlug</code> and <code>variant</code>, defined with the query parameter <code>expand</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListLineItemImpl implements ShoppingListLineItem, ModelBase {

    private java.time.ZonedDateTime addedAt;

    private com.commercetools.api.models.type.CustomFields custom;

    private java.time.ZonedDateTime deactivatedAt;

    private String id;

    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    private String productId;

    private com.commercetools.api.models.product_type.ProductTypeReference productType;

    private Boolean published;

    private Long quantity;

    private Long variantId;

    private com.commercetools.api.models.product.ProductVariant variant;

    private com.commercetools.api.models.common.LocalizedString productSlug;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShoppingListLineItemImpl(@JsonProperty("addedAt") final java.time.ZonedDateTime addedAt,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("deactivatedAt") final java.time.ZonedDateTime deactivatedAt,
            @JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("productId") final String productId,
            @JsonProperty("productType") final com.commercetools.api.models.product_type.ProductTypeReference productType,
            @JsonProperty("published") final Boolean published, @JsonProperty("quantity") final Long quantity,
            @JsonProperty("variantId") final Long variantId,
            @JsonProperty("variant") final com.commercetools.api.models.product.ProductVariant variant,
            @JsonProperty("productSlug") final com.commercetools.api.models.common.LocalizedString productSlug) {
        this.addedAt = addedAt;
        this.custom = custom;
        this.deactivatedAt = deactivatedAt;
        this.id = id;
        this.key = key;
        this.name = name;
        this.productId = productId;
        this.productType = productType;
        this.published = published;
        this.quantity = quantity;
        this.variantId = variantId;
        this.variant = variant;
        this.productSlug = productSlug;
    }

    /**
     * create empty instance
     */
    public ShoppingListLineItemImpl() {
    }

    /**
     *  <p>Date and time (UTC) the ShoppingListLineItem was added to the ShoppingList.</p>
     */

    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    /**
     *  <p>Custom Fields of the ShoppingListLineItem.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>If the Product or Product Variant is deleted, <code>deactivatedAt</code> is the date and time (UTC) of deletion.</p>
     *  <p>This data is updated in an <span>eventual consistent manner</span> when the Product Variant cannot be ordered anymore.</p>
     */

    public java.time.ZonedDateTime getDeactivatedAt() {
        return this.deactivatedAt;
    }

    /**
     *  <p>Unique identifier of the ShoppingListLineItem.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined identifier of the ShoppingListLineItem. It is unique per <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the Product.</p>
     *  <p>This data is updated in an <span>eventual consistent manner</span> when the Product's name changes.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Unique identifier of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p>The Product Type defining the Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public com.commercetools.api.models.product_type.ProductTypeReference getProductType() {
        return this.productType;
    }

    /**
     *  <p>Whether the related <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> is published or not.</p>
     *  <p>This data is updated in an <span>eventual consistent manner</span> when the Product's published status changes.</p>
     */

    public Boolean getPublished() {
        return this.published;
    }

    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> the ShoppingListLineItem refers to. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Data of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>. This data includes all the Product Attributes and Variant Attributes to ensure the full Attribute context of the Product Variant.</p>
     *  <p>Returned when expanded using <code>expand=lineItems[*].variant</code>. You cannot expand only a single element of the array.</p>
     */

    public com.commercetools.api.models.product.ProductVariant getVariant() {
        return this.variant;
    }

    /**
     *  <p>Slug of the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductData" rel="nofollow">ProductData</a>.</p>
     *  <p>Returned when expanded using <code>expand=lineItems[*].productSlug</code>. You cannot expand only a single element of the array.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getProductSlug() {
        return this.productSlug;
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

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public void setProductType(final com.commercetools.api.models.product_type.ProductTypeReference productType) {
        this.productType = productType;
    }

    public void setPublished(final Boolean published) {
        this.published = published;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setVariant(final com.commercetools.api.models.product.ProductVariant variant) {
        this.variant = variant;
    }

    public void setProductSlug(final com.commercetools.api.models.common.LocalizedString productSlug) {
        this.productSlug = productSlug;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShoppingListLineItemImpl that = (ShoppingListLineItemImpl) o;

        return new EqualsBuilder().append(addedAt, that.addedAt)
                .append(custom, that.custom)
                .append(deactivatedAt, that.deactivatedAt)
                .append(id, that.id)
                .append(key, that.key)
                .append(name, that.name)
                .append(productId, that.productId)
                .append(productType, that.productType)
                .append(published, that.published)
                .append(quantity, that.quantity)
                .append(variantId, that.variantId)
                .append(variant, that.variant)
                .append(productSlug, that.productSlug)
                .append(addedAt, that.addedAt)
                .append(custom, that.custom)
                .append(deactivatedAt, that.deactivatedAt)
                .append(id, that.id)
                .append(key, that.key)
                .append(name, that.name)
                .append(productId, that.productId)
                .append(productType, that.productType)
                .append(published, that.published)
                .append(quantity, that.quantity)
                .append(variantId, that.variantId)
                .append(variant, that.variant)
                .append(productSlug, that.productSlug)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(addedAt)
                .append(custom)
                .append(deactivatedAt)
                .append(id)
                .append(key)
                .append(name)
                .append(productId)
                .append(productType)
                .append(published)
                .append(quantity)
                .append(variantId)
                .append(variant)
                .append(productSlug)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("addedAt", addedAt)
                .append("custom", custom)
                .append("deactivatedAt", deactivatedAt)
                .append("id", id)
                .append("key", key)
                .append("name", name)
                .append("productId", productId)
                .append("productType", productType)
                .append("published", published)
                .append("quantity", quantity)
                .append("variantId", variantId)
                .append("variant", variant)
                .append("productSlug", productSlug)
                .build();
    }

    @Override
    public ShoppingListLineItem copyDeep() {
        return ShoppingListLineItem.deepCopy(this);
    }
}
