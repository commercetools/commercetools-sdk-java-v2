
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
     *  <p>Required if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantImport" rel="nofollow">ProductVariantImport</a>. Must not be set if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantPatch" rel="nofollow">ProductVariantPatch</a>.</p>
     *  <p>Must match <code>name</code> of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> of the Product Type.</p>
     * @param name value to be set
     * @return Builder
     */

    public LocalizableEnumAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The key of the localized enum value. Must match the key of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumValue" rel="nofollow">AttributeLocalizedEnumValue</a> in the Product Type.</p>
     * @param value value to be set
     * @return Builder
     */

    public LocalizableEnumAttributeBuilder value(final String value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Required if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantImport" rel="nofollow">ProductVariantImport</a>. Must not be set if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantPatch" rel="nofollow">ProductVariantPatch</a>.</p>
     *  <p>Must match <code>name</code> of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> of the Product Type.</p>
     * @return name
     */

    @Nullable
    public String getName() {
        return this.name;
    }

    /**
     *  <p>The key of the localized enum value. Must match the key of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumValue" rel="nofollow">AttributeLocalizedEnumValue</a> in the Product Type.</p>
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
