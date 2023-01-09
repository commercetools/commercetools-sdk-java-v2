
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

/**
 * ShoppingListDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListDraft shoppingListDraft = ShoppingListDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListDraftImpl.class)
public interface ShoppingListDraft extends com.commercetools.api.models.CustomizableDraft<ShoppingListDraft>,
        com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<ShoppingListDraft> {

    /**
     *  <p>Name of the ShoppingList.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related ShoppingList. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. The slug must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     */
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>The Customer the ShoppingList should be associated to.</p>
     */
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    /**
     *  <p>User-defined unique identifier for the ShoppingList.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Description of the ShoppingList.</p>
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Identifies ShoppingLists belonging to an anonymous session.</p>
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>Number of days after which the ShoppingList will be automatically deleted if it has not been modified. If not set, the default value configured in the Project is used.</p>
     */

    @JsonProperty("deleteDaysAfterLastModification")
    public Long getDeleteDaysAfterLastModification();

    /**
     *  <p>Line Items (containing Products) to add to the ShoppingList.</p>
     */
    @Valid
    @JsonProperty("lineItems")
    public List<ShoppingListLineItemDraft> getLineItems();

    /**
     *  <p>Line Items (containing text values) to add to the ShoppingList.</p>
     */
    @Valid
    @JsonProperty("textLineItems")
    public List<TextLineItemDraft> getTextLineItems();

    /**
     *  <p>Assigns the new ShoppingList to the Store.</p>
     */
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setName(final LocalizedString name);

    public void setSlug(final LocalizedString slug);

    public void setCustomer(final CustomerResourceIdentifier customer);

    public void setKey(final String key);

    public void setDescription(final LocalizedString description);

    public void setAnonymousId(final String anonymousId);

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    @JsonIgnore
    public void setLineItems(final ShoppingListLineItemDraft... lineItems);

    public void setLineItems(final List<ShoppingListLineItemDraft> lineItems);

    @JsonIgnore
    public void setTextLineItems(final TextLineItemDraft... textLineItems);

    public void setTextLineItems(final List<TextLineItemDraft> textLineItems);

    public void setStore(final StoreResourceIdentifier store);

    public void setCustom(final CustomFieldsDraft custom);

    public static ShoppingListDraft of() {
        return new ShoppingListDraftImpl();
    }

    public static ShoppingListDraft of(final ShoppingListDraft template) {
        ShoppingListDraftImpl instance = new ShoppingListDraftImpl();
        instance.setName(template.getName());
        instance.setSlug(template.getSlug());
        instance.setCustomer(template.getCustomer());
        instance.setKey(template.getKey());
        instance.setDescription(template.getDescription());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setLineItems(template.getLineItems());
        instance.setTextLineItems(template.getTextLineItems());
        instance.setStore(template.getStore());
        instance.setCustom(template.getCustom());
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
