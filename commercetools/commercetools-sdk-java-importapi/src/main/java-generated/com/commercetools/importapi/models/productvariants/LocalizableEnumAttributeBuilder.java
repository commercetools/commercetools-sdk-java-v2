
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LocalizableEnumAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizableEnumAttribute localizableEnumAttribute = LocalizableEnumAttribute.builder()
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LocalizableEnumAttributeBuilder implements Builder<LocalizableEnumAttribute> {

    @Nullable
    private String name;

    private String value;

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @param name value to be set
     * @return Builder
     */

    public LocalizableEnumAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */

    public LocalizableEnumAttributeBuilder value(final String value) {
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
     * builds LocalizableEnumAttribute with checking for non-null required values
     * @return LocalizableEnumAttribute
     */
    public LocalizableEnumAttribute build() {
        Objects.requireNonNull(value, LocalizableEnumAttribute.class + ": value is missing");
        return new LocalizableEnumAttributeImpl(name, value);
    }

    /**
     * builds LocalizableEnumAttribute without checking for non-null required values
     * @return LocalizableEnumAttribute
     */
    public LocalizableEnumAttribute buildUnchecked() {
        return new LocalizableEnumAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of LocalizableEnumAttributeBuilder
     * @return builder
     */
    public static LocalizableEnumAttributeBuilder of() {
        return new LocalizableEnumAttributeBuilder();
    }

    /**
     * create builder for LocalizableEnumAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizableEnumAttributeBuilder of(final LocalizableEnumAttribute template) {
        LocalizableEnumAttributeBuilder builder = new LocalizableEnumAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
