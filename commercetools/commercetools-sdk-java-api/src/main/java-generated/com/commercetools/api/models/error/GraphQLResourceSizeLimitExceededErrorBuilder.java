package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLResourceSizeLimitExceededError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLResourceSizeLimitExceededErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLResourceSizeLimitExceededError graphQLResourceSizeLimitExceededError = GraphQLResourceSizeLimitExceededError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLResourceSizeLimitExceededErrorBuilder implements Builder<GraphQLResourceSizeLimitExceededError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLResourceSizeLimitExceededErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLResourceSizeLimitExceededErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLResourceSizeLimitExceededError with checking for non-null required values
     * @return GraphQLResourceSizeLimitExceededError
     */
    public GraphQLResourceSizeLimitExceededError build() {
        return new GraphQLResourceSizeLimitExceededErrorImpl(values);
    }
    
    /**
     * builds GraphQLResourceSizeLimitExceededError without checking for non-null required values
     * @return GraphQLResourceSizeLimitExceededError
     */
    public GraphQLResourceSizeLimitExceededError buildUnchecked() {
        return new GraphQLResourceSizeLimitExceededErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLResourceSizeLimitExceededErrorBuilder
     * @return builder 
     */
    public static GraphQLResourceSizeLimitExceededErrorBuilder of() {
        return new GraphQLResourceSizeLimitExceededErrorBuilder();
    }

    /**
     * create builder for GraphQLResourceSizeLimitExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLResourceSizeLimitExceededErrorBuilder of(final GraphQLResourceSizeLimitExceededError template) {
        GraphQLResourceSizeLimitExceededErrorBuilder builder = new GraphQLResourceSizeLimitExceededErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
