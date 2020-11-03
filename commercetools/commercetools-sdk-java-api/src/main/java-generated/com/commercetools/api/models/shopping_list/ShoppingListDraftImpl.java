package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft;
import com.commercetools.api.models.shopping_list.TextLineItemDraft;
import com.commercetools.api.models.type.CustomFieldsDraft;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListDraftImpl implements ShoppingListDraft {

    private com.commercetools.api.models.type.CustomFieldsDraft custom;
    
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;
    
    private Long deleteDaysAfterLastModification;
    
    private com.commercetools.api.models.common.LocalizedString description;
    
    private String key;
    
    private java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems;
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    private com.commercetools.api.models.common.LocalizedString slug;
    
    private java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems;
    
    private String anonymousId;

    @JsonCreator
    ShoppingListDraftImpl(@JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer, @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification, @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description, @JsonProperty("key") final String key, @JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug, @JsonProperty("textLineItems") final java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems, @JsonProperty("anonymousId") final String anonymousId) {
        this.custom = custom;
        this.customer = customer;
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        this.description = description;
        this.key = key;
        this.lineItems = lineItems;
        this.name = name;
        this.slug = slug;
        this.textLineItems = textLineItems;
        this.anonymousId = anonymousId;
    }
    public ShoppingListDraftImpl() {
       
    }

    /**
    *  <p>The custom fields.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }
    
    
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer(){
        return this.customer;
    }
    
    /**
    *  <p>The shopping list will be deleted automatically if it hasn't been modified for the specified amount of days.</p>
    */
    public Long getDeleteDaysAfterLastModification(){
        return this.deleteDaysAfterLastModification;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    /**
    *  <p>User-specific unique identifier for the shopping list.</p>
    */
    public String getKey(){
        return this.key;
    }
    
    
    public java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> getLineItems(){
        return this.lineItems;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
    *  <p>Human-readable identifiers usually used as deep-link URL to the related shopping list.
    *  Each slug is unique across a project, but a shopping list can have the same slug for different languages.
    *  The slug must match the pattern [a-zA-Z0-9_-]{2,256}.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getSlug(){
        return this.slug;
    }
    
    
    public java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> getTextLineItems(){
        return this.textLineItems;
    }
    
    /**
    *  <p>Identifies shopping lists belonging to an anonymous session (the customer has not signed up/in yet).</p>
    */
    public String getAnonymousId(){
        return this.anonymousId;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
        this.custom = custom;
    }
    
    public void setCustomer(final com.commercetools.api.models.customer.CustomerResourceIdentifier customer){
        this.customer = customer;
    }
    
    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification){
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
    }
    
    public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
        this.description = description;
    }
    
    public void setKey(final String key){
        this.key = key;
    }
    
    public void setLineItems(final com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft ...lineItems){
       this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
    }
    
    public void setLineItems(final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems){
       this.lineItems = lineItems;
    }
    
    public void setName(final com.commercetools.api.models.common.LocalizedString name){
        this.name = name;
    }
    
    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug){
        this.slug = slug;
    }
    
    public void setTextLineItems(final com.commercetools.api.models.shopping_list.TextLineItemDraft ...textLineItems){
       this.textLineItems = new ArrayList<>(Arrays.asList(textLineItems));
    }
    
    public void setTextLineItems(final java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems){
       this.textLineItems = textLineItems;
    }
    
    public void setAnonymousId(final String anonymousId){
        this.anonymousId = anonymousId;
    }

}
