
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeBooleanTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeBooleanType attributeBooleanType = AttributeBooleanType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeBooleanTypeBuilder implements Builder<AttributeBooleanType> {

    public AttributeBooleanType build() {
        return new AttributeBooleanTypeImpl();
    }

    /**
     * builds AttributeBooleanType without checking for non null required values
     */
    public AttributeBooleanType buildUnchecked() {
        return new AttributeBooleanTypeImpl();
    }

    public static AttributeBooleanTypeBuilder of() {
        return new AttributeBooleanTypeBuilder();
    }

    public static AttributeBooleanTypeBuilder of(final AttributeBooleanType template) {
        AttributeBooleanTypeBuilder builder = new AttributeBooleanTypeBuilder();
        return builder;
    }

}
