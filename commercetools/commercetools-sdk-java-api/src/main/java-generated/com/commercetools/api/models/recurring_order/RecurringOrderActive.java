
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changes the Recurring Order state to active.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderActive recurringOrderActive = RecurringOrderActive.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("active")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderActiveImpl.class)
public interface RecurringOrderActive extends RecurringOrderStateDraft {

    /**
     * discriminator value for RecurringOrderActive
     */
    String ACTIVE = "active";

    /**
     *  <p>If set, the Recurring Order will automatically resume at the date and time (UTC) specified.</p>
     * @return resumesAt
     */

    @JsonProperty("resumesAt")
    public ZonedDateTime getResumesAt();

    /**
     *  <p>If set, the Recurring Order will automatically resume at the date and time (UTC) specified.</p>
     * @param resumesAt value to be set
     */

    public void setResumesAt(final ZonedDateTime resumesAt);

    /**
     * factory method
     * @return instance of RecurringOrderActive
     */
    public static RecurringOrderActive of() {
        return new RecurringOrderActiveImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderActive
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderActive of(final RecurringOrderActive template) {
        RecurringOrderActiveImpl instance = new RecurringOrderActiveImpl();
        instance.setResumesAt(template.getResumesAt());
        return instance;
    }

    public RecurringOrderActive copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderActive
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderActive deepCopy(@Nullable final RecurringOrderActive template) {
        if (template == null) {
            return null;
        }
        RecurringOrderActiveImpl instance = new RecurringOrderActiveImpl();
        instance.setResumesAt(template.getResumesAt());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderActive
     * @return builder
     */
    public static RecurringOrderActiveBuilder builder() {
        return RecurringOrderActiveBuilder.of();
    }

    /**
     * create builder for RecurringOrderActive instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderActiveBuilder builder(final RecurringOrderActive template) {
        return RecurringOrderActiveBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderActive(Function<RecurringOrderActive, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderActive> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderActive>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderActive>";
            }
        };
    }
}
