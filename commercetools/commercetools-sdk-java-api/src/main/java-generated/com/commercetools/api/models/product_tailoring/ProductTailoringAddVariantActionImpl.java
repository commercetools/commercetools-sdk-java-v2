
package com.commercetools.api.models.product_tailoring;

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
 *  <p>Either <code>id</code> or <code>sku</code> is required to reference a ProductVariant that exists. Produces the ProductVariantTailoringAdded Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringAddVariantActionImpl implements ProductTailoringAddVariantAction, ModelBase {

    private String action;

    private Long id;

    private String sku;

    private java.util.List<com.commercetools.api.models.common.Image> images;

    private java.util.List<com.commercetools.api.models.common.AssetDraft> assets;

    private java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> attributes;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTailoringAddVariantActionImpl(@JsonProperty("id") final Long id, @JsonProperty("sku") final String sku,
            @JsonProperty("images") final java.util.List<com.commercetools.api.models.common.Image> images,
            @JsonProperty("assets") final java.util.List<com.commercetools.api.models.common.AssetDraft> assets,
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> attributes,
            @JsonProperty("staged") final Boolean staged) {
        this.id = id;
        this.sku = sku;
        this.images = images;
        this.assets = assets;
        this.attributes = attributes;
        this.staged = staged;
        this.action = ADD_VARIANT;
    }

    /**
     * create empty instance
     */
    public ProductTailoringAddVariantActionImpl() {
        this.action = ADD_VARIANT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     */

    public Long getId() {
        return this.id;
    }

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Images for the Product Variant Tailoring.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Media assets for the Product Variant Tailoring.</p>
     */

    public java.util.List<com.commercetools.api.models.common.AssetDraft> getAssets() {
        return this.assets;
    }

    /**
     *  <p>Attributes for the Product Variant Tailoring.</p>
     */

    public java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>If <code>true</code> the new Product Variant Tailoring is only staged. If <code>false</code> the new Product Variant Tailoring is both current and staged.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setId(final Long id) {
        this.id = id;
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

    public void setAssets(final com.commercetools.api.models.common.AssetDraft... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
    }

    public void setAssets(final java.util.List<com.commercetools.api.models.common.AssetDraft> assets) {
        this.assets = assets;
    }

    public void setAttributes(
            final com.commercetools.api.models.product_tailoring.ProductTailoringAttribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(
            final java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> attributes) {
        this.attributes = attributes;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTailoringAddVariantActionImpl that = (ProductTailoringAddVariantActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(id, that.id)
                .append(sku, that.sku)
                .append(images, that.images)
                .append(assets, that.assets)
                .append(attributes, that.attributes)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(id, that.id)
                .append(sku, that.sku)
                .append(images, that.images)
                .append(assets, that.assets)
                .append(attributes, that.attributes)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(id)
                .append(sku)
                .append(images)
                .append(assets)
                .append(attributes)
                .append(staged)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("id", id)
                .append("sku", sku)
                .append("images", images)
                .append("assets", assets)
                .append("attributes", attributes)
                .append("staged", staged)
                .build();
    }

}
