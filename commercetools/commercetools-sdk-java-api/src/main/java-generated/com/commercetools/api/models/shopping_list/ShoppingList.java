
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListImpl.class)
public interface ShoppingList extends BaseResource, com.commercetools.api.models.DomainResource<ShoppingList> {

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
    *  <p>Present on resources created after 2019-02-01 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 2019-02-01 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
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

    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

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

    @JsonIgnore
    public void setLineItems(final ShoppingListLineItem... lineItems);

    public void setLineItems(final List<ShoppingListLineItem> lineItems);

    public void setName(final LocalizedString name);

    public void setSlug(final LocalizedString slug);

    @JsonIgnore
    public void setTextLineItems(final TextLineItem... textLineItems);

    public void setTextLineItems(final List<TextLineItem> textLineItems);

    public void setAnonymousId(final String anonymousId);

    public void setStore(final StoreKeyReference store);

    public static ShoppingList of() {
        return new ShoppingListImpl();
    }

    public static ShoppingList of(final ShoppingList template) {
        ShoppingListImpl instance = new ShoppingListImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setCustom(template.getCustom());
        instance.setCustomer(template.getCustomer());
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setDescription(template.getDescription());
        instance.setKey(template.getKey());
        instance.setLineItems(template.getLineItems());
        instance.setName(template.getName());
        instance.setSlug(template.getSlug());
        instance.setTextLineItems(template.getTextLineItems());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setStore(template.getStore());
        return instance;
    }

    public static ShoppingListBuilder builder() {
        return ShoppingListBuilder.of();
    }

    public static ShoppingListBuilder builder(final ShoppingList template) {
        return ShoppingListBuilder.of(template);
    }

    default <T> T withShoppingList(Function<ShoppingList, T> helper) {
        return helper.apply(this);
    }
}
