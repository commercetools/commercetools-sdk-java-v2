
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
public final class MissingImagesMetaImpl implements MissingImagesMeta {

    private com.commercetools.ml.models.missing_data.MissingImagesProductLevel productLevel;

    private com.commercetools.ml.models.missing_data.MissingImagesVariantLevel variantLevel;

    private Long threshold;

    @JsonCreator
    MissingImagesMetaImpl(
            @JsonProperty("productLevel") final com.commercetools.ml.models.missing_data.MissingImagesProductLevel productLevel,
            @JsonProperty("variantLevel") final com.commercetools.ml.models.missing_data.MissingImagesVariantLevel variantLevel,
            @JsonProperty("threshold") final Long threshold) {
        this.productLevel = productLevel;
        this.variantLevel = variantLevel;
        this.threshold = threshold;
    }

    public MissingImagesMetaImpl() {
    }

    public com.commercetools.ml.models.missing_data.MissingImagesProductLevel getProductLevel() {
        return this.productLevel;
    }

    public com.commercetools.ml.models.missing_data.MissingImagesVariantLevel getVariantLevel() {
        return this.variantLevel;
    }

    /**
    *  <p>The minimum number of images a product variant must have. Anything below this value is considered a product variant with missing images.</p>
    */
    public Long getThreshold() {
        return this.threshold;
    }

    public void setProductLevel(final com.commercetools.ml.models.missing_data.MissingImagesProductLevel productLevel) {
        this.productLevel = productLevel;
    }

    public void setVariantLevel(final com.commercetools.ml.models.missing_data.MissingImagesVariantLevel variantLevel) {
        this.variantLevel = variantLevel;
    }

    public void setThreshold(final Long threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MissingImagesMetaImpl that = (MissingImagesMetaImpl) o;

        return new EqualsBuilder().append(productLevel, that.productLevel)
                .append(variantLevel, that.variantLevel)
                .append(threshold, that.threshold)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(productLevel).append(variantLevel).append(threshold).toHashCode();
    }

}
