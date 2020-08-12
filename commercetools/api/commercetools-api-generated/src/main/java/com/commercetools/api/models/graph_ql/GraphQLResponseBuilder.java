package com.commercetools.api.models.graph_ql;

import com.commercetools.api.models.graph_ql.GraphQLError;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.graph_ql.GraphQLResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class GraphQLResponseBuilder {
   
   @Nullable
   private com.fasterxml.jackson.databind.JsonNode data;
   
   @Nullable
   private java.util.List<com.commercetools.api.models.graph_ql.GraphQLError> errors;
   
   public GraphQLResponseBuilder data(@Nullable final com.fasterxml.jackson.databind.JsonNode data) {
      this.data = data;
      return this;
   }
   
   public GraphQLResponseBuilder errors(@Nullable final java.util.List<com.commercetools.api.models.graph_ql.GraphQLError> errors) {
      this.errors = errors;
      return this;
   }
   
   @Nullable
   public com.fasterxml.jackson.databind.JsonNode getData(){
      return this.data;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.models.graph_ql.GraphQLError> getErrors(){
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
