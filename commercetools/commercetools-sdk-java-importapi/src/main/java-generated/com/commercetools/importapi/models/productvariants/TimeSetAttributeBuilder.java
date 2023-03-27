
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
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @param name value to be set
     * @return Builder
     */

    public TimeSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     * set values to the value
     * @param value value to be set
     * @return Builder
     */

    public TimeSetAttributeBuilder value(final java.time.LocalTime... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     * set value to the value
     * @param value value to be set
     * @return Builder
     */

    public TimeSetAttributeBuilder value(final java.util.List<java.time.LocalTime> value) {
        this.value = value;
        return this;
    }

    /**
     * add values to the value
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
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @return name
     */

    @Nullable
    public String getName() {
        return this.name;
    }

    /**
     * value of value}
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
