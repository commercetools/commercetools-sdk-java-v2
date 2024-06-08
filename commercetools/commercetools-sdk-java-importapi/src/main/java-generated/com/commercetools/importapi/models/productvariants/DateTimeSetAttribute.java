
package com.commercetools.importapi.models.productvariants;

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
 *  <p>This type represents an attribute whose value is a set of dates with time.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DateTimeSetAttribute dateTimeSetAttribute = DateTimeSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DateTimeSetAttributeImpl.class)
public interface DateTimeSetAttribute extends Attribute {

    /**
     * discriminator value for DateTimeSetAttribute
     */
    String DATETIME_SET = "datetime-set";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public List<ZonedDateTime> getValue();

    /**
     * set value
     * @param value values to be set
     */

    @JsonIgnore
    public void setValue(final ZonedDateTime... value);

    /**
     * set value
     * @param value values to be set
     */

    public void setValue(final List<ZonedDateTime> value);

    /**
     * factory method
     * @return instance of DateTimeSetAttribute
     */
    public static DateTimeSetAttribute of() {
        return new DateTimeSetAttributeImpl();
    }

    /**
     * factory method to create a shallow copy DateTimeSetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static DateTimeSetAttribute of(final DateTimeSetAttribute template) {
        DateTimeSetAttributeImpl instance = new DateTimeSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of DateTimeSetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DateTimeSetAttribute deepCopy(@Nullable final DateTimeSetAttribute template) {
        if (template == null) {
            return null;
        }
        DateTimeSetAttributeImpl instance = new DateTimeSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(Optional.ofNullable(template.getValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for DateTimeSetAttribute
     * @return builder
     */
    public static DateTimeSetAttributeBuilder builder() {
        return DateTimeSetAttributeBuilder.of();
    }

    /**
     * create builder for DateTimeSetAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DateTimeSetAttributeBuilder builder(final DateTimeSetAttribute template) {
        return DateTimeSetAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDateTimeSetAttribute(Function<DateTimeSetAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DateTimeSetAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DateTimeSetAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<DateTimeSetAttribute>";
            }
        };
    }
}
