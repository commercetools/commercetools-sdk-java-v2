
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetLocaleActionImpl.class)
public interface OrderSetLocaleAction extends OrderUpdateAction {

    String SET_LOCALE = "setLocale";

    @JsonProperty("locale")
    public String getLocale();

    public void setLocale(final String locale);

    public static OrderSetLocaleAction of() {
        return new OrderSetLocaleActionImpl();
    }

    public static OrderSetLocaleAction of(final OrderSetLocaleAction template) {
        OrderSetLocaleActionImpl instance = new OrderSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    public static OrderSetLocaleActionBuilder builder() {
        return OrderSetLocaleActionBuilder.of();
    }

    public static OrderSetLocaleActionBuilder builder(final OrderSetLocaleAction template) {
        return OrderSetLocaleActionBuilder.of(template);
    }

    default <T> T withOrderSetLocaleAction(Function<OrderSetLocaleAction, T> helper) {
        return helper.apply(this);
    }
}
