package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldNumberType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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

    /**
     * factory method for an instance of CustomFieldNumberTypeBuilder
     * @return builder 
     */
    public static CustomFieldNumberTypeBuilder of() {
        return new CustomFieldNumberTypeBuilder();
    }

    /**
     * create builder for CustomFieldNumberType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldNumberTypeBuilder of(final CustomFieldNumberType template) {
        CustomFieldNumberTypeBuilder builder = new CustomFieldNumberTypeBuilder();
        return builder;
    }

}
