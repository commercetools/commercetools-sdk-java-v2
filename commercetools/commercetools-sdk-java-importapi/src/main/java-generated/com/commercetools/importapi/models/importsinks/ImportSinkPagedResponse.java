
package com.commercetools.importapi.models.importsinks;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/general-concepts#pagedqueryresult">PagedQueryResult</a> for <a href="#importsink">ImportSinks</a>.
*  Used as a response to a query request for <a href="#importsink">ImportSinks</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ImportSinkPagedResponseImpl.class)
public interface ImportSinkPagedResponse {

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
    *  <p>The total number of results matching the query.</p>
    */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    /**
    *  <p>The array of Import Sinks matching the query.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ImportSink> getResults();

    public void setLimit(final Integer limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    @JsonIgnore
    public void setResults(final ImportSink... results);

    public void setResults(final List<ImportSink> results);

    public static ImportSinkPagedResponse of() {
        return new ImportSinkPagedResponseImpl();
    }

    public static ImportSinkPagedResponse of(final ImportSinkPagedResponse template) {
        ImportSinkPagedResponseImpl instance = new ImportSinkPagedResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ImportSinkPagedResponseBuilder builder() {
        return ImportSinkPagedResponseBuilder.of();
    }

    public static ImportSinkPagedResponseBuilder builder(final ImportSinkPagedResponse template) {
        return ImportSinkPagedResponseBuilder.of(template);
    }

    default <T> T withImportSinkPagedResponse(Function<ImportSinkPagedResponse, T> helper) {
        return helper.apply(this);
    }
}
