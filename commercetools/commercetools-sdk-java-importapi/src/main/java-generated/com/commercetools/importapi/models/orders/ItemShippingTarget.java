package com.commercetools.importapi.models.orders;


import com.commercetools.importapi.models.orders.ItemShippingTargetImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>The item's shipping target.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ItemShippingTargetImpl.class)
public interface ItemShippingTarget  {

    /**
    *  <p>Maps to <code>ItemShippingTarget.addressKey</code>.</p>
    */
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();
    /**
    *  <p>Maps to <code>ItemShippingTarget.quantity</code>.</p>
    */
    @NotNull
    @JsonProperty("quantity")
    public Double getQuantity();

    public void setAddressKey(final String addressKey);
    
    public void setQuantity(final Double quantity);

    public static ItemShippingTargetImpl of(){
        return new ItemShippingTargetImpl();
    }
    

    public static ItemShippingTargetImpl of(final ItemShippingTarget template) {
        ItemShippingTargetImpl instance = new ItemShippingTargetImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    default <T> T withItemShippingTarget(Function<ItemShippingTarget, T> helper) {
        return helper.apply(this);
    }
}
