
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
 *  <p>This type represents an attribute whose value is a date with time.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DateTimeAttribute dateTimeAttribute = DateTimeAttribute.builder()
 *             .value(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("datetime")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DateTimeAttributeImpl.class)
public interface DateTimeAttribute extends Attribute {

    /**
     * discriminator value for DateTimeAttribute
     */
    String DATETIME = "datetime";

    /**
     *  <p>A date with time in the format <code>YYYY-MM-DDTHH:mm:ss.SSSZ</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public ZonedDateTime getValue();

    /**
     *  <p>A date with time in the format <code>YYYY-MM-DDTHH:mm:ss.SSSZ</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC.</p>
     * @param value value to be set
     */

    public void setValue(final ZonedDateTime value);

    /**
     * factory method
     * @return instance of DateTimeAttribute
     */
    public static DateTimeAttribute of() {
        return new DateTimeAttributeImpl();
    }

    /**
     * factory method to create a shallow copy DateTimeAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static DateTimeAttribute of(final DateTimeAttribute template) {
        DateTimeAttributeImpl instance = new DateTimeAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public DateTimeAttribute copyDeep();

    /**
     * factory method to create a deep copy of DateTimeAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DateTimeAttribute deepCopy(@Nullable final DateTimeAttribute template) {
        if (template == null) {
            return null;
        }
        DateTimeAttributeImpl instance = new DateTimeAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for DateTimeAttribute
     * @return builder
     */
    public static DateTimeAttributeBuilder builder() {
        return DateTimeAttributeBuilder.of();
    }

    /**
     * create builder for DateTimeAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DateTimeAttributeBuilder builder(final DateTimeAttribute template) {
        return DateTimeAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDateTimeAttribute(Function<DateTimeAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DateTimeAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DateTimeAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<DateTimeAttribute>";
            }
        };
    }
}
