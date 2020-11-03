package com.commercetools.importapi.models.importoperations;

import com.commercetools.importapi.models.importoperations.ImportOperation;
import com.commercetools.importapi.models.importoperations.ImportOperationPagedResponseImpl;

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

/**
*  <p>This type represents a paged import operation result.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ImportOperationPagedResponseImpl.class)
public interface ImportOperationPagedResponse  {

    /**
    *  <p>The maximum number of import operations returned for a page.</p>
    */
    @NotNull
    @JsonProperty("limit")
    public Integer getLimit();
    /**
    *  <p>The offset supplied by the client or the server default. It is the number of elements skipped.</p>
    */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();
    /**
    *  <p>The actual number of results returned by this response.</p>
    */
    @NotNull
    @JsonProperty("count")
    public Long getCount();
    /**
    *  <p>The results for this paged response.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ImportOperation> getResults();

    public void setLimit(final Integer limit);
    
    public void setOffset(final Long offset);
    
    public void setCount(final Long count);
    
    @JsonIgnore
    public void setResults(final ImportOperation ...results);
    public void setResults(final List<ImportOperation> results);

    public static ImportOperationPagedResponseImpl of(){
        return new ImportOperationPagedResponseImpl();
    }
    

    public static ImportOperationPagedResponseImpl of(final ImportOperationPagedResponse template) {
        ImportOperationPagedResponseImpl instance = new ImportOperationPagedResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setResults(template.getResults());
        return instance;
    }

    default <T> T withImportOperationPagedResponse(Function<ImportOperationPagedResponse, T> helper) {
        return helper.apply(this);
    }
}
