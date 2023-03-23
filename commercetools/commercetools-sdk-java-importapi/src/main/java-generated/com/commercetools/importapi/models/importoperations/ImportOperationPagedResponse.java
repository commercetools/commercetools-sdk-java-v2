
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
 *  <p>PagedQueryResult for Import Operations.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportOperationPagedResponse importOperationPagedResponse = ImportOperationPagedResponse.builder()
 *             .limit(1)
 *             .offset(1)
 *             .count(1)
 *             .total(1)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportOperationPagedResponseImpl.class)
public interface ImportOperationPagedResponse {

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Integer getLimit();

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     *  <p>The actual number of results returned.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *  <p>The total number of import operations matching the query.</p>
     * @return total
     */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>The array of Import Operations matching the query.</p>
     * @return results
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
