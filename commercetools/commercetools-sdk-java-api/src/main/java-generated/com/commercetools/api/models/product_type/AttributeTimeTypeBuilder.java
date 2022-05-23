
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   AttributeTimeType attributeTimeType = AttributeTimeType.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeTimeTypeBuilder implements Builder<AttributeTimeType> {

    public AttributeTimeType build() {
        return new AttributeTimeTypeImpl();
    }

    /**
     * builds AttributeTimeType without checking for non null required values
     */
    public AttributeTimeType buildUnchecked() {
        return new AttributeTimeTypeImpl();
    }

    public static AttributeTimeTypeBuilder of() {
        return new AttributeTimeTypeBuilder();
    }

    public static AttributeTimeTypeBuilder of(final AttributeTimeType template) {
        AttributeTimeTypeBuilder builder = new AttributeTimeTypeBuilder();
        return builder;
    }

}
