
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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

    String DATE_TIME = "DateTime";

    /**
     <>
     */
    @NotNull
    @JsonProperty("value")
    public ZonedDateTime getValue();

    public void setValue(final ZonedDateTime value);

    public static DateTimeField of() {
        return new DateTimeFieldImpl();
    }

    public static DateTimeField of(final DateTimeField template) {
        DateTimeFieldImpl instance = new DateTimeFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static DateTimeFieldBuilder builder() {
        return DateTimeFieldBuilder.of();
    }

    public static DateTimeFieldBuilder builder(final DateTimeField template) {
        return DateTimeFieldBuilder.of(template);
    }

    default <T> T withDateTimeField(Function<DateTimeField, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DateTimeField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DateTimeField>() {
            @Override
            public String toString() {
                return "TypeReference<DateTimeField>";
            }
        };
    }
}
