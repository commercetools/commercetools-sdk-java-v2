
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CustomFieldDateTimeType customFieldDateTimeType = CustomFieldDateTimeType.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldDateTimeTypeBuilder implements Builder<CustomFieldDateTimeType> {

    public CustomFieldDateTimeType build() {
        return new CustomFieldDateTimeTypeImpl();
    }

    /**
     * builds CustomFieldDateTimeType without checking for non null required values
     */
    public CustomFieldDateTimeType buildUnchecked() {
        return new CustomFieldDateTimeTypeImpl();
    }

    public static CustomFieldDateTimeTypeBuilder of() {
        return new CustomFieldDateTimeTypeBuilder();
    }

    public static CustomFieldDateTimeTypeBuilder of(final CustomFieldDateTimeType template) {
        CustomFieldDateTimeTypeBuilder builder = new CustomFieldDateTimeTypeBuilder();
        return builder;
    }

}
