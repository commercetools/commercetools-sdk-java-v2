package com.commercetools.api.models.product;

import com.fasterxml.jackson.databind.JsonNode;
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
public final class FacetResultTermImpl implements FacetResultTerm {

    private com.fasterxml.jackson.databind.JsonNode term;
    
    private Long count;
    
    private Long productCount;

    @JsonCreator
    FacetResultTermImpl(@JsonProperty("term") final com.fasterxml.jackson.databind.JsonNode term, @JsonProperty("count") final Long count, @JsonProperty("productCount") final Long productCount) {
        this.term = term;
        this.count = count;
        this.productCount = productCount;
    }
    public FacetResultTermImpl() {
    }

    
    public com.fasterxml.jackson.databind.JsonNode getTerm(){
        return this.term;
    }
    
    
    public Long getCount(){
        return this.count;
    }
    
    
    public Long getProductCount(){
        return this.productCount;
    }

    public void setTerm(final com.fasterxml.jackson.databind.JsonNode term){
        this.term = term;
    }
    
    public void setCount(final Long count){
        this.count = count;
    }
    
    public void setProductCount(final Long productCount){
        this.productCount = productCount;
    }

}
