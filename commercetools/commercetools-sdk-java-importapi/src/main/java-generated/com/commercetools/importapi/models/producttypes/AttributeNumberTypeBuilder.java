
package com.commercetools.importapi.models.producttypes;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeNumberTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeNumberType attributeNumberType = AttributeNumberType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeNumberTypeBuilder implements Builder<AttributeNumberType> {

    /**
     * builds AttributeNumberType with checking for non-null required values
     * @return AttributeNumberType
     */
    public AttributeNumberType build() {
        return new AttributeNumberTypeImpl();
    }

    /**
     * builds AttributeNumberType without checking for non-null required values
     * @return AttributeNumberType
     */
    public AttributeNumberType buildUnchecked() {
        return new AttributeNumberTypeImpl();
    }

    /**
     * factory method for an instance of AttributeNumberTypeBuilder
     * @return builder
     */
    public static AttributeNumberTypeBuilder of() {
        return new AttributeNumberTypeBuilder();
    }

    /**
     * create builder for AttributeNumberType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeNumberTypeBuilder of(final AttributeNumberType template) {
        AttributeNumberTypeBuilder builder = new AttributeNumberTypeBuilder();
        return builder;
    }

}
