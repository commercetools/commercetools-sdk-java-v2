
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DateTimeSetFieldBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DateTimeSetFieldBuilder implements Builder<DateTimeSetField> {

    private java.util.List<java.time.ZonedDateTime> value;

    /**
     <>
     */

    public DateTimeSetFieldBuilder value(final java.time.ZonedDateTime... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     <>
     */

    public DateTimeSetFieldBuilder value(final java.util.List<java.time.ZonedDateTime> value) {
        this.value = value;
        return this;
    }

    /**
     <>
     */

    public DateTimeSetFieldBuilder plusValue(final java.time.ZonedDateTime... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    public java.util.List<java.time.ZonedDateTime> getValue() {
        return this.value;
    }

    public DateTimeSetField build() {
        Objects.requireNonNull(value, DateTimeSetField.class + ": value is missing");
        return new DateTimeSetFieldImpl(value);
    }

    /**
     * builds DateTimeSetField without checking for non null required values
     */
    public DateTimeSetField buildUnchecked() {
        return new DateTimeSetFieldImpl(value);
    }

    public static DateTimeSetFieldBuilder of() {
        return new DateTimeSetFieldBuilder();
    }

    public static DateTimeSetFieldBuilder of(final DateTimeSetField template) {
        DateTimeSetFieldBuilder builder = new DateTimeSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
