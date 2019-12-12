package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.customer.CustomerReference;
import com.commercetools.api.generated.models.shopping_list.ShoppingListLineItem;
import com.commercetools.api.generated.models.shopping_list.TextLineItem;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.shopping_list.ShoppingListImpl;

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
@JsonDeserialize(as = ShoppingListImpl.class)
public interface ShoppingList extends LoggedResource {

   /**
   *  <p>The unique ID of the shopping list.</p>
   */
   @NotNull
   @JsonProperty("id")
   public String getId();
   /**
   *  <p>The current version of the shopping list.</p>
   */
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();
   
   @NotNull
   @JsonProperty("lastModifiedAt")
   public ZonedDateTime getLastModifiedAt();
   /**
   *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("lastModifiedBy")
   public LastModifiedBy getLastModifiedBy();
   /**
   *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("createdBy")
   public CreatedBy getCreatedBy();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   
   @Valid
   @JsonProperty("customer")
   public CustomerReference getCustomer();
   /**
   *  <p>The shopping list will be deleted automatically if it hasn't been modified for the specified amount of days.</p>
   */
   
   @JsonProperty("deleteDaysAfterLastModification")
   public Long getDeleteDaysAfterLastModification();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   /**
   *  <p>User-specific unique identifier for the shopping list.</p>
   */
   
   @JsonProperty("key")
   public String getKey();
   
   @Valid
   @JsonProperty("lineItems")
   public List<ShoppingListLineItem> getLineItems();
   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   /**
   *  <p>Human-readable identifiers usually used as deep-link URL to the related shopping list.
   *  Each slug is unique across a project, but a shopping list can have the same slug for different languages.
   *  The slug must match the pattern [a-zA-Z0-9_-]{2,256}.</p>
   */
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();
   
   @Valid
   @JsonProperty("textLineItems")
   public List<TextLineItem> getTextLineItems();
   /**
   *  <p>Identifies shopping lists belonging to an anonymous session (the customer has not signed up/in yet).</p>
   */
   
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
   
   public static ShoppingListImpl of(){
      return new ShoppingListImpl();
   }
   

   public static ShoppingListImpl of(final ShoppingList template) {
      ShoppingListImpl instance = new ShoppingListImpl();
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