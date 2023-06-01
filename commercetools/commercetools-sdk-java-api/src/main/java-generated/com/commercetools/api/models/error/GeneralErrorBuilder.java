package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.GeneralError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GeneralErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GeneralError generalError = GeneralError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GeneralErrorBuilder implements Builder<GeneralError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    
    /**
     *  <p>Description about any known details of the problem, for example, <code>"Write operations are temporarily unavailable"</code>.</p>
     * @param message value to be set
     * @return Builder
     */
    
    public GeneralErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GeneralErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GeneralErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    

    /**
     *  <p>Description about any known details of the problem, for example, <code>"Write operations are temporarily unavailable"</code>.</p>
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
     * builds GeneralError with checking for non-null required values
     * @return GeneralError
     */
    public GeneralError build() {
        Objects.requireNonNull(message, GeneralError.class + ": message is missing");
        return new GeneralErrorImpl(message, values);
    }
    
    /**
     * builds GeneralError without checking for non-null required values
     * @return GeneralError
     */
    public GeneralError buildUnchecked() {
        return new GeneralErrorImpl(message, values);
    }

    /**
     * factory method for an instance of GeneralErrorBuilder
     * @return builder 
     */
    public static GeneralErrorBuilder of() {
        return new GeneralErrorBuilder();
    }

    /**
     * create builder for GeneralError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GeneralErrorBuilder of(final GeneralError template) {
        GeneralErrorBuilder builder = new GeneralErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
