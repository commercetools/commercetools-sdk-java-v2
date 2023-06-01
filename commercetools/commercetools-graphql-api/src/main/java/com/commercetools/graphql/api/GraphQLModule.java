
package com.commercetools.graphql.api;

import com.commercetools.api.models.graph_ql.GraphQLResponse;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class GraphQLModule extends SimpleModule {
    private static final long serialVersionUID = 0L;

    public GraphQLModule() {
        setMixInAnnotation(GraphQLResponse.class, GraphQLResponseMixin.class);
    }
}
