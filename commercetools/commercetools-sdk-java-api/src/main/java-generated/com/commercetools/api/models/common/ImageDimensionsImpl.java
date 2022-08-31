
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ImageDimensions
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImageDimensionsImpl implements ImageDimensions, ModelBase {

    private Integer w;

    private Integer h;

    @JsonCreator
    ImageDimensionsImpl(@JsonProperty("w") final Integer w, @JsonProperty("h") final Integer h) {
        this.w = w;
        this.h = h;
    }

    public ImageDimensionsImpl() {
    }

    /**
     *  <p>Width of the image.</p>
     */

    public Integer getW() {
        return this.w;
    }

    /**
     *  <p>Height of the image.</p>
     */

    public Integer getH() {
        return this.h;
    }

    public void setW(final Integer w) {
        this.w = w;
    }

    public void setH(final Integer h) {
        this.h = h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImageDimensionsImpl that = (ImageDimensionsImpl) o;

        return new EqualsBuilder().append(w, that.w).append(h, that.h).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(w).append(h).toHashCode();
    }

}
