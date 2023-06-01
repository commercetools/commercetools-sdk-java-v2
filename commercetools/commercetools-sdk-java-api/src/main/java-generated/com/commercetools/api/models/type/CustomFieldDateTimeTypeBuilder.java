package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldDateTimeType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldDateTimeTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldDateTimeType customFieldDateTimeType = CustomFieldDateTimeType.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomFieldDateTimeTypeBuilder implements Builder<CustomFieldDateTimeType> {




    /**
     * builds CustomFieldDateTimeType with checking for non-null required values
     * @return CustomFieldDateTimeType
     */
    public CustomFieldDateTimeType build() {
        return new CustomFieldDateTimeTypeImpl();
    }
    
    /**
     * builds CustomFieldDateTimeType without checking for non-null required values
     * @return CustomFieldDateTimeType
     */
    public CustomFieldDateTimeType buildUnchecked() {
        return new CustomFieldDateTimeTypeImpl();
    }

    /**
     * factory method for an instance of CustomFieldDateTimeTypeBuilder
     * @return builder 
     */
    public static CustomFieldDateTimeTypeBuilder of() {
        return new CustomFieldDateTimeTypeBuilder();
    }

    /**
     * create builder for CustomFieldDateTimeType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldDateTimeTypeBuilder of(final CustomFieldDateTimeType template) {
        CustomFieldDateTimeTypeBuilder builder = new CustomFieldDateTimeTypeBuilder();
        return builder;
    }

}
