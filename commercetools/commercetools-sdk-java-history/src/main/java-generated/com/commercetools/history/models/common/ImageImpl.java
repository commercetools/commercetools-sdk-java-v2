
package com.commercetools.history.models.common;

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
 * Image
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImageImpl implements Image, ModelBase {

    private String url;

    private com.commercetools.history.models.common.ImageDimensions dimensions;

    private String label;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ImageImpl(@JsonProperty("url") final String url,
            @JsonProperty("dimensions") final com.commercetools.history.models.common.ImageDimensions dimensions,
            @JsonProperty("label") final String label) {
        this.url = url;
        this.dimensions = dimensions;
        this.label = label;
    }

    /**
     * create empty instance
     */
    public ImageImpl() {
    }

    /**
     *
     */

    public String getUrl() {
        return this.url;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.ImageDimensions getDimensions() {
        return this.dimensions;
    }

    /**
     *
     */

    public String getLabel() {
        return this.label;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public void setDimensions(final com.commercetools.history.models.common.ImageDimensions dimensions) {
        this.dimensions = dimensions;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImageImpl that = (ImageImpl) o;

        return new EqualsBuilder().append(url, that.url)
                .append(dimensions, that.dimensions)
                .append(label, that.label)
                .append(url, that.url)
                .append(dimensions, that.dimensions)
                .append(label, that.label)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(url).append(dimensions).append(label).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("url", url)
                .append("dimensions", dimensions)
                .append("label", label)
                .build();
    }

    @Override
    public Image copyDeep() {
        return Image.deepCopy(this);
    }
}
