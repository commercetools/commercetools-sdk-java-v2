
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DateTimeSetAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DateTimeSetAttribute dateTimeSetAttribute = DateTimeSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DateTimeSetAttributeBuilder implements Builder<DateTimeSetAttribute> {

    @Nullable
    private String name;

    private java.util.List<java.time.ZonedDateTime> value;

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @param name value to be set
     * @return Builder
     */

    public DateTimeSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @param value value to be set
     * @return Builder
     */

    public DateTimeSetAttributeBuilder value(final java.time.ZonedDateTime... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *
     * @param value value to be set
     * @return Builder
     */

    public DateTimeSetAttributeBuilder value(final java.util.List<java.time.ZonedDateTime> value) {
        this.value = value;
        return this;
    }

    /**
     *
     * @param value value to be set
     * @return Builder
     */

    public DateTimeSetAttributeBuilder plusValue(final java.time.ZonedDateTime... value) {
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

    public java.util.List<java.time.ZonedDateTime> getValue() {
        return this.value;
    }

    /**
     * builds DateTimeSetAttribute with checking for non-null required values
     * @return DateTimeSetAttribute
     */
    public DateTimeSetAttribute build() {
        Objects.requireNonNull(value, DateTimeSetAttribute.class + ": value is missing");
        return new DateTimeSetAttributeImpl(name, value);
    }

    /**
     * builds DateTimeSetAttribute without checking for non-null required values
     * @return DateTimeSetAttribute
     */
    public DateTimeSetAttribute buildUnchecked() {
        return new DateTimeSetAttributeImpl(name, value);
    }

    public static DateTimeSetAttributeBuilder of() {
        return new DateTimeSetAttributeBuilder();
    }

    public static DateTimeSetAttributeBuilder of(final DateTimeSetAttribute template) {
        DateTimeSetAttributeBuilder builder = new DateTimeSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
