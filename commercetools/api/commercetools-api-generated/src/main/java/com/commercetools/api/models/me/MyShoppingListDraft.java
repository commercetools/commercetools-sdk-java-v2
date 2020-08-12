package com.commercetools.api.models.me;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft;
import com.commercetools.api.models.shopping_list.TextLineItemDraft;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.me.MyShoppingListDraftImpl;

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
@JsonDeserialize(as = MyShoppingListDraftImpl.class)
public interface MyShoppingListDraft  {

   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   @Valid
   @JsonProperty("lineItems")
   public List<ShoppingListLineItemDraft> getLineItems();
   
   @Valid
   @JsonProperty("textLineItems")
   public List<TextLineItemDraft> getTextLineItems();
   /**
   *  <p>The custom fields.</p>
   */
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   /**
   *  <p>The shopping list will be deleted automatically if it hasn't been modified for the specified amount of days.</p>
   */
   
   @JsonProperty("deleteDaysAfterLastModification")
   public Long getDeleteDaysAfterLastModification();

   public void setName(final LocalizedString name);
   
   public void setDescription(final LocalizedString description);
   
   public void setLineItems(final List<ShoppingListLineItemDraft> lineItems);
   
   public void setTextLineItems(final List<TextLineItemDraft> textLineItems);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);
   
   public static MyShoppingListDraftImpl of(){
      return new MyShoppingListDraftImpl();
   }
   

   public static MyShoppingListDraftImpl of(final MyShoppingListDraft template) {
      MyShoppingListDraftImpl instance = new MyShoppingListDraftImpl();
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      instance.setLineItems(template.getLineItems());
      instance.setTextLineItems(template.getTextLineItems());
      instance.setCustom(template.getCustom());
      instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
      return instance;
   }

}
