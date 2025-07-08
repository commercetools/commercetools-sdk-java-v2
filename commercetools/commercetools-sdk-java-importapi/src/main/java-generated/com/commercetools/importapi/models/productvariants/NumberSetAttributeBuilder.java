
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * NumberSetAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NumberSetAttribute numberSetAttribute = NumberSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class NumberSetAttributeBuilder implements Builder<NumberSetAttribute> {

    @Nullable
    private String name;

    private java.util.List<Double> value;

    /**
     *  <p>Required if used for ProductVariantImport. Must not be set if used for ProductVariantPatch.</p>
     *  <p>Must match <code>name</code> of an AttributeDefinition of the Product Type.</p>
     * @param name value to be set
     * @return Builder
     */

    public NumberSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>A set of number values. Each value can be an integer or a floating-point number.</p>
     * @param value value to be set
     * @return Builder
     */

    public NumberSetAttributeBuilder value(final Double... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *  <p>A set of number values. Each value can be an integer or a floating-point number.</p>
     * @param value value to be set
     * @return Builder
     */

    public NumberSetAttributeBuilder value(final java.util.List<Double> value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>A set of number values. Each value can be an integer or a floating-point number.</p>
     * @param value value to be set
     * @return Builder
     */

    public NumberSetAttributeBuilder plusValue(final Double... value) {
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
     *  <p>A set of number values. Each value can be an integer or a floating-point number.</p>
     * @return value
     */

    public java.util.List<Double> getValue() {
        return this.value;
    }

    /**
     * builds NumberSetAttribute with checking for non-null required values
     * @return NumberSetAttribute
     */
    public NumberSetAttribute build() {
        Objects.requireNonNull(value, NumberSetAttribute.class + ": value is missing");
        return new NumberSetAttributeImpl(name, value);
    }

    /**
     * builds NumberSetAttribute without checking for non-null required values
     * @return NumberSetAttribute
     */
    public NumberSetAttribute buildUnchecked() {
        return new NumberSetAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of NumberSetAttributeBuilder
     * @return builder
     */
    public static NumberSetAttributeBuilder of() {
        return new NumberSetAttributeBuilder();
    }

    /**
     * create builder for NumberSetAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NumberSetAttributeBuilder of(final NumberSetAttribute template) {
        NumberSetAttributeBuilder builder = new NumberSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
