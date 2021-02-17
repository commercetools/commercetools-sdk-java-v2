
package com.commercetools.api.models.order_edit;

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
@JsonDeserialize(as = OrderEditSetBillingAddressCustomTypeActionImpl.class)
public interface OrderEditSetBillingAddressCustomTypeAction extends OrderEditUpdateAction {

    String SET_BILLING_ADDRESS_CUSTOM_TYPE = "setBillingAddressCustomType";

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static OrderEditSetBillingAddressCustomTypeAction of() {
        return new OrderEditSetBillingAddressCustomTypeActionImpl();
    }

    public static OrderEditSetBillingAddressCustomTypeAction of(
            final OrderEditSetBillingAddressCustomTypeAction template) {
        OrderEditSetBillingAddressCustomTypeActionImpl instance = new OrderEditSetBillingAddressCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static OrderEditSetBillingAddressCustomTypeActionBuilder builder() {
        return OrderEditSetBillingAddressCustomTypeActionBuilder.of();
    }

    public static OrderEditSetBillingAddressCustomTypeActionBuilder builder(
            final OrderEditSetBillingAddressCustomTypeAction template) {
        return OrderEditSetBillingAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withOrderEditSetBillingAddressCustomTypeAction(
            Function<OrderEditSetBillingAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
