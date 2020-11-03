package com.commercetools.ml.models.similar_products;

import com.commercetools.ml.models.similar_products.SimilarityMeasures;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SimilarProductSearchRequestMetaImpl implements SimilarProductSearchRequestMeta {

    private com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures;

    @JsonCreator
    SimilarProductSearchRequestMetaImpl(@JsonProperty("similarityMeasures") final com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures) {
        this.similarityMeasures = similarityMeasures;
    }
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

}
