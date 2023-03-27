
package com.commercetools.importapi.models.producttypes;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeLocalizableTextTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeLocalizableTextType attributeLocalizableTextType = AttributeLocalizableTextType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeLocalizableTextTypeBuilder implements Builder<AttributeLocalizableTextType> {

    /**
     * builds AttributeLocalizableTextType with checking for non-null required values
     * @return AttributeLocalizableTextType
     */
    public AttributeLocalizableTextType build() {
        return new AttributeLocalizableTextTypeImpl();
    }

    /**
     * builds AttributeLocalizableTextType without checking for non-null required values
     * @return AttributeLocalizableTextType
     */
    public AttributeLocalizableTextType buildUnchecked() {
        return new AttributeLocalizableTextTypeImpl();
    }

    /**
     * factory method for an instance of AttributeLocalizableTextTypeBuilder
     * @return builder
     */
    public static AttributeLocalizableTextTypeBuilder of() {
        return new AttributeLocalizableTextTypeBuilder();
    }

    /**
     * create builder for AttributeLocalizableTextType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeLocalizableTextTypeBuilder of(final AttributeLocalizableTextType template) {
        AttributeLocalizableTextTypeBuilder builder = new AttributeLocalizableTextTypeBuilder();
        return builder;
    }

}
