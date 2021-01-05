package com.commercetools.api.models.graph_ql;

import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.graph_ql.GraphQLVariablesMapImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = GraphQLVariablesMapImpl.class)
public interface GraphQLVariablesMap  {

    
    @NotNull
    @JsonAnyGetter
    public Map<String, JsonNode> values();

    @JsonAnySetter
    public void setValue(String key, JsonNode value);

    public static GraphQLVariablesMap of(){
        return new GraphQLVariablesMapImpl();
    }
    

    public static GraphQLVariablesMap of(final GraphQLVariablesMap template) {
        GraphQLVariablesMapImpl instance = new GraphQLVariablesMapImpl();
        return instance;
    }

    public static GraphQLVariablesMapBuilder builder(){
        return GraphQLVariablesMapBuilder.of();
    }
    
    public static GraphQLVariablesMapBuilder builder(final GraphQLVariablesMap template){
        return GraphQLVariablesMapBuilder.of(template);
    }
    

    default <T> T withGraphQLVariablesMap(Function<GraphQLVariablesMap, T> helper) {
        return helper.apply(this);
    }
}
