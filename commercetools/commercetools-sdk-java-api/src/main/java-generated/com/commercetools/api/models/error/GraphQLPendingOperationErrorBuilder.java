package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLPendingOperationError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLPendingOperationErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLPendingOperationError graphQLPendingOperationError = GraphQLPendingOperationError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLPendingOperationErrorBuilder implements Builder<GraphQLPendingOperationError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLPendingOperationErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLPendingOperationErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLPendingOperationError with checking for non-null required values
     * @return GraphQLPendingOperationError
     */
    public GraphQLPendingOperationError build() {
        return new GraphQLPendingOperationErrorImpl(values);
    }
    
    /**
     * builds GraphQLPendingOperationError without checking for non-null required values
     * @return GraphQLPendingOperationError
     */
    public GraphQLPendingOperationError buildUnchecked() {
        return new GraphQLPendingOperationErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLPendingOperationErrorBuilder
     * @return builder 
     */
    public static GraphQLPendingOperationErrorBuilder of() {
        return new GraphQLPendingOperationErrorBuilder();
    }

    /**
     * create builder for GraphQLPendingOperationError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLPendingOperationErrorBuilder of(final GraphQLPendingOperationError template) {
        GraphQLPendingOperationErrorBuilder builder = new GraphQLPendingOperationErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
