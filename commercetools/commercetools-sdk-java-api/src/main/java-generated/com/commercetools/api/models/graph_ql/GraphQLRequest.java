
package com.commercetools.api.models.graph_ql;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = GraphQLRequestImpl.class)
public interface GraphQLRequest {

    @NotNull
    @JsonProperty("query")
    public String getQuery();

    @JsonProperty("operationName")
    public String getOperationName();

    @Valid
    @JsonProperty("variables")
    public GraphQLVariablesMap getVariables();

    public void setQuery(final String query);

    public void setOperationName(final String operationName);

    public void setVariables(final GraphQLVariablesMap variables);

    public static GraphQLRequest of() {
        return new GraphQLRequestImpl();
    }

    public static GraphQLRequest of(final GraphQLRequest template) {
        GraphQLRequestImpl instance = new GraphQLRequestImpl();
        instance.setQuery(template.getQuery());
        instance.setOperationName(template.getOperationName());
        instance.setVariables(template.getVariables());
        return instance;
    }

    public static GraphQLRequestBuilder builder() {
        return GraphQLRequestBuilder.of();
    }

    public static GraphQLRequestBuilder builder(final GraphQLRequest template) {
        return GraphQLRequestBuilder.of(template);
    }

    default <T> T withGraphQLRequest(Function<GraphQLRequest, T> helper) {
        return helper.apply(this);
    }
}
