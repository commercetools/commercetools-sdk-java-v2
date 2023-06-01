package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLInvalidSubjectError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLInvalidSubjectErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInvalidSubjectError graphQLInvalidSubjectError = GraphQLInvalidSubjectError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLInvalidSubjectErrorBuilder implements Builder<GraphQLInvalidSubjectError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLInvalidSubjectErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLInvalidSubjectErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLInvalidSubjectError with checking for non-null required values
     * @return GraphQLInvalidSubjectError
     */
    public GraphQLInvalidSubjectError build() {
        return new GraphQLInvalidSubjectErrorImpl(values);
    }
    
    /**
     * builds GraphQLInvalidSubjectError without checking for non-null required values
     * @return GraphQLInvalidSubjectError
     */
    public GraphQLInvalidSubjectError buildUnchecked() {
        return new GraphQLInvalidSubjectErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLInvalidSubjectErrorBuilder
     * @return builder 
     */
    public static GraphQLInvalidSubjectErrorBuilder of() {
        return new GraphQLInvalidSubjectErrorBuilder();
    }

    /**
     * create builder for GraphQLInvalidSubjectError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInvalidSubjectErrorBuilder of(final GraphQLInvalidSubjectError template) {
        GraphQLInvalidSubjectErrorBuilder builder = new GraphQLInvalidSubjectErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
