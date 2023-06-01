package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.AttributeTimeType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeTimeTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeTimeType attributeTimeType = AttributeTimeType.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeTimeTypeBuilder implements Builder<AttributeTimeType> {




    /**
     * builds AttributeTimeType with checking for non-null required values
     * @return AttributeTimeType
     */
    public AttributeTimeType build() {
        return new AttributeTimeTypeImpl();
    }
    
    /**
     * builds AttributeTimeType without checking for non-null required values
     * @return AttributeTimeType
     */
    public AttributeTimeType buildUnchecked() {
        return new AttributeTimeTypeImpl();
    }

    /**
     * factory method for an instance of AttributeTimeTypeBuilder
     * @return builder 
     */
    public static AttributeTimeTypeBuilder of() {
        return new AttributeTimeTypeBuilder();
    }

    /**
     * create builder for AttributeTimeType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeTimeTypeBuilder of(final AttributeTimeType template) {
        AttributeTimeTypeBuilder builder = new AttributeTimeTypeBuilder();
        return builder;
    }

}
