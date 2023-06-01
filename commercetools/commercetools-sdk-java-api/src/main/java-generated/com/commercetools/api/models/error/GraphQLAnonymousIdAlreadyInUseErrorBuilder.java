package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLAnonymousIdAlreadyInUseError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAnonymousIdAlreadyInUseErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAnonymousIdAlreadyInUseError graphQLAnonymousIdAlreadyInUseError = GraphQLAnonymousIdAlreadyInUseError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLAnonymousIdAlreadyInUseErrorBuilder implements Builder<GraphQLAnonymousIdAlreadyInUseError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLAnonymousIdAlreadyInUseErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLAnonymousIdAlreadyInUseErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLAnonymousIdAlreadyInUseError with checking for non-null required values
     * @return GraphQLAnonymousIdAlreadyInUseError
     */
    public GraphQLAnonymousIdAlreadyInUseError build() {
        return new GraphQLAnonymousIdAlreadyInUseErrorImpl(values);
    }
    
    /**
     * builds GraphQLAnonymousIdAlreadyInUseError without checking for non-null required values
     * @return GraphQLAnonymousIdAlreadyInUseError
     */
    public GraphQLAnonymousIdAlreadyInUseError buildUnchecked() {
        return new GraphQLAnonymousIdAlreadyInUseErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAnonymousIdAlreadyInUseErrorBuilder
     * @return builder 
     */
    public static GraphQLAnonymousIdAlreadyInUseErrorBuilder of() {
        return new GraphQLAnonymousIdAlreadyInUseErrorBuilder();
    }

    /**
     * create builder for GraphQLAnonymousIdAlreadyInUseError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAnonymousIdAlreadyInUseErrorBuilder of(final GraphQLAnonymousIdAlreadyInUseError template) {
        GraphQLAnonymousIdAlreadyInUseErrorBuilder builder = new GraphQLAnonymousIdAlreadyInUseErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
