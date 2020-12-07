package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.Money;
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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


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
        this.action = "changeCustomLineItemMoney";
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedOrderChangeCustomLineItemMoneyActionImpl that = (StagedOrderChangeCustomLineItemMoneyActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(money, that.money)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(customLineItemId)
            .append(money)
            .toHashCode();
    }

}
