
package com.commercetools.checkout.models.application;

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
 *  <p>Paginated result containing Application.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaginatedApplication paginatedApplication = PaginatedApplication.builder()
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
@JsonDeserialize(as = PaginatedApplicationImpl.class)
public interface PaginatedApplication {

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
    public Integer getOffset();

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Integer getCount();

    /**
     *  <p>Total number of results matching the query.</p>
     * @return total
     */
    @NotNull
    @JsonProperty("total")
    public Integer getTotal();

    /**
     *  <p>Applications matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Application> getResults();

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     */

    public void setLimit(final Integer limit);

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     */

    public void setOffset(final Integer offset);

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     */

    public void setCount(final Integer count);

    /**
     *  <p>Total number of results matching the query.</p>
     * @param total value to be set
     */

    public void setTotal(final Integer total);

    /**
     *  <p>Applications matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final Application... results);

    /**
     *  <p>Applications matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<Application> results);

    /**
     * factory method
     * @return instance of PaginatedApplication
     */
    public static PaginatedApplication of() {
        return new PaginatedApplicationImpl();
    }

    /**
     * factory method to create a shallow copy PaginatedApplication
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaginatedApplication of(final PaginatedApplication template) {
        PaginatedApplicationImpl instance = new PaginatedApplicationImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public PaginatedApplication copyDeep();

    /**
     * factory method to create a deep copy of PaginatedApplication
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaginatedApplication deepCopy(@Nullable final PaginatedApplication template) {
        if (template == null) {
            return null;
        }
        PaginatedApplicationImpl instance = new PaginatedApplicationImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.checkout.models.application.Application::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for PaginatedApplication
     * @return builder
     */
    public static PaginatedApplicationBuilder builder() {
        return PaginatedApplicationBuilder.of();
    }

    /**
     * create builder for PaginatedApplication instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaginatedApplicationBuilder builder(final PaginatedApplication template) {
        return PaginatedApplicationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaginatedApplication(Function<PaginatedApplication, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaginatedApplication> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaginatedApplication>() {
            @Override
            public String toString() {
                return "TypeReference<PaginatedApplication>";
            }
        };
    }
}
