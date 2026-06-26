
package com.commercetools.importapi.models.variants;

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
 *  <p>Represents the data used to import a Variant. Once imported, this data is persisted as a <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a> in the Project.</p>
 *  <p>This import resource is only available for Projects with <code>productCatalogModel</code> set to <code>Modular</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantImportImpl implements VariantImport, ModelBase {

    private String key;

    private String sku;

    private com.commercetools.importapi.models.common.ProductKeyReference product;

    private Boolean publish;

    private java.util.List<com.commercetools.importapi.models.common.Image> images;

    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    private java.util.List<com.commercetools.importapi.models.common.Asset> assets;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantImportImpl(@JsonProperty("key") final String key, @JsonProperty("sku") final String sku,
            @JsonProperty("product") final com.commercetools.importapi.models.common.ProductKeyReference product,
            @JsonProperty("publish") final Boolean publish,
            @JsonProperty("images") final java.util.List<com.commercetools.importapi.models.common.Image> images,
            @JsonProperty("attributes") final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes,
            @JsonProperty("assets") final java.util.List<com.commercetools.importapi.models.common.Asset> assets) {
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
    public VariantImportImpl() {
    }

    /**
     *  <p>User-defined unique identifier. If a Variant with this <code>key</code> exists, it is updated with the imported data.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Maps to <code>VariantData.sku</code>.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Maps to <code>Variant.product</code>.</p>
     */

    public com.commercetools.importapi.models.common.ProductKeyReference getProduct() {
        return this.product;
    }

    /**
     *  <p>Indicates whether the Variant is published. If <code>true</code>, the Variant is immediately available in the current published state. Maps to <code>VariantDraft.publish</code>.</p>
     */

    public Boolean getPublish() {
        return this.publish;
    }

    /**
     *  <p>Maps to <code>VariantData.images</code>.</p>
     */

    public java.util.List<com.commercetools.importapi.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Maps to <code>VariantData.attributes</code>.</p>
     */

    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>Maps to <code>VariantData.assets</code>.</p>
     */

    public java.util.List<com.commercetools.importapi.models.common.Asset> getAssets() {
        return this.assets;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setProduct(final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
    }

    public void setPublish(final Boolean publish) {
        this.publish = publish;
    }

    public void setImages(final com.commercetools.importapi.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
    }

    public void setImages(final java.util.List<com.commercetools.importapi.models.common.Image> images) {
        this.images = images;
    }

    public void setAttributes(final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(
            final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
    }

    public void setAssets(final com.commercetools.importapi.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
    }

    public void setAssets(final java.util.List<com.commercetools.importapi.models.common.Asset> assets) {
        this.assets = assets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantImportImpl that = (VariantImportImpl) o;

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
    public VariantImport copyDeep() {
        return VariantImport.deepCopy(this);
    }
}
