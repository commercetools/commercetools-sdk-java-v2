
package com.commercetools.importapi.models.productvariants;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReferenceAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReferenceAttribute referenceAttribute = ReferenceAttribute.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReferenceAttributeBuilder implements Builder<ReferenceAttribute> {

    @Nullable
    private String name;

    private com.commercetools.importapi.models.common.KeyReference value;

    /**
     *  <p>Required if used for ProductVariantImport. Must not be set if used for ProductVariantPatch.</p>
     *  <p>Must match <code>name</code> of an AttributeDefinition of the Product Type.</p>
     * @param name value to be set
     * @return Builder
     */

    public ReferenceAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>References a resource by key.</p>
     * @param value value to be set
     * @return Builder
     */

    public ReferenceAttributeBuilder value(final com.commercetools.importapi.models.common.KeyReference value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>References a resource by key.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public ReferenceAttributeBuilder value(
            Function<com.commercetools.importapi.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.importapi.models.common.KeyReference>> builder) {
        this.value = builder.apply(com.commercetools.importapi.models.common.KeyReferenceBuilder.of()).build();
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
     *  <p>References a resource by key.</p>
     * @return value
     */

    public com.commercetools.importapi.models.common.KeyReference getValue() {
        return this.value;
    }

    /**
     * builds ReferenceAttribute with checking for non-null required values
     * @return ReferenceAttribute
     */
    public ReferenceAttribute build() {
        Objects.requireNonNull(value, ReferenceAttribute.class + ": value is missing");
        return new ReferenceAttributeImpl(name, value);
    }

    /**
     * builds ReferenceAttribute without checking for non-null required values
     * @return ReferenceAttribute
     */
    public ReferenceAttribute buildUnchecked() {
        return new ReferenceAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of ReferenceAttributeBuilder
     * @return builder
     */
    public static ReferenceAttributeBuilder of() {
        return new ReferenceAttributeBuilder();
    }

    /**
     * create builder for ReferenceAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReferenceAttributeBuilder of(final ReferenceAttribute template) {
        ReferenceAttributeBuilder builder = new ReferenceAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
