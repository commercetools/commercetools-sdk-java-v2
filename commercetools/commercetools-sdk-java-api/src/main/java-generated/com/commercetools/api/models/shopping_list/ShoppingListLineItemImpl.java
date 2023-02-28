
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

/**
 *  <p>ShoppingListLineItems are Line Items that contain references to ProductVariants in a Product.</p>
 *  <p>In addition to standard Reference Expansion, a ShoppingListLineItem offers expansion on <code>productSlug</code> and <code>variant</code>, defined with the query parameter <code>expand</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListLineItemImpl implements ShoppingListLineItem, ModelBase {

    private java.time.ZonedDateTime addedAt;

    private com.commercetools.api.models.type.CustomFields custom;

    private java.time.ZonedDateTime deactivatedAt;

    private String id;

    private com.commercetools.api.models.common.LocalizedString name;

    private String productId;

    private com.commercetools.api.models.product_type.ProductTypeReference productType;

    private Long quantity;

    private Long variantId;

    private com.commercetools.api.models.product.ProductVariant variant;

    private com.commercetools.api.models.common.LocalizedString productSlug;

    @JsonCreator
    ShoppingListLineItemImpl(@JsonProperty("addedAt") final java.time.ZonedDateTime addedAt,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("deactivatedAt") final java.time.ZonedDateTime deactivatedAt,
            @JsonProperty("id") final String id,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("productId") final String productId,
            @JsonProperty("productType") final com.commercetools.api.models.product_type.ProductTypeReference productType,
            @JsonProperty("quantity") final Long quantity, @JsonProperty("variantId") final Long variantId,
            @JsonProperty("variant") final com.commercetools.api.models.product.ProductVariant variant,
            @JsonProperty("productSlug") final com.commercetools.api.models.common.LocalizedString productSlug) {
        this.addedAt = addedAt;
        this.custom = custom;
        this.deactivatedAt = deactivatedAt;
        this.id = id;
        this.name = name;
        this.productId = productId;
        this.productType = productType;
        this.quantity = quantity;
        this.variantId = variantId;
        this.variant = variant;
        this.productSlug = productSlug;
    }

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
     *  <p>This data is updated in an eventual consistent manner when the Product Variant cannot be ordered anymore.</p>
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
     *  <p>Name of the Product.</p>
     *  <p>This data is updated in an eventual consistent manner when the Product's name changes.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Unique identifier of a Product.</p>
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p>The Product Type defining the Attributes of the Product.</p>
     */

    public com.commercetools.api.models.product_type.ProductTypeReference getProductType() {
        return this.productType;
    }

    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p><code>id</code> of the ProductVariant the ShoppingListLineItem refers to. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Data of the ProductVariant.</p>
     *  <p>Returned when expanded using <code>expand=lineItems[*].variant</code>. You cannot expand only a single element of the array.</p>
     */

    public com.commercetools.api.models.product.ProductVariant getVariant() {
        return this.variant;
    }

    /**
     *  <p>Slug of the current ProductData.</p>
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

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public void setProductType(final com.commercetools.api.models.product_type.ProductTypeReference productType) {
        this.productType = productType;
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
                .append(name, that.name)
                .append(productId, that.productId)
                .append(productType, that.productType)
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
                .append(name)
                .append(productId)
                .append(productType)
                .append(quantity)
                .append(variantId)
                .append(variant)
                .append(productSlug)
                .toHashCode();
    }

}
