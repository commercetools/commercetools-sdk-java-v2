
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
 *  <p>Generated after a successful Set Images update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringImagesSetMessagePayloadImpl implements ProductTailoringImagesSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.store.StoreKeyReference store;

    private String productKey;

    private com.commercetools.api.models.product.ProductReference product;

    private Long variantId;

    private java.util.List<com.commercetools.api.models.common.Image> oldImages;

    private java.util.List<com.commercetools.api.models.common.Image> images;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTailoringImagesSetMessagePayloadImpl(
            @JsonProperty("store") final com.commercetools.api.models.store.StoreKeyReference store,
            @JsonProperty("productKey") final String productKey,
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product,
            @JsonProperty("variantId") final Long variantId,
            @JsonProperty("oldImages") final java.util.List<com.commercetools.api.models.common.Image> oldImages,
            @JsonProperty("images") final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.store = store;
        this.productKey = productKey;
        this.product = product;
        this.variantId = variantId;
        this.oldImages = oldImages;
        this.images = images;
        this.type = PRODUCT_TAILORING_IMAGES_SET;
    }

    /**
     * create empty instance
     */
    public ProductTailoringImagesSetMessagePayloadImpl() {
        this.type = PRODUCT_TAILORING_IMAGES_SET;
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
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p><code>id</code> of the tailored Product Variant.</p>
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Images on the tailored Product Variant before the Set Images update action.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Image> getOldImages() {
        return this.oldImages;
    }

    /**
     *  <p>Images on the tailored Product Variant after the Set Images update action.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
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

    public void setOldImages(final com.commercetools.api.models.common.Image... oldImages) {
        this.oldImages = new ArrayList<>(Arrays.asList(oldImages));
    }

    public void setOldImages(final java.util.List<com.commercetools.api.models.common.Image> oldImages) {
        this.oldImages = oldImages;
    }

    public void setImages(final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
    }

    public void setImages(final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTailoringImagesSetMessagePayloadImpl that = (ProductTailoringImagesSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(store, that.store)
                .append(productKey, that.productKey)
                .append(product, that.product)
                .append(variantId, that.variantId)
                .append(oldImages, that.oldImages)
                .append(images, that.images)
                .append(type, that.type)
                .append(store, that.store)
                .append(productKey, that.productKey)
                .append(product, that.product)
                .append(variantId, that.variantId)
                .append(oldImages, that.oldImages)
                .append(images, that.images)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(store)
                .append(productKey)
                .append(product)
                .append(variantId)
                .append(oldImages)
                .append(images)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("store", store)
                .append("productKey", productKey)
                .append("product", product)
                .append("variantId", variantId)
                .append("oldImages", oldImages)
                .append("images", images)
                .build();
    }

    @Override
    public ProductTailoringImagesSetMessagePayload copyDeep() {
        return ProductTailoringImagesSetMessagePayload.deepCopy(this);
    }
}
