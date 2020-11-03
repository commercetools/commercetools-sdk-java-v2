package com.commercetools.api.models.graph_ql;

import com.commercetools.api.models.graph_ql.GraphQLVariablesMap;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class GraphQLRequestImpl implements GraphQLRequest {

    private String query;
    
    private String operationName;
    
    private com.commercetools.api.models.graph_ql.GraphQLVariablesMap variables;

    @JsonCreator
    GraphQLRequestImpl(@JsonProperty("query") final String query, @JsonProperty("operationName") final String operationName, @JsonProperty("variables") final com.commercetools.api.models.graph_ql.GraphQLVariablesMap variables) {
        this.query = query;
        this.operationName = operationName;
        this.variables = variables;
    }
    public GraphQLRequestImpl() {
       
    }

    
    public String getQuery(){
        return this.query;
    }
    
    
    public String getOperationName(){
        return this.operationName;
    }
    
    
    public com.commercetools.api.models.graph_ql.GraphQLVariablesMap getVariables(){
        return this.variables;
    }

    public void setQuery(final String query){
        this.query = query;
    }
    
    public void setOperationName(final String operationName){
        this.operationName = operationName;
    }
    
    public void setVariables(final com.commercetools.api.models.graph_ql.GraphQLVariablesMap variables){
        this.variables = variables;
    }

}
