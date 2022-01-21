
package com.commercetools.ml.models.similar_products;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SimilarProductSearchRequestMetaImpl implements SimilarProductSearchRequestMeta, ModelBase {

    private com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures;

    @JsonCreator
    SimilarProductSearchRequestMetaImpl(
            @JsonProperty("similarityMeasures") final com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures) {
        this.similarityMeasures = similarityMeasures;
    }

    public SimilarProductSearchRequestMetaImpl() {
    }

    /**
    *  <p>The SimilarityMeasures used in this search.</p>
    */
    public com.commercetools.ml.models.similar_products.SimilarityMeasures getSimilarityMeasures() {
        return this.similarityMeasures;
    }

    public void setSimilarityMeasures(
            final com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures) {
        this.similarityMeasures = similarityMeasures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SimilarProductSearchRequestMetaImpl that = (SimilarProductSearchRequestMetaImpl) o;

        return new EqualsBuilder().append(similarityMeasures, that.similarityMeasures).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(similarityMeasures).toHashCode();
    }

}
