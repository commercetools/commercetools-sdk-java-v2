
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The item's shipping target.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ItemShippingTargetImpl.class)
public interface ItemShippingTarget {

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

    public static ItemShippingTarget of() {
        return new ItemShippingTargetImpl();
    }

    public static ItemShippingTarget of(final ItemShippingTarget template) {
        ItemShippingTargetImpl instance = new ItemShippingTargetImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static ItemShippingTargetBuilder builder() {
        return ItemShippingTargetBuilder.of();
    }

    public static ItemShippingTargetBuilder builder(final ItemShippingTarget template) {
        return ItemShippingTargetBuilder.of(template);
    }

    default <T> T withItemShippingTarget(Function<ItemShippingTarget, T> helper) {
        return helper.apply(this);
    }
}
