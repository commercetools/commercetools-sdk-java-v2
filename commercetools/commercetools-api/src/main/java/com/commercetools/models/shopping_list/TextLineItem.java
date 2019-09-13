package com.commercetools.models.shopping_list;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.type.CustomFields;
import java.lang.Integer;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.shopping_list.TextLineItemImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = TextLineItemImpl.class)
public interface TextLineItem  {

   
   @NotNull
   @JsonProperty("addedAt")
   public ZonedDateTime getAddedAt();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   @NotNull
   @JsonProperty("id")
   public String getId();
   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   @NotNull
   @JsonProperty("quantity")
   public Integer getQuantity();

   public void setAddedAt(final ZonedDateTime addedAt);
   
   public void setCustom(final CustomFields custom);
   
   public void setDescription(final LocalizedString description);
   
   public void setId(final String id);
   
   public void setName(final LocalizedString name);
   
   public void setQuantity(final Integer quantity);
   
   public static TextLineItemImpl of(){
      return new TextLineItemImpl();
   }
   

   public static TextLineItemImpl of(final TextLineItem template) {
      TextLineItemImpl instance = new TextLineItemImpl();
      instance.setAddedAt(template.getAddedAt());
      instance.setQuantity(template.getQuantity());
      instance.setCustom(template.getCustom());
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      instance.setId(template.getId());
      return instance;
   }

}