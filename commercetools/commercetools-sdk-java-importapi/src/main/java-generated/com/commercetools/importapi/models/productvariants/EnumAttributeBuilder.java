
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * EnumAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EnumAttribute enumAttribute = EnumAttribute.builder()
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EnumAttributeBuilder implements Builder<EnumAttribute> {

    @Nullable
    private String name;

    private String value;

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @param name value to be set
     * @return Builder
     */

    public EnumAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */

    public EnumAttributeBuilder value(final String value) {
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

    public String getValue() {
        return this.value;
    }

    /**
     * builds EnumAttribute with checking for non-null required values
     * @return EnumAttribute
     */
    public EnumAttribute build() {
        Objects.requireNonNull(value, EnumAttribute.class + ": value is missing");
        return new EnumAttributeImpl(name, value);
    }

    /**
     * builds EnumAttribute without checking for non-null required values
     * @return EnumAttribute
     */
    public EnumAttribute buildUnchecked() {
        return new EnumAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of EnumAttributeBuilder
     * @return builder
     */
    public static EnumAttributeBuilder of() {
        return new EnumAttributeBuilder();
    }

    /**
     * create builder for EnumAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EnumAttributeBuilder of(final EnumAttribute template) {
        EnumAttributeBuilder builder = new EnumAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
