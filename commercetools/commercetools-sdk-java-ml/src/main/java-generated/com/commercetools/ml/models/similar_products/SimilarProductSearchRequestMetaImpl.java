package com.commercetools.ml.models.similar_products;

import com.commercetools.ml.models.similar_products.SimilarityMeasures;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * SimilarProductSearchRequestMeta
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SimilarProductSearchRequestMetaImpl implements SimilarProductSearchRequestMeta, ModelBase {

    
    private com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SimilarProductSearchRequestMetaImpl(@JsonProperty("similarityMeasures") final com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures) {
        this.similarityMeasures = similarityMeasures;
    }
    /**
     * create empty instance
     */
    public SimilarProductSearchRequestMetaImpl() {
    }

    /**
     *  <p>The SimilarityMeasures used in this search.</p>
     */
    
    public com.commercetools.ml.models.similar_products.SimilarityMeasures getSimilarityMeasures(){
        return this.similarityMeasures;
    }

    
    public void setSimilarityMeasures(final com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures){
        this.similarityMeasures = similarityMeasures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SimilarProductSearchRequestMetaImpl that = (SimilarProductSearchRequestMetaImpl) o;
    
        return new EqualsBuilder()
                .append(similarityMeasures, that.similarityMeasures)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(similarityMeasures)
            .toHashCode();
    }

}
