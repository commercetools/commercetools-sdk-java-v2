package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderSetCustomLineItemShippingDetailsActionImpl implements StagedOrderSetCustomLineItemShippingDetailsAction {

    private String action;
    
    private String customLineItemId;
    
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    @JsonCreator
    StagedOrderSetCustomLineItemShippingDetailsActionImpl(@JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.customLineItemId = customLineItemId;
        this.shippingDetails = shippingDetails;
        this.action = "setCustomLineItemShippingDetails";
    }
    public StagedOrderSetCustomLineItemShippingDetailsActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails(){
        return this.shippingDetails;
    }

    public void setCustomLineItemId(final String customLineItemId){
        this.customLineItemId = customLineItemId;
    }
    
    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails){
        this.shippingDetails = shippingDetails;
    }

}
