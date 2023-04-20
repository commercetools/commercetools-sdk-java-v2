
package com.commercetools.importapi.models.productvariants;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LocalizableTextAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizableTextAttribute localizableTextAttribute = LocalizableTextAttribute.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LocalizableTextAttributeBuilder implements Builder<LocalizableTextAttribute> {

    @Nullable
    private String name;

    private com.commercetools.importapi.models.common.LocalizedString value;

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @param name value to be set
     * @return Builder
     */

    public LocalizableTextAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @param builder function to build the value value
     * @return Builder
     */

    public LocalizableTextAttributeBuilder value(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.value = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @param builder function to build the value value
     * @return Builder
     */

    public LocalizableTextAttributeBuilder withValue(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.value = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @param value value to be set
     * @return Builder
     */

    public LocalizableTextAttributeBuilder value(
            final com.commercetools.importapi.models.common.LocalizedString value) {
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
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @return value
     */

    public com.commercetools.importapi.models.common.LocalizedString getValue() {
        return this.value;
    }

    /**
     * builds LocalizableTextAttribute with checking for non-null required values
     * @return LocalizableTextAttribute
     */
    public LocalizableTextAttribute build() {
        Objects.requireNonNull(value, LocalizableTextAttribute.class + ": value is missing");
        return new LocalizableTextAttributeImpl(name, value);
    }

    /**
     * builds LocalizableTextAttribute without checking for non-null required values
     * @return LocalizableTextAttribute
     */
    public LocalizableTextAttribute buildUnchecked() {
        return new LocalizableTextAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of LocalizableTextAttributeBuilder
     * @return builder
     */
    public static LocalizableTextAttributeBuilder of() {
        return new LocalizableTextAttributeBuilder();
    }

    /**
     * create builder for LocalizableTextAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizableTextAttributeBuilder of(final LocalizableTextAttribute template) {
        LocalizableTextAttributeBuilder builder = new LocalizableTextAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
