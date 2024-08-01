
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>The data representation for a ProductVariant to be imported that is persisted as a ProductVariant in the Project.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantImportImpl implements ProductVariantImport, ModelBase {

    private String key;

    private String sku;

    private Boolean isMasterVariant;

    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    private java.util.List<com.commercetools.importapi.models.common.Image> images;

    private java.util.List<com.commercetools.importapi.models.common.Asset> assets;

    private Boolean staged;

    private com.commercetools.importapi.models.common.ProductKeyReference product;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantImportImpl(@JsonProperty("key") final String key, @JsonProperty("sku") final String sku,
            @JsonProperty("isMasterVariant") final Boolean isMasterVariant,
            @JsonProperty("attributes") final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes,
            @JsonProperty("images") final java.util.List<com.commercetools.importapi.models.common.Image> images,
            @JsonProperty("assets") final java.util.List<com.commercetools.importapi.models.common.Asset> assets,
            @JsonProperty("staged") final Boolean staged,
            @JsonProperty("product") final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.key = key;
        this.sku = sku;
        this.isMasterVariant = isMasterVariant;
        this.attributes = attributes;
        this.images = images;
        this.assets = assets;
        this.staged = staged;
        this.product = product;
    }

    /**
     * create empty instance
     */
    public ProductVariantImportImpl() {
    }

    /**
     *  <p>User-defined unique identifier. If a ProductVariant with this <code>key</code> exists on the specified <code>product</code>, it will be updated with the imported data.</p>
     */

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
     *  <p>Maps to <code>ProductVariant.attributes</code>. The referenced attribute must be defined in an already existing ProductType in the project, or the <code>state</code> of the ImportOperation will be <code>unresolved</code>.</p>
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
     *  <ul>
     *   <li>Set to <code>false</code> to update both the current and staged projections of the Product with the new Product Variant data.</li>
     *   <li>Leave empty or set to <code>true</code> to only update the staged projection.</li>
     *  </ul>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The Product to which this Product Variant belongs. Maps to <code>ProductVariant.product</code>. The Reference to the Product with which the ProductVariant is associated. If referenced Product does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Product is created.</p>
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

    public void setStaged(final Boolean staged) {
        this.staged = staged;
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
                .append(staged, that.staged)
                .append(product, that.product)
                .append(key, that.key)
                .append(sku, that.sku)
                .append(isMasterVariant, that.isMasterVariant)
                .append(attributes, that.attributes)
                .append(images, that.images)
                .append(assets, that.assets)
                .append(staged, that.staged)
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
                .append(staged)
                .append(product)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("sku", sku)
                .append("isMasterVariant", isMasterVariant)
                .append("attributes", attributes)
                .append("images", images)
                .append("assets", assets)
                .append("staged", staged)
                .append("product", product)
                .build();
    }

}
