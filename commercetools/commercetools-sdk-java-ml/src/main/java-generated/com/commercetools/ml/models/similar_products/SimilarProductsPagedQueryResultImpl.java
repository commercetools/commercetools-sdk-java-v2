package com.commercetools.ml.models.similar_products;

import com.commercetools.ml.models.similar_products.SimilarProductPair;
import com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMeta;
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
public final class SimilarProductsPagedQueryResultImpl implements SimilarProductsPagedQueryResult {

    private Long count;
    
    private Long total;
    
    private Long offset;
    
    private java.util.List<com.commercetools.ml.models.similar_products.SimilarProductPair> results;
    
    private com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMeta meta;

    @JsonCreator
    SimilarProductsPagedQueryResultImpl(@JsonProperty("count") final Long count, @JsonProperty("total") final Long total, @JsonProperty("offset") final Long offset, @JsonProperty("results") final java.util.List<com.commercetools.ml.models.similar_products.SimilarProductPair> results, @JsonProperty("meta") final com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMeta meta) {
        this.count = count;
        this.total = total;
        this.offset = offset;
        this.results = results;
        this.meta = meta;
    }
    public SimilarProductsPagedQueryResultImpl() {
       
    }

    
    public Long getCount(){
        return this.count;
    }
    
    
    public Long getTotal(){
        return this.total;
    }
    
    
    public Long getOffset(){
        return this.offset;
    }
    
    
    public java.util.List<com.commercetools.ml.models.similar_products.SimilarProductPair> getResults(){
        return this.results;
    }
    
    
    public com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMeta getMeta(){
        return this.meta;
    }

    public void setCount(final Long count){
        this.count = count;
    }
    
    public void setTotal(final Long total){
        this.total = total;
    }
    
    public void setOffset(final Long offset){
        this.offset = offset;
    }
    
    public void setResults(final com.commercetools.ml.models.similar_products.SimilarProductPair ...results){
       this.results = new ArrayList<>(Arrays.asList(results));
    }
    
    public void setResults(final java.util.List<com.commercetools.ml.models.similar_products.SimilarProductPair> results){
       this.results = results;
    }
    
    public void setMeta(final com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMeta meta){
        this.meta = meta;
    }

}
