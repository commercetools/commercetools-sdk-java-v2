package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveItemShippingAddressActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderRemoveItemShippingAddressActionImpl.class)
public interface StagedOrderRemoveItemShippingAddressAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressKey(final String addressKey);

    public static StagedOrderRemoveItemShippingAddressActionImpl of(){
        return new StagedOrderRemoveItemShippingAddressActionImpl();
    }
    

    public static StagedOrderRemoveItemShippingAddressActionImpl of(final StagedOrderRemoveItemShippingAddressAction template) {
        StagedOrderRemoveItemShippingAddressActionImpl instance = new StagedOrderRemoveItemShippingAddressActionImpl();
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

}
