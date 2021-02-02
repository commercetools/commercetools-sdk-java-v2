
package com.commercetools.api.models.graph_ql;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class GraphQLVariablesMapBuilder {

    private Map<String, java.lang.Object> values;

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
