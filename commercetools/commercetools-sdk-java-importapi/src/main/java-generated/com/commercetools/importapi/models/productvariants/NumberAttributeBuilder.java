
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * NumberAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NumberAttribute numberAttribute = NumberAttribute.builder()
 *             .value(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class NumberAttributeBuilder implements Builder<NumberAttribute> {

    @Nullable
    private String name;

    private Double value;

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @param name value to be set
     * @return Builder
     */

    public NumberAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */

    public NumberAttributeBuilder value(final Double value) {
        this.value = value;
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

    public Double getValue() {
        return this.value;
    }

    /**
     * builds NumberAttribute with checking for non-null required values
     * @return NumberAttribute
     */
    public NumberAttribute build() {
        Objects.requireNonNull(value, NumberAttribute.class + ": value is missing");
        return new NumberAttributeImpl(name, value);
    }

    /**
     * builds NumberAttribute without checking for non-null required values
     * @return NumberAttribute
     */
    public NumberAttribute buildUnchecked() {
        return new NumberAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of NumberAttributeBuilder
     * @return builder
     */
    public static NumberAttributeBuilder of() {
        return new NumberAttributeBuilder();
    }

    /**
     * create builder for NumberAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NumberAttributeBuilder of(final NumberAttribute template) {
        NumberAttributeBuilder builder = new NumberAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
