
package com.commercetools.importapi.models.importcontainers;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>PagedQueryResult for ImportContainers. Used as a response to a query request for ImportContainers.</p>
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
     *  <p>The actual number of results returned.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *  <p>The total number of results matching the query.</p>
     * @return total
     */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>The array of Import Containers matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ImportContainer> getResults();

    public void setLimit(final Integer limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    @JsonIgnore
    public void setResults(final ImportContainer... results);

    public void setResults(final List<ImportContainer> results);

    public static ImportContainerPagedResponse of() {
        return new ImportContainerPagedResponseImpl();
    }

    public static ImportContainerPagedResponse of(final ImportContainerPagedResponse template) {
        ImportContainerPagedResponseImpl instance = new ImportContainerPagedResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ImportContainerPagedResponseBuilder builder() {
        return ImportContainerPagedResponseBuilder.of();
    }

    public static ImportContainerPagedResponseBuilder builder(final ImportContainerPagedResponse template) {
        return ImportContainerPagedResponseBuilder.of(template);
    }

    default <T> T withImportContainerPagedResponse(Function<ImportContainerPagedResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ImportContainerPagedResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportContainerPagedResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ImportContainerPagedResponse>";
            }
        };
    }
}
