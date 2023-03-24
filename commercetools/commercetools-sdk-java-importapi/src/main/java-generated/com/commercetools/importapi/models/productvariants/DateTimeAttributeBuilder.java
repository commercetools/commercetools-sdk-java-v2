
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DateTimeAttributeBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DateTimeAttributeBuilder implements Builder<DateTimeAttribute> {

    @Nullable
    private String name;

    private java.time.ZonedDateTime value;

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @param name value to be set
     * @return Builder
     */

    public DateTimeAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @param value value to be set
     * @return Builder
     */

    public DateTimeAttributeBuilder value(final java.time.ZonedDateTime value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public java.time.ZonedDateTime getValue() {
        return this.value;
    }

    /**
     * builds DateTimeAttribute with checking for non-null required values
     * @return DateTimeAttribute
     */
    public DateTimeAttribute build() {
        Objects.requireNonNull(value, DateTimeAttribute.class + ": value is missing");
        return new DateTimeAttributeImpl(name, value);
    }

    /**
     * builds DateTimeAttribute without checking for non-null required values
     * @return DateTimeAttribute
     */
    public DateTimeAttribute buildUnchecked() {
        return new DateTimeAttributeImpl(name, value);
    }

    public static DateTimeAttributeBuilder of() {
        return new DateTimeAttributeBuilder();
    }

    public static DateTimeAttributeBuilder of(final DateTimeAttribute template) {
        DateTimeAttributeBuilder builder = new DateTimeAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
