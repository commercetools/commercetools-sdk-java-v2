package com.commercetools.ml.models.similar_products;

import com.commercetools.ml.models.similar_products.SimilarityMeasures;
import com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMetaImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = SimilarProductSearchRequestMetaImpl.class)
public interface SimilarProductSearchRequestMeta  {

    /**
    *  <p>The SimilarityMeasures used in this search.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("similarityMeasures")
    public SimilarityMeasures getSimilarityMeasures();

    public void setSimilarityMeasures(final SimilarityMeasures similarityMeasures);

    public static SimilarProductSearchRequestMeta of(){
        return new SimilarProductSearchRequestMetaImpl();
    }
    

    public static SimilarProductSearchRequestMeta of(final SimilarProductSearchRequestMeta template) {
        SimilarProductSearchRequestMetaImpl instance = new SimilarProductSearchRequestMetaImpl();
        instance.setSimilarityMeasures(template.getSimilarityMeasures());
        return instance;
    }

    public static SimilarProductSearchRequestMetaBuilder builder(){
        return SimilarProductSearchRequestMetaBuilder.of();
    }
    
    public static SimilarProductSearchRequestMetaBuilder builder(final SimilarProductSearchRequestMeta template){
        return SimilarProductSearchRequestMetaBuilder.of(template);
    }
    

    default <T> T withSimilarProductSearchRequestMeta(Function<SimilarProductSearchRequestMeta, T> helper) {
        return helper.apply(this);
    }
}
