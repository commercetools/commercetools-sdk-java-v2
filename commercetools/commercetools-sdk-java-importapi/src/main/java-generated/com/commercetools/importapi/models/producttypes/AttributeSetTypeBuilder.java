
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
     * set the value to the elementType
     * @param elementType value to be set
     * @return Builder
     */

    public AttributeSetTypeBuilder elementType(
            final com.commercetools.importapi.models.producttypes.AttributeType elementType) {
        this.elementType = elementType;
        return this;
    }

    /**
     * set the value to the elementType using the builder function
     * @param builder function to build the elementType value
     * @return Builder
     */

    public AttributeSetTypeBuilder elementType(
            Function<com.commercetools.importapi.models.producttypes.AttributeTypeBuilder, Builder<? extends com.commercetools.importapi.models.producttypes.AttributeType>> builder) {
        this.elementType = builder.apply(com.commercetools.importapi.models.producttypes.AttributeTypeBuilder.of())
                .build();
        return this;
    }

    /**
     * value of elementType}
     * @return elementType
     */

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

    /**
     * factory method for an instance of AttributeSetTypeBuilder
     * @return builder
     */
    public static AttributeSetTypeBuilder of() {
        return new AttributeSetTypeBuilder();
    }

    /**
     * create builder for AttributeSetType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeSetTypeBuilder of(final AttributeSetType template) {
        AttributeSetTypeBuilder builder = new AttributeSetTypeBuilder();
        builder.elementType = template.getElementType();
        return builder;
    }

}
