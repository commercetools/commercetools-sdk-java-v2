package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLInvalidTokenError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLInvalidTokenErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInvalidTokenError graphQLInvalidTokenError = GraphQLInvalidTokenError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLInvalidTokenErrorBuilder implements Builder<GraphQLInvalidTokenError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLInvalidTokenErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLInvalidTokenErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLInvalidTokenError with checking for non-null required values
     * @return GraphQLInvalidTokenError
     */
    public GraphQLInvalidTokenError build() {
        return new GraphQLInvalidTokenErrorImpl(values);
    }
    
    /**
     * builds GraphQLInvalidTokenError without checking for non-null required values
     * @return GraphQLInvalidTokenError
     */
    public GraphQLInvalidTokenError buildUnchecked() {
        return new GraphQLInvalidTokenErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLInvalidTokenErrorBuilder
     * @return builder 
     */
    public static GraphQLInvalidTokenErrorBuilder of() {
        return new GraphQLInvalidTokenErrorBuilder();
    }

    /**
     * create builder for GraphQLInvalidTokenError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInvalidTokenErrorBuilder of(final GraphQLInvalidTokenError template) {
        GraphQLInvalidTokenErrorBuilder builder = new GraphQLInvalidTokenErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
