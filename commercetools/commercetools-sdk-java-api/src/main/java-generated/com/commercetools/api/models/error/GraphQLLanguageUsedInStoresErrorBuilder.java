package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLLanguageUsedInStoresError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLLanguageUsedInStoresErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLLanguageUsedInStoresError graphQLLanguageUsedInStoresError = GraphQLLanguageUsedInStoresError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLLanguageUsedInStoresErrorBuilder implements Builder<GraphQLLanguageUsedInStoresError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLLanguageUsedInStoresErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLLanguageUsedInStoresErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLLanguageUsedInStoresError with checking for non-null required values
     * @return GraphQLLanguageUsedInStoresError
     */
    public GraphQLLanguageUsedInStoresError build() {
        return new GraphQLLanguageUsedInStoresErrorImpl(values);
    }
    
    /**
     * builds GraphQLLanguageUsedInStoresError without checking for non-null required values
     * @return GraphQLLanguageUsedInStoresError
     */
    public GraphQLLanguageUsedInStoresError buildUnchecked() {
        return new GraphQLLanguageUsedInStoresErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLLanguageUsedInStoresErrorBuilder
     * @return builder 
     */
    public static GraphQLLanguageUsedInStoresErrorBuilder of() {
        return new GraphQLLanguageUsedInStoresErrorBuilder();
    }

    /**
     * create builder for GraphQLLanguageUsedInStoresError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLLanguageUsedInStoresErrorBuilder of(final GraphQLLanguageUsedInStoresError template) {
        GraphQLLanguageUsedInStoresErrorBuilder builder = new GraphQLLanguageUsedInStoresErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
