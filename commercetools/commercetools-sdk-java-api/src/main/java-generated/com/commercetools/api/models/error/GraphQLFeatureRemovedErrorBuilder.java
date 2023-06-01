package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLFeatureRemovedError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLFeatureRemovedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLFeatureRemovedError graphQLFeatureRemovedError = GraphQLFeatureRemovedError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLFeatureRemovedErrorBuilder implements Builder<GraphQLFeatureRemovedError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLFeatureRemovedErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLFeatureRemovedErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLFeatureRemovedError with checking for non-null required values
     * @return GraphQLFeatureRemovedError
     */
    public GraphQLFeatureRemovedError build() {
        return new GraphQLFeatureRemovedErrorImpl(values);
    }
    
    /**
     * builds GraphQLFeatureRemovedError without checking for non-null required values
     * @return GraphQLFeatureRemovedError
     */
    public GraphQLFeatureRemovedError buildUnchecked() {
        return new GraphQLFeatureRemovedErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLFeatureRemovedErrorBuilder
     * @return builder 
     */
    public static GraphQLFeatureRemovedErrorBuilder of() {
        return new GraphQLFeatureRemovedErrorBuilder();
    }

    /**
     * create builder for GraphQLFeatureRemovedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLFeatureRemovedErrorBuilder of(final GraphQLFeatureRemovedError template) {
        GraphQLFeatureRemovedErrorBuilder builder = new GraphQLFeatureRemovedErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
