
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TimeSetAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TimeSetAttribute timeSetAttribute = TimeSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TimeSetAttributeBuilder implements Builder<TimeSetAttribute> {

    @Nullable
    private String name;

    private java.util.List<java.time.LocalTime> value;

    /**
     *  <p>Required if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantImport" rel="nofollow">ProductVariantImport</a>. Must not be set if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantPatch" rel="nofollow">ProductVariantPatch</a>.</p>
     *  <p>Must match <code>name</code> of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> of the Product Type.</p>
     * @param name value to be set
     * @return Builder
     */

    public TimeSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>A set of time values in the format <code>HH:mm:ss.SSS</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC.</p>
     * @param value value to be set
     * @return Builder
     */

    public TimeSetAttributeBuilder value(final java.time.LocalTime... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *  <p>A set of time values in the format <code>HH:mm:ss.SSS</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC.</p>
     * @param value value to be set
     * @return Builder
     */

    public TimeSetAttributeBuilder value(final java.util.List<java.time.LocalTime> value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>A set of time values in the format <code>HH:mm:ss.SSS</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC.</p>
     * @param value value to be set
     * @return Builder
     */

    public TimeSetAttributeBuilder plusValue(final java.time.LocalTime... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    /**
     *  <p>Required if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantImport" rel="nofollow">ProductVariantImport</a>. Must not be set if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantPatch" rel="nofollow">ProductVariantPatch</a>.</p>
     *  <p>Must match <code>name</code> of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> of the Product Type.</p>
     * @return name
     */

    @Nullable
    public String getName() {
        return this.name;
    }

    /**
     *  <p>A set of time values in the format <code>HH:mm:ss.SSS</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC.</p>
     * @return value
     */

    public java.util.List<java.time.LocalTime> getValue() {
        return this.value;
    }

    /**
     * builds TimeSetAttribute with checking for non-null required values
     * @return TimeSetAttribute
     */
    public TimeSetAttribute build() {
        Objects.requireNonNull(value, TimeSetAttribute.class + ": value is missing");
        return new TimeSetAttributeImpl(name, value);
    }

    /**
     * builds TimeSetAttribute without checking for non-null required values
     * @return TimeSetAttribute
     */
    public TimeSetAttribute buildUnchecked() {
        return new TimeSetAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of TimeSetAttributeBuilder
     * @return builder
     */
    public static TimeSetAttributeBuilder of() {
        return new TimeSetAttributeBuilder();
    }

    /**
     * create builder for TimeSetAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TimeSetAttributeBuilder of(final TimeSetAttribute template) {
        TimeSetAttributeBuilder builder = new TimeSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
