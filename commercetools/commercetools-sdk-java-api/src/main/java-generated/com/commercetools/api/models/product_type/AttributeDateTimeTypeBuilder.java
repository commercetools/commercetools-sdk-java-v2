package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.AttributeDateTimeType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeDateTimeTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeDateTimeType attributeDateTimeType = AttributeDateTimeType.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeDateTimeTypeBuilder implements Builder<AttributeDateTimeType> {




    /**
     * builds AttributeDateTimeType with checking for non-null required values
     * @return AttributeDateTimeType
     */
    public AttributeDateTimeType build() {
        return new AttributeDateTimeTypeImpl();
    }
    
    /**
     * builds AttributeDateTimeType without checking for non-null required values
     * @return AttributeDateTimeType
     */
    public AttributeDateTimeType buildUnchecked() {
        return new AttributeDateTimeTypeImpl();
    }

    /**
     * factory method for an instance of AttributeDateTimeTypeBuilder
     * @return builder 
     */
    public static AttributeDateTimeTypeBuilder of() {
        return new AttributeDateTimeTypeBuilder();
    }

    /**
     * create builder for AttributeDateTimeType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeDateTimeTypeBuilder of(final AttributeDateTimeType template) {
        AttributeDateTimeTypeBuilder builder = new AttributeDateTimeTypeBuilder();
        return builder;
    }

}
