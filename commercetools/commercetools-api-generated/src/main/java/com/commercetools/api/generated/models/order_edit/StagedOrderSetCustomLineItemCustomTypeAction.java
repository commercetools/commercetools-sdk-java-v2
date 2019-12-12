package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.type.FieldContainer;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomLineItemCustomTypeActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = StagedOrderSetCustomLineItemCustomTypeActionImpl.class)
public interface StagedOrderSetCustomLineItemCustomTypeAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();
   
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   
   @Valid
   @JsonProperty("fields")
   public FieldContainer getFields();

   public void setCustomLineItemId(final String customLineItemId);
   
   public void setType(final TypeResourceIdentifier type);
   
   public void setFields(final FieldContainer fields);
   
   public static StagedOrderSetCustomLineItemCustomTypeActionImpl of(){
      return new StagedOrderSetCustomLineItemCustomTypeActionImpl();
   }
   

   public static StagedOrderSetCustomLineItemCustomTypeActionImpl of(final StagedOrderSetCustomLineItemCustomTypeAction template) {
      StagedOrderSetCustomLineItemCustomTypeActionImpl instance = new StagedOrderSetCustomLineItemCustomTypeActionImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setFields(template.getFields());
      instance.setType(template.getType());
      return instance;
   }

}