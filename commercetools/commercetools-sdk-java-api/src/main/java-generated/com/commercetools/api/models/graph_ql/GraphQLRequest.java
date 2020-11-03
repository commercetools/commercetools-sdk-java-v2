package com.commercetools.api.models.graph_ql;

import com.commercetools.api.models.graph_ql.GraphQLVariablesMap;
import com.commercetools.api.models.graph_ql.GraphQLRequestImpl;

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
@JsonDeserialize(as = GraphQLRequestImpl.class)
public interface GraphQLRequest  {

    
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

    public static GraphQLRequestImpl of(){
        return new GraphQLRequestImpl();
    }
    

    public static GraphQLRequestImpl of(final GraphQLRequest template) {
        GraphQLRequestImpl instance = new GraphQLRequestImpl();
        instance.setQuery(template.getQuery());
        instance.setOperationName(template.getOperationName());
        instance.setVariables(template.getVariables());
        return instance;
    }

    default <T> T withGraphQLRequest(Function<GraphQLRequest, T> helper) {
        return helper.apply(this);
    }
}
