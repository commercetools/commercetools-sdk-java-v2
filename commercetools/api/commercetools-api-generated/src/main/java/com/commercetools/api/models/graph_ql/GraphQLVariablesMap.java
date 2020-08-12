package com.commercetools.api.models.graph_ql;

import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.graph_ql.GraphQLVariablesMapImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = GraphQLVariablesMapImpl.class)
public interface GraphQLVariablesMap  {

   
   @NotNull
   @JsonAnyGetter
   public Map<String, JsonNode> values();

   @JsonAnySetter
   public void setValue(String key, JsonNode value);
   
   public static GraphQLVariablesMapImpl of(){
      return new GraphQLVariablesMapImpl();
   }
   

   public static GraphQLVariablesMapImpl of(final GraphQLVariablesMap template) {
      GraphQLVariablesMapImpl instance = new GraphQLVariablesMapImpl();
      return instance;
   }

}
