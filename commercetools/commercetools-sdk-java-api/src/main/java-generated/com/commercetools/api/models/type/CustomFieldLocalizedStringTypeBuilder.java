
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldLocalizedStringTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldLocalizedStringType customFieldLocalizedStringType = CustomFieldLocalizedStringType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldLocalizedStringTypeBuilder implements Builder<CustomFieldLocalizedStringType> {

    /**
     * builds CustomFieldLocalizedStringType with checking for non-null required values
     * @return CustomFieldLocalizedStringType
     */
    public CustomFieldLocalizedStringType build() {
        return new CustomFieldLocalizedStringTypeImpl();
    }

    /**
     * builds CustomFieldLocalizedStringType without checking for non-null required values
     * @return CustomFieldLocalizedStringType
     */
    public CustomFieldLocalizedStringType buildUnchecked() {
        return new CustomFieldLocalizedStringTypeImpl();
    }

    public static CustomFieldLocalizedStringTypeBuilder of() {
        return new CustomFieldLocalizedStringTypeBuilder();
    }

    public static CustomFieldLocalizedStringTypeBuilder of(final CustomFieldLocalizedStringType template) {
        CustomFieldLocalizedStringTypeBuilder builder = new CustomFieldLocalizedStringTypeBuilder();
        return builder;
    }

}
