package com.commercetools.history.models.common;


import com.commercetools.history.models.common.AttributeType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeType attributeType = AttributeType.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeTypeBuilder implements Builder<AttributeType> {

    
    
    private String name;

    
    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */
    
    public AttributeTypeBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    

    /**
     * value of name}
     * @return name
     */
    
    
    public String getName(){
        return this.name;
    }

    /**
     * builds AttributeType with checking for non-null required values
     * @return AttributeType
     */
    public AttributeType build() {
        Objects.requireNonNull(name, AttributeType.class + ": name is missing");
        return new AttributeTypeImpl(name);
    }
    
    /**
     * builds AttributeType without checking for non-null required values
     * @return AttributeType
     */
    public AttributeType buildUnchecked() {
        return new AttributeTypeImpl(name);
    }

    /**
     * factory method for an instance of AttributeTypeBuilder
     * @return builder 
     */
    public static AttributeTypeBuilder of() {
        return new AttributeTypeBuilder();
    }

    /**
     * create builder for AttributeType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeTypeBuilder of(final AttributeType template) {
        AttributeTypeBuilder builder = new AttributeTypeBuilder();
        builder.name = template.getName();
        return builder;
    }

}
