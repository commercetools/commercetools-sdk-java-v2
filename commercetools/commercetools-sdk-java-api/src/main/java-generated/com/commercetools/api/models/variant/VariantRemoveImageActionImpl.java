
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
 *  <p>Removes a Variant's image.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantRemoveImageActionImpl implements VariantRemoveImageAction, ModelBase {

    private String action;

    private String imageUrl;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantRemoveImageActionImpl(@JsonProperty("imageUrl") final String imageUrl,
            @JsonProperty("staged") final Boolean staged) {
        this.imageUrl = imageUrl;
        this.staged = staged;
        this.action = REMOVE_IMAGE;
    }

    /**
     * create empty instance
     */
    public VariantRemoveImageActionImpl() {
        this.action = REMOVE_IMAGE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The URL of the image to remove.</p>
     */

    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     *  <p>Whether only the staged image is removed. If <code>false</code>, both the current and staged image is removed.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setImageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
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

        VariantRemoveImageActionImpl that = (VariantRemoveImageActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(imageUrl, that.imageUrl)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(imageUrl, that.imageUrl)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(imageUrl).append(staged).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("imageUrl", imageUrl)
                .append("staged", staged)
                .build();
    }

    @Override
    public VariantRemoveImageAction copyDeep() {
        return VariantRemoveImageAction.deepCopy(this);
    }
}
