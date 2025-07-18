
package com.commercetools.importapi.models.productvariants;

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
 *  <p>This type represents an attribute whose value is a time.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TimeAttribute timeAttribute = TimeAttribute.builder()
 *             .value(LocalTime.parse("12:00:00.301"))
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("time")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TimeAttributeImpl.class)
public interface TimeAttribute extends Attribute {

    /**
     * discriminator value for TimeAttribute
     */
    String TIME = "time";

    /**
     *  <p>A time value in the format <code>HH:mm:ss.SSS</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public LocalTime getValue();

    /**
     *  <p>A time value in the format <code>HH:mm:ss.SSS</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC.</p>
     * @param value value to be set
     */

    public void setValue(final LocalTime value);

    /**
     * factory method
     * @return instance of TimeAttribute
     */
    public static TimeAttribute of() {
        return new TimeAttributeImpl();
    }

    /**
     * factory method to create a shallow copy TimeAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static TimeAttribute of(final TimeAttribute template) {
        TimeAttributeImpl instance = new TimeAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public TimeAttribute copyDeep();

    /**
     * factory method to create a deep copy of TimeAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TimeAttribute deepCopy(@Nullable final TimeAttribute template) {
        if (template == null) {
            return null;
        }
        TimeAttributeImpl instance = new TimeAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for TimeAttribute
     * @return builder
     */
    public static TimeAttributeBuilder builder() {
        return TimeAttributeBuilder.of();
    }

    /**
     * create builder for TimeAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TimeAttributeBuilder builder(final TimeAttribute template) {
        return TimeAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTimeAttribute(Function<TimeAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TimeAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TimeAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<TimeAttribute>";
            }
        };
    }
}
