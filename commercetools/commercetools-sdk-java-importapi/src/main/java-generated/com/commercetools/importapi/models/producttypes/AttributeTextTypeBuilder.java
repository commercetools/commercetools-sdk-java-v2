package com.commercetools.importapi.models.producttypes;

import com.commercetools.importapi.models.producttypes.AttributeType;
import com.commercetools.importapi.models.producttypes.AttributeTextType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeTextTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeTextType attributeTextType = AttributeTextType.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeTextTypeBuilder implements Builder<AttributeTextType> {




    /**
     * builds AttributeTextType with checking for non-null required values
     * @return AttributeTextType
     */
    public AttributeTextType build() {
        return new AttributeTextTypeImpl();
    }
    
    /**
     * builds AttributeTextType without checking for non-null required values
     * @return AttributeTextType
     */
    public AttributeTextType buildUnchecked() {
        return new AttributeTextTypeImpl();
    }

    /**
     * factory method for an instance of AttributeTextTypeBuilder
     * @return builder 
     */
    public static AttributeTextTypeBuilder of() {
        return new AttributeTextTypeBuilder();
    }

    /**
     * create builder for AttributeTextType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeTextTypeBuilder of(final AttributeTextType template) {
        AttributeTextTypeBuilder builder = new AttributeTextTypeBuilder();
        return builder;
    }

}
