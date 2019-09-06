package com.commercetools.models.ShoppingList;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.ShoppingList.ShoppingListAddTextLineItemActionImpl;

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
@JsonDeserialize(as = ShoppingListAddTextLineItemActionImpl.class)
public interface ShoppingListAddTextLineItemAction extends ShoppingListUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   
   @JsonProperty("quantity")
   public Long getQuantity();
   
   
   @JsonProperty("addedAt")
   public ZonedDateTime getAddedAt();
   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();

   public void setName(final LocalizedString name);
   
   public void setDescription(final LocalizedString description);
   
   public void setQuantity(final Long quantity);
   
   public void setAddedAt(final ZonedDateTime addedAt);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public static ShoppingListAddTextLineItemActionImpl of(){
      return new ShoppingListAddTextLineItemActionImpl();
   }
   

   public static ShoppingListAddTextLineItemActionImpl of(final ShoppingListAddTextLineItemAction template) {
      ShoppingListAddTextLineItemActionImpl instance = new ShoppingListAddTextLineItemActionImpl();
      instance.setAddedAt(template.getAddedAt());
      instance.setQuantity(template.getQuantity());
      instance.setCustom(template.getCustom());
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      return instance;
   }

}