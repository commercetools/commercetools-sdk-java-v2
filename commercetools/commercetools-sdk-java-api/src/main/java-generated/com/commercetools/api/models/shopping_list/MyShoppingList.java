
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
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyShoppingListImpl.class)
public interface MyShoppingList extends BaseResource, com.commercetools.api.models.DomainResource<MyShoppingList> {

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

    @JsonIgnore
    public void setLineItems(final ShoppingListLineItem... lineItems);

    public void setLineItems(final List<ShoppingListLineItem> lineItems);

    public void setName(final LocalizedString name);

    public void setSlug(final LocalizedString slug);

    @JsonIgnore
    public void setTextLineItems(final TextLineItem... textLineItems);

    public void setTextLineItems(final List<TextLineItem> textLineItems);

    public void setAnonymousId(final String anonymousId);

    public static MyShoppingList of() {
        return new MyShoppingListImpl();
    }

    public static MyShoppingList of(final MyShoppingList template) {
        MyShoppingListImpl instance = new MyShoppingListImpl();
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
        return instance;
    }

    public static MyShoppingListBuilder builder() {
        return MyShoppingListBuilder.of();
    }

    public static MyShoppingListBuilder builder(final MyShoppingList template) {
        return MyShoppingListBuilder.of(template);
    }

    default <T> T withMyShoppingList(Function<MyShoppingList, T> helper) {
        return helper.apply(this);
    }
}
