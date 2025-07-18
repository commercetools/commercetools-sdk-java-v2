
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TextSetAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TextSetAttribute textSetAttribute = TextSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TextSetAttributeBuilder implements Builder<TextSetAttribute> {

    @Nullable
    private String name;

    private java.util.List<String> value;

    /**
     *  <p>Required if used for ProductVariantImport. Must not be set if used for ProductVariantPatch.</p>
     *  <p>Must match <code>name</code> of an AttributeDefinition of the Product Type.</p>
     * @param name value to be set
     * @return Builder
     */

    public TextSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>A set of text values.</p>
     * @param value value to be set
     * @return Builder
     */

    public TextSetAttributeBuilder value(final String... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *  <p>A set of text values.</p>
     * @param value value to be set
     * @return Builder
     */

    public TextSetAttributeBuilder value(final java.util.List<String> value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>A set of text values.</p>
     * @param value value to be set
     * @return Builder
     */

    public TextSetAttributeBuilder plusValue(final String... value) {
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
     *  <p>A set of text values.</p>
     * @return value
     */

    public java.util.List<String> getValue() {
        return this.value;
    }

    /**
     * builds TextSetAttribute with checking for non-null required values
     * @return TextSetAttribute
     */
    public TextSetAttribute build() {
        Objects.requireNonNull(value, TextSetAttribute.class + ": value is missing");
        return new TextSetAttributeImpl(name, value);
    }

    /**
     * builds TextSetAttribute without checking for non-null required values
     * @return TextSetAttribute
     */
    public TextSetAttribute buildUnchecked() {
        return new TextSetAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of TextSetAttributeBuilder
     * @return builder
     */
    public static TextSetAttributeBuilder of() {
        return new TextSetAttributeBuilder();
    }

    /**
     * create builder for TextSetAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TextSetAttributeBuilder of(final TextSetAttribute template) {
        TextSetAttributeBuilder builder = new TextSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
