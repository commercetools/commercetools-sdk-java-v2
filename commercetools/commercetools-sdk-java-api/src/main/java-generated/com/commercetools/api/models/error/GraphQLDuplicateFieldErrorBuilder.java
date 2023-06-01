package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import java.lang.Object;
import com.commercetools.api.models.error.GraphQLDuplicateFieldError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLDuplicateFieldErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDuplicateFieldError graphQLDuplicateFieldError = GraphQLDuplicateFieldError.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLDuplicateFieldErrorBuilder implements Builder<GraphQLDuplicateFieldError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private String field;
    
    
    
    private java.lang.Object duplicateValue;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLDuplicateFieldErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLDuplicateFieldErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>Name of the conflicting field.</p>
     * @param field value to be set
     * @return Builder
     */
    
    public GraphQLDuplicateFieldErrorBuilder field( final String field) {
        this.field = field;
        return this;
    }
    
    
    
    
    /**
     *  <p>Conflicting duplicate value.</p>
     * @param duplicateValue value to be set
     * @return Builder
     */
    
    public GraphQLDuplicateFieldErrorBuilder duplicateValue( final java.lang.Object duplicateValue) {
        this.duplicateValue = duplicateValue;
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
     *  <p>Name of the conflicting field.</p>
     * @return field
     */
    
    
    public String getField(){
        return this.field;
    }
    
    /**
     *  <p>Conflicting duplicate value.</p>
     * @return duplicateValue
     */
    
    
    public java.lang.Object getDuplicateValue(){
        return this.duplicateValue;
    }

    /**
     * builds GraphQLDuplicateFieldError with checking for non-null required values
     * @return GraphQLDuplicateFieldError
     */
    public GraphQLDuplicateFieldError build() {
        Objects.requireNonNull(field, GraphQLDuplicateFieldError.class + ": field is missing");
        Objects.requireNonNull(duplicateValue, GraphQLDuplicateFieldError.class + ": duplicateValue is missing");
        return new GraphQLDuplicateFieldErrorImpl(values, field, duplicateValue);
    }
    
    /**
     * builds GraphQLDuplicateFieldError without checking for non-null required values
     * @return GraphQLDuplicateFieldError
     */
    public GraphQLDuplicateFieldError buildUnchecked() {
        return new GraphQLDuplicateFieldErrorImpl(values, field, duplicateValue);
    }

    /**
     * factory method for an instance of GraphQLDuplicateFieldErrorBuilder
     * @return builder 
     */
    public static GraphQLDuplicateFieldErrorBuilder of() {
        return new GraphQLDuplicateFieldErrorBuilder();
    }

    /**
     * create builder for GraphQLDuplicateFieldError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDuplicateFieldErrorBuilder of(final GraphQLDuplicateFieldError template) {
        GraphQLDuplicateFieldErrorBuilder builder = new GraphQLDuplicateFieldErrorBuilder();
        builder.values = template.values();
        builder.field = template.getField();
        builder.duplicateValue = template.getDuplicateValue();
        return builder;
    }

}
