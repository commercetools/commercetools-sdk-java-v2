
package com.commercetools.importapi.models.importoperations;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/general-concepts#pagedqueryresult">PagedQueryResult</a> for Import Operations.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ImportOperationPagedResponseImpl.class)
public interface ImportOperationPagedResponse {

    /**
    *  <p>The number of results requested in the query request.</p>
    */
    @NotNull
    @JsonProperty("limit")
    public Integer getLimit();

    /**
    *  <p>The number of elements skipped, not a page number.
    *  Supplied by the client or the server default.</p>
    */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
    *  <p>The actual number of results returned.</p>
    */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
    *  <p>The total number of import operations matching the query.</p>
    */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    /**
    *  <p>The array of Import Operations matching the query.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ImportOperation> getResults();

    public void setLimit(final Integer limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    @JsonIgnore
    public void setResults(final ImportOperation... results);

    public void setResults(final List<ImportOperation> results);

    public static ImportOperationPagedResponse of() {
        return new ImportOperationPagedResponseImpl();
    }

    public static ImportOperationPagedResponse of(final ImportOperationPagedResponse template) {
        ImportOperationPagedResponseImpl instance = new ImportOperationPagedResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ImportOperationPagedResponseBuilder builder() {
        return ImportOperationPagedResponseBuilder.of();
    }

    public static ImportOperationPagedResponseBuilder builder(final ImportOperationPagedResponse template) {
        return ImportOperationPagedResponseBuilder.of(template);
    }

    default <T> T withImportOperationPagedResponse(Function<ImportOperationPagedResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ImportOperationPagedResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportOperationPagedResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ImportOperationPagedResponse>";
            }
        };
    }
}
