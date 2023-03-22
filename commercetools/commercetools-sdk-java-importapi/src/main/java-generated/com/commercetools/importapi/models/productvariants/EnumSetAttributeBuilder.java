
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * EnumSetAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EnumSetAttribute enumSetAttribute = EnumSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EnumSetAttributeBuilder implements Builder<EnumSetAttribute> {

    @Nullable
    private String name;

    private java.util.List<String> value;

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @param name
     * @return Builder
     */

    public EnumSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @param value
     * @return Builder
     */

    public EnumSetAttributeBuilder value(final String... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *
     * @param value
     * @return Builder
     */

    public EnumSetAttributeBuilder value(final java.util.List<String> value) {
        this.value = value;
        return this;
    }

    /**
     *
     * @param value
     * @return Builder
     */

    public EnumSetAttributeBuilder plusValue(final String... value) {
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

    public EnumSetAttribute build() {
        Objects.requireNonNull(value, EnumSetAttribute.class + ": value is missing");
        return new EnumSetAttributeImpl(name, value);
    }

    /**
     * builds EnumSetAttribute without checking for non null required values
     */
    public EnumSetAttribute buildUnchecked() {
        return new EnumSetAttributeImpl(name, value);
    }

    public static EnumSetAttributeBuilder of() {
        return new EnumSetAttributeBuilder();
    }

    public static EnumSetAttributeBuilder of(final EnumSetAttribute template) {
        EnumSetAttributeBuilder builder = new EnumSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
