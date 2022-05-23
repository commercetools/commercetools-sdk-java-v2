
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CustomFieldBooleanType customFieldBooleanType = CustomFieldBooleanType.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldBooleanTypeBuilder implements Builder<CustomFieldBooleanType> {

    public CustomFieldBooleanType build() {
        return new CustomFieldBooleanTypeImpl();
    }

    /**
     * builds CustomFieldBooleanType without checking for non null required values
     */
    public CustomFieldBooleanType buildUnchecked() {
        return new CustomFieldBooleanTypeImpl();
    }

    public static CustomFieldBooleanTypeBuilder of() {
        return new CustomFieldBooleanTypeBuilder();
    }

    public static CustomFieldBooleanTypeBuilder of(final CustomFieldBooleanType template) {
        CustomFieldBooleanTypeBuilder builder = new CustomFieldBooleanTypeBuilder();
        return builder;
    }

}
