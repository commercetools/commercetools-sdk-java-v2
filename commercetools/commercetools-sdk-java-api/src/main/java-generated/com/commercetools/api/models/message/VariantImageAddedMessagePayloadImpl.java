
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantAddExternalImageAction" rel="nofollow">Add External Image</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantImageAddedMessagePayloadImpl implements VariantImageAddedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.common.Image image;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantImageAddedMessagePayloadImpl(@JsonProperty("image") final com.commercetools.api.models.common.Image image,
            @JsonProperty("staged") final Boolean staged) {
        this.image = image;
        this.staged = staged;
        this.type = VARIANT_IMAGE_ADDED;
    }

    /**
     * create empty instance
     */
    public VariantImageAddedMessagePayloadImpl() {
        this.type = VARIANT_IMAGE_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Image" rel="nofollow">Image</a> that was added.</p>
     */

    public com.commercetools.api.models.common.Image getImage() {
        return this.image;
    }

    /**
     *  <p>Whether the update was only applied to the staged Variant.</p>
     */

    public Boolean getStaged() {
        return this.staged;
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

        VariantImageAddedMessagePayloadImpl that = (VariantImageAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(image, that.image)
                .append(staged, that.staged)
                .append(type, that.type)
                .append(image, that.image)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(image).append(staged).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("image", image)
                .append("staged", staged)
                .build();
    }

    @Override
    public VariantImageAddedMessagePayload copyDeep() {
        return VariantImageAddedMessagePayload.deepCopy(this);
    }
}
