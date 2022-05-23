
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   EnumAttribute enumAttribute = EnumAttribute.builder()
           .value("{value}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EnumAttributeBuilder implements Builder<EnumAttribute> {

    @Nullable
    private String name;

    private String value;

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     */

    public EnumAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public EnumAttributeBuilder value(final String value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public EnumAttribute build() {
        Objects.requireNonNull(value, EnumAttribute.class + ": value is missing");
        return new EnumAttributeImpl(name, value);
    }

    /**
     * builds EnumAttribute without checking for non null required values
     */
    public EnumAttribute buildUnchecked() {
        return new EnumAttributeImpl(name, value);
    }

    public static EnumAttributeBuilder of() {
        return new EnumAttributeBuilder();
    }

    public static EnumAttributeBuilder of(final EnumAttribute template) {
        EnumAttributeBuilder builder = new EnumAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
