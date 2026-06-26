
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <span>Create Variant</span> request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantCreatedMessagePayloadImpl implements VariantCreatedMessagePayload, ModelBase {

    private String type;

    private String id;

    private String productId;

    private Integer variantId;

    private String key;

    private String sku;

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    private java.util.List<com.commercetools.api.models.common.Asset> assets;

    private java.util.List<com.commercetools.api.models.common.Image> images;

    private Boolean publish;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantCreatedMessagePayloadImpl(@JsonProperty("id") final String id,
            @JsonProperty("productId") final String productId, @JsonProperty("variantId") final Integer variantId,
            @JsonProperty("key") final String key, @JsonProperty("sku") final String sku,
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product.Attribute> attributes,
            @JsonProperty("assets") final java.util.List<com.commercetools.api.models.common.Asset> assets,
            @JsonProperty("images") final java.util.List<com.commercetools.api.models.common.Image> images,
            @JsonProperty("publish") final Boolean publish) {
        this.id = id;
        this.productId = productId;
        this.variantId = variantId;
        this.key = key;
        this.sku = sku;
        this.attributes = attributes;
        this.assets = assets;
        this.images = images;
        this.publish = publish;
        this.type = VARIANT_CREATED;
    }

    /**
     * create empty instance
     */
    public VariantCreatedMessagePayloadImpl() {
        this.type = VARIANT_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier of the Variant.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Unique identifier of the Product to which the Variant belongs.</p>
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p>Unique identifier of the Variant within its parent Product.</p>
     */

    public Integer getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>User-defined unique identifier of the Variant.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>SKU of the Variant.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Attributes of the Variant.</p>
     */

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>Assets of the Variant.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Asset> getAssets() {
        return this.assets;
    }

    /**
     *  <p>Images of the Variant.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Whether the Variant was published.</p>
     */

    public Boolean getPublish() {
        return this.publish;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public void setVariantId(final Integer variantId) {
        this.variantId = variantId;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setAttributes(final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
    }

    public void setAssets(final com.commercetools.api.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
    }

    public void setAssets(final java.util.List<com.commercetools.api.models.common.Asset> assets) {
        this.assets = assets;
    }

    public void setImages(final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
    }

    public void setImages(final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
    }

    public void setPublish(final Boolean publish) {
        this.publish = publish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantCreatedMessagePayloadImpl that = (VariantCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(id, that.id)
                .append(productId, that.productId)
                .append(variantId, that.variantId)
                .append(key, that.key)
                .append(sku, that.sku)
                .append(attributes, that.attributes)
                .append(assets, that.assets)
                .append(images, that.images)
                .append(publish, that.publish)
                .append(type, that.type)
                .append(id, that.id)
                .append(productId, that.productId)
                .append(variantId, that.variantId)
                .append(key, that.key)
                .append(sku, that.sku)
                .append(attributes, that.attributes)
                .append(assets, that.assets)
                .append(images, that.images)
                .append(publish, that.publish)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(id)
                .append(productId)
                .append(variantId)
                .append(key)
                .append(sku)
                .append(attributes)
                .append(assets)
                .append(images)
                .append(publish)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("id", id)
                .append("productId", productId)
                .append("variantId", variantId)
                .append("key", key)
                .append("sku", sku)
                .append("attributes", attributes)
                .append("assets", assets)
                .append("images", images)
                .append("publish", publish)
                .build();
    }

    @Override
    public VariantCreatedMessagePayload copyDeep() {
        return VariantCreatedMessagePayload.deepCopy(this);
    }
}
