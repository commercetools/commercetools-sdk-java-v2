
package com.commercetools.api.models.graph_ql;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>The query, operation name, and variables that are sent to the GraphQL API.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLRequestImpl implements GraphQLRequest, ModelBase {

    private String query;

    private String operationName;

    private com.commercetools.api.models.graph_ql.GraphQLVariablesMap variables;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLRequestImpl(@JsonProperty("query") final String query,
            @JsonProperty("operationName") final String operationName,
            @JsonProperty("variables") final com.commercetools.api.models.graph_ql.GraphQLVariablesMap variables) {
        this.query = query;
        this.operationName = operationName;
        this.variables = variables;
    }

    /**
     * create empty instance
     */
    public GraphQLRequestImpl() {
    }

    /**
     *  <p>String representation of the <em>Source Text</em> of the <em>Document</em> that is specified in the Language section of the GraphQL specification.</p>
     */

    public String getQuery() {
        return this.query;
    }

    /**
     *  <p>Name of the operation, if you defined several operations in <code>query</code>.</p>
     */

    public String getOperationName() {
        return this.operationName;
    }

    /**
     *  <p>JSON object that contains key-value pairs in which the keys are variable names and the values are variable values.</p>
     */

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
                .append(query, that.query)
                .append(operationName, that.operationName)
                .append(variables, that.variables)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(query).append(operationName).append(variables).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("query", query)
                .append("operationName", operationName)
                .append("variables", variables)
                .build();
    }

}
