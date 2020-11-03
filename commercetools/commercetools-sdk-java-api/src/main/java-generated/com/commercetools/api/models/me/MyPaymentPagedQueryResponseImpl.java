package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyPayment;
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
public final class MyPaymentPagedQueryResponseImpl implements MyPaymentPagedQueryResponse {

    private Long limit;
    
    private Long count;
    
    private Long total;
    
    private Long offset;
    
    private java.util.List<com.commercetools.api.models.me.MyPayment> results;

    @JsonCreator
    MyPaymentPagedQueryResponseImpl(@JsonProperty("limit") final Long limit, @JsonProperty("count") final Long count, @JsonProperty("total") final Long total, @JsonProperty("offset") final Long offset, @JsonProperty("results") final java.util.List<com.commercetools.api.models.me.MyPayment> results) {
        this.limit = limit;
        this.count = count;
        this.total = total;
        this.offset = offset;
        this.results = results;
    }
    public MyPaymentPagedQueryResponseImpl() {
       
    }

    
    public Long getLimit(){
        return this.limit;
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
    
    
    public java.util.List<com.commercetools.api.models.me.MyPayment> getResults(){
        return this.results;
    }

    public void setLimit(final Long limit){
        this.limit = limit;
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
    
    public void setResults(final com.commercetools.api.models.me.MyPayment ...results){
       this.results = new ArrayList<>(Arrays.asList(results));
    }
    
    public void setResults(final java.util.List<com.commercetools.api.models.me.MyPayment> results){
       this.results = results;
    }

}
