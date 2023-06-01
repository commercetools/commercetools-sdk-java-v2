package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLInternalConstraintViolatedError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLInternalConstraintViolatedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInternalConstraintViolatedError graphQLInternalConstraintViolatedError = GraphQLInternalConstraintViolatedError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLInternalConstraintViolatedErrorBuilder implements Builder<GraphQLInternalConstraintViolatedError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLInternalConstraintViolatedErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLInternalConstraintViolatedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
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
     * builds GraphQLInternalConstraintViolatedError with checking for non-null required values
     * @return GraphQLInternalConstraintViolatedError
     */
    public GraphQLInternalConstraintViolatedError build() {
        return new GraphQLInternalConstraintViolatedErrorImpl(values);
    }
    
    /**
     * builds GraphQLInternalConstraintViolatedError without checking for non-null required values
     * @return GraphQLInternalConstraintViolatedError
     */
    public GraphQLInternalConstraintViolatedError buildUnchecked() {
        return new GraphQLInternalConstraintViolatedErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLInternalConstraintViolatedErrorBuilder
     * @return builder 
     */
    public static GraphQLInternalConstraintViolatedErrorBuilder of() {
        return new GraphQLInternalConstraintViolatedErrorBuilder();
    }

    /**
     * create builder for GraphQLInternalConstraintViolatedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInternalConstraintViolatedErrorBuilder of(final GraphQLInternalConstraintViolatedError template) {
        GraphQLInternalConstraintViolatedErrorBuilder builder = new GraphQLInternalConstraintViolatedErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
