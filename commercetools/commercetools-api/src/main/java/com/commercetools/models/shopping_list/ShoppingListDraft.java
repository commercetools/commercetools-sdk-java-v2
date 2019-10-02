package com.commercetools.models.shopping_list;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.customer.CustomerResourceIdentifier;
import com.commercetools.models.shopping_list.ShoppingListLineItemDraft;
import com.commercetools.models.shopping_list.TextLineItemDraft;
import com.commercetools.models.type.CustomFieldsDraft;
import com.commercetools.models.shopping_list.ShoppingListDraftImpl;

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
@JsonDeserialize(as = ShoppingListDraftImpl.class)
public interface ShoppingListDraft  {

   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   
   @Valid
   @JsonProperty("customer")
   public CustomerResourceIdentifier getCustomer();
   
   
   @JsonProperty("deleteDaysAfterLastModification")
   public Long getDeleteDaysAfterLastModification();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   
   @JsonProperty("key")
   public String getKey();
   
   @Valid
   @JsonProperty("lineItems")
   public List<ShoppingListLineItemDraft> getLineItems();
   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();
   
   @Valid
   @JsonProperty("textLineItems")
   public List<TextLineItemDraft> getTextLineItems();
   
   
   @JsonProperty("anonymousId")
   public String getAnonymousId();

   public void setCustom(final CustomFieldsDraft custom);
   
   public void setCustomer(final CustomerResourceIdentifier customer);
   
   public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);
   
   public void setDescription(final LocalizedString description);
   
   public void setKey(final String key);
   
   public void setLineItems(final List<ShoppingListLineItemDraft> lineItems);
   
   public void setName(final LocalizedString name);
   
   public void setSlug(final LocalizedString slug);
   
   public void setTextLineItems(final List<TextLineItemDraft> textLineItems);
   
   public void setAnonymousId(final String anonymousId);
   
   public static ShoppingListDraftImpl of(){
      return new ShoppingListDraftImpl();
   }
   

   public static ShoppingListDraftImpl of(final ShoppingListDraft template) {
      ShoppingListDraftImpl instance = new ShoppingListDraftImpl();
      instance.setLineItems(template.getLineItems());
      instance.setAnonymousId(template.getAnonymousId());
      instance.setTextLineItems(template.getTextLineItems());
      instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
      instance.setCustom(template.getCustom());
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      instance.setSlug(template.getSlug());
      instance.setKey(template.getKey());
      instance.setCustomer(template.getCustomer());
      return instance;
   }

}