
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
*  <p>This type represents a paged importsink result.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ImportSinkPagedResponseImpl.class)
public interface ImportSinkPagedResponse {

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
    public List<ImportSink> getResults();

    public void setLimit(final Integer limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

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
