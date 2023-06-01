package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLNoMatchingProductDiscountFoundError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLNoMatchingProductDiscountFoundErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLNoMatchingProductDiscountFoundError graphQLNoMatchingProductDiscountFoundError = GraphQLNoMatchingProductDiscountFoundError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLNoMatchingProductDiscountFoundErrorBuilder implements Builder<GraphQLNoMatchingProductDiscountFoundError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLNoMatchingProductDiscountFoundErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLNoMatchingProductDiscountFoundErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLNoMatchingProductDiscountFoundError with checking for non-null required values
     * @return GraphQLNoMatchingProductDiscountFoundError
     */
    public GraphQLNoMatchingProductDiscountFoundError build() {
        return new GraphQLNoMatchingProductDiscountFoundErrorImpl(values);
    }
    
    /**
     * builds GraphQLNoMatchingProductDiscountFoundError without checking for non-null required values
     * @return GraphQLNoMatchingProductDiscountFoundError
     */
    public GraphQLNoMatchingProductDiscountFoundError buildUnchecked() {
        return new GraphQLNoMatchingProductDiscountFoundErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLNoMatchingProductDiscountFoundErrorBuilder
     * @return builder 
     */
    public static GraphQLNoMatchingProductDiscountFoundErrorBuilder of() {
        return new GraphQLNoMatchingProductDiscountFoundErrorBuilder();
    }

    /**
     * create builder for GraphQLNoMatchingProductDiscountFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLNoMatchingProductDiscountFoundErrorBuilder of(final GraphQLNoMatchingProductDiscountFoundError template) {
        GraphQLNoMatchingProductDiscountFoundErrorBuilder builder = new GraphQLNoMatchingProductDiscountFoundErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
