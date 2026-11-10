
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>The response body for a bulk update of Variants. Contains the individual result for each Variant in the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantBulkUpdateResponse variantBulkUpdateResponse = VariantBulkUpdateResponse.builder()
 *             .successCount(0.3)
 *             .failureCount(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantBulkUpdateResponseImpl.class)
public interface VariantBulkUpdateResponse {

    /**
     *  <p>Number of Variants that were successfully updated.</p>
     * @return successCount
     */
    @NotNull
    @JsonProperty("successCount")
    public Integer getSuccessCount();

    /**
     *  <p>Number of Variants that failed to update.</p>
     * @return failureCount
     */
    @NotNull
    @JsonProperty("failureCount")
    public Integer getFailureCount();

    /**
     *  <p>Results for each Variant in the request, in the same order as the <code>items</code> in the request body.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<VariantBulkUpdateResult> getResults();

    /**
     *  <p>Number of Variants that were successfully updated.</p>
     * @param successCount value to be set
     */

    public void setSuccessCount(final Integer successCount);

    /**
     *  <p>Number of Variants that failed to update.</p>
     * @param failureCount value to be set
     */

    public void setFailureCount(final Integer failureCount);

    /**
     *  <p>Results for each Variant in the request, in the same order as the <code>items</code> in the request body.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final VariantBulkUpdateResult... results);

    /**
     *  <p>Results for each Variant in the request, in the same order as the <code>items</code> in the request body.</p>
     * @param results values to be set
     */

    public void setResults(final List<VariantBulkUpdateResult> results);

    /**
     * factory method
     * @return instance of VariantBulkUpdateResponse
     */
    public static VariantBulkUpdateResponse of() {
        return new VariantBulkUpdateResponseImpl();
    }

    /**
     * factory method to create a shallow copy VariantBulkUpdateResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantBulkUpdateResponse of(final VariantBulkUpdateResponse template) {
        VariantBulkUpdateResponseImpl instance = new VariantBulkUpdateResponseImpl();
        instance.setSuccessCount(template.getSuccessCount());
        instance.setFailureCount(template.getFailureCount());
        instance.setResults(template.getResults());
        return instance;
    }

    public VariantBulkUpdateResponse copyDeep();

    /**
     * factory method to create a deep copy of VariantBulkUpdateResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantBulkUpdateResponse deepCopy(@Nullable final VariantBulkUpdateResponse template) {
        if (template == null) {
            return null;
        }
        VariantBulkUpdateResponseImpl instance = new VariantBulkUpdateResponseImpl();
        instance.setSuccessCount(template.getSuccessCount());
        instance.setFailureCount(template.getFailureCount());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.variant.VariantBulkUpdateResult::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for VariantBulkUpdateResponse
     * @return builder
     */
    public static VariantBulkUpdateResponseBuilder builder() {
        return VariantBulkUpdateResponseBuilder.of();
    }

    /**
     * create builder for VariantBulkUpdateResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantBulkUpdateResponseBuilder builder(final VariantBulkUpdateResponse template) {
        return VariantBulkUpdateResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantBulkUpdateResponse(Function<VariantBulkUpdateResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantBulkUpdateResponse> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantBulkUpdateResponse>() {
            @Override
            public String toString() {
                return "TypeReference<VariantBulkUpdateResponse>";
            }
        };
    }
}
