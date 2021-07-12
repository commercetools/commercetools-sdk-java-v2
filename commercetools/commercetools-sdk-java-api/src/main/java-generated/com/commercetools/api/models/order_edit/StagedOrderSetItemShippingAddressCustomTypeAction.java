
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetItemShippingAddressCustomTypeActionImpl.class)
public interface StagedOrderSetItemShippingAddressCustomTypeAction extends StagedOrderUpdateAction {

    String SET_ITEM_SHIPPING_ADDRESS_CUSTOM_TYPE = "setItemShippingAddressCustomType";

    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setAddressKey(final String addressKey);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static StagedOrderSetItemShippingAddressCustomTypeAction of() {
        return new StagedOrderSetItemShippingAddressCustomTypeActionImpl();
    }

    public static StagedOrderSetItemShippingAddressCustomTypeAction of(
            final StagedOrderSetItemShippingAddressCustomTypeAction template) {
        StagedOrderSetItemShippingAddressCustomTypeActionImpl instance = new StagedOrderSetItemShippingAddressCustomTypeActionImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static StagedOrderSetItemShippingAddressCustomTypeActionBuilder builder() {
        return StagedOrderSetItemShippingAddressCustomTypeActionBuilder.of();
    }

    public static StagedOrderSetItemShippingAddressCustomTypeActionBuilder builder(
            final StagedOrderSetItemShippingAddressCustomTypeAction template) {
        return StagedOrderSetItemShippingAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetItemShippingAddressCustomTypeAction(
            Function<StagedOrderSetItemShippingAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
