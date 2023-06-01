package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLGeneralError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLGeneralErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLGeneralError graphQLGeneralError = GraphQLGeneralError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLGeneralErrorBuilder implements Builder<GraphQLGeneralError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLGeneralErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLGeneralErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLGeneralError with checking for non-null required values
     * @return GraphQLGeneralError
     */
    public GraphQLGeneralError build() {
        return new GraphQLGeneralErrorImpl(values);
    }
    
    /**
     * builds GraphQLGeneralError without checking for non-null required values
     * @return GraphQLGeneralError
     */
    public GraphQLGeneralError buildUnchecked() {
        return new GraphQLGeneralErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLGeneralErrorBuilder
     * @return builder 
     */
    public static GraphQLGeneralErrorBuilder of() {
        return new GraphQLGeneralErrorBuilder();
    }

    /**
     * create builder for GraphQLGeneralError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLGeneralErrorBuilder of(final GraphQLGeneralError template) {
        GraphQLGeneralErrorBuilder builder = new GraphQLGeneralErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
