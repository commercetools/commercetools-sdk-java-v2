package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldTimeType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldTimeTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldTimeType customFieldTimeType = CustomFieldTimeType.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomFieldTimeTypeBuilder implements Builder<CustomFieldTimeType> {




    /**
     * builds CustomFieldTimeType with checking for non-null required values
     * @return CustomFieldTimeType
     */
    public CustomFieldTimeType build() {
        return new CustomFieldTimeTypeImpl();
    }
    
    /**
     * builds CustomFieldTimeType without checking for non-null required values
     * @return CustomFieldTimeType
     */
    public CustomFieldTimeType buildUnchecked() {
        return new CustomFieldTimeTypeImpl();
    }

    /**
     * factory method for an instance of CustomFieldTimeTypeBuilder
     * @return builder 
     */
    public static CustomFieldTimeTypeBuilder of() {
        return new CustomFieldTimeTypeBuilder();
    }

    /**
     * create builder for CustomFieldTimeType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldTimeTypeBuilder of(final CustomFieldTimeType template) {
        CustomFieldTimeTypeBuilder builder = new CustomFieldTimeTypeBuilder();
        return builder;
    }

}
