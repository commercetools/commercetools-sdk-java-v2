
package com.commercetools.importapi.models.importoperations;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
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

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     */

    public void setLimit(final Integer limit);

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     */

    public void setOffset(final Long offset);

    /**
     *  <p>The actual number of results returned.</p>
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     *  <p>The total number of import operations matching the query.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p>The array of Import Operations matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final ImportOperation... results);

    /**
     *  <p>The array of Import Operations matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<ImportOperation> results);

    /**
     * factory method
     * @return instance of ImportOperationPagedResponse
     */
    public static ImportOperationPagedResponse of() {
        return new ImportOperationPagedResponseImpl();
    }

    /**
     * factory method to create a shallow copy ImportOperationPagedResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportOperationPagedResponse of(final ImportOperationPagedResponse template) {
        ImportOperationPagedResponseImpl instance = new ImportOperationPagedResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    /**
     * factory method to create a deep copy of ImportOperationPagedResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportOperationPagedResponse deepCopy(@Nullable final ImportOperationPagedResponse template) {
        if (template == null) {
            return null;
        }
        ImportOperationPagedResponseImpl instance = new ImportOperationPagedResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.importoperations.ImportOperation::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ImportOperationPagedResponse
     * @return builder
     */
    public static ImportOperationPagedResponseBuilder builder() {
        return ImportOperationPagedResponseBuilder.of();
    }

    /**
     * create builder for ImportOperationPagedResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportOperationPagedResponseBuilder builder(final ImportOperationPagedResponse template) {
        return ImportOperationPagedResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportOperationPagedResponse(Function<ImportOperationPagedResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportOperationPagedResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportOperationPagedResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ImportOperationPagedResponse>";
            }
        };
    }
}
