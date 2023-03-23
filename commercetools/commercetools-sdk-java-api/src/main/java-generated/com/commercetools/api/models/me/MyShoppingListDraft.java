
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

/**
 *  <p>A MyShoppingListDraft is the object submitted as payload to the Create MyShoppingList request. The <code>customer</code> field of ShoppingList is automatically set with a password flow token. The <code>anonymousId</code> is automatically set with a token for an anonymous session. The <code>key</code> and <code>slug</code> fields can not be set.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListDraft myShoppingListDraft = MyShoppingListDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListDraftImpl.class)
public interface MyShoppingListDraft extends com.commercetools.api.models.CustomizableDraft<MyShoppingListDraft>,
        io.vrap.rmf.base.client.Draft<MyShoppingListDraft> {

    /**
     *  <p>Name of the ShoppingList.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Description of the ShoppingList.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

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
     *  <p>Custom Fields defined for the ShoppingList.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Number of days after which the ShoppingList will be automatically deleted if it has not been modified. If not set, the default value configured in the Project is used.</p>
     * @return deleteDaysAfterLastModification
     */

    @JsonProperty("deleteDaysAfterLastModification")
    public Long getDeleteDaysAfterLastModification();

    /**
     *  <p>Assigns the new ShoppingList to the Store. The Store assignment can not be modified.</p>
     * @return store
     */
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
