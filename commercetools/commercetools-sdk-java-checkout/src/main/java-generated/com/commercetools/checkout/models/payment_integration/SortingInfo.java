
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * SortingInfo
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SortingInfo sortingInfo = SortingInfo.builder()
 *             .priority(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SortingInfoImpl.class)
public interface SortingInfo {

    /**
     *  <p>Sorting priority of the Payment Integration.</p>
     * @return priority
     */
    @NotNull
    @JsonProperty("priority")
    public Integer getPriority();

    /**
     *  <p>Sorting priority of the Payment Integration.</p>
     * @param priority value to be set
     */

    public void setPriority(final Integer priority);

    /**
     * factory method
     * @return instance of SortingInfo
     */
    public static SortingInfo of() {
        return new SortingInfoImpl();
    }

    /**
     * factory method to create a shallow copy SortingInfo
     * @param template instance to be copied
     * @return copy instance
     */
    public static SortingInfo of(final SortingInfo template) {
        SortingInfoImpl instance = new SortingInfoImpl();
        instance.setPriority(template.getPriority());
        return instance;
    }

    public SortingInfo copyDeep();

    /**
     * factory method to create a deep copy of SortingInfo
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SortingInfo deepCopy(@Nullable final SortingInfo template) {
        if (template == null) {
            return null;
        }
        SortingInfoImpl instance = new SortingInfoImpl();
        instance.setPriority(template.getPriority());
        return instance;
    }

    /**
     * builder factory method for SortingInfo
     * @return builder
     */
    public static SortingInfoBuilder builder() {
        return SortingInfoBuilder.of();
    }

    /**
     * create builder for SortingInfo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SortingInfoBuilder builder(final SortingInfo template) {
        return SortingInfoBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSortingInfo(Function<SortingInfo, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SortingInfo> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SortingInfo>() {
            @Override
            public String toString() {
                return "TypeReference<SortingInfo>";
            }
        };
    }
}
