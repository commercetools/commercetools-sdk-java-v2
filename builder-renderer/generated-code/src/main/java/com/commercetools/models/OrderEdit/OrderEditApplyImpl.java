package com.commercetools.models.OrderEdit;

import java.lang.Integer;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditApplyImpl implements OrderEditApply {

   private java.lang.Integer resourceVersion;
   
   private java.lang.Integer editVersion;

   @JsonCreator
   OrderEditApplyImpl(@JsonProperty("resourceVersion") final java.lang.Integer resourceVersion, @JsonProperty("editVersion") final java.lang.Integer editVersion) {
      this.resourceVersion = resourceVersion;
      this.editVersion = editVersion;
   }
   public OrderEditApplyImpl() {
      
   }
   
   
   public java.lang.Integer getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public java.lang.Integer getEditVersion(){
      return this.editVersion;
   }

   public void setResourceVersion(final java.lang.Integer resourceVersion){
      this.resourceVersion = resourceVersion;
   }
   
   public void setEditVersion(final java.lang.Integer editVersion){
      this.editVersion = editVersion;
   }

}