
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ItemShippingTargetImpl.class)
public interface ItemShippingTarget {

    /**
    *  <p>The key of the address in the cart's <code>itemShippingAddresses</code></p>
    */
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
    *  <p>The quantity of items that should go to the address with the specified <code>addressKey</code>. Only positive values are allowed. Using <code>0</code> as quantity is also possible in a draft object, but the element will not be present in the resulting ItemShippingDetails.</p>
    */
    @NotNull
    @JsonProperty("quantity")
    public Integer getQuantity();

    public void setAddressKey(final String addressKey);

    public void setQuantity(final Integer quantity);

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
