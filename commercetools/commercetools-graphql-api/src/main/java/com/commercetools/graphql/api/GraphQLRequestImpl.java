
package com.commercetools.graphql.api;

import java.util.function.Function;

import com.commercetools.api.models.graph_ql.GraphQLVariablesMap;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * GraphQLRequest
 */
public class GraphQLRequestImpl<T> implements GraphQLRequest<T>, ModelBase {

    private String query;

    private String operationName;

    private GraphQLVariablesMap variables;

    private Function<GraphQLData, T> dataMapper;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLRequestImpl(@JsonProperty("query") final String query,
            @JsonProperty("operationName") final String operationName,
            @JsonProperty("variables") final GraphQLVariablesMap variables, Function<GraphQLData, T> dataMapper) {
        this.query = query;
        this.operationName = operationName;
        this.variables = variables;
        this.dataMapper = dataMapper;
    }

    /**
     * create empty instance
     */
    public GraphQLRequestImpl() {
    }

    /**
     *
     */

    public String getQuery() {
        return this.query;
    }

    /**
     *
     */

    public String getOperationName() {
        return this.operationName;
    }

    /**
     *
     */

    public GraphQLVariablesMap getVariables() {
        return this.variables;
    }

    public void setQuery(final String query) {
        this.query = query;
    }

    public void setOperationName(final String operationName) {
        this.operationName = operationName;
    }

    public void setVariables(final GraphQLVariablesMap variables) {
        this.variables = variables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLRequestImpl<?> that = (GraphQLRequestImpl<?>) o;

        return new EqualsBuilder().append(query, that.query)
                .append(operationName, that.operationName)
                .append(variables, that.variables)
                .append(dataMapper, that.dataMapper)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(query)
                .append(operationName)
                .append(variables)
                .append(dataMapper)
                .toHashCode();
    }

    @Override
    public Function<GraphQLData, T> getDataMapper() {
        return dataMapper;
    }

    @Override
    public void setDataMapper(Function<GraphQLData, T> dataMapper) {
        this.dataMapper = dataMapper;
    }

    @Override
    public GraphQLRequest<T> copyDeep() {
        return GraphQLRequest.deepCopy(this);
    }
}
