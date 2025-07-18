
package com.commercetools.importapi.models.productvariants;

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
 *  <p>This type represents an attribute whose value is a date.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DateAttribute dateAttribute = DateAttribute.builder()
 *             .value(LocalDate.parse("2022-01-01"))
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("date")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DateAttributeImpl.class)
public interface DateAttribute extends Attribute {

    /**
     * discriminator value for DateAttribute
     */
    String DATE = "date";

    /**
     *  <p>A date in the format <code>YYYY-MM-DD</code>.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public LocalDate getValue();

    /**
     *  <p>A date in the format <code>YYYY-MM-DD</code>.</p>
     * @param value value to be set
     */

    public void setValue(final LocalDate value);

    /**
     * factory method
     * @return instance of DateAttribute
     */
    public static DateAttribute of() {
        return new DateAttributeImpl();
    }

    /**
     * factory method to create a shallow copy DateAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static DateAttribute of(final DateAttribute template) {
        DateAttributeImpl instance = new DateAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public DateAttribute copyDeep();

    /**
     * factory method to create a deep copy of DateAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DateAttribute deepCopy(@Nullable final DateAttribute template) {
        if (template == null) {
            return null;
        }
        DateAttributeImpl instance = new DateAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for DateAttribute
     * @return builder
     */
    public static DateAttributeBuilder builder() {
        return DateAttributeBuilder.of();
    }

    /**
     * create builder for DateAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DateAttributeBuilder builder(final DateAttribute template) {
        return DateAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDateAttribute(Function<DateAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DateAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DateAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<DateAttribute>";
            }
        };
    }
}
