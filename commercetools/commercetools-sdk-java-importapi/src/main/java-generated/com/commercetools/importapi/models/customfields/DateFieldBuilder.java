
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DateFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DateField dateField = DateField.builder()
 *             .value(LocalDate.parse("2022-01-01"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DateFieldBuilder implements Builder<DateField> {

    private java.time.LocalDate value;

    /**
     *
     * @param value
     * @return Builder
     */

    public DateFieldBuilder value(final java.time.LocalDate value) {
        this.value = value;
        return this;
    }

    public java.time.LocalDate getValue() {
        return this.value;
    }

    public DateField build() {
        Objects.requireNonNull(value, DateField.class + ": value is missing");
        return new DateFieldImpl(value);
    }

    /**
     * builds DateField without checking for non null required values
     */
    public DateField buildUnchecked() {
        return new DateFieldImpl(value);
    }

    public static DateFieldBuilder of() {
        return new DateFieldBuilder();
    }

    public static DateFieldBuilder of(final DateField template) {
        DateFieldBuilder builder = new DateFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
