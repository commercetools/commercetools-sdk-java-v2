
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>A field with a time set value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TimeSetField timeSetField = TimeSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("TimeSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TimeSetFieldImpl.class)
public interface TimeSetField extends CustomField {

    /**
     * discriminator value for TimeSetField
     */
    String TIME_SET = "TimeSet";

    /**
     *  <p>JSON array of time values in the format <code>HH:mm:ss.SSS</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC. The order of items in the array is not fixed.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public List<LocalTime> getValue();

    /**
     *  <p>JSON array of time values in the format <code>HH:mm:ss.SSS</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC. The order of items in the array is not fixed.</p>
     * @param value values to be set
     */

    @JsonIgnore
    public void setValue(final LocalTime... value);

    /**
     *  <p>JSON array of time values in the format <code>HH:mm:ss.SSS</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC. The order of items in the array is not fixed.</p>
     * @param value values to be set
     */

    public void setValue(final List<LocalTime> value);

    /**
     * factory method
     * @return instance of TimeSetField
     */
    public static TimeSetField of() {
        return new TimeSetFieldImpl();
    }

    /**
     * factory method to create a shallow copy TimeSetField
     * @param template instance to be copied
     * @return copy instance
     */
    public static TimeSetField of(final TimeSetField template) {
        TimeSetFieldImpl instance = new TimeSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public TimeSetField copyDeep();

    /**
     * factory method to create a deep copy of TimeSetField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TimeSetField deepCopy(@Nullable final TimeSetField template) {
        if (template == null) {
            return null;
        }
        TimeSetFieldImpl instance = new TimeSetFieldImpl();
        instance.setValue(Optional.ofNullable(template.getValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for TimeSetField
     * @return builder
     */
    public static TimeSetFieldBuilder builder() {
        return TimeSetFieldBuilder.of();
    }

    /**
     * create builder for TimeSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TimeSetFieldBuilder builder(final TimeSetField template) {
        return TimeSetFieldBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTimeSetField(Function<TimeSetField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TimeSetField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TimeSetField>() {
            @Override
            public String toString() {
                return "TypeReference<TimeSetField>";
            }
        };
    }
}
