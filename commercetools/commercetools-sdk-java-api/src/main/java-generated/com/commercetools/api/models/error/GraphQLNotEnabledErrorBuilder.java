package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLNotEnabledError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLNotEnabledErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLNotEnabledError graphQLNotEnabledError = GraphQLNotEnabledError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLNotEnabledErrorBuilder implements Builder<GraphQLNotEnabledError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLNotEnabledErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLNotEnabledErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLNotEnabledError with checking for non-null required values
     * @return GraphQLNotEnabledError
     */
    public GraphQLNotEnabledError build() {
        return new GraphQLNotEnabledErrorImpl(values);
    }
    
    /**
     * builds GraphQLNotEnabledError without checking for non-null required values
     * @return GraphQLNotEnabledError
     */
    public GraphQLNotEnabledError buildUnchecked() {
        return new GraphQLNotEnabledErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLNotEnabledErrorBuilder
     * @return builder 
     */
    public static GraphQLNotEnabledErrorBuilder of() {
        return new GraphQLNotEnabledErrorBuilder();
    }

    /**
     * create builder for GraphQLNotEnabledError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLNotEnabledErrorBuilder of(final GraphQLNotEnabledError template) {
        GraphQLNotEnabledErrorBuilder builder = new GraphQLNotEnabledErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
