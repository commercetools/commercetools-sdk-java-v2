
package com.commercetools.api.models.product_type;

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

    private com.commercetools.api.models.product_type.ProductTypeReference typeReference;

    /**
     *  <p>Attributes that can be stored as nested Attributes of the current Attribute.</p>
     * @param builder function to build the typeReference value
     * @return Builder
     */

    public AttributeNestedTypeBuilder typeReference(
            Function<com.commercetools.api.models.product_type.ProductTypeReferenceBuilder, com.commercetools.api.models.product_type.ProductTypeReferenceBuilder> builder) {
        this.typeReference = builder.apply(com.commercetools.api.models.product_type.ProductTypeReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Attributes that can be stored as nested Attributes of the current Attribute.</p>
     * @param builder function to build the typeReference value
     * @return Builder
     */

    public AttributeNestedTypeBuilder withTypeReference(
            Function<com.commercetools.api.models.product_type.ProductTypeReferenceBuilder, com.commercetools.api.models.product_type.ProductTypeReference> builder) {
        this.typeReference = builder.apply(com.commercetools.api.models.product_type.ProductTypeReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Attributes that can be stored as nested Attributes of the current Attribute.</p>
     * @param typeReference value to be set
     * @return Builder
     */

    public AttributeNestedTypeBuilder typeReference(
            final com.commercetools.api.models.product_type.ProductTypeReference typeReference) {
        this.typeReference = typeReference;
        return this;
    }

    /**
     *  <p>Attributes that can be stored as nested Attributes of the current Attribute.</p>
     * @return typeReference
     */

    public com.commercetools.api.models.product_type.ProductTypeReference getTypeReference() {
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
