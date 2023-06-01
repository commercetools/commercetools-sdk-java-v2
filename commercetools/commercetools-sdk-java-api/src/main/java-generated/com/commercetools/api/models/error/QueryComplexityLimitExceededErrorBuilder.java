package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.QueryComplexityLimitExceededError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QueryComplexityLimitExceededErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QueryComplexityLimitExceededError queryComplexityLimitExceededError = QueryComplexityLimitExceededError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class QueryComplexityLimitExceededErrorBuilder implements Builder<QueryComplexityLimitExceededError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    
    /**
     * set the value to the message
     * @param message value to be set
     * @return Builder
     */
    
    public QueryComplexityLimitExceededErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public QueryComplexityLimitExceededErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public QueryComplexityLimitExceededErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    

    /**
     * value of message}
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
     * builds QueryComplexityLimitExceededError with checking for non-null required values
     * @return QueryComplexityLimitExceededError
     */
    public QueryComplexityLimitExceededError build() {
        Objects.requireNonNull(message, QueryComplexityLimitExceededError.class + ": message is missing");
        return new QueryComplexityLimitExceededErrorImpl(message, values);
    }
    
    /**
     * builds QueryComplexityLimitExceededError without checking for non-null required values
     * @return QueryComplexityLimitExceededError
     */
    public QueryComplexityLimitExceededError buildUnchecked() {
        return new QueryComplexityLimitExceededErrorImpl(message, values);
    }

    /**
     * factory method for an instance of QueryComplexityLimitExceededErrorBuilder
     * @return builder 
     */
    public static QueryComplexityLimitExceededErrorBuilder of() {
        return new QueryComplexityLimitExceededErrorBuilder();
    }

    /**
     * create builder for QueryComplexityLimitExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QueryComplexityLimitExceededErrorBuilder of(final QueryComplexityLimitExceededError template) {
        QueryComplexityLimitExceededErrorBuilder builder = new QueryComplexityLimitExceededErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
