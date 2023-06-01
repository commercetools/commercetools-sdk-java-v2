package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorByExtension;
import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.ExtensionPredicateEvaluationFailedError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionPredicateEvaluationFailedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionPredicateEvaluationFailedError extensionPredicateEvaluationFailedError = ExtensionPredicateEvaluationFailedError.builder()
 *             .message("{message}")
 *             .errorByExtension(errorByExtensionBuilder -> errorByExtensionBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ExtensionPredicateEvaluationFailedErrorBuilder implements Builder<ExtensionPredicateEvaluationFailedError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private com.commercetools.api.models.error.ErrorByExtension errorByExtension;

    
    /**
     *  <p><code>"The compared field $fieldName is not present."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public ExtensionPredicateEvaluationFailedErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public ExtensionPredicateEvaluationFailedErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public ExtensionPredicateEvaluationFailedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>Details about the API Extension that was involved in the error.</p>
     * @param builder function to build the errorByExtension value
     * @return Builder
     */
    
    public ExtensionPredicateEvaluationFailedErrorBuilder errorByExtension(Function<com.commercetools.api.models.error.ErrorByExtensionBuilder, com.commercetools.api.models.error.ErrorByExtensionBuilder> builder) {
        this.errorByExtension = builder.apply(com.commercetools.api.models.error.ErrorByExtensionBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Details about the API Extension that was involved in the error.</p>
     * @param builder function to build the errorByExtension value
     * @return Builder
     */
    
    public ExtensionPredicateEvaluationFailedErrorBuilder withErrorByExtension(Function<com.commercetools.api.models.error.ErrorByExtensionBuilder, com.commercetools.api.models.error.ErrorByExtension> builder) {
        this.errorByExtension = builder.apply(com.commercetools.api.models.error.ErrorByExtensionBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Details about the API Extension that was involved in the error.</p>
     * @param errorByExtension value to be set
     * @return Builder
     */
    
    public ExtensionPredicateEvaluationFailedErrorBuilder errorByExtension( final com.commercetools.api.models.error.ErrorByExtension errorByExtension) {
        this.errorByExtension = errorByExtension;
        return this;
    }
    
    

    /**
     *  <p><code>"The compared field $fieldName is not present."</code></p>
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
     *  <p>Details about the API Extension that was involved in the error.</p>
     * @return errorByExtension
     */
    
    
    public com.commercetools.api.models.error.ErrorByExtension getErrorByExtension(){
        return this.errorByExtension;
    }

    /**
     * builds ExtensionPredicateEvaluationFailedError with checking for non-null required values
     * @return ExtensionPredicateEvaluationFailedError
     */
    public ExtensionPredicateEvaluationFailedError build() {
        Objects.requireNonNull(message, ExtensionPredicateEvaluationFailedError.class + ": message is missing");
        Objects.requireNonNull(errorByExtension, ExtensionPredicateEvaluationFailedError.class + ": errorByExtension is missing");
        return new ExtensionPredicateEvaluationFailedErrorImpl(message, values, errorByExtension);
    }
    
    /**
     * builds ExtensionPredicateEvaluationFailedError without checking for non-null required values
     * @return ExtensionPredicateEvaluationFailedError
     */
    public ExtensionPredicateEvaluationFailedError buildUnchecked() {
        return new ExtensionPredicateEvaluationFailedErrorImpl(message, values, errorByExtension);
    }

    /**
     * factory method for an instance of ExtensionPredicateEvaluationFailedErrorBuilder
     * @return builder 
     */
    public static ExtensionPredicateEvaluationFailedErrorBuilder of() {
        return new ExtensionPredicateEvaluationFailedErrorBuilder();
    }

    /**
     * create builder for ExtensionPredicateEvaluationFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionPredicateEvaluationFailedErrorBuilder of(final ExtensionPredicateEvaluationFailedError template) {
        ExtensionPredicateEvaluationFailedErrorBuilder builder = new ExtensionPredicateEvaluationFailedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.errorByExtension = template.getErrorByExtension();
        return builder;
    }

}
