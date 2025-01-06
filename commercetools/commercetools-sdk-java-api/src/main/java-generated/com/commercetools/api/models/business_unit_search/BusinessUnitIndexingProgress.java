
package com.commercetools.api.models.business_unit_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * BusinessUnitIndexingProgress
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitIndexingProgress businessUnitIndexingProgress = BusinessUnitIndexingProgress.builder()
 *             .indexed(0.3)
 *             .failed(0.3)
 *             .estimatedTotal(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitIndexingProgressImpl.class)
public interface BusinessUnitIndexingProgress {

    /**
     *  <p>The number of Business Units successfully indexed.</p>
     * @return indexed
     */
    @NotNull
    @JsonProperty("indexed")
    public Integer getIndexed();

    /**
     *  <p>The number of Business Units that failed to be indexed.</p>
     * @return failed
     */
    @NotNull
    @JsonProperty("failed")
    public Integer getFailed();

    /**
     *  <p>The estimated total number of Business Units to be indexed.</p>
     * @return estimatedTotal
     */
    @NotNull
    @JsonProperty("estimatedTotal")
    public Integer getEstimatedTotal();

    /**
     *  <p>The number of Business Units successfully indexed.</p>
     * @param indexed value to be set
     */

    public void setIndexed(final Integer indexed);

    /**
     *  <p>The number of Business Units that failed to be indexed.</p>
     * @param failed value to be set
     */

    public void setFailed(final Integer failed);

    /**
     *  <p>The estimated total number of Business Units to be indexed.</p>
     * @param estimatedTotal value to be set
     */

    public void setEstimatedTotal(final Integer estimatedTotal);

    /**
     * factory method
     * @return instance of BusinessUnitIndexingProgress
     */
    public static BusinessUnitIndexingProgress of() {
        return new BusinessUnitIndexingProgressImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitIndexingProgress
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitIndexingProgress of(final BusinessUnitIndexingProgress template) {
        BusinessUnitIndexingProgressImpl instance = new BusinessUnitIndexingProgressImpl();
        instance.setIndexed(template.getIndexed());
        instance.setFailed(template.getFailed());
        instance.setEstimatedTotal(template.getEstimatedTotal());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitIndexingProgress
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitIndexingProgress deepCopy(@Nullable final BusinessUnitIndexingProgress template) {
        if (template == null) {
            return null;
        }
        BusinessUnitIndexingProgressImpl instance = new BusinessUnitIndexingProgressImpl();
        instance.setIndexed(template.getIndexed());
        instance.setFailed(template.getFailed());
        instance.setEstimatedTotal(template.getEstimatedTotal());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitIndexingProgress
     * @return builder
     */
    public static BusinessUnitIndexingProgressBuilder builder() {
        return BusinessUnitIndexingProgressBuilder.of();
    }

    /**
     * create builder for BusinessUnitIndexingProgress instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitIndexingProgressBuilder builder(final BusinessUnitIndexingProgress template) {
        return BusinessUnitIndexingProgressBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitIndexingProgress(Function<BusinessUnitIndexingProgress, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitIndexingProgress> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitIndexingProgress>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitIndexingProgress>";
            }
        };
    }
}
