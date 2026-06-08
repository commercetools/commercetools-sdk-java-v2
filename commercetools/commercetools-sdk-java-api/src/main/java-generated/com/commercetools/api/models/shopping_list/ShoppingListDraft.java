
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related ShoppingList. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. The slug must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     * @return slug
     */
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> the ShoppingList should be associated to.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    /**
     *  <p>User-defined unique identifier for the ShoppingList.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Description of the ShoppingList.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Identifies ShoppingLists belonging to an <a href="https://docs.commercetools.com/apis/ctp:api:type:AnonymousSession" rel="nofollow">anonymous session</a>.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>Number of days after the last modification before a ShoppingList is deleted. If not set, the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListsConfiguration" rel="nofollow">default value</a> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> is used.</p>
     * @return deleteDaysAfterLastModification
     */

    @JsonProperty("deleteDaysAfterLastModification")
    public Long getDeleteDaysAfterLastModification();

    /**
     *  <p>Line Items (containing Products) to add to the ShoppingList.</p>
     * @return lineItems
     */
    @Valid
    @JsonProperty("lineItems")
    public List<ShoppingListLineItemDraft> getLineItems();

    /**
     *  <p>Line Items (containing text values) to add to the ShoppingList.</p>
     * @return textLineItems
     */
    @Valid
    @JsonProperty("textLineItems")
    public List<TextLineItemDraft> getTextLineItems();

    /**
     *  <p>Assigns the new ShoppingList to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> of the Business Unit the Shopping List should belong to. When the <code>customer</code> of the Shopping List is set, the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> must be an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> of the Business Unit. Only available for <span>B2B</span>-enabled Projects.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitResourceIdentifier getBusinessUnit();

    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Name of the ShoppingList.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related ShoppingList. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. The slug must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> the ShoppingList should be associated to.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerResourceIdentifier customer);

    /**
     *  <p>User-defined unique identifier for the ShoppingList.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Description of the ShoppingList.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Identifies ShoppingLists belonging to an <a href="https://docs.commercetools.com/apis/ctp:api:type:AnonymousSession" rel="nofollow">anonymous session</a>.</p>
     * @param anonymousId value to be set
     */

    public void setAnonymousId(final String anonymousId);

    /**
     *  <p>Number of days after the last modification before a ShoppingList is deleted. If not set, the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListsConfiguration" rel="nofollow">default value</a> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> is used.</p>
     * @param deleteDaysAfterLastModification value to be set
     */

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    /**
     *  <p>Line Items (containing Products) to add to the ShoppingList.</p>
     * @param lineItems values to be set
     */

    @JsonIgnore
    public void setLineItems(final ShoppingListLineItemDraft... lineItems);

    /**
     *  <p>Line Items (containing Products) to add to the ShoppingList.</p>
     * @param lineItems values to be set
     */

    public void setLineItems(final List<ShoppingListLineItemDraft> lineItems);

    /**
     *  <p>Line Items (containing text values) to add to the ShoppingList.</p>
     * @param textLineItems values to be set
     */

    @JsonIgnore
    public void setTextLineItems(final TextLineItemDraft... textLineItems);

    /**
     *  <p>Line Items (containing text values) to add to the ShoppingList.</p>
     * @param textLineItems values to be set
     */

    public void setTextLineItems(final List<TextLineItemDraft> textLineItems);

    /**
     *  <p>Assigns the new ShoppingList to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param store value to be set
     */

    public void setStore(final StoreResourceIdentifier store);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> of the Business Unit the Shopping List should belong to. When the <code>customer</code> of the Shopping List is set, the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> must be an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> of the Business Unit. Only available for <span>B2B</span>-enabled Projects.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitResourceIdentifier businessUnit);

    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of ShoppingListDraft
     */
    public static ShoppingListDraft of() {
        return new ShoppingListDraftImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListDraft
     * @param template instance to be copied
     * @return copy instance
     */
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
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public ShoppingListDraft copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListDraft deepCopy(@Nullable final ShoppingListDraft template) {
        if (template == null) {
            return null;
        }
        ShoppingListDraftImpl instance = new ShoppingListDraftImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setCustomer(
            com.commercetools.api.models.customer.CustomerResourceIdentifier.deepCopy(template.getCustomer()));
        instance.setKey(template.getKey());
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setAnonymousId(template.getAnonymousId());
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setLineItems(Optional.ofNullable(template.getLineItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTextLineItems(Optional.ofNullable(template.getTextLineItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.shopping_list.TextLineItemDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setStore(com.commercetools.api.models.store.StoreResourceIdentifier.deepCopy(template.getStore()));
        instance.setBusinessUnit(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier
                .deepCopy(template.getBusinessUnit()));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for ShoppingListDraft
     * @return builder
     */
    public static ShoppingListDraftBuilder builder() {
        return ShoppingListDraftBuilder.of();
    }

    /**
     * create builder for ShoppingListDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListDraftBuilder builder(final ShoppingListDraft template) {
        return ShoppingListDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListDraft(Function<ShoppingListDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListDraft>";
            }
        };
    }
}
