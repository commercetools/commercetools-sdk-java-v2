
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetBillingAddressCustomTypeActionImpl.class)
public interface OrderSetBillingAddressCustomTypeAction extends OrderUpdateAction {

    String SET_BILLING_ADDRESS_CUSTOM_TYPE = "setBillingAddressCustomType";

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static OrderSetBillingAddressCustomTypeAction of() {
        return new OrderSetBillingAddressCustomTypeActionImpl();
    }

    public static OrderSetBillingAddressCustomTypeAction of(final OrderSetBillingAddressCustomTypeAction template) {
        OrderSetBillingAddressCustomTypeActionImpl instance = new OrderSetBillingAddressCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static OrderSetBillingAddressCustomTypeActionBuilder builder() {
        return OrderSetBillingAddressCustomTypeActionBuilder.of();
    }

    public static OrderSetBillingAddressCustomTypeActionBuilder builder(
            final OrderSetBillingAddressCustomTypeAction template) {
        return OrderSetBillingAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withOrderSetBillingAddressCustomTypeAction(
            Function<OrderSetBillingAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
