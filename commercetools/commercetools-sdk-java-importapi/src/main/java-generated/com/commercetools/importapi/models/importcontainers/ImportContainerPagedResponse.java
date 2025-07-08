
package com.commercetools.importapi.models.importcontainers;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>PagedQueryResult with results containing an array of ImportContainer.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportContainerPagedResponse importContainerPagedResponse = ImportContainerPagedResponse.builder()
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
@JsonDeserialize(as = ImportContainerPagedResponseImpl.class)
public interface ImportContainerPagedResponse {

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
     *  <p>Actual number of results returned.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *  <p>Total number of results matching the query.</p>
     * @return total
     */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>ImportContainers matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ImportContainer> getResults();

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
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     *  <p>Total number of results matching the query.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p>ImportContainers matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final ImportContainer... results);

    /**
     *  <p>ImportContainers matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<ImportContainer> results);

    /**
     * factory method
     * @return instance of ImportContainerPagedResponse
     */
    public static ImportContainerPagedResponse of() {
        return new ImportContainerPagedResponseImpl();
    }

    /**
     * factory method to create a shallow copy ImportContainerPagedResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportContainerPagedResponse of(final ImportContainerPagedResponse template) {
        ImportContainerPagedResponseImpl instance = new ImportContainerPagedResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public ImportContainerPagedResponse copyDeep();

    /**
     * factory method to create a deep copy of ImportContainerPagedResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportContainerPagedResponse deepCopy(@Nullable final ImportContainerPagedResponse template) {
        if (template == null) {
            return null;
        }
        ImportContainerPagedResponseImpl instance = new ImportContainerPagedResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.importcontainers.ImportContainer::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ImportContainerPagedResponse
     * @return builder
     */
    public static ImportContainerPagedResponseBuilder builder() {
        return ImportContainerPagedResponseBuilder.of();
    }

    /**
     * create builder for ImportContainerPagedResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportContainerPagedResponseBuilder builder(final ImportContainerPagedResponse template) {
        return ImportContainerPagedResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportContainerPagedResponse(Function<ImportContainerPagedResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportContainerPagedResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportContainerPagedResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ImportContainerPagedResponse>";
            }
        };
    }
}
