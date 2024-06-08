
package com.commercetools.importapi.models.customfields;

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
 *  <p>A field with a date time value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DateTimeField dateTimeField = DateTimeField.builder()
 *             .value(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DateTimeFieldImpl.class)
public interface DateTimeField extends CustomField {

    /**
     * discriminator value for DateTimeField
     */
    String DATE_TIME = "DateTime";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public ZonedDateTime getValue();

    /**
     * set value
     * @param value value to be set
     */

    public void setValue(final ZonedDateTime value);

    /**
     * factory method
     * @return instance of DateTimeField
     */
    public static DateTimeField of() {
        return new DateTimeFieldImpl();
    }

    /**
     * factory method to create a shallow copy DateTimeField
     * @param template instance to be copied
     * @return copy instance
     */
    public static DateTimeField of(final DateTimeField template) {
        DateTimeFieldImpl instance = new DateTimeFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of DateTimeField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DateTimeField deepCopy(@Nullable final DateTimeField template) {
        if (template == null) {
            return null;
        }
        DateTimeFieldImpl instance = new DateTimeFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for DateTimeField
     * @return builder
     */
    public static DateTimeFieldBuilder builder() {
        return DateTimeFieldBuilder.of();
    }

    /**
     * create builder for DateTimeField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DateTimeFieldBuilder builder(final DateTimeField template) {
        return DateTimeFieldBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDateTimeField(Function<DateTimeField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DateTimeField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DateTimeField>() {
            @Override
            public String toString() {
                return "TypeReference<DateTimeField>";
            }
        };
    }
}
