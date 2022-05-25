
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TimeFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TimeField timeField = TimeField.builder()
 *             .value(LocalTime.parse("12:00:00.301"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TimeFieldBuilder implements Builder<TimeField> {

    private java.time.LocalTime value;

    /**
     *
     */

    public TimeFieldBuilder value(final java.time.LocalTime value) {
        this.value = value;
        return this;
    }

    public java.time.LocalTime getValue() {
        return this.value;
    }

    public TimeField build() {
        Objects.requireNonNull(value, TimeField.class + ": value is missing");
        return new TimeFieldImpl(value);
    }

    /**
     * builds TimeField without checking for non null required values
     */
    public TimeField buildUnchecked() {
        return new TimeFieldImpl(value);
    }

    public static TimeFieldBuilder of() {
        return new TimeFieldBuilder();
    }

    public static TimeFieldBuilder of(final TimeField template) {
        TimeFieldBuilder builder = new TimeFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
