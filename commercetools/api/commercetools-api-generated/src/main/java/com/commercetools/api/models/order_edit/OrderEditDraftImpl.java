package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.OrderReference;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.CustomFieldsDraft;
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
public final class OrderEditDraftImpl implements OrderEditDraft {

   private Boolean dryRun;

   private com.commercetools.api.models.order.OrderReference resource;

   private com.commercetools.api.models.type.CustomFieldsDraft custom;

   private String comment;

   private java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions;

   private String key;

   @JsonCreator
   OrderEditDraftImpl(@JsonProperty("dryRun") final Boolean dryRun, @JsonProperty("resource") final com.commercetools.api.models.order.OrderReference resource, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("comment") final String comment, @JsonProperty("stagedActions") final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions, @JsonProperty("key") final String key) {
      this.dryRun = dryRun;
      this.resource = resource;
      this.custom = custom;
      this.comment = comment;
      this.stagedActions = stagedActions;
      this.key = key;
   }
   public OrderEditDraftImpl() {

   }

   /**
   *  <p>When set to <code>true</code> the edit is applied on the Order without persisting it.</p>
   */
   public Boolean getDryRun(){
      return this.dryRun;
   }

   /**
   *  <p>The order to be updated with this edit.</p>
   */
   public com.commercetools.api.models.order.OrderReference getResource(){
      return this.resource;
   }

   /**
   *  <p>The custom fields.</p>
   */
   public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }

   /**
   *  <p>This field can be used to add additional textual information regarding the edit.</p>
   */
   public String getComment(){
      return this.comment;
   }

   /**
   *  <p>The actions to apply to <code>resource</code>.</p>
   */
   public java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> getStagedActions(){
      return this.stagedActions;
   }

   /**
   *  <p>Unique identifier for this edit.</p>
   */
   public String getKey(){
      return this.key;
   }

   public void setDryRun(final Boolean dryRun){
      this.dryRun = dryRun;
   }

   public void setResource(final com.commercetools.api.models.order.OrderReference resource){
      this.resource = resource;
   }

   public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }

   public void setComment(final String comment){
      this.comment = comment;
   }

   public void setStagedActions(final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions){
      this.stagedActions = stagedActions;
   }

   public void setKey(final String key){
      this.key = key;
   }

}
