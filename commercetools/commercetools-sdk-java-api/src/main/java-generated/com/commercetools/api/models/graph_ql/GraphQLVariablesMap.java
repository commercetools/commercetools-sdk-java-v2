
package com.commercetools.api.models.graph_ql;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = GraphQLVariablesMapImpl.class)
public interface GraphQLVariablesMap {

    @NotNull
    @JsonAnyGetter
    public Map<String, Object> values();

    @JsonAnySetter
    public void setValue(String key, Object value);

    public static GraphQLVariablesMap of() {
        return new GraphQLVariablesMapImpl();
    }

    public static GraphQLVariablesMap of(final GraphQLVariablesMap template) {
        GraphQLVariablesMapImpl instance = new GraphQLVariablesMapImpl();
        return instance;
    }

    public static GraphQLVariablesMapBuilder builder() {
        return GraphQLVariablesMapBuilder.of();
    }

    public static GraphQLVariablesMapBuilder builder(final GraphQLVariablesMap template) {
        return GraphQLVariablesMapBuilder.of(template);
    }

    default <T> T withGraphQLVariablesMap(Function<GraphQLVariablesMap, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLVariablesMap> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLVariablesMap>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLVariablesMap>";
            }
        };
    }
}
