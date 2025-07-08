
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DateSetFieldBuilder
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
public class DateSetFieldBuilder implements Builder<DateSetField> {

    private java.util.List<java.time.LocalDate> value;

    /**
     *  <p>JSON array of date values in the format <code>YYYY-MM-DD</code> without duplicates. The order of items in the array is not fixed.</p>
     * @param value value to be set
     * @return Builder
     */

    public DateSetFieldBuilder value(final java.time.LocalDate... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *  <p>JSON array of date values in the format <code>YYYY-MM-DD</code> without duplicates. The order of items in the array is not fixed.</p>
     * @param value value to be set
     * @return Builder
     */

    public DateSetFieldBuilder value(final java.util.List<java.time.LocalDate> value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>JSON array of date values in the format <code>YYYY-MM-DD</code> without duplicates. The order of items in the array is not fixed.</p>
     * @param value value to be set
     * @return Builder
     */

    public DateSetFieldBuilder plusValue(final java.time.LocalDate... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    /**
     *  <p>JSON array of date values in the format <code>YYYY-MM-DD</code> without duplicates. The order of items in the array is not fixed.</p>
     * @return value
     */

    public java.util.List<java.time.LocalDate> getValue() {
        return this.value;
    }

    /**
     * builds DateSetField with checking for non-null required values
     * @return DateSetField
     */
    public DateSetField build() {
        Objects.requireNonNull(value, DateSetField.class + ": value is missing");
        return new DateSetFieldImpl(value);
    }

    /**
     * builds DateSetField without checking for non-null required values
     * @return DateSetField
     */
    public DateSetField buildUnchecked() {
        return new DateSetFieldImpl(value);
    }

    /**
     * factory method for an instance of DateSetFieldBuilder
     * @return builder
     */
    public static DateSetFieldBuilder of() {
        return new DateSetFieldBuilder();
    }

    /**
     * create builder for DateSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DateSetFieldBuilder of(final DateSetField template) {
        DateSetFieldBuilder builder = new DateSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
