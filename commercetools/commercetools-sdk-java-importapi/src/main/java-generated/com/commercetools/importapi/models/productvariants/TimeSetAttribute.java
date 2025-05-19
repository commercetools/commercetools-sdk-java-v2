
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
 *  <p>This type represents an attribute whose value is a set of times.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TimeSetAttribute timeSetAttribute = TimeSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("time-set")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TimeSetAttributeImpl.class)
public interface TimeSetAttribute extends Attribute {

    /**
     * discriminator value for TimeSetAttribute
     */
    String TIME_SET = "time-set";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public List<LocalTime> getValue();

    /**
     * set value
     * @param value values to be set
     */

    @JsonIgnore
    public void setValue(final LocalTime... value);

    /**
     * set value
     * @param value values to be set
     */

    public void setValue(final List<LocalTime> value);

    /**
     * factory method
     * @return instance of TimeSetAttribute
     */
    public static TimeSetAttribute of() {
        return new TimeSetAttributeImpl();
    }

    /**
     * factory method to create a shallow copy TimeSetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static TimeSetAttribute of(final TimeSetAttribute template) {
        TimeSetAttributeImpl instance = new TimeSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public TimeSetAttribute copyDeep();

    /**
     * factory method to create a deep copy of TimeSetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TimeSetAttribute deepCopy(@Nullable final TimeSetAttribute template) {
        if (template == null) {
            return null;
        }
        TimeSetAttributeImpl instance = new TimeSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(Optional.ofNullable(template.getValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for TimeSetAttribute
     * @return builder
     */
    public static TimeSetAttributeBuilder builder() {
        return TimeSetAttributeBuilder.of();
    }

    /**
     * create builder for TimeSetAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TimeSetAttributeBuilder builder(final TimeSetAttribute template) {
        return TimeSetAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTimeSetAttribute(Function<TimeSetAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TimeSetAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TimeSetAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<TimeSetAttribute>";
            }
        };
    }
}
