package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLRequiredFieldError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLRequiredFieldErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLRequiredFieldError graphQLRequiredFieldError = GraphQLRequiredFieldError.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLRequiredFieldErrorBuilder implements Builder<GraphQLRequiredFieldError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private String field;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLRequiredFieldErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLRequiredFieldErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>Name of the field missing the value.</p>
     * @param field value to be set
     * @return Builder
     */
    
    public GraphQLRequiredFieldErrorBuilder field( final String field) {
        this.field = field;
        return this;
    }
    
    

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */
    
    
    public Map<String, java.lang.Object> getValues(){
        return this.values;
    }
    
    /**
     *  <p>Name of the field missing the value.</p>
     * @return field
     */
    
    
    public String getField(){
        return this.field;
    }

    /**
     * builds GraphQLRequiredFieldError with checking for non-null required values
     * @return GraphQLRequiredFieldError
     */
    public GraphQLRequiredFieldError build() {
        Objects.requireNonNull(field, GraphQLRequiredFieldError.class + ": field is missing");
        return new GraphQLRequiredFieldErrorImpl(values, field);
    }
    
    /**
     * builds GraphQLRequiredFieldError without checking for non-null required values
     * @return GraphQLRequiredFieldError
     */
    public GraphQLRequiredFieldError buildUnchecked() {
        return new GraphQLRequiredFieldErrorImpl(values, field);
    }

    /**
     * factory method for an instance of GraphQLRequiredFieldErrorBuilder
     * @return builder 
     */
    public static GraphQLRequiredFieldErrorBuilder of() {
        return new GraphQLRequiredFieldErrorBuilder();
    }

    /**
     * create builder for GraphQLRequiredFieldError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLRequiredFieldErrorBuilder of(final GraphQLRequiredFieldError template) {
        GraphQLRequiredFieldErrorBuilder builder = new GraphQLRequiredFieldErrorBuilder();
        builder.values = template.values();
        builder.field = template.getField();
        return builder;
    }

}
