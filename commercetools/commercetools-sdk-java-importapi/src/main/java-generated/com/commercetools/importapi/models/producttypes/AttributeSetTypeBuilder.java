
package com.commercetools.importapi.models.producttypes;

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

    private com.commercetools.importapi.models.producttypes.AttributeType elementType;

    /**
     *
     * @param elementType value to be set
     * @return Builder
     */

    public AttributeSetTypeBuilder elementType(
            final com.commercetools.importapi.models.producttypes.AttributeType elementType) {
        this.elementType = elementType;
        return this;
    }

    /**
     *
     * @param builder function to build the elementType value
     * @return Builder
     */

    public AttributeSetTypeBuilder elementType(
            Function<com.commercetools.importapi.models.producttypes.AttributeTypeBuilder, Builder<? extends com.commercetools.importapi.models.producttypes.AttributeType>> builder) {
        this.elementType = builder.apply(com.commercetools.importapi.models.producttypes.AttributeTypeBuilder.of())
                .build();
        return this;
    }

    public com.commercetools.importapi.models.producttypes.AttributeType getElementType() {
        return this.elementType;
    }

    /**
     * builds AttributeSetType with checking for non-null required values
     * @return AttributeSetType
     */
    public AttributeSetType build() {
        Objects.requireNonNull(elementType, AttributeSetType.class + ": elementType is missing");
        return new AttributeSetTypeImpl(elementType);
    }

    /**
     * builds AttributeSetType without checking for non-null required values
     * @return AttributeSetType
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
