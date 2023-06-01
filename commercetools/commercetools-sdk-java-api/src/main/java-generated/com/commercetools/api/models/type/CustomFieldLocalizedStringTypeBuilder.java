package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldLocalizedStringType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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

    /**
     * factory method for an instance of CustomFieldLocalizedStringTypeBuilder
     * @return builder 
     */
    public static CustomFieldLocalizedStringTypeBuilder of() {
        return new CustomFieldLocalizedStringTypeBuilder();
    }

    /**
     * create builder for CustomFieldLocalizedStringType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldLocalizedStringTypeBuilder of(final CustomFieldLocalizedStringType template) {
        CustomFieldLocalizedStringTypeBuilder builder = new CustomFieldLocalizedStringTypeBuilder();
        return builder;
    }

}
