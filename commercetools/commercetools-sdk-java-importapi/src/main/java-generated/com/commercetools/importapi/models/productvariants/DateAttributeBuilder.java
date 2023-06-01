package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import java.time.LocalDate;
import com.commercetools.importapi.models.productvariants.DateAttribute;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DateAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DateAttribute dateAttribute = DateAttribute.builder()
 *             .value(LocalDate.parse("2022-01-01"))
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DateAttributeBuilder implements Builder<DateAttribute> {

    
    @Nullable
    private String name;
    
    
    
    private java.time.LocalDate value;

    
    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public DateAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */
    
    public DateAttributeBuilder value( final java.time.LocalDate value) {
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
    
    
    public java.time.LocalDate getValue(){
        return this.value;
    }

    /**
     * builds DateAttribute with checking for non-null required values
     * @return DateAttribute
     */
    public DateAttribute build() {
        Objects.requireNonNull(value, DateAttribute.class + ": value is missing");
        return new DateAttributeImpl(name, value);
    }
    
    /**
     * builds DateAttribute without checking for non-null required values
     * @return DateAttribute
     */
    public DateAttribute buildUnchecked() {
        return new DateAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of DateAttributeBuilder
     * @return builder 
     */
    public static DateAttributeBuilder of() {
        return new DateAttributeBuilder();
    }

    /**
     * create builder for DateAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DateAttributeBuilder of(final DateAttribute template) {
        DateAttributeBuilder builder = new DateAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
