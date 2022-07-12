
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeSetTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeSetType attributeSetType = AttributeSetType.builder()
 *             .elementType(elementTypeBuilder -> elementTypeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeSetTypeBuilder implements Builder<AttributeSetType> {

    private com.commercetools.api.models.product_type.AttributeType elementType;

    /**
     *  <p>Attribute type of the elements in the set.</p>
     */

    public AttributeSetTypeBuilder elementType(
            final com.commercetools.api.models.product_type.AttributeType elementType) {
        this.elementType = elementType;
        return this;
    }

    /**
     *  <p>Attribute type of the elements in the set.</p>
     */

    public AttributeSetTypeBuilder elementType(
            Function<com.commercetools.api.models.product_type.AttributeTypeBuilder, Builder<? extends com.commercetools.api.models.product_type.AttributeType>> builder) {
        this.elementType = builder.apply(com.commercetools.api.models.product_type.AttributeTypeBuilder.of()).build();
        return this;
    }

    public com.commercetools.api.models.product_type.AttributeType getElementType() {
        return this.elementType;
    }

    public AttributeSetType build() {
        Objects.requireNonNull(elementType, AttributeSetType.class + ": elementType is missing");
        return new AttributeSetTypeImpl(elementType);
    }

    /**
     * builds AttributeSetType without checking for non null required values
     */
    public AttributeSetType buildUnchecked() {
        return new AttributeSetTypeImpl(elementType);
    }

    public static AttributeSetTypeBuilder of() {
        return new AttributeSetTypeBuilder();
    }

    public static AttributeSetTypeBuilder of(final AttributeSetType template) {
        AttributeSetTypeBuilder builder = new AttributeSetTypeBuilder();
        builder.elementType = template.getElementType();
        return builder;
    }

}
