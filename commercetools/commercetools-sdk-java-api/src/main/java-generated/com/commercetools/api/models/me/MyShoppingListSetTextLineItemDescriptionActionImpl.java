package com.commercetools.api.models.me;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.me.MyShoppingListUpdateAction;
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
public final class MyShoppingListSetTextLineItemDescriptionActionImpl implements MyShoppingListSetTextLineItemDescriptionAction {

    private String action;
    
    private String textLineItemId;
    
    private com.commercetools.api.models.common.LocalizedString description;

    @JsonCreator
    MyShoppingListSetTextLineItemDescriptionActionImpl(@JsonProperty("textLineItemId") final String textLineItemId, @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description) {
        this.textLineItemId = textLineItemId;
        this.description = description;
        this.action = "setTextLineItemDescription";
    }
    public MyShoppingListSetTextLineItemDescriptionActionImpl() {
        this.action = "setTextLineItemDescription";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getTextLineItemId(){
        return this.textLineItemId;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }

    public void setTextLineItemId(final String textLineItemId){
        this.textLineItemId = textLineItemId;
    }
    
    public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
        this.description = description;
    }

}
