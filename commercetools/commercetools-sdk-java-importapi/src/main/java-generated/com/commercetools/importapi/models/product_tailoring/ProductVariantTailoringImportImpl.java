
package com.commercetools.importapi.models.product_tailoring;

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
 *  <p>Represents the data of a Product Variant to be tailored for a Store.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantTailoringImportImpl implements ProductVariantTailoringImport, ModelBase {

    private String sku;

    private java.util.List<com.commercetools.importapi.models.common.Image> images;

    private java.util.List<com.commercetools.importapi.models.common.Asset> assets;

    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantTailoringImportImpl(@JsonProperty("sku") final String sku,
            @JsonProperty("images") final java.util.List<com.commercetools.importapi.models.common.Image> images,
            @JsonProperty("assets") final java.util.List<com.commercetools.importapi.models.common.Asset> assets,
            @JsonProperty("attributes") final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.sku = sku;
        this.images = images;
        this.assets = assets;
        this.attributes = attributes;
    }

    /**
     * create empty instance
     */
    public ProductVariantTailoringImportImpl() {
    }

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to be tailored.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.images</code>.</p>
     */

    public java.util.List<com.commercetools.importapi.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.assets</code>.</p>
     */

    public java.util.List<com.commercetools.importapi.models.common.Asset> getAssets() {
        return this.assets;
    }

    /**
     *  <p>Maps to <code>ProductVariantTailoring.attributes</code>.</p>
     */

    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
        return this.attributes;
    }

    public void setSku(final String sku) {
        this.sku = sku;
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

    public void setAttributes(final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(
            final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantTailoringImportImpl that = (ProductVariantTailoringImportImpl) o;

        return new EqualsBuilder().append(sku, that.sku)
                .append(images, that.images)
                .append(assets, that.assets)
                .append(attributes, that.attributes)
                .append(sku, that.sku)
                .append(images, that.images)
                .append(assets, that.assets)
                .append(attributes, that.attributes)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(sku).append(images).append(assets).append(attributes).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("sku", sku)
                .append("images", images)
                .append("assets", assets)
                .append("attributes", attributes)
                .build();
    }

    @Override
    public ProductVariantTailoringImport copyDeep() {
        return ProductVariantTailoringImport.deepCopy(this);
    }
}
