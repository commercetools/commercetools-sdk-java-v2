package com.commercetools.models.OrderEdit;

import com.commercetools.models.OrderEdit.OrderEditResult;
import com.commercetools.models.OrderEdit.OrderExcerpt;
import java.lang.String;
import java.time.ZonedDateTime;
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
public final class OrderEditAppliedImpl implements OrderEditApplied {

   private java.lang.String type;
   
   private com.commercetools.models.OrderEdit.OrderExcerpt excerptAfterEdit;
   
   private com.commercetools.models.OrderEdit.OrderExcerpt excerptBeforeEdit;
   
   private java.time.ZonedDateTime appliedAt;

   @JsonCreator
   OrderEditAppliedImpl(@JsonProperty("excerptAfterEdit") final com.commercetools.models.OrderEdit.OrderExcerpt excerptAfterEdit, @JsonProperty("excerptBeforeEdit") final com.commercetools.models.OrderEdit.OrderExcerpt excerptBeforeEdit, @JsonProperty("appliedAt") final java.time.ZonedDateTime appliedAt) {
      this.excerptAfterEdit = excerptAfterEdit;
      this.excerptBeforeEdit = excerptBeforeEdit;
      this.appliedAt = appliedAt;
      this.type = "Applied";
   }
   public OrderEditAppliedImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.OrderEdit.OrderExcerpt getExcerptAfterEdit(){
      return this.excerptAfterEdit;
   }
   
   
   public com.commercetools.models.OrderEdit.OrderExcerpt getExcerptBeforeEdit(){
      return this.excerptBeforeEdit;
   }
   
   
   public java.time.ZonedDateTime getAppliedAt(){
      return this.appliedAt;
   }

   public void setExcerptAfterEdit(final com.commercetools.models.OrderEdit.OrderExcerpt excerptAfterEdit){
      this.excerptAfterEdit = excerptAfterEdit;
   }
   
   public void setExcerptBeforeEdit(final com.commercetools.models.OrderEdit.OrderExcerpt excerptBeforeEdit){
      this.excerptBeforeEdit = excerptBeforeEdit;
   }
   
   public void setAppliedAt(final java.time.ZonedDateTime appliedAt){
      this.appliedAt = appliedAt;
   }

}