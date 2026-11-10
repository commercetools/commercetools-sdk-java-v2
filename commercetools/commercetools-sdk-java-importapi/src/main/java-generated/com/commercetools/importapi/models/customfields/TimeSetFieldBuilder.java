
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TimeSetFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TimeSetField timeSetField = TimeSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TimeSetFieldBuilder implements Builder<TimeSetField> {

    private java.util.List<java.time.LocalTime> value;

    /**
     *  <p>JSON array of time values in the format <code>HH:mm:ss.SSS</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC. The order of items in the array is not fixed.</p>
     * @param value value to be set
     * @return Builder
     */

    public TimeSetFieldBuilder value(final java.time.LocalTime... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *  <p>JSON array of time values in the format <code>HH:mm:ss.SSS</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC. The order of items in the array is not fixed.</p>
     * @param value value to be set
     * @return Builder
     */

    public TimeSetFieldBuilder value(final java.util.List<java.time.LocalTime> value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>JSON array of time values in the format <code>HH:mm:ss.SSS</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC. The order of items in the array is not fixed.</p>
     * @param value value to be set
     * @return Builder
     */

    public TimeSetFieldBuilder plusValue(final java.time.LocalTime... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    /**
     *  <p>JSON array of time values in the format <code>HH:mm:ss.SSS</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC. The order of items in the array is not fixed.</p>
     * @return value
     */

    public java.util.List<java.time.LocalTime> getValue() {
        return this.value;
    }

    /**
     * builds TimeSetField with checking for non-null required values
     * @return TimeSetField
     */
    public TimeSetField build() {
        Objects.requireNonNull(value, TimeSetField.class + ": value is missing");
        return new TimeSetFieldImpl(value);
    }

    /**
     * builds TimeSetField without checking for non-null required values
     * @return TimeSetField
     */
    public TimeSetField buildUnchecked() {
        return new TimeSetFieldImpl(value);
    }

    /**
     * factory method for an instance of TimeSetFieldBuilder
     * @return builder
     */
    public static TimeSetFieldBuilder of() {
        return new TimeSetFieldBuilder();
    }

    /**
     * create builder for TimeSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TimeSetFieldBuilder of(final TimeSetField template) {
        TimeSetFieldBuilder builder = new TimeSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
