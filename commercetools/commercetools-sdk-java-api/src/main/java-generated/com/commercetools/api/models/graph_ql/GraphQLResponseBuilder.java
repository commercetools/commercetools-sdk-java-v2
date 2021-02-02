
package com.commercetools.api.models.graph_ql;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class GraphQLResponseBuilder {

    @Nullable
    private java.lang.Object data;

    @Nullable
    private java.util.List<com.commercetools.api.models.graph_ql.GraphQLError> errors;

    public GraphQLResponseBuilder data(@Nullable final java.lang.Object data) {
        this.data = data;
        return this;
    }

    public GraphQLResponseBuilder errors(@Nullable final com.commercetools.api.models.graph_ql.GraphQLError... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    public GraphQLResponseBuilder errors(
            @Nullable final java.util.List<com.commercetools.api.models.graph_ql.GraphQLError> errors) {
        this.errors = errors;
        return this;
    }

    @Nullable
    public java.lang.Object getData() {
        return this.data;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.graph_ql.GraphQLError> getErrors() {
        return this.errors;
    }

    public GraphQLResponse build() {
        return new GraphQLResponseImpl(data, errors);
    }

    public static GraphQLResponseBuilder of() {
        return new GraphQLResponseBuilder();
    }

    public static GraphQLResponseBuilder of(final GraphQLResponse template) {
        GraphQLResponseBuilder builder = new GraphQLResponseBuilder();
        builder.data = template.getData();
        builder.errors = template.getErrors();
        return builder;
    }

}
