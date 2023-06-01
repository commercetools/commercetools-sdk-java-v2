package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.StringField;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StringFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StringField stringField = StringField.builder()
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StringFieldBuilder implements Builder<StringField> {

    
    
    private String value;

    
    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */
    
    public StringFieldBuilder value( final String value) {
        this.value = value;
        return this;
    }
    
    

    /**
     * value of value}
     * @return value
     */
    
    
    public String getValue(){
        return this.value;
    }

    /**
     * builds StringField with checking for non-null required values
     * @return StringField
     */
    public StringField build() {
        Objects.requireNonNull(value, StringField.class + ": value is missing");
        return new StringFieldImpl(value);
    }
    
    /**
     * builds StringField without checking for non-null required values
     * @return StringField
     */
    public StringField buildUnchecked() {
        return new StringFieldImpl(value);
    }

    /**
     * factory method for an instance of StringFieldBuilder
     * @return builder 
     */
    public static StringFieldBuilder of() {
        return new StringFieldBuilder();
    }

    /**
     * create builder for StringField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StringFieldBuilder of(final StringField template) {
        StringFieldBuilder builder = new StringFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
