
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DateTimeFieldBuilder
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
public class DateTimeFieldBuilder implements Builder<DateTimeField> {

    private java.time.ZonedDateTime value;

    /**
     *  <p>A date with time in the format <code>YYYY-MM-DDTHH:mm:ss.SSSZ</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC.</p>
     * @param value value to be set
     * @return Builder
     */

    public DateTimeFieldBuilder value(final java.time.ZonedDateTime value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>A date with time in the format <code>YYYY-MM-DDTHH:mm:ss.SSSZ</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC.</p>
     * @return value
     */

    public java.time.ZonedDateTime getValue() {
        return this.value;
    }

    /**
     * builds DateTimeField with checking for non-null required values
     * @return DateTimeField
     */
    public DateTimeField build() {
        Objects.requireNonNull(value, DateTimeField.class + ": value is missing");
        return new DateTimeFieldImpl(value);
    }

    /**
     * builds DateTimeField without checking for non-null required values
     * @return DateTimeField
     */
    public DateTimeField buildUnchecked() {
        return new DateTimeFieldImpl(value);
    }

    /**
     * factory method for an instance of DateTimeFieldBuilder
     * @return builder
     */
    public static DateTimeFieldBuilder of() {
        return new DateTimeFieldBuilder();
    }

    /**
     * create builder for DateTimeField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DateTimeFieldBuilder of(final DateTimeField template) {
        DateTimeFieldBuilder builder = new DateTimeFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
