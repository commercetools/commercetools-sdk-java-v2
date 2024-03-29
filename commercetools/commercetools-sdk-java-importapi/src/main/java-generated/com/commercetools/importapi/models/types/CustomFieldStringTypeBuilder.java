
package com.commercetools.importapi.models.types;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldStringTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldStringType customFieldStringType = CustomFieldStringType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldStringTypeBuilder implements Builder<CustomFieldStringType> {

    /**
     * builds CustomFieldStringType with checking for non-null required values
     * @return CustomFieldStringType
     */
    public CustomFieldStringType build() {
        return new CustomFieldStringTypeImpl();
    }

    /**
     * builds CustomFieldStringType without checking for non-null required values
     * @return CustomFieldStringType
     */
    public CustomFieldStringType buildUnchecked() {
        return new CustomFieldStringTypeImpl();
    }

    /**
     * factory method for an instance of CustomFieldStringTypeBuilder
     * @return builder
     */
    public static CustomFieldStringTypeBuilder of() {
        return new CustomFieldStringTypeBuilder();
    }

    /**
     * create builder for CustomFieldStringType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldStringTypeBuilder of(final CustomFieldStringType template) {
        CustomFieldStringTypeBuilder builder = new CustomFieldStringTypeBuilder();
        return builder;
    }

}
