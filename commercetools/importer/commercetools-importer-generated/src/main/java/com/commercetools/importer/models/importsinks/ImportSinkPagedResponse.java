package com.commercetools.importer.models.importsinks;

import com.commercetools.importer.models.importsinks.ImportSink;
import com.commercetools.importer.models.importsinks.ImportSinkPagedResponseImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>This type represents a paged importsink result.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ImportSinkPagedResponseImpl.class)
public interface ImportSinkPagedResponse  {

    /**
    *  <p>The maximum number of import operations returned for a page.</p>
    */
    @NotNull
    @JsonProperty("limit")
    public Double getLimit();
    /**
    *  <p>The offset supplied by the client or the server default. It is the number of elements skipped.</p>
    */
    @NotNull
    @JsonProperty("offset")
    public Double getOffset();
    /**
    *  <p>The actual number of results returned by this response.</p>
    */
    @NotNull
    @JsonProperty("count")
    public Double getCount();
    /**
    *  <p>The results for this paged response.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ImportSink> getResults();

    public void setLimit(final Double limit);
    
    public void setOffset(final Double offset);
    
    public void setCount(final Double count);
    
    public void setResults(final List<ImportSink> results);

    public static ImportSinkPagedResponseImpl of(){
        return new ImportSinkPagedResponseImpl();
    }
    

    public static ImportSinkPagedResponseImpl of(final ImportSinkPagedResponse template) {
        ImportSinkPagedResponseImpl instance = new ImportSinkPagedResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setResults(template.getResults());
        return instance;
    }

}
