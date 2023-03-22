
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
     * @param name
     * @return Builder
     */

    public TimeSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @param value
     * @return Builder
     */

    public TimeSetAttributeBuilder value(final java.time.LocalTime... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *
     * @param value
     * @return Builder
     */

    public TimeSetAttributeBuilder value(final java.util.List<java.time.LocalTime> value) {
        this.value = value;
        return this;
    }

    /**
     *
     * @param value
     * @return Builder
     */

    public TimeSetAttributeBuilder plusValue(final java.time.LocalTime... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public java.util.List<java.time.LocalTime> getValue() {
        return this.value;
    }

    public TimeSetAttribute build() {
        Objects.requireNonNull(value, TimeSetAttribute.class + ": value is missing");
        return new TimeSetAttributeImpl(name, value);
    }

    /**
     * builds TimeSetAttribute without checking for non null required values
     */
    public TimeSetAttribute buildUnchecked() {
        return new TimeSetAttributeImpl(name, value);
    }

    public static TimeSetAttributeBuilder of() {
        return new TimeSetAttributeBuilder();
    }

    public static TimeSetAttributeBuilder of(final TimeSetAttribute template) {
        TimeSetAttributeBuilder builder = new TimeSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
