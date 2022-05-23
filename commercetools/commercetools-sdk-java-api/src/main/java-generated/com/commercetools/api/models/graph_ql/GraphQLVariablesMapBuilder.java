
package com.commercetools.api.models.graph_ql;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   GraphQLVariablesMap graphQLVariablesMap = GraphQLVariablesMap.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLVariablesMapBuilder implements Builder<GraphQLVariablesMap> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    public GraphQLVariablesMapBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public GraphQLVariablesMapBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public GraphQLVariablesMap build() {
        Objects.requireNonNull(values, GraphQLVariablesMap.class + ": values are missing");
        return new GraphQLVariablesMapImpl(values);
    }

    /**
     * builds GraphQLVariablesMap without checking for non null required values
     */
    public GraphQLVariablesMap buildUnchecked() {
        return new GraphQLVariablesMapImpl(values);
    }

    public static GraphQLVariablesMapBuilder of() {
        return new GraphQLVariablesMapBuilder();
    }

    public static GraphQLVariablesMapBuilder of(final GraphQLVariablesMap template) {
        GraphQLVariablesMapBuilder builder = new GraphQLVariablesMapBuilder();
        builder.values = template.values();
        return builder;
    }

}
