
package com.commercetools.importapi.models.producttypes;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   AttributeLocalizableTextType attributeLocalizableTextType = AttributeLocalizableTextType.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeLocalizableTextTypeBuilder implements Builder<AttributeLocalizableTextType> {

    public AttributeLocalizableTextType build() {
        return new AttributeLocalizableTextTypeImpl();
    }

    /**
     * builds AttributeLocalizableTextType without checking for non null required values
     */
    public AttributeLocalizableTextType buildUnchecked() {
        return new AttributeLocalizableTextTypeImpl();
    }

    public static AttributeLocalizableTextTypeBuilder of() {
        return new AttributeLocalizableTextTypeBuilder();
    }

    public static AttributeLocalizableTextTypeBuilder of(final AttributeLocalizableTextType template) {
        AttributeLocalizableTextTypeBuilder builder = new AttributeLocalizableTextTypeBuilder();
        return builder;
    }

}
