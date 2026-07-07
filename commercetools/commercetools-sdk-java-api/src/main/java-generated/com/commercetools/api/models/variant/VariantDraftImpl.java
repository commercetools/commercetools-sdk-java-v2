
package com.commercetools.api.models.variant;

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
 *  <p>Draft for creating a new Variant. When a Variant is created, only the current version is set. The staged version is only set when the Variant is updated with different current and staged data.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantDraftImpl implements VariantDraft, ModelBase {

    private String key;

    private String sku;

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    private Boolean publish;

    private java.util.List<com.commercetools.api.models.common.Image> images;

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    private java.util.List<com.commercetools.api.models.common.AssetDraft> assets;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantDraftImpl(@JsonProperty("key") final String key, @JsonProperty("sku") final String sku,
            @JsonProperty("product") final com.commercetools.api.models.product.ProductResourceIdentifier product,
            @JsonProperty("publish") final Boolean publish,
            @JsonProperty("images") final java.util.List<com.commercetools.api.models.common.Image> images,
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product.Attribute> attributes,
            @JsonProperty("assets") final java.util.List<com.commercetools.api.models.common.AssetDraft> assets) {
        this.key = key;
        this.sku = sku;
        this.product = product;
        this.publish = publish;
        this.images = images;
        this.attributes = attributes;
        this.assets = assets;
    }

    /**
     * create empty instance
     */
    public VariantDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier for the Variant. This field is optional, but we strongly recommend setting it.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>User-defined unique SKU of the Variant.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>ResourceIdentifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Variant belongs to.</p>
     */

    public com.commercetools.api.models.product.ProductResourceIdentifier getProduct() {
        return this.product;
    }

    /**
     *  <p>Indicates whether the Variant is published. If <code>true</code>, the Variant will be immediately available in the current published state.</p>
     */

    public Boolean getPublish() {
        return this.publish;
    }

    /**
     *  <p>Images for the Variant.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Variant Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     */

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>Media assets for the Variant.</p>
     */

    public java.util.List<com.commercetools.api.models.common.AssetDraft> getAssets() {
        return this.assets;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
    }

    public void setPublish(final Boolean publish) {
        this.publish = publish;
    }

    public void setImages(final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
    }

    public void setImages(final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
    }

    public void setAttributes(final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
    }

    public void setAssets(final com.commercetools.api.models.common.AssetDraft... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
    }

    public void setAssets(final java.util.List<com.commercetools.api.models.common.AssetDraft> assets) {
        this.assets = assets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantDraftImpl that = (VariantDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(sku, that.sku)
                .append(product, that.product)
                .append(publish, that.publish)
                .append(images, that.images)
                .append(attributes, that.attributes)
                .append(assets, that.assets)
                .append(key, that.key)
                .append(sku, that.sku)
                .append(product, that.product)
                .append(publish, that.publish)
                .append(images, that.images)
                .append(attributes, that.attributes)
                .append(assets, that.assets)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(sku)
                .append(product)
                .append(publish)
                .append(images)
                .append(attributes)
                .append(assets)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("sku", sku)
                .append("product", product)
                .append("publish", publish)
                .append("images", images)
                .append("attributes", attributes)
                .append("assets", assets)
                .build();
    }

    @Override
    public VariantDraft copyDeep() {
        return VariantDraft.deepCopy(this);
    }
}
