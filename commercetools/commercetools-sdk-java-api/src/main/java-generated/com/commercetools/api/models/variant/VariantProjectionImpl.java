
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
 *  <p>A lightweight, read-only projection of a single Variant with embedded Product data. Variant Projections are automatically created and updated when Variants or their parent Products change.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantProjectionImpl implements VariantProjection, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private Boolean staged;

    private Integer variantId;

    private com.commercetools.api.models.product.ProductReference product;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString slug;

    private com.commercetools.api.models.common.LocalizedString description;

    private String key;

    private String sku;

    private java.util.List<com.commercetools.api.models.common.Image> images;

    private java.util.List<com.commercetools.api.models.common.Asset> assets;

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    private com.commercetools.api.models.common.Price price;

    private Boolean _default;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantProjectionImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("staged") final Boolean staged, @JsonProperty("variantId") final Integer variantId,
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("key") final String key, @JsonProperty("sku") final String sku,
            @JsonProperty("images") final java.util.List<com.commercetools.api.models.common.Image> images,
            @JsonProperty("assets") final java.util.List<com.commercetools.api.models.common.Asset> assets,
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product.Attribute> attributes,
            @JsonProperty("price") final com.commercetools.api.models.common.Price price,
            @JsonProperty("default") final Boolean _default) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.staged = staged;
        this.variantId = variantId;
        this.product = product;
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.key = key;
        this.sku = sku;
        this.images = images;
        this.assets = assets;
        this.attributes = attributes;
        this.price = price;
        this._default = _default;
    }

    /**
     * create empty instance
     */
    public VariantProjectionImpl() {
    }

    /**
     *  <p>Unique identifier of the Variant within its parent Product.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Variant Projection.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Variant Projection was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p><code>true</code> for the staged (draft) projection, <code>false</code> for the current (published) projection.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     */

    public Integer getVariantId() {
        return this.variantId;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p>Name of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Slug of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>Description of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Images of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Assets of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Asset> getAssets() {
        return this.assets;
    }

    /**
     *  <p>Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>, including product-level Attributes merged at projection time.</p>
     */

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>The selected price based on the <span>price selection</span> query parameters. Only present when price selection parameters are provided.</p>
     */

    public com.commercetools.api.models.common.Price getPrice() {
        return this.price;
    }

    /**
     *  <p><code>true</code> if this Variant is the default Variant of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> (see <span>Product.defaultVariant</span>). <code>false</code> otherwise.</p>
     */

    public Boolean getDefault() {
        return this._default;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    public void setVariantId(final Integer variantId) {
        this.variantId = variantId;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setImages(final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
    }

    public void setImages(final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
    }

    public void setAssets(final com.commercetools.api.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
    }

    public void setAssets(final java.util.List<com.commercetools.api.models.common.Asset> assets) {
        this.assets = assets;
    }

    public void setAttributes(final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
    }

    public void setPrice(final com.commercetools.api.models.common.Price price) {
        this.price = price;
    }

    public void setDefault(final Boolean _default) {
        this._default = _default;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantProjectionImpl that = (VariantProjectionImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(staged, that.staged)
                .append(variantId, that.variantId)
                .append(product, that.product)
                .append(name, that.name)
                .append(slug, that.slug)
                .append(description, that.description)
                .append(key, that.key)
                .append(sku, that.sku)
                .append(images, that.images)
                .append(assets, that.assets)
                .append(attributes, that.attributes)
                .append(price, that.price)
                .append(_default, that._default)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(staged, that.staged)
                .append(variantId, that.variantId)
                .append(product, that.product)
                .append(name, that.name)
                .append(slug, that.slug)
                .append(description, that.description)
                .append(key, that.key)
                .append(sku, that.sku)
                .append(images, that.images)
                .append(assets, that.assets)
                .append(attributes, that.attributes)
                .append(price, that.price)
                .append(_default, that._default)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(staged)
                .append(variantId)
                .append(product)
                .append(name)
                .append(slug)
                .append(description)
                .append(key)
                .append(sku)
                .append(images)
                .append(assets)
                .append(attributes)
                .append(price)
                .append(_default)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .append("createdAt", createdAt)
                .append("staged", staged)
                .append("variantId", variantId)
                .append("product", product)
                .append("name", name)
                .append("slug", slug)
                .append("description", description)
                .append("key", key)
                .append("sku", sku)
                .append("images", images)
                .append("assets", assets)
                .append("attributes", attributes)
                .append("price", price)
                .append("default", _default)
                .build();
    }

    @Override
    public VariantProjection copyDeep() {
        return VariantProjection.deepCopy(this);
    }
}
