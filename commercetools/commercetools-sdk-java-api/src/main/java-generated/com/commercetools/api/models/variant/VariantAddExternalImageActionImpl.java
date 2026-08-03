
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
 *  <p>Adds an image to existing variant's images. Generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantImageAddedMessage" rel="nofollow">VariantImageAdded</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantAddExternalImageActionImpl implements VariantAddExternalImageAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.Image image;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantAddExternalImageActionImpl(@JsonProperty("image") final com.commercetools.api.models.common.Image image,
            @JsonProperty("staged") final Boolean staged) {
        this.image = image;
        this.staged = staged;
        this.action = ADD_EXTERNAL_IMAGE;
    }

    /**
     * create empty instance
     */
    public VariantAddExternalImageActionImpl() {
        this.action = ADD_EXTERNAL_IMAGE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to add to <code>images</code>.</p>
     */

    public com.commercetools.api.models.common.Image getImage() {
        return this.image;
    }

    /**
     *  <p>Whether only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> are updated.</p>
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

        VariantAddExternalImageActionImpl that = (VariantAddExternalImageActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(image, that.image)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(image, that.image)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(image).append(staged).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("image", image)
                .append("staged", staged)
                .build();
    }

    @Override
    public VariantAddExternalImageAction copyDeep() {
        return VariantAddExternalImageAction.deepCopy(this);
    }
}
