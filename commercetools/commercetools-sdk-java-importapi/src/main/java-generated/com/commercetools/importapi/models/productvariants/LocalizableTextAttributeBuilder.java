
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
     */

    public LocalizableTextAttributeBuilder value(
            final com.commercetools.importapi.models.common.LocalizedString value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public com.commercetools.importapi.models.common.LocalizedString getValue() {
        return this.value;
    }

    public LocalizableTextAttribute build() {
        Objects.requireNonNull(value, LocalizableTextAttribute.class + ": value is missing");
        return new LocalizableTextAttributeImpl(name, value);
    }

    /**
     * builds LocalizableTextAttribute without checking for non null required values
     */
    public LocalizableTextAttribute buildUnchecked() {
        return new LocalizableTextAttributeImpl(name, value);
    }

    public static LocalizableTextAttributeBuilder of() {
        return new LocalizableTextAttributeBuilder();
    }

    public static LocalizableTextAttributeBuilder of(final LocalizableTextAttribute template) {
        LocalizableTextAttributeBuilder builder = new LocalizableTextAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
