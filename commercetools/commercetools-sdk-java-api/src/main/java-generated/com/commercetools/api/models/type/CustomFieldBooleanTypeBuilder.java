package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldBooleanType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldBooleanTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldBooleanType customFieldBooleanType = CustomFieldBooleanType.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomFieldBooleanTypeBuilder implements Builder<CustomFieldBooleanType> {




    /**
     * builds CustomFieldBooleanType with checking for non-null required values
     * @return CustomFieldBooleanType
     */
    public CustomFieldBooleanType build() {
        return new CustomFieldBooleanTypeImpl();
    }
    
    /**
     * builds CustomFieldBooleanType without checking for non-null required values
     * @return CustomFieldBooleanType
     */
    public CustomFieldBooleanType buildUnchecked() {
        return new CustomFieldBooleanTypeImpl();
    }

    /**
     * factory method for an instance of CustomFieldBooleanTypeBuilder
     * @return builder 
     */
    public static CustomFieldBooleanTypeBuilder of() {
        return new CustomFieldBooleanTypeBuilder();
    }

    /**
     * create builder for CustomFieldBooleanType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldBooleanTypeBuilder of(final CustomFieldBooleanType template) {
        CustomFieldBooleanTypeBuilder builder = new CustomFieldBooleanTypeBuilder();
        return builder;
    }

}
