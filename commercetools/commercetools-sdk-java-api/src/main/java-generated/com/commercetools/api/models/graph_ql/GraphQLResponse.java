
package com.commercetools.api.models.graph_ql;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = GraphQLResponseImpl.class)
public interface GraphQLResponse {

    @JsonProperty("data")
    public Object getData();

    @Valid
    @JsonProperty("errors")
    public List<GraphQLError> getErrors();

    public void setData(final Object data);

    @JsonIgnore
    public void setErrors(final GraphQLError... errors);

    public void setErrors(final List<GraphQLError> errors);

    public static GraphQLResponse of() {
        return new GraphQLResponseImpl();
    }

    public static GraphQLResponse of(final GraphQLResponse template) {
        GraphQLResponseImpl instance = new GraphQLResponseImpl();
        instance.setData(template.getData());
        instance.setErrors(template.getErrors());
        return instance;
    }

    public static GraphQLResponseBuilder builder() {
        return GraphQLResponseBuilder.of();
    }

    public static GraphQLResponseBuilder builder(final GraphQLResponse template) {
        return GraphQLResponseBuilder.of(template);
    }

    default <T> T withGraphQLResponse(Function<GraphQLResponse, T> helper) {
        return helper.apply(this);
    }
}
