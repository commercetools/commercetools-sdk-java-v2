package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLQueryTimedOutError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLQueryTimedOutErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLQueryTimedOutError graphQLQueryTimedOutError = GraphQLQueryTimedOutError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLQueryTimedOutErrorBuilder implements Builder<GraphQLQueryTimedOutError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLQueryTimedOutErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLQueryTimedOutErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLQueryTimedOutError with checking for non-null required values
     * @return GraphQLQueryTimedOutError
     */
    public GraphQLQueryTimedOutError build() {
        return new GraphQLQueryTimedOutErrorImpl(values);
    }
    
    /**
     * builds GraphQLQueryTimedOutError without checking for non-null required values
     * @return GraphQLQueryTimedOutError
     */
    public GraphQLQueryTimedOutError buildUnchecked() {
        return new GraphQLQueryTimedOutErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLQueryTimedOutErrorBuilder
     * @return builder 
     */
    public static GraphQLQueryTimedOutErrorBuilder of() {
        return new GraphQLQueryTimedOutErrorBuilder();
    }

    /**
     * create builder for GraphQLQueryTimedOutError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLQueryTimedOutErrorBuilder of(final GraphQLQueryTimedOutError template) {
        GraphQLQueryTimedOutErrorBuilder builder = new GraphQLQueryTimedOutErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
