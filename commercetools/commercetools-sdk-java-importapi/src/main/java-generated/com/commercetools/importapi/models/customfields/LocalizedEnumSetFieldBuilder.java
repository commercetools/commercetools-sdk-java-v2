package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.LocalizedEnumSetField;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LocalizedEnumSetFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizedEnumSetField localizedEnumSetField = LocalizedEnumSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class LocalizedEnumSetFieldBuilder implements Builder<LocalizedEnumSetField> {

    
    
    private java.util.List<String> value;

    /**
     * set values to the value
     * @param value value to be set
     * @return Builder
     */
    
    public LocalizedEnumSetFieldBuilder value( final String ...value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }
    
    /**
     * set value to the value
     * @param value value to be set
     * @return Builder
     */
    
    public LocalizedEnumSetFieldBuilder value( final java.util.List<String> value) {
        this.value = value;
        return this;
    }
    
    /**
     * add values to the value
     * @param value value to be set
     * @return Builder
     */
    
    public LocalizedEnumSetFieldBuilder plusValue( final String ...value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }
    
    
    

    /**
     * value of value}
     * @return value
     */
    
    
    public java.util.List<String> getValue(){
        return this.value;
    }

    /**
     * builds LocalizedEnumSetField with checking for non-null required values
     * @return LocalizedEnumSetField
     */
    public LocalizedEnumSetField build() {
        Objects.requireNonNull(value, LocalizedEnumSetField.class + ": value is missing");
        return new LocalizedEnumSetFieldImpl(value);
    }
    
    /**
     * builds LocalizedEnumSetField without checking for non-null required values
     * @return LocalizedEnumSetField
     */
    public LocalizedEnumSetField buildUnchecked() {
        return new LocalizedEnumSetFieldImpl(value);
    }

    /**
     * factory method for an instance of LocalizedEnumSetFieldBuilder
     * @return builder 
     */
    public static LocalizedEnumSetFieldBuilder of() {
        return new LocalizedEnumSetFieldBuilder();
    }

    /**
     * create builder for LocalizedEnumSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizedEnumSetFieldBuilder of(final LocalizedEnumSetField template) {
        LocalizedEnumSetFieldBuilder builder = new LocalizedEnumSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
