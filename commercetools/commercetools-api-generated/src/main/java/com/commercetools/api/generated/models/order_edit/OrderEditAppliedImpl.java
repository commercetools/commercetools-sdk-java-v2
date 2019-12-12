package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order_edit.OrderEditResult;
import com.commercetools.api.generated.models.order_edit.OrderExcerpt;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditAppliedImpl implements OrderEditApplied {

   private String type;
   
   private com.commercetools.api.generated.models.order_edit.OrderExcerpt excerptAfterEdit;
   
   private com.commercetools.api.generated.models.order_edit.OrderExcerpt excerptBeforeEdit;
   
   private java.time.ZonedDateTime appliedAt;

   @JsonCreator
   OrderEditAppliedImpl(@JsonProperty("excerptAfterEdit") final com.commercetools.api.generated.models.order_edit.OrderExcerpt excerptAfterEdit, @JsonProperty("excerptBeforeEdit") final com.commercetools.api.generated.models.order_edit.OrderExcerpt excerptBeforeEdit, @JsonProperty("appliedAt") final java.time.ZonedDateTime appliedAt) {
      this.excerptAfterEdit = excerptAfterEdit;
      this.excerptBeforeEdit = excerptBeforeEdit;
      this.appliedAt = appliedAt;
      this.type = "Applied";
   }
   public OrderEditAppliedImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.api.generated.models.order_edit.OrderExcerpt getExcerptAfterEdit(){
      return this.excerptAfterEdit;
   }
   
   
   public com.commercetools.api.generated.models.order_edit.OrderExcerpt getExcerptBeforeEdit(){
      return this.excerptBeforeEdit;
   }
   
   
   public java.time.ZonedDateTime getAppliedAt(){
      return this.appliedAt;
   }

   public void setExcerptAfterEdit(final com.commercetools.api.generated.models.order_edit.OrderExcerpt excerptAfterEdit){
      this.excerptAfterEdit = excerptAfterEdit;
   }
   
   public void setExcerptBeforeEdit(final com.commercetools.api.generated.models.order_edit.OrderExcerpt excerptBeforeEdit){
      this.excerptBeforeEdit = excerptBeforeEdit;
   }
   
   public void setAppliedAt(final java.time.ZonedDateTime appliedAt){
      this.appliedAt = appliedAt;
   }

}