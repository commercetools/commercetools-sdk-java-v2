
package com.commercetools.api.models.graph_ql;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class GraphQLRequestImpl implements GraphQLRequest {

    private String query;

    private String operationName;

    private com.commercetools.api.models.graph_ql.GraphQLVariablesMap variables;

    @JsonCreator
    GraphQLRequestImpl(@JsonProperty("query") final String query,
            @JsonProperty("operationName") final String operationName,
            @JsonProperty("variables") final com.commercetools.api.models.graph_ql.GraphQLVariablesMap variables) {
        this.query = query;
        this.operationName = operationName;
        this.variables = variables;
    }

    public GraphQLRequestImpl() {
    }

    public String getQuery() {
        return this.query;
    }

    public String getOperationName() {
        return this.operationName;
    }

    public com.commercetools.api.models.graph_ql.GraphQLVariablesMap getVariables() {
        return this.variables;
    }

    public void setQuery(final String query) {
        this.query = query;
    }

    public void setOperationName(final String operationName) {
        this.operationName = operationName;
    }

    public void setVariables(final com.commercetools.api.models.graph_ql.GraphQLVariablesMap variables) {
        this.variables = variables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLRequestImpl that = (GraphQLRequestImpl) o;

        return new EqualsBuilder().append(query, that.query)
                .append(operationName, that.operationName)
                .append(variables, that.variables)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(query).append(operationName).append(variables).toHashCode();
    }

}
