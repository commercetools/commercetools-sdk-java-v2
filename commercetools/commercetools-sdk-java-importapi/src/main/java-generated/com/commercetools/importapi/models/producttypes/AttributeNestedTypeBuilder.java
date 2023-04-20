
package com.commercetools.importapi.models.producttypes;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeNestedTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeNestedType attributeNestedType = AttributeNestedType.builder()
 *             .typeReference(typeReferenceBuilder -> typeReferenceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeNestedTypeBuilder implements Builder<AttributeNestedType> {

    private com.commercetools.importapi.models.common.ProductTypeKeyReference typeReference;

    /**
     *  <p>References a product type by key.</p>
     * @param builder function to build the typeReference value
     * @return Builder
     */

    public AttributeNestedTypeBuilder typeReference(
            Function<com.commercetools.importapi.models.common.ProductTypeKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductTypeKeyReferenceBuilder> builder) {
        this.typeReference = builder
                .apply(com.commercetools.importapi.models.common.ProductTypeKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>References a product type by key.</p>
     * @param builder function to build the typeReference value
     * @return Builder
     */

    public AttributeNestedTypeBuilder withTypeReference(
            Function<com.commercetools.importapi.models.common.ProductTypeKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductTypeKeyReference> builder) {
        this.typeReference = builder
                .apply(com.commercetools.importapi.models.common.ProductTypeKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>References a product type by key.</p>
     * @param typeReference value to be set
     * @return Builder
     */

    public AttributeNestedTypeBuilder typeReference(
            final com.commercetools.importapi.models.common.ProductTypeKeyReference typeReference) {
        this.typeReference = typeReference;
        return this;
    }

    /**
     *  <p>References a product type by key.</p>
     * @return typeReference
     */

    public com.commercetools.importapi.models.common.ProductTypeKeyReference getTypeReference() {
        return this.typeReference;
    }

    /**
     * builds AttributeNestedType with checking for non-null required values
     * @return AttributeNestedType
     */
    public AttributeNestedType build() {
        Objects.requireNonNull(typeReference, AttributeNestedType.class + ": typeReference is missing");
        return new AttributeNestedTypeImpl(typeReference);
    }

    /**
     * builds AttributeNestedType without checking for non-null required values
     * @return AttributeNestedType
     */
    public AttributeNestedType buildUnchecked() {
        return new AttributeNestedTypeImpl(typeReference);
    }

    /**
     * factory method for an instance of AttributeNestedTypeBuilder
     * @return builder
     */
    public static AttributeNestedTypeBuilder of() {
        return new AttributeNestedTypeBuilder();
    }

    /**
     * create builder for AttributeNestedType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeNestedTypeBuilder of(final AttributeNestedType template) {
        AttributeNestedTypeBuilder builder = new AttributeNestedTypeBuilder();
        builder.typeReference = template.getTypeReference();
        return builder;
    }

}
