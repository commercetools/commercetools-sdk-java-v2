package com.commercetools.api.models.order_edit;


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
public final class OrderEditApplyImpl implements OrderEditApply {

   private Integer editVersion;
   
   private Integer resourceVersion;

   @JsonCreator
   OrderEditApplyImpl(@JsonProperty("editVersion") final Integer editVersion, @JsonProperty("resourceVersion") final Integer resourceVersion) {
      this.editVersion = editVersion;
      this.resourceVersion = resourceVersion;
   }
   public OrderEditApplyImpl() {
      
   }
   
   
   public Integer getEditVersion(){
      return this.editVersion;
   }
   
   
   public Integer getResourceVersion(){
      return this.resourceVersion;
   }

   public void setEditVersion(final Integer editVersion){
      this.editVersion = editVersion;
   }
   
   public void setResourceVersion(final Integer resourceVersion){
      this.resourceVersion = resourceVersion;
   }

}
