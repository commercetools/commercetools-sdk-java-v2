package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLExternalOAuthFailedError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLExternalOAuthFailedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLExternalOAuthFailedError graphQLExternalOAuthFailedError = GraphQLExternalOAuthFailedError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLExternalOAuthFailedErrorBuilder implements Builder<GraphQLExternalOAuthFailedError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLExternalOAuthFailedErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLExternalOAuthFailedErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLExternalOAuthFailedError with checking for non-null required values
     * @return GraphQLExternalOAuthFailedError
     */
    public GraphQLExternalOAuthFailedError build() {
        return new GraphQLExternalOAuthFailedErrorImpl(values);
    }
    
    /**
     * builds GraphQLExternalOAuthFailedError without checking for non-null required values
     * @return GraphQLExternalOAuthFailedError
     */
    public GraphQLExternalOAuthFailedError buildUnchecked() {
        return new GraphQLExternalOAuthFailedErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLExternalOAuthFailedErrorBuilder
     * @return builder 
     */
    public static GraphQLExternalOAuthFailedErrorBuilder of() {
        return new GraphQLExternalOAuthFailedErrorBuilder();
    }

    /**
     * create builder for GraphQLExternalOAuthFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExternalOAuthFailedErrorBuilder of(final GraphQLExternalOAuthFailedError template) {
        GraphQLExternalOAuthFailedErrorBuilder builder = new GraphQLExternalOAuthFailedErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
