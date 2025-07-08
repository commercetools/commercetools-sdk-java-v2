
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TimeAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TimeAttribute timeAttribute = TimeAttribute.builder()
 *             .value(LocalTime.parse("12:00:00.301"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TimeAttributeBuilder implements Builder<TimeAttribute> {

    @Nullable
    private String name;

    private java.time.LocalTime value;

    /**
     *  <p>Required if used for ProductVariantImport. Must not be set if used for ProductVariantPatch.</p>
     *  <p>Must match <code>name</code> of an AttributeDefinition of the Product Type.</p>
     * @param name value to be set
     * @return Builder
     */

    public TimeAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>A time value in the format <code>HH:mm:ss.SSS</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC.</p>
     * @param value value to be set
     * @return Builder
     */

    public TimeAttributeBuilder value(final java.time.LocalTime value) {
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
     *  <p>A time value in the format <code>HH:mm:ss.SSS</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC.</p>
     * @return value
     */

    public java.time.LocalTime getValue() {
        return this.value;
    }

    /**
     * builds TimeAttribute with checking for non-null required values
     * @return TimeAttribute
     */
    public TimeAttribute build() {
        Objects.requireNonNull(value, TimeAttribute.class + ": value is missing");
        return new TimeAttributeImpl(name, value);
    }

    /**
     * builds TimeAttribute without checking for non-null required values
     * @return TimeAttribute
     */
    public TimeAttribute buildUnchecked() {
        return new TimeAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of TimeAttributeBuilder
     * @return builder
     */
    public static TimeAttributeBuilder of() {
        return new TimeAttributeBuilder();
    }

    /**
     * create builder for TimeAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TimeAttributeBuilder of(final TimeAttribute template) {
        TimeAttributeBuilder builder = new TimeAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
