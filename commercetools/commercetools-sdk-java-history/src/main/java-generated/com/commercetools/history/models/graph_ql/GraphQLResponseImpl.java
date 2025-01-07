
package com.commercetools.history.models.graph_ql;

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
 *  <p><code>error</code> is present in the response only if the GraphQL query was unsuccessful.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLResponseImpl implements GraphQLResponse, ModelBase {

    private java.lang.Object data;

    private java.util.List<com.commercetools.history.models.graph_ql.GraphQLError> errors;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLResponseImpl(@JsonProperty("data") final java.lang.Object data,
            @JsonProperty("errors") final java.util.List<com.commercetools.history.models.graph_ql.GraphQLError> errors) {
        this.data = data;
        this.errors = errors;
    }

    /**
     * create empty instance
     */
    public GraphQLResponseImpl() {
    }

    /**
     *  <p>JSON object that contains the results of a GraphQL query.</p>
     */

    public java.lang.Object getData() {
        return this.data;
    }

    /**
     *  <p>Errors that the GraphQL query returns.</p>
     */

    public java.util.List<com.commercetools.history.models.graph_ql.GraphQLError> getErrors() {
        return this.errors;
    }

    public void setData(final java.lang.Object data) {
        this.data = data;
    }

    public void setErrors(final com.commercetools.history.models.graph_ql.GraphQLError... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
    }

    public void setErrors(final java.util.List<com.commercetools.history.models.graph_ql.GraphQLError> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLResponseImpl that = (GraphQLResponseImpl) o;

        return new EqualsBuilder().append(data, that.data)
                .append(errors, that.errors)
                .append(data, that.data)
                .append(errors, that.errors)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(data).append(errors).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("data", data)
                .append("errors", errors)
                .build();
    }

}
