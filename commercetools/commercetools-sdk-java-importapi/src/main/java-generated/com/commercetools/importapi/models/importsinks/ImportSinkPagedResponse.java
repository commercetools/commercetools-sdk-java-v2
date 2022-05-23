
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
 <p>PagedQueryResult for ImportSinks. Used as a response to a query request for ImportSinks.</p>

 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ImportSinkPagedResponse importSinkPagedResponse = ImportSinkPagedResponse.builder()
           .limit(1)
           .offset(1)
           .count(1)
           .total(1)
           .plusResults(resultsBuilder -> resultsBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportSinkPagedResponseImpl.class)
public interface ImportSinkPagedResponse {

    /**
     *  <p>Number of results requested.</p>
     */
    @NotNull
    @JsonProperty("limit")
    public Integer getLimit();

    /**
     *  <p>Number of elements skipped.</p>
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

    public static com.fasterxml.jackson.core.type.TypeReference<ImportSinkPagedResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportSinkPagedResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ImportSinkPagedResponse>";
            }
        };
    }
}
