package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import java.time.LocalTime;
import com.commercetools.importapi.models.productvariants.TimeAttribute;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TimeAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TimeAttribute timeAttribute = TimeAttribute.builder()
 *             .value(LocalTime.parse("12:00:00.301"))
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TimeAttributeBuilder implements Builder<TimeAttribute> {

    
    @Nullable
    private String name;
    
    
    
    private java.time.LocalTime value;

    
    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public TimeAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */
    
    public TimeAttributeBuilder value( final java.time.LocalTime value) {
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
    
    
    public java.time.LocalTime getValue(){
        return this.value;
    }

    /**
     * builds TimeAttribute with checking for non-null required values
     * @return TimeAttribute
     */
    public TimeAttribute build() {
        Objects.requireNonNull(value, TimeAttribute.class + ": value is missing");
        return new TimeAttributeImpl(name, value);
    }
    
    /**
     * builds TimeAttribute without checking for non-null required values
     * @return TimeAttribute
     */
    public TimeAttribute buildUnchecked() {
        return new TimeAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of TimeAttributeBuilder
     * @return builder 
     */
    public static TimeAttributeBuilder of() {
        return new TimeAttributeBuilder();
    }

    /**
     * create builder for TimeAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TimeAttributeBuilder of(final TimeAttribute template) {
        TimeAttributeBuilder builder = new TimeAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
