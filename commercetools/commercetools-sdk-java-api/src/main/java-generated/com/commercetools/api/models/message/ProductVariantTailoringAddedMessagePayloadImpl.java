
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Add ProductVariant Tailoring update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantTailoringAddedMessagePayloadImpl
        implements ProductVariantTailoringAddedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.store.StoreKeyReference store;

    private String productKey;

    private com.commercetools.api.models.product.ProductReference product;

    private Long variantId;

    private com.commercetools.api.models.product_tailoring.ProductVariantTailoring variant;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantTailoringAddedMessagePayloadImpl(
            @JsonProperty("store") final com.commercetools.api.models.store.StoreKeyReference store,
            @JsonProperty("productKey") final String productKey,
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product,
            @JsonProperty("variantId") final Long variantId,
            @JsonProperty("variant") final com.commercetools.api.models.product_tailoring.ProductVariantTailoring variant) {
        this.store = store;
        this.productKey = productKey;
        this.product = product;
        this.variantId = variantId;
        this.variant = variant;
        this.type = PRODUCT_VARIANT_TAILORING_ADDED;
    }

    /**
     * create empty instance
     */
    public ProductVariantTailoringAddedMessagePayloadImpl() {
        this.type = PRODUCT_VARIANT_TAILORING_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     */

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p><code>key</code> of the tailored Product.</p>
     */

    public String getProductKey() {
        return this.productKey;
    }

    /**
     *  <p>Reference to the tailored Product.</p>
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p><code>id</code> of the ProductVariant added to the Tailoring.</p>
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The ProductVariantTailoring that was added to the ProductTailoring.</p>
     */

    public com.commercetools.api.models.product_tailoring.ProductVariantTailoring getVariant() {
        return this.variant;
    }

    public void setStore(final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
    }

    public void setProductKey(final String productKey) {
        this.productKey = productKey;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setVariant(final com.commercetools.api.models.product_tailoring.ProductVariantTailoring variant) {
        this.variant = variant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantTailoringAddedMessagePayloadImpl that = (ProductVariantTailoringAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(store, that.store)
                .append(productKey, that.productKey)
                .append(product, that.product)
                .append(variantId, that.variantId)
                .append(variant, that.variant)
                .append(type, that.type)
                .append(store, that.store)
                .append(productKey, that.productKey)
                .append(product, that.product)
                .append(variantId, that.variantId)
                .append(variant, that.variant)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(store)
                .append(productKey)
                .append(product)
                .append(variantId)
                .append(variant)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("store", store)
                .append("productKey", productKey)
                .append("product", product)
                .append("variantId", variantId)
                .append("variant", variant)
                .build();
    }

    @Override
    public ProductVariantTailoringAddedMessagePayload copyDeep() {
        return ProductVariantTailoringAddedMessagePayload.deepCopy(this);
    }
}
