package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.BooleanAttribute;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BooleanAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BooleanAttribute booleanAttribute = BooleanAttribute.builder()
 *             .value(true)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BooleanAttributeBuilder implements Builder<BooleanAttribute> {

    
    @Nullable
    private String name;
    
    
    
    private Boolean value;

    
    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public BooleanAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */
    
    public BooleanAttributeBuilder value( final Boolean value) {
        this.value = value;
        return this;
    }
    
    

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @return name
     */
    
    @Nullable
    public String getName(){
        return this.name;
    }
    
    /**
     * value of value}
     * @return value
     */
    
    
    public Boolean getValue(){
        return this.value;
    }

    /**
     * builds BooleanAttribute with checking for non-null required values
     * @return BooleanAttribute
     */
    public BooleanAttribute build() {
        Objects.requireNonNull(value, BooleanAttribute.class + ": value is missing");
        return new BooleanAttributeImpl(name, value);
    }
    
    /**
     * builds BooleanAttribute without checking for non-null required values
     * @return BooleanAttribute
     */
    public BooleanAttribute buildUnchecked() {
        return new BooleanAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of BooleanAttributeBuilder
     * @return builder 
     */
    public static BooleanAttributeBuilder of() {
        return new BooleanAttributeBuilder();
    }

    /**
     * create builder for BooleanAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BooleanAttributeBuilder of(final BooleanAttribute template) {
        BooleanAttributeBuilder builder = new BooleanAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
