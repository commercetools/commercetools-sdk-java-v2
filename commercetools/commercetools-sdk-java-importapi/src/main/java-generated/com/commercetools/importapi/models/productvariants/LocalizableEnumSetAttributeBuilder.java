
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
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     */

    public LocalizableEnumSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *
     */

    public LocalizableEnumSetAttributeBuilder value(final String... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *
     */

    public LocalizableEnumSetAttributeBuilder value(final java.util.List<String> value) {
        this.value = value;
        return this;
    }

    /**
     *
     */

    public LocalizableEnumSetAttributeBuilder plusValue(final String... value) {
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

    public LocalizableEnumSetAttribute build() {
        Objects.requireNonNull(value, LocalizableEnumSetAttribute.class + ": value is missing");
        return new LocalizableEnumSetAttributeImpl(name, value);
    }

    /**
     * builds LocalizableEnumSetAttribute without checking for non null required values
     */
    public LocalizableEnumSetAttribute buildUnchecked() {
        return new LocalizableEnumSetAttributeImpl(name, value);
    }

    public static LocalizableEnumSetAttributeBuilder of() {
        return new LocalizableEnumSetAttributeBuilder();
    }

    public static LocalizableEnumSetAttributeBuilder of(final LocalizableEnumSetAttribute template) {
        LocalizableEnumSetAttributeBuilder builder = new LocalizableEnumSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
