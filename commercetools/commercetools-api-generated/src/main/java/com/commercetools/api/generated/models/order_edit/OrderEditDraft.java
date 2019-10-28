package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.OrderReference;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import com.commercetools.api.generated.models.order_edit.OrderEditDraftImpl;

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
@JsonDeserialize(as = OrderEditDraftImpl.class)
public interface OrderEditDraft  {

   
   
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @Valid
   @JsonProperty("resource")
   public OrderReference getResource();
   
   @Valid
   @JsonProperty("stagedActions")
   public List<StagedOrderUpdateAction> getStagedActions();
   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   
   
   @JsonProperty("comment")
   public String getComment();
   
   
   @JsonProperty("dryRun")
   public Boolean getDryRun();

   public void setKey(final String key);
   
   public void setResource(final OrderReference resource);
   
   public void setStagedActions(final List<StagedOrderUpdateAction> stagedActions);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public void setComment(final String comment);
   
   public void setDryRun(final Boolean dryRun);
   
   public static OrderEditDraftImpl of(){
      return new OrderEditDraftImpl();
   }
   

   public static OrderEditDraftImpl of(final OrderEditDraft template) {
      OrderEditDraftImpl instance = new OrderEditDraftImpl();
      instance.setDryRun(template.getDryRun());
      instance.setResource(template.getResource());
      instance.setCustom(template.getCustom());
      instance.setComment(template.getComment());
      instance.setStagedActions(template.getStagedActions());
      instance.setKey(template.getKey());
      return instance;
   }

}