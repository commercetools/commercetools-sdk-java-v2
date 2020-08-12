package com.commercetools.api.models.graph_ql;


import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class GraphQLErrorLocationImpl implements GraphQLErrorLocation {

   private Integer line;
   
   private Integer column;

   @JsonCreator
   GraphQLErrorLocationImpl(@JsonProperty("line") final Integer line, @JsonProperty("column") final Integer column) {
      this.line = line;
      this.column = column;
   }
   public GraphQLErrorLocationImpl() {
      
   }
   
   
   public Integer getLine(){
      return this.line;
   }
   
   
   public Integer getColumn(){
      return this.column;
   }

   public void setLine(final Integer line){
      this.line = line;
   }
   
   public void setColumn(final Integer column){
      this.column = column;
   }

}
