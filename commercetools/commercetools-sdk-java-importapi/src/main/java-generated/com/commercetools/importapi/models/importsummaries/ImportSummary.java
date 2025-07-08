
package com.commercetools.importapi.models.importsummaries;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The current status of ImportOperations in an ImportContainer.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportSummary importSummary = ImportSummary.builder()
 *             .states(statesBuilder -> statesBuilder)
 *             .total(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportSummaryImpl.class)
public interface ImportSummary {

    /**
     *  <p>The current ProcessingStates of ImportOperations in an ImportContainer.</p>
     * @return states
     */
    @NotNull
    @Valid
    @JsonProperty("states")
    public OperationStates getStates();

    /**
     *  <p>The total number of ImportOperations in <code>states</code>.</p>
     * @return total
     */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>The current ProcessingStates of ImportOperations in an ImportContainer.</p>
     * @param states value to be set
     */

    public void setStates(final OperationStates states);

    /**
     *  <p>The total number of ImportOperations in <code>states</code>.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     * factory method
     * @return instance of ImportSummary
     */
    public static ImportSummary of() {
        return new ImportSummaryImpl();
    }

    /**
     * factory method to create a shallow copy ImportSummary
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportSummary of(final ImportSummary template) {
        ImportSummaryImpl instance = new ImportSummaryImpl();
        instance.setStates(template.getStates());
        instance.setTotal(template.getTotal());
        return instance;
    }

    public ImportSummary copyDeep();

    /**
     * factory method to create a deep copy of ImportSummary
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportSummary deepCopy(@Nullable final ImportSummary template) {
        if (template == null) {
            return null;
        }
        ImportSummaryImpl instance = new ImportSummaryImpl();
        instance.setStates(
            com.commercetools.importapi.models.importsummaries.OperationStates.deepCopy(template.getStates()));
        instance.setTotal(template.getTotal());
        return instance;
    }

    /**
     * builder factory method for ImportSummary
     * @return builder
     */
    public static ImportSummaryBuilder builder() {
        return ImportSummaryBuilder.of();
    }

    /**
     * create builder for ImportSummary instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportSummaryBuilder builder(final ImportSummary template) {
        return ImportSummaryBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportSummary(Function<ImportSummary, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportSummary> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportSummary>() {
            @Override
            public String toString() {
                return "TypeReference<ImportSummary>";
            }
        };
    }
}
