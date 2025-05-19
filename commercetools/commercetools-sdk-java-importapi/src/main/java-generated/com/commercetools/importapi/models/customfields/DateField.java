
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>A field with a date value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DateField dateField = DateField.builder()
 *             .value(LocalDate.parse("2022-01-01"))
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Date")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DateFieldImpl.class)
public interface DateField extends CustomField {

    /**
     * discriminator value for DateField
     */
    String DATE = "Date";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public LocalDate getValue();

    /**
     * set value
     * @param value value to be set
     */

    public void setValue(final LocalDate value);

    /**
     * factory method
     * @return instance of DateField
     */
    public static DateField of() {
        return new DateFieldImpl();
    }

    /**
     * factory method to create a shallow copy DateField
     * @param template instance to be copied
     * @return copy instance
     */
    public static DateField of(final DateField template) {
        DateFieldImpl instance = new DateFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public DateField copyDeep();

    /**
     * factory method to create a deep copy of DateField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DateField deepCopy(@Nullable final DateField template) {
        if (template == null) {
            return null;
        }
        DateFieldImpl instance = new DateFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for DateField
     * @return builder
     */
    public static DateFieldBuilder builder() {
        return DateFieldBuilder.of();
    }

    /**
     * create builder for DateField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DateFieldBuilder builder(final DateField template) {
        return DateFieldBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDateField(Function<DateField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DateField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DateField>() {
            @Override
            public String toString() {
                return "TypeReference<DateField>";
            }
        };
    }
}
