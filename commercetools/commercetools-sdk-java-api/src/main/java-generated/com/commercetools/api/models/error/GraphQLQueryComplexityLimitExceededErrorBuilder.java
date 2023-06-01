package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLQueryComplexityLimitExceededError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLQueryComplexityLimitExceededErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLQueryComplexityLimitExceededError graphQLQueryComplexityLimitExceededError = GraphQLQueryComplexityLimitExceededError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLQueryComplexityLimitExceededErrorBuilder implements Builder<GraphQLQueryComplexityLimitExceededError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLQueryComplexityLimitExceededErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLQueryComplexityLimitExceededErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLQueryComplexityLimitExceededError with checking for non-null required values
     * @return GraphQLQueryComplexityLimitExceededError
     */
    public GraphQLQueryComplexityLimitExceededError build() {
        return new GraphQLQueryComplexityLimitExceededErrorImpl(values);
    }
    
    /**
     * builds GraphQLQueryComplexityLimitExceededError without checking for non-null required values
     * @return GraphQLQueryComplexityLimitExceededError
     */
    public GraphQLQueryComplexityLimitExceededError buildUnchecked() {
        return new GraphQLQueryComplexityLimitExceededErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLQueryComplexityLimitExceededErrorBuilder
     * @return builder 
     */
    public static GraphQLQueryComplexityLimitExceededErrorBuilder of() {
        return new GraphQLQueryComplexityLimitExceededErrorBuilder();
    }

    /**
     * create builder for GraphQLQueryComplexityLimitExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLQueryComplexityLimitExceededErrorBuilder of(final GraphQLQueryComplexityLimitExceededError template) {
        GraphQLQueryComplexityLimitExceededErrorBuilder builder = new GraphQLQueryComplexityLimitExceededErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
