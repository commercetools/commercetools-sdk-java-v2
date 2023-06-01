package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.InvalidJsonInputError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidJsonInputErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidJsonInputError invalidJsonInputError = InvalidJsonInputError.builder()
 *             .message("{message}")
 *             .detailedErrorMessage("{detailedErrorMessage}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class InvalidJsonInputErrorBuilder implements Builder<InvalidJsonInputError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private String detailedErrorMessage;

    
    /**
     *  <p><code>"Request body does not contain valid JSON."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public InvalidJsonInputErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public InvalidJsonInputErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public InvalidJsonInputErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>Further explanation about why the JSON is invalid.</p>
     * @param detailedErrorMessage value to be set
     * @return Builder
     */
    
    public InvalidJsonInputErrorBuilder detailedErrorMessage( final String detailedErrorMessage) {
        this.detailedErrorMessage = detailedErrorMessage;
        return this;
    }
    
    

    /**
     *  <p><code>"Request body does not contain valid JSON."</code></p>
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
     *  <p>Further explanation about why the JSON is invalid.</p>
     * @return detailedErrorMessage
     */
    
    
    public String getDetailedErrorMessage(){
        return this.detailedErrorMessage;
    }

    /**
     * builds InvalidJsonInputError with checking for non-null required values
     * @return InvalidJsonInputError
     */
    public InvalidJsonInputError build() {
        Objects.requireNonNull(message, InvalidJsonInputError.class + ": message is missing");
        Objects.requireNonNull(detailedErrorMessage, InvalidJsonInputError.class + ": detailedErrorMessage is missing");
        return new InvalidJsonInputErrorImpl(message, values, detailedErrorMessage);
    }
    
    /**
     * builds InvalidJsonInputError without checking for non-null required values
     * @return InvalidJsonInputError
     */
    public InvalidJsonInputError buildUnchecked() {
        return new InvalidJsonInputErrorImpl(message, values, detailedErrorMessage);
    }

    /**
     * factory method for an instance of InvalidJsonInputErrorBuilder
     * @return builder 
     */
    public static InvalidJsonInputErrorBuilder of() {
        return new InvalidJsonInputErrorBuilder();
    }

    /**
     * create builder for InvalidJsonInputError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidJsonInputErrorBuilder of(final InvalidJsonInputError template) {
        InvalidJsonInputErrorBuilder builder = new InvalidJsonInputErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.detailedErrorMessage = template.getDetailedErrorMessage();
        return builder;
    }

}
