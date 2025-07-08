
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
     *  <p>Required if used for ProductVariantImport. Must not be set if used for ProductVariantPatch.</p>
     *  <p>Must match <code>name</code> of an AttributeDefinition of the Product Type.</p>
     * @param name value to be set
     * @return Builder
     */

    public DateTimeAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>A date with time in the format <code>YYYY-MM-DDTHH:mm:ss.SSSZ</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC.</p>
     * @param value value to be set
     * @return Builder
     */

    public DateTimeAttributeBuilder value(final java.time.ZonedDateTime value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Required if used for ProductVariantImport. Must not be set if used for ProductVariantPatch.</p>
     *  <p>Must match <code>name</code> of an AttributeDefinition of the Product Type.</p>
     * @return name
     */

    @Nullable
    public String getName() {
        return this.name;
    }

    /**
     *  <p>A date with time in the format <code>YYYY-MM-DDTHH:mm:ss.SSSZ</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC.</p>
     * @return value
     */

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

    /**
     * factory method for an instance of DateTimeAttributeBuilder
     * @return builder
     */
    public static DateTimeAttributeBuilder of() {
        return new DateTimeAttributeBuilder();
    }

    /**
     * create builder for DateTimeAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DateTimeAttributeBuilder of(final DateTimeAttribute template) {
        DateTimeAttributeBuilder builder = new DateTimeAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
