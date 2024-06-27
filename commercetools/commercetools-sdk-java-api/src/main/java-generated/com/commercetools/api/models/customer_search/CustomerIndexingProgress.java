
package com.commercetools.api.models.customer_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * CustomerIndexingProgress
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerIndexingProgress customerIndexingProgress = CustomerIndexingProgress.builder()
 *             .indexed(0.3)
 *             .failed(0.3)
 *             .estimatedTotal(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerIndexingProgressImpl.class)
public interface CustomerIndexingProgress {

    /**
     *  <p>The number of Customers successfully indexed.</p>
     * @return indexed
     */
    @NotNull
    @JsonProperty("indexed")
    public Integer getIndexed();

    /**
     *  <p>The number of Customers that failed to be indexed.</p>
     * @return failed
     */
    @NotNull
    @JsonProperty("failed")
    public Integer getFailed();

    /**
     *  <p>The estimated total number of Customers to be indexed.</p>
     * @return estimatedTotal
     */
    @NotNull
    @JsonProperty("estimatedTotal")
    public Integer getEstimatedTotal();

    /**
     *  <p>The number of Customers successfully indexed.</p>
     * @param indexed value to be set
     */

    public void setIndexed(final Integer indexed);

    /**
     *  <p>The number of Customers that failed to be indexed.</p>
     * @param failed value to be set
     */

    public void setFailed(final Integer failed);

    /**
     *  <p>The estimated total number of Customers to be indexed.</p>
     * @param estimatedTotal value to be set
     */

    public void setEstimatedTotal(final Integer estimatedTotal);

    /**
     * factory method
     * @return instance of CustomerIndexingProgress
     */
    public static CustomerIndexingProgress of() {
        return new CustomerIndexingProgressImpl();
    }

    /**
     * factory method to create a shallow copy CustomerIndexingProgress
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerIndexingProgress of(final CustomerIndexingProgress template) {
        CustomerIndexingProgressImpl instance = new CustomerIndexingProgressImpl();
        instance.setIndexed(template.getIndexed());
        instance.setFailed(template.getFailed());
        instance.setEstimatedTotal(template.getEstimatedTotal());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerIndexingProgress
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerIndexingProgress deepCopy(@Nullable final CustomerIndexingProgress template) {
        if (template == null) {
            return null;
        }
        CustomerIndexingProgressImpl instance = new CustomerIndexingProgressImpl();
        instance.setIndexed(template.getIndexed());
        instance.setFailed(template.getFailed());
        instance.setEstimatedTotal(template.getEstimatedTotal());
        return instance;
    }

    /**
     * builder factory method for CustomerIndexingProgress
     * @return builder
     */
    public static CustomerIndexingProgressBuilder builder() {
        return CustomerIndexingProgressBuilder.of();
    }

    /**
     * create builder for CustomerIndexingProgress instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerIndexingProgressBuilder builder(final CustomerIndexingProgress template) {
        return CustomerIndexingProgressBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerIndexingProgress(Function<CustomerIndexingProgress, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerIndexingProgress> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerIndexingProgress>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerIndexingProgress>";
            }
        };
    }
}
