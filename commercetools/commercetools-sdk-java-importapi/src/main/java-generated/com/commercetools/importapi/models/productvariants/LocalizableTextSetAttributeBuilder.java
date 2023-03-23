
package com.commercetools.importapi.models.productvariants;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LocalizableTextSetAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizableTextSetAttribute localizableTextSetAttribute = LocalizableTextSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LocalizableTextSetAttributeBuilder implements Builder<LocalizableTextSetAttribute> {

    @Nullable
    private String name;

    private java.util.List<com.commercetools.importapi.models.common.LocalizedString> value;

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @param name
     * @return Builder
     */

    public LocalizableTextSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @param value
     * @return Builder
     */

    public LocalizableTextSetAttributeBuilder value(
            final com.commercetools.importapi.models.common.LocalizedString... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *
     * @param value
     * @return Builder
     */

    public LocalizableTextSetAttributeBuilder value(
            final java.util.List<com.commercetools.importapi.models.common.LocalizedString> value) {
        this.value = value;
        return this;
    }

    /**
     *
     * @param value
     * @return Builder
     */

    public LocalizableTextSetAttributeBuilder plusValue(
            final com.commercetools.importapi.models.common.LocalizedString... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    /**
     *
     * @return Builder
     */

    public LocalizableTextSetAttributeBuilder plusValue(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }

    /**
     *
     * @return Builder
     */

    public LocalizableTextSetAttributeBuilder withValue(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.value = new ArrayList<>();
        this.value.add(builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public java.util.List<com.commercetools.importapi.models.common.LocalizedString> getValue() {
        return this.value;
    }

    public LocalizableTextSetAttribute build() {
        Objects.requireNonNull(value, LocalizableTextSetAttribute.class + ": value is missing");
        return new LocalizableTextSetAttributeImpl(name, value);
    }

    /**
     * builds LocalizableTextSetAttribute without checking for non null required values
     */
    public LocalizableTextSetAttribute buildUnchecked() {
        return new LocalizableTextSetAttributeImpl(name, value);
    }

    public static LocalizableTextSetAttributeBuilder of() {
        return new LocalizableTextSetAttributeBuilder();
    }

    public static LocalizableTextSetAttributeBuilder of(final LocalizableTextSetAttribute template) {
        LocalizableTextSetAttributeBuilder builder = new LocalizableTextSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
