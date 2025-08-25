
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>A <a href="https://docs.commercetools.com/apis/ctp:api:type:MyShoppingListDraft" rel="nofollow">MyShoppingListDraft</a> is the object submitted as payload to the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/shopping-lists:POST" rel="nofollow">Create MyShoppingList request</a>. The <code>customer</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a> is automatically set with a <span>password flow token</span>. The <code>anonymousId</code> is automatically set with a <span>token for an anonymous session</span>. The <code>key</code> and <code>slug</code> fields can not be set.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListDraftImpl implements MyShoppingListDraft, ModelBase {

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString description;

    private java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems;

    private java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private Long deleteDaysAfterLastModification;

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyShoppingListDraftImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems,
            @JsonProperty("textLineItems") final java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification,
            @JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.name = name;
        this.description = description;
        this.lineItems = lineItems;
        this.textLineItems = textLineItems;
        this.custom = custom;
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        this.store = store;
    }

    /**
     * create empty instance
     */
    public MyShoppingListDraftImpl() {
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Description of the ShoppingList.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">Line Items</a> (containing Products) to add to the ShoppingList.</p>
     */

    public java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">Line Items</a> (containing text values) to add to the ShoppingList.</p>
     */

    public java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> getTextLineItems() {
        return this.textLineItems;
    }

    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Number of days after the last modification before a ShoppingList is deleted. If not set, the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListsConfiguration" rel="nofollow">default value</a> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> is used.</p>
     */

    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    /**
     *  <p>Assigns the new ShoppingList to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>. The Store assignment can not be modified.</p>
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setLineItems(final com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
    }

    public void setLineItems(
            final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems) {
        this.lineItems = lineItems;
    }

    public void setTextLineItems(final com.commercetools.api.models.shopping_list.TextLineItemDraft... textLineItems) {
        this.textLineItems = new ArrayList<>(Arrays.asList(textLineItems));
    }

    public void setTextLineItems(
            final java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems) {
        this.textLineItems = textLineItems;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
    }

    public void setStore(final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyShoppingListDraftImpl that = (MyShoppingListDraftImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(description, that.description)
                .append(lineItems, that.lineItems)
                .append(textLineItems, that.textLineItems)
                .append(custom, that.custom)
                .append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .append(store, that.store)
                .append(name, that.name)
                .append(description, that.description)
                .append(lineItems, that.lineItems)
                .append(textLineItems, that.textLineItems)
                .append(custom, that.custom)
                .append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .append(store, that.store)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(description)
                .append(lineItems)
                .append(textLineItems)
                .append(custom)
                .append(deleteDaysAfterLastModification)
                .append(store)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("description", description)
                .append("lineItems", lineItems)
                .append("textLineItems", textLineItems)
                .append("custom", custom)
                .append("deleteDaysAfterLastModification", deleteDaysAfterLastModification)
                .append("store", store)
                .build();
    }

    @Override
    public MyShoppingListDraft copyDeep() {
        return MyShoppingListDraft.deepCopy(this);
    }
}
