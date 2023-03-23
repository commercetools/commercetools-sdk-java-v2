
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
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setName(final LocalizedString name);

    public void setKey(final String key);

    public void setCustomer(final CustomerReference customer);

    public void setSlug(final LocalizedString slug);

    public void setDescription(final LocalizedString description);

    @JsonIgnore
    public void setLineItems(final ShoppingListLineItem... lineItems);

    public void setLineItems(final List<ShoppingListLineItem> lineItems);

    @JsonIgnore
    public void setTextLineItems(final TextLineItem... textLineItems);

    public void setTextLineItems(final List<TextLineItem> textLineItems);

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    public void setAnonymousId(final String anonymousId);

    public void setStore(final StoreKeyReference store);

    public void setCustom(final CustomFields custom);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public static ShoppingList of() {
        return new ShoppingListImpl();
    }

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

    public static ShoppingListBuilder builder() {
        return ShoppingListBuilder.of();
    }

    public static ShoppingListBuilder builder(final ShoppingList template) {
        return ShoppingListBuilder.of(template);
    }

    default <T> T withShoppingList(Function<ShoppingList, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.SHOPPING_LIST;
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingList> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingList>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingList>";
            }
        };
    }
}
