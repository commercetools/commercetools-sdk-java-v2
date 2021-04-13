package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditAddStagedActionAction;
import com.commercetools.api.models.order_edit.OrderEditSetBillingAddressCustomFieldAction;
import com.commercetools.api.models.order_edit.OrderEditSetBillingAddressCustomTypeAction;
import com.commercetools.api.models.order_edit.OrderEditSetCommentAction;
import com.commercetools.api.models.order_edit.OrderEditSetCustomFieldAction;
import com.commercetools.api.models.order_edit.OrderEditSetCustomTypeAction;
import com.commercetools.api.models.order_edit.OrderEditSetDeliveryAddressCustomFieldAction;
import com.commercetools.api.models.order_edit.OrderEditSetDeliveryAddressCustomTypeAction;
import com.commercetools.api.models.order_edit.OrderEditSetItemShippingAddressCustomFieldAction;
import com.commercetools.api.models.order_edit.OrderEditSetItemShippingAddressCustomTypeAction;
import com.commercetools.api.models.order_edit.OrderEditSetKeyAction;
import com.commercetools.api.models.order_edit.OrderEditSetShippingAddressCustomFieldAction;
import com.commercetools.api.models.order_edit.OrderEditSetShippingAddressCustomTypeAction;
import com.commercetools.api.models.order_edit.OrderEditSetStagedActionsAction;
import io.vrap.rmf.base.client.utils.Generated;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditUpdateActionImpl implements OrderEditUpdateAction {

    
    private String action;

    @JsonCreator
    OrderEditUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    public OrderEditUpdateActionImpl() {
    }

    
    public String getAction(){
        return this.action;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderEditUpdateActionImpl that = (OrderEditUpdateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .toHashCode();
    }

}
