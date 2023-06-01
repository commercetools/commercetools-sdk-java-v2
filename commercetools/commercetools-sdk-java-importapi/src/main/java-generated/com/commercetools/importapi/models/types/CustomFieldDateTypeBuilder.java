package com.commercetools.importapi.models.types;

import com.commercetools.importapi.models.types.FieldType;
import com.commercetools.importapi.models.types.CustomFieldDateType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldDateTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldDateType customFieldDateType = CustomFieldDateType.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomFieldDateTypeBuilder implements Builder<CustomFieldDateType> {




    /**
     * builds CustomFieldDateType with checking for non-null required values
     * @return CustomFieldDateType
     */
    public CustomFieldDateType build() {
        return new CustomFieldDateTypeImpl();
    }
    
    /**
     * builds CustomFieldDateType without checking for non-null required values
     * @return CustomFieldDateType
     */
    public CustomFieldDateType buildUnchecked() {
        return new CustomFieldDateTypeImpl();
    }

    /**
     * factory method for an instance of CustomFieldDateTypeBuilder
     * @return builder 
     */
    public static CustomFieldDateTypeBuilder of() {
        return new CustomFieldDateTypeBuilder();
    }

    /**
     * create builder for CustomFieldDateType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldDateTypeBuilder of(final CustomFieldDateType template) {
        CustomFieldDateTypeBuilder builder = new CustomFieldDateTypeBuilder();
        return builder;
    }

}
