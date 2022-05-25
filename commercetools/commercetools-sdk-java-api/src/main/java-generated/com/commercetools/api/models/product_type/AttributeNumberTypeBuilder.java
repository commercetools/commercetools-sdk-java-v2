
package com.commercetools.api.models.product_type;

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

    public AttributeNumberType build() {
        return new AttributeNumberTypeImpl();
    }

    /**
     * builds AttributeNumberType without checking for non null required values
     */
    public AttributeNumberType buildUnchecked() {
        return new AttributeNumberTypeImpl();
    }

    public static AttributeNumberTypeBuilder of() {
        return new AttributeNumberTypeBuilder();
    }

    public static AttributeNumberTypeBuilder of(final AttributeNumberType template) {
        AttributeNumberTypeBuilder builder = new AttributeNumberTypeBuilder();
        return builder;
    }

}
