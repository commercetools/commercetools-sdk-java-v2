package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldMoneyType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldMoneyTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldMoneyType customFieldMoneyType = CustomFieldMoneyType.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomFieldMoneyTypeBuilder implements Builder<CustomFieldMoneyType> {




    /**
     * builds CustomFieldMoneyType with checking for non-null required values
     * @return CustomFieldMoneyType
     */
    public CustomFieldMoneyType build() {
        return new CustomFieldMoneyTypeImpl();
    }
    
    /**
     * builds CustomFieldMoneyType without checking for non-null required values
     * @return CustomFieldMoneyType
     */
    public CustomFieldMoneyType buildUnchecked() {
        return new CustomFieldMoneyTypeImpl();
    }

    /**
     * factory method for an instance of CustomFieldMoneyTypeBuilder
     * @return builder 
     */
    public static CustomFieldMoneyTypeBuilder of() {
        return new CustomFieldMoneyTypeBuilder();
    }

    /**
     * create builder for CustomFieldMoneyType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldMoneyTypeBuilder of(final CustomFieldMoneyType template) {
        CustomFieldMoneyTypeBuilder builder = new CustomFieldMoneyTypeBuilder();
        return builder;
    }

}
