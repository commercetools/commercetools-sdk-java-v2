
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantSetImagesAction" rel="nofollow">Set Images</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantImagesSetMessagePayloadImpl implements VariantImagesSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.product.ProductReference product;

    private java.util.List<com.commercetools.api.models.common.Image> images;

    private java.util.List<com.commercetools.api.models.common.Image> oldImages;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantImagesSetMessagePayloadImpl(
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product,
            @JsonProperty("images") final java.util.List<com.commercetools.api.models.common.Image> images,
            @JsonProperty("oldImages") final java.util.List<com.commercetools.api.models.common.Image> oldImages,
            @JsonProperty("staged") final Boolean staged) {
        this.product = product;
        this.images = images;
        this.oldImages = oldImages;
        this.staged = staged;
        this.type = VARIANT_IMAGES_SET;
    }

    /**
     * create empty instance
     */
    public VariantImagesSetMessagePayloadImpl() {
        this.type = VARIANT_IMAGES_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p>The images that were set on the Variant.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>The previous images of the Variant.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Image> getOldImages() {
        return this.oldImages;
    }

    /**
     *  <p>Whether the update was only applied to the staged Variant.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
    }

    public void setImages(final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
    }

    public void setImages(final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
    }

    public void setOldImages(final com.commercetools.api.models.common.Image... oldImages) {
        this.oldImages = new ArrayList<>(Arrays.asList(oldImages));
    }

    public void setOldImages(final java.util.List<com.commercetools.api.models.common.Image> oldImages) {
        this.oldImages = oldImages;
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

        VariantImagesSetMessagePayloadImpl that = (VariantImagesSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(product, that.product)
                .append(images, that.images)
                .append(oldImages, that.oldImages)
                .append(staged, that.staged)
                .append(type, that.type)
                .append(product, that.product)
                .append(images, that.images)
                .append(oldImages, that.oldImages)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(product)
                .append(images)
                .append(oldImages)
                .append(staged)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("product", product)
                .append("images", images)
                .append("oldImages", oldImages)
                .append("staged", staged)
                .build();
    }

    @Override
    public VariantImagesSetMessagePayload copyDeep() {
        return VariantImagesSetMessagePayload.deepCopy(this);
    }
}
