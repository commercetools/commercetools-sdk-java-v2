
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
public final class MissingImagesProductLevelImpl implements MissingImagesProductLevel {

    private Long missingImages;

    private Long total;

    @JsonCreator
    MissingImagesProductLevelImpl(@JsonProperty("missingImages") final Long missingImages,
            @JsonProperty("total") final Long total) {
        this.missingImages = missingImages;
        this.total = total;
    }

    public MissingImagesProductLevelImpl() {
    }

    /**
    *  <p>Number of products missing images.</p>
    */
    public Long getMissingImages() {
        return this.missingImages;
    }

    /**
    *  <p>Number of products scanned.</p>
    */
    public Long getTotal() {
        return this.total;
    }

    public void setMissingImages(final Long missingImages) {
        this.missingImages = missingImages;
    }

    public void setTotal(final Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MissingImagesProductLevelImpl that = (MissingImagesProductLevelImpl) o;

        return new EqualsBuilder().append(missingImages, that.missingImages).append(total, that.total).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(missingImages).append(total).toHashCode();
    }

}
