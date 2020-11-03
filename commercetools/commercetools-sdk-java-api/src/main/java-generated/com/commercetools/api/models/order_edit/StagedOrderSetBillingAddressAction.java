package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetBillingAddressActionImpl.class)
public interface StagedOrderSetBillingAddressAction extends StagedOrderUpdateAction {

    
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static StagedOrderSetBillingAddressActionImpl of(){
        return new StagedOrderSetBillingAddressActionImpl();
    }
    

    public static StagedOrderSetBillingAddressActionImpl of(final StagedOrderSetBillingAddressAction template) {
        StagedOrderSetBillingAddressActionImpl instance = new StagedOrderSetBillingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    default <T> T withStagedOrderSetBillingAddressAction(Function<StagedOrderSetBillingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
