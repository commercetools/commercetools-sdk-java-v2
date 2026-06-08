
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
 *  <p>A field with a date time set value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DateTimeSetField dateTimeSetField = DateTimeSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DateTimeSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DateTimeSetFieldImpl.class)
public interface DateTimeSetField extends CustomField {

    /**
     * discriminator value for DateTimeSetField
     */
    String DATE_TIME_SET = "DateTimeSet";

    /**
     *  <p>JSON array of date time values in the format <code>YYYY-MM-DDTHH:mm:ss.SSSZ</code> without duplicates. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC. The order of items in the array is not fixed.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public List<ZonedDateTime> getValue();

    /**
     *  <p>JSON array of date time values in the format <code>YYYY-MM-DDTHH:mm:ss.SSSZ</code> without duplicates. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC. The order of items in the array is not fixed.</p>
     * @param value values to be set
     */

    @JsonIgnore
    public void setValue(final ZonedDateTime... value);

    /**
     *  <p>JSON array of date time values in the format <code>YYYY-MM-DDTHH:mm:ss.SSSZ</code> without duplicates. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC. The order of items in the array is not fixed.</p>
     * @param value values to be set
     */

    public void setValue(final List<ZonedDateTime> value);

    /**
     * factory method
     * @return instance of DateTimeSetField
     */
    public static DateTimeSetField of() {
        return new DateTimeSetFieldImpl();
    }

    /**
     * factory method to create a shallow copy DateTimeSetField
     * @param template instance to be copied
     * @return copy instance
     */
    public static DateTimeSetField of(final DateTimeSetField template) {
        DateTimeSetFieldImpl instance = new DateTimeSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public DateTimeSetField copyDeep();

    /**
     * factory method to create a deep copy of DateTimeSetField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DateTimeSetField deepCopy(@Nullable final DateTimeSetField template) {
        if (template == null) {
            return null;
        }
        DateTimeSetFieldImpl instance = new DateTimeSetFieldImpl();
        instance.setValue(Optional.ofNullable(template.getValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for DateTimeSetField
     * @return builder
     */
    public static DateTimeSetFieldBuilder builder() {
        return DateTimeSetFieldBuilder.of();
    }

    /**
     * create builder for DateTimeSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DateTimeSetFieldBuilder builder(final DateTimeSetField template) {
        return DateTimeSetFieldBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDateTimeSetField(Function<DateTimeSetField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DateTimeSetField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DateTimeSetField>() {
            @Override
            public String toString() {
                return "TypeReference<DateTimeSetField>";
            }
        };
    }
}
