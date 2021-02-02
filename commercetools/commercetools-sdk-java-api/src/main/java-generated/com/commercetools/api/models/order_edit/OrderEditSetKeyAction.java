
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderEditSetKeyActionImpl.class)
public interface OrderEditSetKeyAction extends OrderEditUpdateAction {

    String SET_KEY = "setKey";

    /**
    *  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static OrderEditSetKeyAction of() {
        return new OrderEditSetKeyActionImpl();
    }

    public static OrderEditSetKeyAction of(final OrderEditSetKeyAction template) {
        OrderEditSetKeyActionImpl instance = new OrderEditSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static OrderEditSetKeyActionBuilder builder() {
        return OrderEditSetKeyActionBuilder.of();
    }

    public static OrderEditSetKeyActionBuilder builder(final OrderEditSetKeyAction template) {
        return OrderEditSetKeyActionBuilder.of(template);
    }

    default <T> T withOrderEditSetKeyAction(Function<OrderEditSetKeyAction, T> helper) {
        return helper.apply(this);
    }
}
