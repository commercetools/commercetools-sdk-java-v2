
package com.commercetools.graphql.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * GraphQLResponse
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLResponseImpl implements GraphQLResponse, ModelBase {

    private GraphQLData data;

    private List<com.commercetools.api.models.graph_ql.GraphQLError> errors;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLResponseImpl(@JsonProperty("data") final GraphQLData data,
            @JsonProperty("errors") final List<com.commercetools.api.models.graph_ql.GraphQLError> errors) {
        this.data = data;
        this.errors = errors;
    }

    /**
     * create empty instance
     */
    public GraphQLResponseImpl() {
    }

    /**
     *
     */

    public GraphQLData getData() {
        return this.data;
    }

    /**
     *
     */

    public List<com.commercetools.api.models.graph_ql.GraphQLError> getErrors() {
        return this.errors;
    }

    public void setData(final GraphQLData data) {
        this.data = data;
    }

    public void setErrors(final com.commercetools.api.models.graph_ql.GraphQLError... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
    }

    public void setErrors(final List<com.commercetools.api.models.graph_ql.GraphQLError> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLResponseImpl that = (GraphQLResponseImpl) o;

        return new EqualsBuilder().append(data, that.data).append(errors, that.errors).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(data).append(errors).toHashCode();
    }

}
