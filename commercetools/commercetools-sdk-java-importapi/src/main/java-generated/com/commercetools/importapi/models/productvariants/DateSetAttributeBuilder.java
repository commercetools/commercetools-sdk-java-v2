
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DateSetAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DateSetAttribute dateSetAttribute = DateSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DateSetAttributeBuilder implements Builder<DateSetAttribute> {

    @Nullable
    private String name;

    private java.util.List<java.time.LocalDate> value;

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @param name value to be set
     * @return Builder
     */

    public DateSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     * set values to the value
     * @param value value to be set
     * @return Builder
     */

    public DateSetAttributeBuilder value(final java.time.LocalDate... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     * set value to the value
     * @param value value to be set
     * @return Builder
     */

    public DateSetAttributeBuilder value(final java.util.List<java.time.LocalDate> value) {
        this.value = value;
        return this;
    }

    /**
     * add values to the value
     * @param value value to be set
     * @return Builder
     */

    public DateSetAttributeBuilder plusValue(final java.time.LocalDate... value) {
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

    public java.util.List<java.time.LocalDate> getValue() {
        return this.value;
    }

    /**
     * builds DateSetAttribute with checking for non-null required values
     * @return DateSetAttribute
     */
    public DateSetAttribute build() {
        Objects.requireNonNull(value, DateSetAttribute.class + ": value is missing");
        return new DateSetAttributeImpl(name, value);
    }

    /**
     * builds DateSetAttribute without checking for non-null required values
     * @return DateSetAttribute
     */
    public DateSetAttribute buildUnchecked() {
        return new DateSetAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of DateSetAttributeBuilder
     * @return builder
     */
    public static DateSetAttributeBuilder of() {
        return new DateSetAttributeBuilder();
    }

    /**
     * create builder for DateSetAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DateSetAttributeBuilder of(final DateSetAttribute template) {
        DateSetAttributeBuilder builder = new DateSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
