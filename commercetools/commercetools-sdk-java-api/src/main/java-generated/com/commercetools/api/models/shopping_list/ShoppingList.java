
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

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

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ShoppingList
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingList shoppingList = ShoppingList.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name(nameBuilder -> nameBuilder)
 *             .plusLineItems(lineItemsBuilder -> lineItemsBuilder)
 *             .plusTextLineItems(textLineItemsBuilder -> textLineItemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListImpl.class)
public interface ShoppingList
        extends BaseResource, ShoppingListMixin, com.commercetools.api.models.DomainResource<ShoppingList>,
        com.commercetools.api.models.Referencable<ShoppingList>,
        com.commercetools.api.models.ResourceIdentifiable<ShoppingList>,
        com.commercetools.api.models.Customizable<ShoppingList>, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the ShoppingList.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the ShoppingList.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Name of the ShoppingList.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>User-defined unique identifier of the ShoppingList.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Reference to a Customer associated with the ShoppingList.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related ShoppingList. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. The slug must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>. For good performance, indexes are provided for the first 15 <code>languages</code> set on the Project.</p>
     * @return slug
     */
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>Description of the ShoppingList.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Line Items (containing Products) of the ShoppingList.</p>
     * @return lineItems
     */
    @NotNull
    @Valid
    @JsonProperty("lineItems")
    public List<ShoppingListLineItem> getLineItems();

    /**
     *  <p>Line Items (containing text values) of the ShoppingList.</p>
     * @return textLineItems
     */
    @NotNull
    @Valid
    @JsonProperty("textLineItems")
    public List<TextLineItem> getTextLineItems();

    /**
     *  <p>Number of days after which the ShoppingList will be automatically deleted if it has not been modified.</p>
     * @return deleteDaysAfterLastModification
     */

    @JsonProperty("deleteDaysAfterLastModification")
    public Long getDeleteDaysAfterLastModification();

    /**
     *  <p>Identifies ShoppingLists belonging to an anonymous session.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>Store to which the ShoppingList is assigned.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Date and time (UTC) the ShoppingList was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the ShoppingList was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the ShoppingList.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the ShoppingList.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Unique identifier of the ShoppingList.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the ShoppingList.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Name of the ShoppingList.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>User-defined unique identifier of the ShoppingList.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Reference to a Customer associated with the ShoppingList.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerReference customer);

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related ShoppingList. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. The slug must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>. For good performance, indexes are provided for the first 15 <code>languages</code> set on the Project.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>Description of the ShoppingList.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Line Items (containing Products) of the ShoppingList.</p>
     * @param lineItems values to be set
     */

    @JsonIgnore
    public void setLineItems(final ShoppingListLineItem... lineItems);

    /**
     *  <p>Line Items (containing Products) of the ShoppingList.</p>
     * @param lineItems values to be set
     */

    public void setLineItems(final List<ShoppingListLineItem> lineItems);

    /**
     *  <p>Line Items (containing text values) of the ShoppingList.</p>
     * @param textLineItems values to be set
     */

    @JsonIgnore
    public void setTextLineItems(final TextLineItem... textLineItems);

    /**
     *  <p>Line Items (containing text values) of the ShoppingList.</p>
     * @param textLineItems values to be set
     */

    public void setTextLineItems(final List<TextLineItem> textLineItems);

    /**
     *  <p>Number of days after which the ShoppingList will be automatically deleted if it has not been modified.</p>
     * @param deleteDaysAfterLastModification value to be set
     */

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    /**
     *  <p>Identifies ShoppingLists belonging to an anonymous session.</p>
     * @param anonymousId value to be set
     */

    public void setAnonymousId(final String anonymousId);

    /**
     *  <p>Store to which the ShoppingList is assigned.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>Date and time (UTC) the ShoppingList was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the ShoppingList was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the ShoppingList.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the ShoppingList.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     * factory method
     * @return instance of ShoppingList
     */
    public static ShoppingList of() {
        return new ShoppingListImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingList
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingList of(final ShoppingList template) {
        ShoppingListImpl instance = new ShoppingListImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setName(template.getName());
        instance.setKey(template.getKey());
        instance.setCustomer(template.getCustomer());
        instance.setSlug(template.getSlug());
        instance.setDescription(template.getDescription());
        instance.setLineItems(template.getLineItems());
        instance.setTextLineItems(template.getTextLineItems());
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setStore(template.getStore());
        instance.setCustom(template.getCustom());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShoppingList
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingList deepCopy(@Nullable final ShoppingList template) {
        if (template == null) {
            return null;
        }
        ShoppingListImpl instance = new ShoppingListImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setKey(template.getKey());
        instance.setCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getCustomer()));
        instance.setSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setLineItems(Optional.ofNullable(template.getLineItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.shopping_list.ShoppingListLineItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTextLineItems(Optional.ofNullable(template.getTextLineItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.shopping_list.TextLineItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        return instance;
    }

    /**
     * builder factory method for ShoppingList
     * @return builder
     */
    public static ShoppingListBuilder builder() {
        return ShoppingListBuilder.of();
    }

    /**
     * create builder for ShoppingList instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListBuilder builder(final ShoppingList template) {
        return ShoppingListBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingList(Function<ShoppingList, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.SHOPPING_LIST;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingList> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingList>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingList>";
            }
        };
    }
}
