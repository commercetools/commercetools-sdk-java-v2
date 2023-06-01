
package com.commercetools.graphql.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public interface GraphQLResponseMixin {
    @JsonProperty("data")
    @JsonDeserialize(as = GraphQLData.class)
    public Object getData();
}
