
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeTextTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeTextType attributeTextType = AttributeTextType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeTextTypeBuilder implements Builder<AttributeTextType> {

    public AttributeTextType build() {
        return new AttributeTextTypeImpl();
    }

    /**
     * builds AttributeTextType without checking for non null required values
     */
    public AttributeTextType buildUnchecked() {
        return new AttributeTextTypeImpl();
    }

    public static AttributeTextTypeBuilder of() {
        return new AttributeTextTypeBuilder();
    }

    public static AttributeTextTypeBuilder of(final AttributeTextType template) {
        AttributeTextTypeBuilder builder = new AttributeTextTypeBuilder();
        return builder;
    }

}
