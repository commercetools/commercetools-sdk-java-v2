package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft;
import com.commercetools.api.models.shopping_list.TextLineItemDraft;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ShoppingListDraft
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShoppingListDraftImpl implements ShoppingListDraft, ModelBase {

    
    private com.commercetools.api.models.common.LocalizedString name;
    
    
    private com.commercetools.api.models.common.LocalizedString slug;
    
    
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;
    
    
    private String key;
    
    
    private com.commercetools.api.models.common.LocalizedString description;
    
    
    private String anonymousId;
    
    
    private Long deleteDaysAfterLastModification;
    
    
    private java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems;
    
    
    private java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems;
    
    
    private com.commercetools.api.models.store.StoreResourceIdentifier store;
    
    
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShoppingListDraftImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug, @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer, @JsonProperty("key") final String key, @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description, @JsonProperty("anonymousId") final String anonymousId, @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification, @JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems, @JsonProperty("textLineItems") final java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems, @JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.name = name;
        this.slug = slug;
        this.customer = customer;
        this.key = key;
        this.description = description;
        this.anonymousId = anonymousId;
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        this.lineItems = lineItems;
        this.textLineItems = textLineItems;
        this.store = store;
        this.custom = custom;
    }
    /**
     * create empty instance
     */
    public ShoppingListDraftImpl() {
    }

    /**
     *  <p>Name of the ShoppingList.</p>
     */
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related ShoppingList. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. The slug must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     */
    
    public com.commercetools.api.models.common.LocalizedString getSlug(){
        return this.slug;
    }
    
    /**
     *  <p>The Customer the ShoppingList should be associated to.</p>
     */
    
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer(){
        return this.customer;
    }
    
    /**
     *  <p>User-defined unique identifier for the ShoppingList.</p>
     */
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>Description of the ShoppingList.</p>
     */
    
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    /**
     *  <p>Identifies ShoppingLists belonging to an anonymous session.</p>
     */
    
    public String getAnonymousId(){
        return this.anonymousId;
    }
    
    /**
     *  <p>Number of days after which the ShoppingList will be automatically deleted if it has not been modified. If not set, the default value configured in the Project is used.</p>
     */
    
    public Long getDeleteDaysAfterLastModification(){
        return this.deleteDaysAfterLastModification;
    }
    
    /**
     *  <p>Line Items (containing Products) to add to the ShoppingList.</p>
     */
    
    public java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> getLineItems(){
        return this.lineItems;
    }
    
    /**
     *  <p>Line Items (containing text values) to add to the ShoppingList.</p>
     */
    
    public java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> getTextLineItems(){
        return this.textLineItems;
    }
    
    /**
     *  <p>Assigns the new ShoppingList to the Store.</p>
     */
    
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore(){
        return this.store;
    }
    
    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     */
    
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }

    
    public void setName(final com.commercetools.api.models.common.LocalizedString name){
        this.name = name;
    }
    
    
    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug){
        this.slug = slug;
    }
    
    
    public void setCustomer(final com.commercetools.api.models.customer.CustomerResourceIdentifier customer){
        this.customer = customer;
    }
    
    
    public void setKey(final String key){
        this.key = key;
    }
    
    
    public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
        this.description = description;
    }
    
    
    public void setAnonymousId(final String anonymousId){
        this.anonymousId = anonymousId;
    }
    
    
    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification){
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
    }
    
    
    public void setLineItems(final com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft ...lineItems){
       this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
    }
    
    
    public void setLineItems(final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems){
       this.lineItems = lineItems;
    }
    
    
    public void setTextLineItems(final com.commercetools.api.models.shopping_list.TextLineItemDraft ...textLineItems){
       this.textLineItems = new ArrayList<>(Arrays.asList(textLineItems));
    }
    
    
    public void setTextLineItems(final java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems){
       this.textLineItems = textLineItems;
    }
    
    
    public void setStore(final com.commercetools.api.models.store.StoreResourceIdentifier store){
        this.store = store;
    }
    
    
    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ShoppingListDraftImpl that = (ShoppingListDraftImpl) o;
    
        return new EqualsBuilder()
                .append(name, that.name)
                .append(slug, that.slug)
                .append(customer, that.customer)
                .append(key, that.key)
                .append(description, that.description)
                .append(anonymousId, that.anonymousId)
                .append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .append(lineItems, that.lineItems)
                .append(textLineItems, that.textLineItems)
                .append(store, that.store)
                .append(custom, that.custom)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(name)
            .append(slug)
            .append(customer)
            .append(key)
            .append(description)
            .append(anonymousId)
            .append(deleteDaysAfterLastModification)
            .append(lineItems)
            .append(textLineItems)
            .append(store)
            .append(custom)
            .toHashCode();
    }

}
