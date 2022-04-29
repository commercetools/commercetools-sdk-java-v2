
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomerIdActionImpl.class)
public interface StagedOrderSetCustomerIdAction extends StagedOrderUpdateAction {

    String SET_CUSTOMER_ID = "setCustomerId";

    @JsonProperty("customerId")
    public String getCustomerId();

    public void setCustomerId(final String customerId);

    public static StagedOrderSetCustomerIdAction of() {
        return new StagedOrderSetCustomerIdActionImpl();
    }

    public static StagedOrderSetCustomerIdAction of(final StagedOrderSetCustomerIdAction template) {
        StagedOrderSetCustomerIdActionImpl instance = new StagedOrderSetCustomerIdActionImpl();
        instance.setCustomerId(template.getCustomerId());
        return instance;
    }

    public static StagedOrderSetCustomerIdActionBuilder builder() {
        return StagedOrderSetCustomerIdActionBuilder.of();
    }

    public static StagedOrderSetCustomerIdActionBuilder builder(final StagedOrderSetCustomerIdAction template) {
        return StagedOrderSetCustomerIdActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetCustomerIdAction(Function<StagedOrderSetCustomerIdAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomerIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomerIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetCustomerIdAction>";
            }
        };
    }
}
