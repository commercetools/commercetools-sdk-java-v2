
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
     */

    public AttributeNestedTypeBuilder typeReference(
            Function<com.commercetools.api.models.product_type.ProductTypeReferenceBuilder, com.commercetools.api.models.product_type.ProductTypeReferenceBuilder> builder) {
        this.typeReference = builder.apply(com.commercetools.api.models.product_type.ProductTypeReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Attributes that can be stored as nested Attributes of the current Attribute.</p>
     */

    public AttributeNestedTypeBuilder typeReference(
            final com.commercetools.api.models.product_type.ProductTypeReference typeReference) {
        this.typeReference = typeReference;
        return this;
    }

    public com.commercetools.api.models.product_type.ProductTypeReference getTypeReference() {
        return this.typeReference;
    }

    public AttributeNestedType build() {
        Objects.requireNonNull(typeReference, AttributeNestedType.class + ": typeReference is missing");
        return new AttributeNestedTypeImpl(typeReference);
    }

    /**
     * builds AttributeNestedType without checking for non null required values
     */
    public AttributeNestedType buildUnchecked() {
        return new AttributeNestedTypeImpl(typeReference);
    }

    public static AttributeNestedTypeBuilder of() {
        return new AttributeNestedTypeBuilder();
    }

    public static AttributeNestedTypeBuilder of(final AttributeNestedType template) {
        AttributeNestedTypeBuilder builder = new AttributeNestedTypeBuilder();
        builder.typeReference = template.getTypeReference();
        return builder;
    }

}
