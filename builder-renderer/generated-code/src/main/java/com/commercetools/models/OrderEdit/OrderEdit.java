package com.commercetools.models.OrderEdit;

import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Order.OrderReference;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import com.commercetools.models.OrderEdit.OrderEditResult;
import com.commercetools.models.Type.CustomFields;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.OrderEdit.OrderEditImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderEditImpl.class)
public interface OrderEdit extends LoggedResource {

   
   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();
   
   @NotNull
   @JsonProperty("lastModifiedAt")
   public ZonedDateTime getLastModifiedAt();
   
   
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @Valid
   @JsonProperty("resource")
   public OrderReference getResource();
   
   @NotNull
   @Valid
   @JsonProperty("stagedActions")
   public List<StagedOrderUpdateAction> getStagedActions();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   
   @NotNull
   @Valid
   @JsonProperty("result")
   public OrderEditResult getResult();
   
   
   @JsonProperty("comment")
   public String getComment();

   public void setCreatedAt(final ZonedDateTime createdAt);
   
   public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
   
   public void setKey(final String key);
   
   public void setResource(final OrderReference resource);
   
   public void setStagedActions(final List<StagedOrderUpdateAction> stagedActions);
   
   public void setCustom(final CustomFields custom);
   
   public void setResult(final OrderEditResult result);
   
   public void setComment(final String comment);
   
   public static OrderEditImpl of(){
      return new OrderEditImpl();
   }
   

   public static OrderEditImpl of(final OrderEdit template) {
      OrderEditImpl instance = new OrderEditImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setResult(template.getResult());
      instance.setResource(template.getResource());
      instance.setCustom(template.getCustom());
      instance.setComment(template.getComment());
      instance.setStagedActions(template.getStagedActions());
      instance.setKey(template.getKey());
      return instance;
   }

}