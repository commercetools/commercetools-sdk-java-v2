
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
     *  <p>JSON array of date time values in the format <code>YYYY-MM-DDTHH:mm:ss.SSSZ</code> without duplicates. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC. The order of items in the array is not fixed.</p>
     * @param value value to be set
     * @return Builder
     */

    public DateTimeSetFieldBuilder value(final java.time.ZonedDateTime... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *  <p>JSON array of date time values in the format <code>YYYY-MM-DDTHH:mm:ss.SSSZ</code> without duplicates. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC. The order of items in the array is not fixed.</p>
     * @param value value to be set
     * @return Builder
     */

    public DateTimeSetFieldBuilder value(final java.util.List<java.time.ZonedDateTime> value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>JSON array of date time values in the format <code>YYYY-MM-DDTHH:mm:ss.SSSZ</code> without duplicates. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC. The order of items in the array is not fixed.</p>
     * @param value value to be set
     * @return Builder
     */

    public DateTimeSetFieldBuilder plusValue(final java.time.ZonedDateTime... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    /**
     *  <p>JSON array of date time values in the format <code>YYYY-MM-DDTHH:mm:ss.SSSZ</code> without duplicates. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC. The order of items in the array is not fixed.</p>
     * @return value
     */

    public java.util.List<java.time.ZonedDateTime> getValue() {
        return this.value;
    }

    /**
     * builds DateTimeSetField with checking for non-null required values
     * @return DateTimeSetField
     */
    public DateTimeSetField build() {
        Objects.requireNonNull(value, DateTimeSetField.class + ": value is missing");
        return new DateTimeSetFieldImpl(value);
    }

    /**
     * builds DateTimeSetField without checking for non-null required values
     * @return DateTimeSetField
     */
    public DateTimeSetField buildUnchecked() {
        return new DateTimeSetFieldImpl(value);
    }

    /**
     * factory method for an instance of DateTimeSetFieldBuilder
     * @return builder
     */
    public static DateTimeSetFieldBuilder of() {
        return new DateTimeSetFieldBuilder();
    }

    /**
     * create builder for DateTimeSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DateTimeSetFieldBuilder of(final DateTimeSetField template) {
        DateTimeSetFieldBuilder builder = new DateTimeSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
