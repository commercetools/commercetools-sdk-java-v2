
package com.commercetools.api.models.recurrence_policy;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Determines the schedule for a Recurring Order to occur at a fixed interval—for example, every two weeks or every month.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandardScheduleDraft standardScheduleDraft = StandardScheduleDraft.builder()
 *             .value(0.3)
 *             .intervalUnit(IntervalUnit.DAYS)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("standard")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandardScheduleDraftImpl.class)
public interface StandardScheduleDraft
        extends RecurrencePolicyScheduleDraft, io.vrap.rmf.base.client.Draft<StandardScheduleDraft> {

    /**
     * discriminator value for StandardScheduleDraft
     */
    String STANDARD = "standard";

    /**
     *  <p>Number of intervals between orders.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Long getValue();

    /**
     *  <p>Interval for this schedule.</p>
     * @return intervalUnit
     */
    @NotNull
    @JsonProperty("intervalUnit")
    public IntervalUnit getIntervalUnit();

    /**
     *  <p>Number of intervals between orders.</p>
     * @param value value to be set
     */

    public void setValue(final Long value);

    /**
     *  <p>Interval for this schedule.</p>
     * @param intervalUnit value to be set
     */

    public void setIntervalUnit(final IntervalUnit intervalUnit);

    /**
     * factory method
     * @return instance of StandardScheduleDraft
     */
    public static StandardScheduleDraft of() {
        return new StandardScheduleDraftImpl();
    }

    /**
     * factory method to create a shallow copy StandardScheduleDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandardScheduleDraft of(final StandardScheduleDraft template) {
        StandardScheduleDraftImpl instance = new StandardScheduleDraftImpl();
        instance.setValue(template.getValue());
        instance.setIntervalUnit(template.getIntervalUnit());
        return instance;
    }

    public StandardScheduleDraft copyDeep();

    /**
     * factory method to create a deep copy of StandardScheduleDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandardScheduleDraft deepCopy(@Nullable final StandardScheduleDraft template) {
        if (template == null) {
            return null;
        }
        StandardScheduleDraftImpl instance = new StandardScheduleDraftImpl();
        instance.setValue(template.getValue());
        instance.setIntervalUnit(template.getIntervalUnit());
        return instance;
    }

    /**
     * builder factory method for StandardScheduleDraft
     * @return builder
     */
    public static StandardScheduleDraftBuilder builder() {
        return StandardScheduleDraftBuilder.of();
    }

    /**
     * create builder for StandardScheduleDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandardScheduleDraftBuilder builder(final StandardScheduleDraft template) {
        return StandardScheduleDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandardScheduleDraft(Function<StandardScheduleDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandardScheduleDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandardScheduleDraft>() {
            @Override
            public String toString() {
                return "TypeReference<StandardScheduleDraft>";
            }
        };
    }
}
