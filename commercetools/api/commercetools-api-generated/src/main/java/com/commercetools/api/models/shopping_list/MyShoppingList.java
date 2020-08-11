package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.LoggedResource;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.shopping_list.ShoppingListLineItem;
import com.commercetools.api.models.shopping_list.TextLineItem;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.shopping_list.MyShoppingListImpl;

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
@JsonDeserialize(as = MyShoppingListImpl.class)
public interface MyShoppingList extends LoggedResource {


   @NotNull
   @JsonProperty("id")
   public String getId();

   @NotNull
   @JsonProperty("version")
   public Long getVersion();

   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();

   @NotNull
   @JsonProperty("lastModifiedAt")
   public ZonedDateTime getLastModifiedAt();

   @Valid
   @JsonProperty("lastModifiedBy")
   public LastModifiedBy getLastModifiedBy();

   @Valid
   @JsonProperty("createdBy")
   public CreatedBy getCreatedBy();

   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();

   @Valid
   @JsonProperty("customer")
   public CustomerReference getCustomer();


   @JsonProperty("deleteDaysAfterLastModification")
   public Long getDeleteDaysAfterLastModification();

   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();


   @JsonProperty("key")
   public String getKey();

   @Valid
   @JsonProperty("lineItems")
   public List<ShoppingListLineItem> getLineItems();

   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();

   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();

   @Valid
   @JsonProperty("textLineItems")
   public List<TextLineItem> getTextLineItems();


   @JsonProperty("anonymousId")
   public String getAnonymousId();

   public void setId(final String id);

   public void setVersion(final Long version);

   public void setCreatedAt(final ZonedDateTime createdAt);

   public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

   public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

   public void setCreatedBy(final CreatedBy createdBy);

   public void setCustom(final CustomFields custom);

   public void setCustomer(final CustomerReference customer);

   public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

   public void setDescription(final LocalizedString description);

   public void setKey(final String key);

   public void setLineItems(final List<ShoppingListLineItem> lineItems);

   public void setName(final LocalizedString name);

   public void setSlug(final LocalizedString slug);

   public void setTextLineItems(final List<TextLineItem> textLineItems);

   public void setAnonymousId(final String anonymousId);

   public static MyShoppingListImpl of(){
      return new MyShoppingListImpl();
   }


   public static MyShoppingListImpl of(final MyShoppingList template) {
      MyShoppingListImpl instance = new MyShoppingListImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setAnonymousId(template.getAnonymousId());
      instance.setTextLineItems(template.getTextLineItems());
      instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
      instance.setCustom(template.getCustom());
      instance.setDescription(template.getDescription());
      instance.setLineItems(template.getLineItems());
      instance.setName(template.getName());
      instance.setSlug(template.getSlug());
      instance.setKey(template.getKey());
      instance.setCustomer(template.getCustomer());
      return instance;
   }

}
