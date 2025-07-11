
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
     *  <p>A time value in the format <code>HH:mm:ss.SSS</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC.</p>
     * @param value value to be set
     * @return Builder
     */

    public TimeFieldBuilder value(final java.time.LocalTime value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>A time value in the format <code>HH:mm:ss.SSS</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC.</p>
     * @return value
     */

    public java.time.LocalTime getValue() {
        return this.value;
    }

    /**
     * builds TimeField with checking for non-null required values
     * @return TimeField
     */
    public TimeField build() {
        Objects.requireNonNull(value, TimeField.class + ": value is missing");
        return new TimeFieldImpl(value);
    }

    /**
     * builds TimeField without checking for non-null required values
     * @return TimeField
     */
    public TimeField buildUnchecked() {
        return new TimeFieldImpl(value);
    }

    /**
     * factory method for an instance of TimeFieldBuilder
     * @return builder
     */
    public static TimeFieldBuilder of() {
        return new TimeFieldBuilder();
    }

    /**
     * create builder for TimeField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TimeFieldBuilder of(final TimeField template) {
        TimeFieldBuilder builder = new TimeFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
