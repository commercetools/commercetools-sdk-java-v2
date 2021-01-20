
package com.commercetools.api.models.graph_ql;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.graph_ql.GraphQLErrorImpl;
import com.commercetools.api.models.graph_ql.GraphQLErrorLocation;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = GraphQLErrorImpl.class)
public interface GraphQLError {

    @NotNull
    @JsonProperty("message")
    public String getMessage();

    @NotNull
    @Valid
    @JsonProperty("locations")
    public List<GraphQLErrorLocation> getLocations();

    @NotNull
    @JsonProperty("path")
    public List<JsonNode> getPath();

    public void setMessage(final String message);

    @JsonIgnore
    public void setLocations(final GraphQLErrorLocation... locations);

    public void setLocations(final List<GraphQLErrorLocation> locations);

    @JsonIgnore
    public void setPath(final JsonNode... path);

    public void setPath(final List<JsonNode> path);

    public static GraphQLError of() {
        return new GraphQLErrorImpl();
    }

    public static GraphQLError of(final GraphQLError template) {
        GraphQLErrorImpl instance = new GraphQLErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setLocations(template.getLocations());
        instance.setPath(template.getPath());
        return instance;
    }

    public static GraphQLErrorBuilder builder() {
        return GraphQLErrorBuilder.of();
    }

    public static GraphQLErrorBuilder builder(final GraphQLError template) {
        return GraphQLErrorBuilder.of(template);
    }

    default <T> T withGraphQLError(Function<GraphQLError, T> helper) {
        return helper.apply(this);
    }
}
