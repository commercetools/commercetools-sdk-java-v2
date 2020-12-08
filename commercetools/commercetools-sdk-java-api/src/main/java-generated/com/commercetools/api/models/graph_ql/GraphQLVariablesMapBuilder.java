package com.commercetools.api.models.graph_ql;

import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.graph_ql.GraphQLVariablesMap;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class GraphQLVariablesMapBuilder {

    
    private Map<String, com.fasterxml.jackson.databind.JsonNode> values;

    public GraphQLVariablesMapBuilder values( final Map<String, com.fasterxml.jackson.databind.JsonNode> values){
        this.values = values;
        return this;
    }
    
    public GraphQLVariablesMapBuilder addValue(final String key, final com.fasterxml.jackson.databind.JsonNode value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    

    
    public Map<String, com.fasterxml.jackson.databind.JsonNode> getValues(){
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
