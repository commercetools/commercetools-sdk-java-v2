
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>A field with a date set value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DateSetField dateSetField = DateSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DateSetFieldImpl.class)
public interface DateSetField extends CustomField {

    /**
     * discriminator value for DateSetField
     */
    String DATE_SET = "DateSet";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public List<LocalDate> getValue();

    /**
     * set value
     * @param value values to be set
     */

    @JsonIgnore
    public void setValue(final LocalDate... value);

    /**
     * set value
     * @param value values to be set
     */

    public void setValue(final List<LocalDate> value);

    /**
     * factory method
     * @return instance of DateSetField
     */
    public static DateSetField of() {
        return new DateSetFieldImpl();
    }

    /**
     * factory method to create a shallow copy DateSetField
     * @param template instance to be copied
     * @return copy instance
     */
    public static DateSetField of(final DateSetField template) {
        DateSetFieldImpl instance = new DateSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of DateSetField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DateSetField deepCopy(@Nullable final DateSetField template) {
        if (template == null) {
            return null;
        }
        DateSetFieldImpl instance = new DateSetFieldImpl();
        instance.setValue(Optional.ofNullable(template.getValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for DateSetField
     * @return builder
     */
    public static DateSetFieldBuilder builder() {
        return DateSetFieldBuilder.of();
    }

    /**
     * create builder for DateSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DateSetFieldBuilder builder(final DateSetField template) {
        return DateSetFieldBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDateSetField(Function<DateSetField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DateSetField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DateSetField>() {
            @Override
            public String toString() {
                return "TypeReference<DateSetField>";
            }
        };
    }
}
