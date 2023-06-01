package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLOverCapacityError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLOverCapacityErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLOverCapacityError graphQLOverCapacityError = GraphQLOverCapacityError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLOverCapacityErrorBuilder implements Builder<GraphQLOverCapacityError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLOverCapacityErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLOverCapacityErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLOverCapacityError with checking for non-null required values
     * @return GraphQLOverCapacityError
     */
    public GraphQLOverCapacityError build() {
        return new GraphQLOverCapacityErrorImpl(values);
    }
    
    /**
     * builds GraphQLOverCapacityError without checking for non-null required values
     * @return GraphQLOverCapacityError
     */
    public GraphQLOverCapacityError buildUnchecked() {
        return new GraphQLOverCapacityErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLOverCapacityErrorBuilder
     * @return builder 
     */
    public static GraphQLOverCapacityErrorBuilder of() {
        return new GraphQLOverCapacityErrorBuilder();
    }

    /**
     * create builder for GraphQLOverCapacityError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLOverCapacityErrorBuilder of(final GraphQLOverCapacityError template) {
        GraphQLOverCapacityErrorBuilder builder = new GraphQLOverCapacityErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
