
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LocalizableEnumSetAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizableEnumSetAttribute localizableEnumSetAttribute = LocalizableEnumSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LocalizableEnumSetAttributeBuilder implements Builder<LocalizableEnumSetAttribute> {

    @Nullable
    private String name;

    private java.util.List<String> value;

    /**
     *  <p>Required if used for ProductVariantImport. Must not be set if used for ProductVariantPatch.</p>
     *  <p>Must match <code>name</code> of an AttributeDefinition of the Product Type.</p>
     * @param name value to be set
     * @return Builder
     */

    public LocalizableEnumSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>A set of localized enum values, each represented by its key. Each key must match the key of an AttributeLocalizedEnumValue in the Product Type.</p>
     * @param value value to be set
     * @return Builder
     */

    public LocalizableEnumSetAttributeBuilder value(final String... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *  <p>A set of localized enum values, each represented by its key. Each key must match the key of an AttributeLocalizedEnumValue in the Product Type.</p>
     * @param value value to be set
     * @return Builder
     */

    public LocalizableEnumSetAttributeBuilder value(final java.util.List<String> value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>A set of localized enum values, each represented by its key. Each key must match the key of an AttributeLocalizedEnumValue in the Product Type.</p>
     * @param value value to be set
     * @return Builder
     */

    public LocalizableEnumSetAttributeBuilder plusValue(final String... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    /**
     *  <p>Required if used for ProductVariantImport. Must not be set if used for ProductVariantPatch.</p>
     *  <p>Must match <code>name</code> of an AttributeDefinition of the Product Type.</p>
     * @return name
     */

    @Nullable
    public String getName() {
        return this.name;
    }

    /**
     *  <p>A set of localized enum values, each represented by its key. Each key must match the key of an AttributeLocalizedEnumValue in the Product Type.</p>
     * @return value
     */

    public java.util.List<String> getValue() {
        return this.value;
    }

    /**
     * builds LocalizableEnumSetAttribute with checking for non-null required values
     * @return LocalizableEnumSetAttribute
     */
    public LocalizableEnumSetAttribute build() {
        Objects.requireNonNull(value, LocalizableEnumSetAttribute.class + ": value is missing");
        return new LocalizableEnumSetAttributeImpl(name, value);
    }

    /**
     * builds LocalizableEnumSetAttribute without checking for non-null required values
     * @return LocalizableEnumSetAttribute
     */
    public LocalizableEnumSetAttribute buildUnchecked() {
        return new LocalizableEnumSetAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of LocalizableEnumSetAttributeBuilder
     * @return builder
     */
    public static LocalizableEnumSetAttributeBuilder of() {
        return new LocalizableEnumSetAttributeBuilder();
    }

    /**
     * create builder for LocalizableEnumSetAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizableEnumSetAttributeBuilder of(final LocalizableEnumSetAttribute template) {
        LocalizableEnumSetAttributeBuilder builder = new LocalizableEnumSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
