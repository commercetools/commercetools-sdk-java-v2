package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.databind.JsonNode;
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
public final class OrderEditSetCustomTypeActionImpl implements OrderEditSetCustomTypeAction {

   private String action;

   private com.fasterxml.jackson.databind.JsonNode fields;

   private com.commercetools.api.models.type.TypeResourceIdentifier type;

   @JsonCreator
   OrderEditSetCustomTypeActionImpl(@JsonProperty("fields") final com.fasterxml.jackson.databind.JsonNode fields, @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type) {
      this.fields = fields;
      this.type = type;
      this.action = "setCustomType";
   }
   public OrderEditSetCustomTypeActionImpl() {

   }


   public String getAction(){
      return this.action;
   }

   /**
   *  <p>If set, the custom fields are set to this new value.</p>
   */
   public com.fasterxml.jackson.databind.JsonNode getFields(){
      return this.fields;
   }

   /**
   *  <p>If set, the custom type is set to this new value.
   *  If absent, the custom type and any existing custom fields are removed.</p>
   */
   public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public void setFields(final com.fasterxml.jackson.databind.JsonNode fields){
      this.fields = fields;
   }

   public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type){
      this.type = type;
   }

}
