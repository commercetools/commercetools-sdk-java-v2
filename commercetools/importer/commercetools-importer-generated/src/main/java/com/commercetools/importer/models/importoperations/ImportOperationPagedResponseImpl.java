package com.commercetools.importer.models.importoperations;

import com.commercetools.importer.models.importoperations.ImportOperation;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>This type represents a paged import operation result.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportOperationPagedResponseImpl implements ImportOperationPagedResponse {

    private Double limit;
    
    private Double offset;
    
    private Double count;
    
    private java.util.List<com.commercetools.importer.models.importoperations.ImportOperation> results;

    @JsonCreator
    ImportOperationPagedResponseImpl(@JsonProperty("limit") final Double limit, @JsonProperty("offset") final Double offset, @JsonProperty("count") final Double count, @JsonProperty("results") final java.util.List<com.commercetools.importer.models.importoperations.ImportOperation> results) {
        this.limit = limit;
        this.offset = offset;
        this.count = count;
        this.results = results;
    }
    public ImportOperationPagedResponseImpl() {
       
    }

    /**
    *  <p>The maximum number of import operations returned for a page.</p>
    */
    public Double getLimit(){
        return this.limit;
    }
    
    /**
    *  <p>The offset supplied by the client or the server default. It is the number of elements skipped.</p>
    */
    public Double getOffset(){
        return this.offset;
    }
    
    /**
    *  <p>The actual number of results returned by this response.</p>
    */
    public Double getCount(){
        return this.count;
    }
    
    /**
    *  <p>The results for this paged response.</p>
    */
    public java.util.List<com.commercetools.importer.models.importoperations.ImportOperation> getResults(){
        return this.results;
    }

    public void setLimit(final Double limit){
        this.limit = limit;
    }
    
    public void setOffset(final Double offset){
        this.offset = offset;
    }
    
    public void setCount(final Double count){
        this.count = count;
    }
    
    public void setResults(final java.util.List<com.commercetools.importer.models.importoperations.ImportOperation> results){
        this.results = results;
    }

}
