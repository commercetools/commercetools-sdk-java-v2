
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Configuration that uses a counter to track the number of Orders that will be skipped.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CounterDraft counterDraft = CounterDraft.builder()
 *             .totalToSkip(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("counter")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CounterDraftImpl.class)
public interface CounterDraft extends SkipConfigurationDraft, io.vrap.rmf.base.client.Draft<CounterDraft> {

    /**
     * discriminator value for CounterDraft
     */
    String COUNTER = "counter";

    /**
     *  <p>Number of Orders that will be skipped.</p>
     * @return totalToSkip
     */
    @NotNull
    @JsonProperty("totalToSkip")
    public Integer getTotalToSkip();

    /**
     *  <p>Number of Orders that will be skipped.</p>
     * @param totalToSkip value to be set
     */

    public void setTotalToSkip(final Integer totalToSkip);

    /**
     * factory method
     * @return instance of CounterDraft
     */
    public static CounterDraft of() {
        return new CounterDraftImpl();
    }

    /**
     * factory method to create a shallow copy CounterDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CounterDraft of(final CounterDraft template) {
        CounterDraftImpl instance = new CounterDraftImpl();
        instance.setTotalToSkip(template.getTotalToSkip());
        return instance;
    }

    public CounterDraft copyDeep();

    /**
     * factory method to create a deep copy of CounterDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CounterDraft deepCopy(@Nullable final CounterDraft template) {
        if (template == null) {
            return null;
        }
        CounterDraftImpl instance = new CounterDraftImpl();
        instance.setTotalToSkip(template.getTotalToSkip());
        return instance;
    }

    /**
     * builder factory method for CounterDraft
     * @return builder
     */
    public static CounterDraftBuilder builder() {
        return CounterDraftBuilder.of();
    }

    /**
     * create builder for CounterDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CounterDraftBuilder builder(final CounterDraft template) {
        return CounterDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCounterDraft(Function<CounterDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CounterDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CounterDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CounterDraft>";
            }
        };
    }
}
