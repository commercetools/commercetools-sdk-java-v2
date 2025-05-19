
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
 *  <p>The tailoring of a ProductVariant.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantTailoringImpl implements ProductVariantTailoring, ModelBase {

    private Long id;

    private java.util.List<com.commercetools.api.models.common.Image> images;

    private java.util.List<com.commercetools.api.models.common.Asset> assets;

    private java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> attributes;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantTailoringImpl(@JsonProperty("id") final Long id,
            @JsonProperty("images") final java.util.List<com.commercetools.api.models.common.Image> images,
            @JsonProperty("assets") final java.util.List<com.commercetools.api.models.common.Asset> assets,
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> attributes) {
        this.id = id;
        this.images = images;
        this.assets = assets;
        this.attributes = attributes;
    }

    /**
     * create empty instance
     */
    public ProductVariantTailoringImpl() {
    }

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant.</p>
     */

    public Long getId() {
        return this.id;
    }

    /**
     *  <p>Images of the tailored Product Variant. If present, these images will override the images of the corresponding ProductVariant in total.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Media assets of the tailored Product Variant. If present, these assets will override the assets of the corresponding ProductVariant in total.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Asset> getAssets() {
        return this.assets;
    }

    /**
     *  <p>Attributes of the tailored Product Variant. If present, these Attributes are selectively merged into the <code>attributes</code> of the corresponding ProductVariant:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     */

    public java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> getAttributes() {
        return this.attributes;
    }

    public void setId(final Long id) {
        this.id = id;
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

    public void setAttributes(
            final com.commercetools.api.models.product_tailoring.ProductTailoringAttribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(
            final java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantTailoringImpl that = (ProductVariantTailoringImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(images, that.images)
                .append(assets, that.assets)
                .append(attributes, that.attributes)
                .append(id, that.id)
                .append(images, that.images)
                .append(assets, that.assets)
                .append(attributes, that.attributes)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(images).append(assets).append(attributes).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("images", images)
                .append("assets", assets)
                .append("attributes", attributes)
                .build();
    }

    @Override
    public ProductVariantTailoring copyDeep() {
        return ProductVariantTailoring.deepCopy(this);
    }
}
