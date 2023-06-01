package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLBadGatewayError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLBadGatewayErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLBadGatewayError graphQLBadGatewayError = GraphQLBadGatewayError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLBadGatewayErrorBuilder implements Builder<GraphQLBadGatewayError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLBadGatewayErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLBadGatewayErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLBadGatewayError with checking for non-null required values
     * @return GraphQLBadGatewayError
     */
    public GraphQLBadGatewayError build() {
        return new GraphQLBadGatewayErrorImpl(values);
    }
    
    /**
     * builds GraphQLBadGatewayError without checking for non-null required values
     * @return GraphQLBadGatewayError
     */
    public GraphQLBadGatewayError buildUnchecked() {
        return new GraphQLBadGatewayErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLBadGatewayErrorBuilder
     * @return builder 
     */
    public static GraphQLBadGatewayErrorBuilder of() {
        return new GraphQLBadGatewayErrorBuilder();
    }

    /**
     * create builder for GraphQLBadGatewayError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLBadGatewayErrorBuilder of(final GraphQLBadGatewayError template) {
        GraphQLBadGatewayErrorBuilder builder = new GraphQLBadGatewayErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
