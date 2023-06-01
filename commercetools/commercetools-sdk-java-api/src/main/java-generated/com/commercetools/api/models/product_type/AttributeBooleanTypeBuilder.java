package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.AttributeBooleanType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeBooleanTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeBooleanType attributeBooleanType = AttributeBooleanType.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeBooleanTypeBuilder implements Builder<AttributeBooleanType> {




    /**
     * builds AttributeBooleanType with checking for non-null required values
     * @return AttributeBooleanType
     */
    public AttributeBooleanType build() {
        return new AttributeBooleanTypeImpl();
    }
    
    /**
     * builds AttributeBooleanType without checking for non-null required values
     * @return AttributeBooleanType
     */
    public AttributeBooleanType buildUnchecked() {
        return new AttributeBooleanTypeImpl();
    }

    /**
     * factory method for an instance of AttributeBooleanTypeBuilder
     * @return builder 
     */
    public static AttributeBooleanTypeBuilder of() {
        return new AttributeBooleanTypeBuilder();
    }

    /**
     * create builder for AttributeBooleanType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeBooleanTypeBuilder of(final AttributeBooleanType template) {
        AttributeBooleanTypeBuilder builder = new AttributeBooleanTypeBuilder();
        return builder;
    }

}
