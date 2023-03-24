
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldNumberTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldNumberType customFieldNumberType = CustomFieldNumberType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldNumberTypeBuilder implements Builder<CustomFieldNumberType> {

    /**
     * builds CustomFieldNumberType with checking for non-null required values
     * @return CustomFieldNumberType
     */
    public CustomFieldNumberType build() {
        return new CustomFieldNumberTypeImpl();
    }

    /**
     * builds CustomFieldNumberType without checking for non-null required values
     * @return CustomFieldNumberType
     */
    public CustomFieldNumberType buildUnchecked() {
        return new CustomFieldNumberTypeImpl();
    }

    public static CustomFieldNumberTypeBuilder of() {
        return new CustomFieldNumberTypeBuilder();
    }

    public static CustomFieldNumberTypeBuilder of(final CustomFieldNumberType template) {
        CustomFieldNumberTypeBuilder builder = new CustomFieldNumberTypeBuilder();
        return builder;
    }

}
