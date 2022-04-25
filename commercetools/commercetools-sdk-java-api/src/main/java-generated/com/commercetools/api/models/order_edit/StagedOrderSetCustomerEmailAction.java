
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomerEmailActionImpl.class)
public interface StagedOrderSetCustomerEmailAction extends StagedOrderUpdateAction {

    String SET_CUSTOMER_EMAIL = "setCustomerEmail";

    @JsonProperty("email")
    public String getEmail();

    public void setEmail(final String email);

    public static StagedOrderSetCustomerEmailAction of() {
        return new StagedOrderSetCustomerEmailActionImpl();
    }

    public static StagedOrderSetCustomerEmailAction of(final StagedOrderSetCustomerEmailAction template) {
        StagedOrderSetCustomerEmailActionImpl instance = new StagedOrderSetCustomerEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    public static StagedOrderSetCustomerEmailActionBuilder builder() {
        return StagedOrderSetCustomerEmailActionBuilder.of();
    }

    public static StagedOrderSetCustomerEmailActionBuilder builder(final StagedOrderSetCustomerEmailAction template) {
        return StagedOrderSetCustomerEmailActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetCustomerEmailAction(Function<StagedOrderSetCustomerEmailAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomerEmailAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomerEmailAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetCustomerEmailAction>";
            }
        };
    }
}
