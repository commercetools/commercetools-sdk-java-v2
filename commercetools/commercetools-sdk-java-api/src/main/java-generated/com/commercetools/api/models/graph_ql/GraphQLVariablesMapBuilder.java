package com.commercetools.api.models.graph_ql;

import java.lang.Object;
import com.commercetools.api.models.graph_ql.GraphQLVariablesMap;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLVariablesMapBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLVariablesMap graphQLVariablesMap = GraphQLVariablesMap.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLVariablesMapBuilder implements Builder<GraphQLVariablesMap> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     * assign pattern properties to the builder
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLVariablesMapBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     * assign a pattern property to the builder
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLVariablesMapBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    

    /**
     * values of pattern properties
     * @return pattern properties
     */
    
    
    public Map<String, java.lang.Object> getValues(){
        return this.values;
    }

    /**
     * builds GraphQLVariablesMap with checking for non-null required values
     * @return GraphQLVariablesMap
     */
    public GraphQLVariablesMap build() {
        return new GraphQLVariablesMapImpl(values);
    }
    
    /**
     * builds GraphQLVariablesMap without checking for non-null required values
     * @return GraphQLVariablesMap
     */
    public GraphQLVariablesMap buildUnchecked() {
        return new GraphQLVariablesMapImpl(values);
    }

    /**
     * factory method for an instance of GraphQLVariablesMapBuilder
     * @return builder 
     */
    public static GraphQLVariablesMapBuilder of() {
        return new GraphQLVariablesMapBuilder();
    }

    /**
     * create builder for GraphQLVariablesMap instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLVariablesMapBuilder of(final GraphQLVariablesMap template) {
        GraphQLVariablesMapBuilder builder = new GraphQLVariablesMapBuilder();
        builder.values = template.values();
        return builder;
    }

}
