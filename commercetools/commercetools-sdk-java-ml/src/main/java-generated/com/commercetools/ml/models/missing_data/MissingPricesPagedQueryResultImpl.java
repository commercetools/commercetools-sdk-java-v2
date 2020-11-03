package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingPrices;
import com.commercetools.ml.models.missing_data.MissingPricesMeta;
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
public final class MissingPricesPagedQueryResultImpl implements MissingPricesPagedQueryResult {

    private Long count;
    
    private Long total;
    
    private Long offset;
    
    private java.util.List<com.commercetools.ml.models.missing_data.MissingPrices> results;
    
    private com.commercetools.ml.models.missing_data.MissingPricesMeta meta;

    @JsonCreator
    MissingPricesPagedQueryResultImpl(@JsonProperty("count") final Long count, @JsonProperty("total") final Long total, @JsonProperty("offset") final Long offset, @JsonProperty("results") final java.util.List<com.commercetools.ml.models.missing_data.MissingPrices> results, @JsonProperty("meta") final com.commercetools.ml.models.missing_data.MissingPricesMeta meta) {
        this.count = count;
        this.total = total;
        this.offset = offset;
        this.results = results;
        this.meta = meta;
    }
    public MissingPricesPagedQueryResultImpl() {
       
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
    
    
    public java.util.List<com.commercetools.ml.models.missing_data.MissingPrices> getResults(){
        return this.results;
    }
    
    
    public com.commercetools.ml.models.missing_data.MissingPricesMeta getMeta(){
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
    
    public void setResults(final com.commercetools.ml.models.missing_data.MissingPrices ...results){
       this.results = new ArrayList<>(Arrays.asList(results));
    }
    
    public void setResults(final java.util.List<com.commercetools.ml.models.missing_data.MissingPrices> results){
       this.results = results;
    }
    
    public void setMeta(final com.commercetools.ml.models.missing_data.MissingPricesMeta meta){
        this.meta = meta;
    }

}
