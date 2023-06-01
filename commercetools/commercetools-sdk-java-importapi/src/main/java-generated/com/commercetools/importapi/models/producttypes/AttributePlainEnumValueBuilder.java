package com.commercetools.importapi.models.producttypes;


import com.commercetools.importapi.models.producttypes.AttributePlainEnumValue;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributePlainEnumValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributePlainEnumValue attributePlainEnumValue = AttributePlainEnumValue.builder()
 *             .key("{key}")
 *             .label("{label}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributePlainEnumValueBuilder implements Builder<AttributePlainEnumValue> {

    
    
    private String key;
    
    
    
    private String label;

    
    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */
    
    public AttributePlainEnumValueBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    
    
    
    /**
     * set the value to the label
     * @param label value to be set
     * @return Builder
     */
    
    public AttributePlainEnumValueBuilder label( final String label) {
        this.label = label;
        return this;
    }
    
    

    /**
     * value of key}
     * @return key
     */
    
    
    public String getKey(){
        return this.key;
    }
    
    /**
     * value of label}
     * @return label
     */
    
    
    public String getLabel(){
        return this.label;
    }

    /**
     * builds AttributePlainEnumValue with checking for non-null required values
     * @return AttributePlainEnumValue
     */
    public AttributePlainEnumValue build() {
        Objects.requireNonNull(key, AttributePlainEnumValue.class + ": key is missing");
        Objects.requireNonNull(label, AttributePlainEnumValue.class + ": label is missing");
        return new AttributePlainEnumValueImpl(key, label);
    }
    
    /**
     * builds AttributePlainEnumValue without checking for non-null required values
     * @return AttributePlainEnumValue
     */
    public AttributePlainEnumValue buildUnchecked() {
        return new AttributePlainEnumValueImpl(key, label);
    }

    /**
     * factory method for an instance of AttributePlainEnumValueBuilder
     * @return builder 
     */
    public static AttributePlainEnumValueBuilder of() {
        return new AttributePlainEnumValueBuilder();
    }

    /**
     * create builder for AttributePlainEnumValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributePlainEnumValueBuilder of(final AttributePlainEnumValue template) {
        AttributePlainEnumValueBuilder builder = new AttributePlainEnumValueBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
