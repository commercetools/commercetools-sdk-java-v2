
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
 *  <p>Sets the images of the Variant. Existing images will be replaced with the new ones. Generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantImagesSetMessage" rel="nofollow">VariantImagesSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetImagesActionImpl implements VariantSetImagesAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.common.Image> images;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantSetImagesActionImpl(
            @JsonProperty("images") final java.util.List<com.commercetools.api.models.common.Image> images,
            @JsonProperty("staged") final Boolean staged) {
        this.images = images;
        this.staged = staged;
        this.action = SET_IMAGES;
    }

    /**
     * create empty instance
     */
    public VariantSetImagesActionImpl() {
        this.action = SET_IMAGES;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Images to set for the Variant.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Whether only the staged images are updated. If <code>false</code>, both the current and staged images are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setImages(final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
    }

    public void setImages(final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
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

        VariantSetImagesActionImpl that = (VariantSetImagesActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(images, that.images)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(images, that.images)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(images).append(staged).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("images", images)
                .append("staged", staged)
                .build();
    }

    @Override
    public VariantSetImagesAction copyDeep() {
        return VariantSetImagesAction.deepCopy(this);
    }
}
