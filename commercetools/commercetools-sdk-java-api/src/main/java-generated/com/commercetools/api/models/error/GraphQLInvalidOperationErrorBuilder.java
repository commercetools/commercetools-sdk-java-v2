package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLInvalidOperationError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLInvalidOperationErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInvalidOperationError graphQLInvalidOperationError = GraphQLInvalidOperationError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLInvalidOperationErrorBuilder implements Builder<GraphQLInvalidOperationError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLInvalidOperationErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLInvalidOperationErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLInvalidOperationError with checking for non-null required values
     * @return GraphQLInvalidOperationError
     */
    public GraphQLInvalidOperationError build() {
        return new GraphQLInvalidOperationErrorImpl(values);
    }
    
    /**
     * builds GraphQLInvalidOperationError without checking for non-null required values
     * @return GraphQLInvalidOperationError
     */
    public GraphQLInvalidOperationError buildUnchecked() {
        return new GraphQLInvalidOperationErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLInvalidOperationErrorBuilder
     * @return builder 
     */
    public static GraphQLInvalidOperationErrorBuilder of() {
        return new GraphQLInvalidOperationErrorBuilder();
    }

    /**
     * create builder for GraphQLInvalidOperationError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInvalidOperationErrorBuilder of(final GraphQLInvalidOperationError template) {
        GraphQLInvalidOperationErrorBuilder builder = new GraphQLInvalidOperationErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
