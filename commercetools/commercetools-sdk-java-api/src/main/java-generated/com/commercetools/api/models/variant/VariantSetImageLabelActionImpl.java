
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
 *  <p>Sets the label of a Variant's image.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetImageLabelActionImpl implements VariantSetImageLabelAction, ModelBase {

    private String action;

    private String imageUrl;

    private String label;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantSetImageLabelActionImpl(@JsonProperty("imageUrl") final String imageUrl,
            @JsonProperty("label") final String label, @JsonProperty("staged") final Boolean staged) {
        this.imageUrl = imageUrl;
        this.label = label;
        this.staged = staged;
        this.action = SET_IMAGE_LABEL;
    }

    /**
     * create empty instance
     */
    public VariantSetImageLabelActionImpl() {
        this.action = SET_IMAGE_LABEL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The URL of the image to set the label.</p>
     */

    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public String getLabel() {
        return this.label;
    }

    /**
     *  <p>If <code>true</code>, only the staged image is updated. If <code>false</code>, both the current and staged image is updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setImageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setLabel(final String label) {
        this.label = label;
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

        VariantSetImageLabelActionImpl that = (VariantSetImageLabelActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(imageUrl, that.imageUrl)
                .append(label, that.label)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(imageUrl, that.imageUrl)
                .append(label, that.label)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(imageUrl).append(label).append(staged).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("imageUrl", imageUrl)
                .append("label", label)
                .append("staged", staged)
                .build();
    }

    @Override
    public VariantSetImageLabelAction copyDeep() {
        return VariantSetImageLabelAction.deepCopy(this);
    }
}
