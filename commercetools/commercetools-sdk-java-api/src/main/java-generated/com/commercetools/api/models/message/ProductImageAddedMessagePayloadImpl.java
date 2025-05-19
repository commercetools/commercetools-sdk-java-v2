
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Add External Image update action or after the successful upload of an image.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductImageAddedMessagePayloadImpl implements ProductImageAddedMessagePayload, ModelBase {

    private String type;

    private Long variantId;

    private com.commercetools.api.models.common.Image image;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductImageAddedMessagePayloadImpl(@JsonProperty("variantId") final Long variantId,
            @JsonProperty("image") final com.commercetools.api.models.common.Image image,
            @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.image = image;
        this.staged = staged;
        this.type = PRODUCT_IMAGE_ADDED;
    }

    /**
     * create empty instance
     */
    public ProductImageAddedMessagePayloadImpl() {
        this.type = PRODUCT_IMAGE_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier of the Product Variant to which the Image was added.</p>
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Image that was added.</p>
     */

    public com.commercetools.api.models.common.Image getImage() {
        return this.image;
    }

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setImage(final com.commercetools.api.models.common.Image image) {
        this.image = image;
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

        ProductImageAddedMessagePayloadImpl that = (ProductImageAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(variantId, that.variantId)
                .append(image, that.image)
                .append(staged, that.staged)
                .append(type, that.type)
                .append(variantId, that.variantId)
                .append(image, that.image)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(variantId).append(image).append(staged).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("variantId", variantId)
                .append("image", image)
                .append("staged", staged)
                .build();
    }

    @Override
    public ProductImageAddedMessagePayload copyDeep() {
        return ProductImageAddedMessagePayload.deepCopy(this);
    }
}
