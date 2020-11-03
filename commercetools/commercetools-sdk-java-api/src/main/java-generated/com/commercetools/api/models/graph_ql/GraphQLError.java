package com.commercetools.api.models.graph_ql;

import com.commercetools.api.models.graph_ql.GraphQLErrorLocation;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.graph_ql.GraphQLErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = GraphQLErrorImpl.class)
public interface GraphQLError  {

    
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
    public void setLocations(final GraphQLErrorLocation ...locations);
    public void setLocations(final List<GraphQLErrorLocation> locations);
    
    @JsonIgnore
    public void setPath(final JsonNode ...path);
    public void setPath(final List<JsonNode> path);

    public static GraphQLErrorImpl of(){
        return new GraphQLErrorImpl();
    }
    

    public static GraphQLErrorImpl of(final GraphQLError template) {
        GraphQLErrorImpl instance = new GraphQLErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setLocations(template.getLocations());
        instance.setPath(template.getPath());
        return instance;
    }

    default <T> T withGraphQLError(Function<GraphQLError, T> helper) {
        return helper.apply(this);
    }
}
