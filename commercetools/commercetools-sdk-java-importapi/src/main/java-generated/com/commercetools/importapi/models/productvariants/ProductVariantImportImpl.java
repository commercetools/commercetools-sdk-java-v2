
package com.commercetools.importapi.models.productvariants;

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
*  <p>The data representation for a ProductVariant to be imported that is persisted as a <a href="/../api/projects/products#productvariant">ProductVariant</a> in the Project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductVariantImportImpl implements ProductVariantImport, ModelBase {

    private String key;

    private String sku;

    private Boolean isMasterVariant;

    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    private java.util.List<com.commercetools.importapi.models.common.Image> images;

    private java.util.List<com.commercetools.importapi.models.common.Asset> assets;

    private Boolean publish;

    private com.commercetools.importapi.models.common.ProductKeyReference product;

    @JsonCreator
    ProductVariantImportImpl(@JsonProperty("key") final String key, @JsonProperty("sku") final String sku,
            @JsonProperty("isMasterVariant") final Boolean isMasterVariant,
            @JsonProperty("attributes") final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes,
            @JsonProperty("images") final java.util.List<com.commercetools.importapi.models.common.Image> images,
            @JsonProperty("assets") final java.util.List<com.commercetools.importapi.models.common.Asset> assets,
            @JsonProperty("publish") final Boolean publish,
            @JsonProperty("product") final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.key = key;
        this.sku = sku;
        this.isMasterVariant = isMasterVariant;
        this.attributes = attributes;
        this.images = images;
        this.assets = assets;
        this.publish = publish;
        this.product = product;
    }

    public ProductVariantImportImpl() {
    }

    public String getKey() {
        return this.key;
    }

    /**
    *  <p>Maps to <code>ProductVariant.sku</code>.</p>
    */
    public String getSku() {
        return this.sku;
    }

    /**
    *  <p>Maps to <code>ProductVariant.isMasterVariant</code>.</p>
    */
    public Boolean getIsMasterVariant() {
        return this.isMasterVariant;
    }

    /**
    *  <p>Maps to <code>ProductVariant.attributes</code>.
    *  The referenced attribute must be defined in an already existing ProductType in the commercetools project, or the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be <code>unresolved</code>.</p>
    */
    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
    *  <p>Maps to <code>ProductVariant.images</code>.</p>
    */
    public java.util.List<com.commercetools.importapi.models.common.Image> getImages() {
        return this.images;
    }

    /**
    *  <p>Maps to <code>ProductVariant.assets</code>.</p>
    */
    public java.util.List<com.commercetools.importapi.models.common.Asset> getAssets() {
        return this.assets;
    }

    /**
    *  <p>If <code>publish</code> is set to either <code>true</code> or <code>false</code>, both staged and current projections are set to the same value provided by the import data.
    *  If <code>publish</code> is not set, the staged projection is set to the provided import data, but the current projection stays unchanged.
    *  However, if the import data contains no update, that is, if it matches the staged projection of the existing Product in the platform, the import induces no change in the existing Product whether <code>publish</code> is set or not.</p>
    */
    public Boolean getPublish() {
        return this.publish;
    }

    /**
    *  <p>The <a href="/../api/projects/products#productvariant">Product</a> to which this Product Variant belongs. Maps to <code>ProductVariant.product</code>.
    *  The Reference to the <a href="/../api/projects/products#product">Product</a> with which the ProductVariant is associated.
    *  If referenced Product does not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>unresolved</code> until the necessary Product is created.</p>
    */
    public com.commercetools.importapi.models.common.ProductKeyReference getProduct() {
        return this.product;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setIsMasterVariant(final Boolean isMasterVariant) {
        this.isMasterVariant = isMasterVariant;
    }

    public void setAttributes(final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(
            final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
    }

    public void setImages(final com.commercetools.importapi.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
    }

    public void setImages(final java.util.List<com.commercetools.importapi.models.common.Image> images) {
        this.images = images;
    }

    public void setAssets(final com.commercetools.importapi.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
    }

    public void setAssets(final java.util.List<com.commercetools.importapi.models.common.Asset> assets) {
        this.assets = assets;
    }

    public void setPublish(final Boolean publish) {
        this.publish = publish;
    }

    public void setProduct(final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantImportImpl that = (ProductVariantImportImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(sku, that.sku)
                .append(isMasterVariant, that.isMasterVariant)
                .append(attributes, that.attributes)
                .append(images, that.images)
                .append(assets, that.assets)
                .append(publish, that.publish)
                .append(product, that.product)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(sku)
                .append(isMasterVariant)
                .append(attributes)
                .append(images)
                .append(assets)
                .append(publish)
                .append(product)
                .toHashCode();
    }

}
