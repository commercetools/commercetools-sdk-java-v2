
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListDraftImpl.class)
public interface ShoppingListDraft {

    /**
    *  <p>The custom fields.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

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
    public List<ShoppingListLineItemDraft> getLineItems();

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
    public List<TextLineItemDraft> getTextLineItems();

    /**
    *  <p>Identifies shopping lists belonging to an anonymous session (the customer has not signed up/in yet).</p>
    */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    public void setCustom(final CustomFieldsDraft custom);

    public void setCustomer(final CustomerResourceIdentifier customer);

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    public void setDescription(final LocalizedString description);

    public void setKey(final String key);

    @JsonIgnore
    public void setLineItems(final ShoppingListLineItemDraft... lineItems);

    public void setLineItems(final List<ShoppingListLineItemDraft> lineItems);

    public void setName(final LocalizedString name);

    public void setSlug(final LocalizedString slug);

    @JsonIgnore
    public void setTextLineItems(final TextLineItemDraft... textLineItems);

    public void setTextLineItems(final List<TextLineItemDraft> textLineItems);

    public void setAnonymousId(final String anonymousId);

    public void setStore(final StoreResourceIdentifier store);

    public static ShoppingListDraft of() {
        return new ShoppingListDraftImpl();
    }

    public static ShoppingListDraft of(final ShoppingListDraft template) {
        ShoppingListDraftImpl instance = new ShoppingListDraftImpl();
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

    public static ShoppingListDraftBuilder builder() {
        return ShoppingListDraftBuilder.of();
    }

    public static ShoppingListDraftBuilder builder(final ShoppingListDraft template) {
        return ShoppingListDraftBuilder.of(template);
    }

    default <T> T withShoppingListDraft(Function<ShoppingListDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListDraft>";
            }
        };
    }
}
