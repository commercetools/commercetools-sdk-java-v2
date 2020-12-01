package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
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
public final class StagedOrderSetCustomerGroupActionImpl implements StagedOrderSetCustomerGroupAction {

    private String action;
    
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    @JsonCreator
    StagedOrderSetCustomerGroupActionImpl(@JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        this.action = "setCustomerGroup";
    }
    public StagedOrderSetCustomerGroupActionImpl() {
        this.action = "setCustomerGroup";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
        return this.customerGroup;
    }

    public void setCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup){
        this.customerGroup = customerGroup;
    }

}
