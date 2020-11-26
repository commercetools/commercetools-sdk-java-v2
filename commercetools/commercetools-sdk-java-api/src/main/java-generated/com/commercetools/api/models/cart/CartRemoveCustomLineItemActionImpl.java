package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
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
public final class CartRemoveCustomLineItemActionImpl implements CartRemoveCustomLineItemAction {

    private String action;
    
    private String customLineItemId;

    @JsonCreator
    CartRemoveCustomLineItemActionImpl(@JsonProperty("customLineItemId") final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        this.action = "removeCustomLineItem";
    }
    public CartRemoveCustomLineItemActionImpl() {
        this.action = "removeCustomLineItem";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }

    public void setCustomLineItemId(final String customLineItemId){
        this.customLineItemId = customLineItemId;
    }

}
