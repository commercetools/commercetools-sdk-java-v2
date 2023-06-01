package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.SyntaxErrorError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SyntaxErrorErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SyntaxErrorError syntaxErrorError = SyntaxErrorError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SyntaxErrorErrorBuilder implements Builder<SyntaxErrorError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    
    /**
     *  <p><code>"Syntax error while parsing $fieldDefinition."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public SyntaxErrorErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public SyntaxErrorErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public SyntaxErrorErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    

    /**
     *  <p><code>"Syntax error while parsing $fieldDefinition."</code></p>
     * @return message
     */
    
    
    public String getMessage(){
        return this.message;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */
    
    
    public Map<String, java.lang.Object> getValues(){
        return this.values;
    }

    /**
     * builds SyntaxErrorError with checking for non-null required values
     * @return SyntaxErrorError
     */
    public SyntaxErrorError build() {
        Objects.requireNonNull(message, SyntaxErrorError.class + ": message is missing");
        return new SyntaxErrorErrorImpl(message, values);
    }
    
    /**
     * builds SyntaxErrorError without checking for non-null required values
     * @return SyntaxErrorError
     */
    public SyntaxErrorError buildUnchecked() {
        return new SyntaxErrorErrorImpl(message, values);
    }

    /**
     * factory method for an instance of SyntaxErrorErrorBuilder
     * @return builder 
     */
    public static SyntaxErrorErrorBuilder of() {
        return new SyntaxErrorErrorBuilder();
    }

    /**
     * create builder for SyntaxErrorError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SyntaxErrorErrorBuilder of(final SyntaxErrorError template) {
        SyntaxErrorErrorBuilder builder = new SyntaxErrorErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
