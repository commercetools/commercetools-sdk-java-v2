package com.commercetools.api.models.graph_ql;

import com.commercetools.api.models.graph_ql.GraphQLError;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.graph_ql.GraphQLResponseImpl;

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
@JsonDeserialize(as = GraphQLResponseImpl.class)
public interface GraphQLResponse  {

    
    
    @JsonProperty("data")
    public JsonNode getData();
    
    @Valid
    @JsonProperty("errors")
    public List<GraphQLError> getErrors();

    public void setData(final JsonNode data);
    
    @JsonIgnore
    public void setErrors(final GraphQLError ...errors);
    public void setErrors(final List<GraphQLError> errors);

    public static GraphQLResponse of(){
        return new GraphQLResponseImpl();
    }
    

    public static GraphQLResponse of(final GraphQLResponse template) {
        GraphQLResponseImpl instance = new GraphQLResponseImpl();
        instance.setData(template.getData());
        instance.setErrors(template.getErrors());
        return instance;
    }

    public static GraphQLResponseBuilder builder(){
        return GraphQLResponseBuilder.of();
    }
    
    public static GraphQLResponseBuilder builder(final GraphQLResponse template){
        return GraphQLResponseBuilder.of(template);
    }
    

    default <T> T withGraphQLResponse(Function<GraphQLResponse, T> helper) {
        return helper.apply(this);
    }
}
