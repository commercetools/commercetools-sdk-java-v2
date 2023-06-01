package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLResourceNotFoundError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLResourceNotFoundErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLResourceNotFoundError graphQLResourceNotFoundError = GraphQLResourceNotFoundError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLResourceNotFoundErrorBuilder implements Builder<GraphQLResourceNotFoundError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLResourceNotFoundErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLResourceNotFoundErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLResourceNotFoundError with checking for non-null required values
     * @return GraphQLResourceNotFoundError
     */
    public GraphQLResourceNotFoundError build() {
        return new GraphQLResourceNotFoundErrorImpl(values);
    }
    
    /**
     * builds GraphQLResourceNotFoundError without checking for non-null required values
     * @return GraphQLResourceNotFoundError
     */
    public GraphQLResourceNotFoundError buildUnchecked() {
        return new GraphQLResourceNotFoundErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLResourceNotFoundErrorBuilder
     * @return builder 
     */
    public static GraphQLResourceNotFoundErrorBuilder of() {
        return new GraphQLResourceNotFoundErrorBuilder();
    }

    /**
     * create builder for GraphQLResourceNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLResourceNotFoundErrorBuilder of(final GraphQLResourceNotFoundError template) {
        GraphQLResourceNotFoundErrorBuilder builder = new GraphQLResourceNotFoundErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
