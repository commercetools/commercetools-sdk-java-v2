package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderChangeCustomLineItemMoneyActionImpl implements StagedOrderChangeCustomLineItemMoneyAction {

    private String action;
    
    private String customLineItemId;
    
    private com.commercetools.api.models.common.Money money;

    @JsonCreator
    StagedOrderChangeCustomLineItemMoneyActionImpl(@JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("money") final com.commercetools.api.models.common.Money money) {
        this.customLineItemId = customLineItemId;
        this.money = money;
        this.action = "changeCustomLineItemMoney";
    }
    public StagedOrderChangeCustomLineItemMoneyActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    
    public com.commercetools.api.models.common.Money getMoney(){
        return this.money;
    }

    public void setCustomLineItemId(final String customLineItemId){
        this.customLineItemId = customLineItemId;
    }
    
    public void setMoney(final com.commercetools.api.models.common.Money money){
        this.money = money;
    }

}
