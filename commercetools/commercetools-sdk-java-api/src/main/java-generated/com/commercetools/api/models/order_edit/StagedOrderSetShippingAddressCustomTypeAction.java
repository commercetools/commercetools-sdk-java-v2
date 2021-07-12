
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetShippingAddressCustomTypeActionImpl.class)
public interface StagedOrderSetShippingAddressCustomTypeAction extends StagedOrderUpdateAction {

    String SET_SHIPPING_ADDRESS_CUSTOM_TYPE = "setShippingAddressCustomType";

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static StagedOrderSetShippingAddressCustomTypeAction of() {
        return new StagedOrderSetShippingAddressCustomTypeActionImpl();
    }

    public static StagedOrderSetShippingAddressCustomTypeAction of(
            final StagedOrderSetShippingAddressCustomTypeAction template) {
        StagedOrderSetShippingAddressCustomTypeActionImpl instance = new StagedOrderSetShippingAddressCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static StagedOrderSetShippingAddressCustomTypeActionBuilder builder() {
        return StagedOrderSetShippingAddressCustomTypeActionBuilder.of();
    }

    public static StagedOrderSetShippingAddressCustomTypeActionBuilder builder(
            final StagedOrderSetShippingAddressCustomTypeAction template) {
        return StagedOrderSetShippingAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetShippingAddressCustomTypeAction(
            Function<StagedOrderSetShippingAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
