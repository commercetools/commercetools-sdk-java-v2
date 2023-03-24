
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
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @param name value to be set
     * @return Builder
     */

    public TextSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @param value value to be set
     * @return Builder
     */

    public TextSetAttributeBuilder value(final String... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *
     * @param value value to be set
     * @return Builder
     */

    public TextSetAttributeBuilder value(final java.util.List<String> value) {
        this.value = value;
        return this;
    }

    /**
     *
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

    @Nullable
    public String getName() {
        return this.name;
    }

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

    public static TextSetAttributeBuilder of() {
        return new TextSetAttributeBuilder();
    }

    public static TextSetAttributeBuilder of(final TextSetAttribute template) {
        TextSetAttributeBuilder builder = new TextSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
