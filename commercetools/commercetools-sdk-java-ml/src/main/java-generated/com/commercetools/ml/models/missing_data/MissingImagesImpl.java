
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingImagesImpl implements MissingImages {

    private com.commercetools.ml.models.common.ProductReference product;

    private Long variantId;

    private Long imageCount;

    @JsonCreator
    MissingImagesImpl(@JsonProperty("product") final com.commercetools.ml.models.common.ProductReference product,
            @JsonProperty("variantId") final Long variantId, @JsonProperty("imageCount") final Long imageCount) {
        this.product = product;
        this.variantId = variantId;
        this.imageCount = imageCount;
    }

    public MissingImagesImpl() {
    }

    public com.commercetools.ml.models.common.ProductReference getProduct() {
        return this.product;
    }

    /**
    *  <p>ID of the variant</p>
    */
    public Long getVariantId() {
        return this.variantId;
    }

    /**
    *  <p>Number of images the variant contains.</p>
    */
    public Long getImageCount() {
        return this.imageCount;
    }

    public void setProduct(final com.commercetools.ml.models.common.ProductReference product) {
        this.product = product;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setImageCount(final Long imageCount) {
        this.imageCount = imageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MissingImagesImpl that = (MissingImagesImpl) o;

        return new EqualsBuilder().append(product, that.product)
                .append(variantId, that.variantId)
                .append(imageCount, that.imageCount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(product).append(variantId).append(imageCount).toHashCode();
    }

}
