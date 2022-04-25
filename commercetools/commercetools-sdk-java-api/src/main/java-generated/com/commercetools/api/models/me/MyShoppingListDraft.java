
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft;
import com.commercetools.api.models.shopping_list.TextLineItemDraft;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyShoppingListDraftImpl.class)
public interface MyShoppingListDraft extends com.commercetools.api.models.CustomizableDraft<MyShoppingListDraft> {

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

    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    @JsonIgnore
    public void setLineItems(final ShoppingListLineItemDraft... lineItems);

    public void setLineItems(final List<ShoppingListLineItemDraft> lineItems);

    @JsonIgnore
    public void setTextLineItems(final TextLineItemDraft... textLineItems);

    public void setTextLineItems(final List<TextLineItemDraft> textLineItems);

    public void setCustom(final CustomFieldsDraft custom);

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    public void setStore(final StoreResourceIdentifier store);

    public static MyShoppingListDraft of() {
        return new MyShoppingListDraftImpl();
    }

    public static MyShoppingListDraft of(final MyShoppingListDraft template) {
        MyShoppingListDraftImpl instance = new MyShoppingListDraftImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setLineItems(template.getLineItems());
        instance.setTextLineItems(template.getTextLineItems());
        instance.setCustom(template.getCustom());
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setStore(template.getStore());
        return instance;
    }

    public static MyShoppingListDraftBuilder builder() {
        return MyShoppingListDraftBuilder.of();
    }

    public static MyShoppingListDraftBuilder builder(final MyShoppingListDraft template) {
        return MyShoppingListDraftBuilder.of(template);
    }

    default <T> T withMyShoppingListDraft(Function<MyShoppingListDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListDraft>";
            }
        };
    }
}
