
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AssetDimensionsImpl implements AssetDimensions {

    private Integer w;

    private Integer h;

    @JsonCreator
    AssetDimensionsImpl(@JsonProperty("w") final Integer w, @JsonProperty("h") final Integer h) {
        this.w = w;
        this.h = h;
    }

    public AssetDimensionsImpl() {
    }

    public Integer getW() {
        return this.w;
    }

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

        AssetDimensionsImpl that = (AssetDimensionsImpl) o;

        return new EqualsBuilder().append(w, that.w).append(h, that.h).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(w).append(h).toHashCode();
    }

}
