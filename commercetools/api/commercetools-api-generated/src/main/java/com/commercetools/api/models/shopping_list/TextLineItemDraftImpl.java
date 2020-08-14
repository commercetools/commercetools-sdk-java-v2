package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TextLineItemDraftImpl implements TextLineItemDraft {

    private java.time.ZonedDateTime addedAt;
    
    private com.commercetools.api.models.type.CustomFieldsDraft custom;
    
    private com.commercetools.api.models.common.LocalizedString description;
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    private Integer quantity;

    @JsonCreator
    TextLineItemDraftImpl(@JsonProperty("addedAt") final java.time.ZonedDateTime addedAt, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("quantity") final Integer quantity) {
        this.addedAt = addedAt;
        this.custom = custom;
        this.description = description;
        this.name = name;
        this.quantity = quantity;
    }
    public TextLineItemDraftImpl() {
       
    }

    /**
    *  <p>Defaults to the current date and time.</p>
    */
    public java.time.ZonedDateTime getAddedAt(){
        return this.addedAt;
    }
    
    /**
    *  <p>The custom fields.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
    *  <p>Defaults to <code>1</code>.</p>
    */
    public Integer getQuantity(){
        return this.quantity;
    }

    public void setAddedAt(final java.time.ZonedDateTime addedAt){
        this.addedAt = addedAt;
    }
    
    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
        this.custom = custom;
    }
    
    public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
        this.description = description;
    }
    
    public void setName(final com.commercetools.api.models.common.LocalizedString name){
        this.name = name;
    }
    
    public void setQuantity(final Integer quantity){
        this.quantity = quantity;
    }

}
