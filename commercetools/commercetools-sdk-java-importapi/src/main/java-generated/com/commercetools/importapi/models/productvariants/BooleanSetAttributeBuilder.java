
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   BooleanSetAttribute booleanSetAttribute = BooleanSetAttribute.builder()
           .plusValue(valueBuilder -> valueBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BooleanSetAttributeBuilder implements Builder<BooleanSetAttribute> {

    @Nullable
    private String name;

    private java.util.List<Boolean> value;

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     */

    public BooleanSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public BooleanSetAttributeBuilder value(final Boolean... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public BooleanSetAttributeBuilder value(final java.util.List<Boolean> value) {
        this.value = value;
        return this;
    }

    public BooleanSetAttributeBuilder plusValue(final Boolean... value) {
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

    public java.util.List<Boolean> getValue() {
        return this.value;
    }

    public BooleanSetAttribute build() {
        Objects.requireNonNull(value, BooleanSetAttribute.class + ": value is missing");
        return new BooleanSetAttributeImpl(name, value);
    }

    /**
     * builds BooleanSetAttribute without checking for non null required values
     */
    public BooleanSetAttribute buildUnchecked() {
        return new BooleanSetAttributeImpl(name, value);
    }

    public static BooleanSetAttributeBuilder of() {
        return new BooleanSetAttributeBuilder();
    }

    public static BooleanSetAttributeBuilder of(final BooleanSetAttribute template) {
        BooleanSetAttributeBuilder builder = new BooleanSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
