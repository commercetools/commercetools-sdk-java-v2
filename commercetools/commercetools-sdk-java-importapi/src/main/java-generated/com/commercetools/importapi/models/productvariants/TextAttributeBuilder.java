
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TextAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TextAttribute textAttribute = TextAttribute.builder()
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TextAttributeBuilder implements Builder<TextAttribute> {

    @Nullable
    private String name;

    private String value;

    /**
     *  <p>Required if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantImport" rel="nofollow">ProductVariantImport</a>. Must not be set if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantPatch" rel="nofollow">ProductVariantPatch</a>.</p>
     *  <p>Must match <code>name</code> of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> of the Product Type.</p>
     * @param name value to be set
     * @return Builder
     */

    public TextAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>A text value.</p>
     * @param value value to be set
     * @return Builder
     */

    public TextAttributeBuilder value(final String value) {
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
     *  <p>A text value.</p>
     * @return value
     */

    public String getValue() {
        return this.value;
    }

    /**
     * builds TextAttribute with checking for non-null required values
     * @return TextAttribute
     */
    public TextAttribute build() {
        Objects.requireNonNull(value, TextAttribute.class + ": value is missing");
        return new TextAttributeImpl(name, value);
    }

    /**
     * builds TextAttribute without checking for non-null required values
     * @return TextAttribute
     */
    public TextAttribute buildUnchecked() {
        return new TextAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of TextAttributeBuilder
     * @return builder
     */
    public static TextAttributeBuilder of() {
        return new TextAttributeBuilder();
    }

    /**
     * create builder for TextAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TextAttributeBuilder of(final TextAttribute template) {
        TextAttributeBuilder builder = new TextAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
