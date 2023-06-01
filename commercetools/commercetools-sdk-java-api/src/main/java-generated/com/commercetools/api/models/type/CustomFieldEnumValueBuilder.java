package com.commercetools.api.models.type;


import com.commercetools.api.models.type.CustomFieldEnumValue;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldEnumValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldEnumValue customFieldEnumValue = CustomFieldEnumValue.builder()
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
public class CustomFieldEnumValueBuilder implements Builder<CustomFieldEnumValue> {

    
    
    private String key;
    
    
    
    private String label;

    
    /**
     *  <p>Key of the value used as a programmatic identifier.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public CustomFieldEnumValueBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    
    
    
    /**
     *  <p>Descriptive label of the value.</p>
     * @param label value to be set
     * @return Builder
     */
    
    public CustomFieldEnumValueBuilder label( final String label) {
        this.label = label;
        return this;
    }
    
    

    /**
     *  <p>Key of the value used as a programmatic identifier.</p>
     * @return key
     */
    
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>Descriptive label of the value.</p>
     * @return label
     */
    
    
    public String getLabel(){
        return this.label;
    }

    /**
     * builds CustomFieldEnumValue with checking for non-null required values
     * @return CustomFieldEnumValue
     */
    public CustomFieldEnumValue build() {
        Objects.requireNonNull(key, CustomFieldEnumValue.class + ": key is missing");
        Objects.requireNonNull(label, CustomFieldEnumValue.class + ": label is missing");
        return new CustomFieldEnumValueImpl(key, label);
    }
    
    /**
     * builds CustomFieldEnumValue without checking for non-null required values
     * @return CustomFieldEnumValue
     */
    public CustomFieldEnumValue buildUnchecked() {
        return new CustomFieldEnumValueImpl(key, label);
    }

    /**
     * factory method for an instance of CustomFieldEnumValueBuilder
     * @return builder 
     */
    public static CustomFieldEnumValueBuilder of() {
        return new CustomFieldEnumValueBuilder();
    }

    /**
     * create builder for CustomFieldEnumValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldEnumValueBuilder of(final CustomFieldEnumValue template) {
        CustomFieldEnumValueBuilder builder = new CustomFieldEnumValueBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
