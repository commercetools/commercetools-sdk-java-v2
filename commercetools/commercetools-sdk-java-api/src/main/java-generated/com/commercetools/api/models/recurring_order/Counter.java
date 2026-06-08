
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Configuration to track skips for a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Counter counter = Counter.builder()
 *             .totalToSkip(1)
 *             .skipped(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Counter")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CounterImpl.class)
public interface Counter extends SkipConfiguration {

    /**
     * discriminator value for Counter
     */
    String COUNTER = "Counter";

    /**
     *  <p>Number of Orders that will be skipped.</p>
     * @return totalToSkip
     */
    @NotNull
    @JsonProperty("totalToSkip")
    public Integer getTotalToSkip();

    /**
     *  <p>Number of Orders that were already skipped.</p>
     * @return skipped
     */
    @NotNull
    @JsonProperty("skipped")
    public Integer getSkipped();

    /**
     *  <p>Date and time (UTC) when the last Order creation was skipped.</p>
     * @return lastSkippedAt
     */

    @JsonProperty("lastSkippedAt")
    public ZonedDateTime getLastSkippedAt();

    /**
     *  <p>Number of Orders that will be skipped.</p>
     * @param totalToSkip value to be set
     */

    public void setTotalToSkip(final Integer totalToSkip);

    /**
     *  <p>Number of Orders that were already skipped.</p>
     * @param skipped value to be set
     */

    public void setSkipped(final Integer skipped);

    /**
     *  <p>Date and time (UTC) when the last Order creation was skipped.</p>
     * @param lastSkippedAt value to be set
     */

    public void setLastSkippedAt(final ZonedDateTime lastSkippedAt);

    /**
     * factory method
     * @return instance of Counter
     */
    public static Counter of() {
        return new CounterImpl();
    }

    /**
     * factory method to create a shallow copy Counter
     * @param template instance to be copied
     * @return copy instance
     */
    public static Counter of(final Counter template) {
        CounterImpl instance = new CounterImpl();
        instance.setTotalToSkip(template.getTotalToSkip());
        instance.setSkipped(template.getSkipped());
        instance.setLastSkippedAt(template.getLastSkippedAt());
        return instance;
    }

    public Counter copyDeep();

    /**
     * factory method to create a deep copy of Counter
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Counter deepCopy(@Nullable final Counter template) {
        if (template == null) {
            return null;
        }
        CounterImpl instance = new CounterImpl();
        instance.setTotalToSkip(template.getTotalToSkip());
        instance.setSkipped(template.getSkipped());
        instance.setLastSkippedAt(template.getLastSkippedAt());
        return instance;
    }

    /**
     * builder factory method for Counter
     * @return builder
     */
    public static CounterBuilder builder() {
        return CounterBuilder.of();
    }

    /**
     * create builder for Counter instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CounterBuilder builder(final Counter template) {
        return CounterBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCounter(Function<Counter, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Counter> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Counter>() {
            @Override
            public String toString() {
                return "TypeReference<Counter>";
            }
        };
    }
}
