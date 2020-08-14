package com.commercetools.api.models.me;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.me.MyShoppingListUpdateAction;
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
public final class MyShoppingListChangeTextLineItemNameActionImpl implements MyShoppingListChangeTextLineItemNameAction {

    private String action;
    
    private String textLineItemId;
    
    private com.commercetools.api.models.common.LocalizedString name;

    @JsonCreator
    MyShoppingListChangeTextLineItemNameActionImpl(@JsonProperty("textLineItemId") final String textLineItemId, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name) {
        this.textLineItemId = textLineItemId;
        this.name = name;
        this.action = "changeTextLineItemName";
    }
    public MyShoppingListChangeTextLineItemNameActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getTextLineItemId(){
        return this.textLineItemId;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }

    public void setTextLineItemId(final String textLineItemId){
        this.textLineItemId = textLineItemId;
    }
    
    public void setName(final com.commercetools.api.models.common.LocalizedString name){
        this.name = name;
    }

}
