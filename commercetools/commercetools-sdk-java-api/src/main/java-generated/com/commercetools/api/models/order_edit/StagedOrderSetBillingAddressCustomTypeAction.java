
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
@JsonDeserialize(as = StagedOrderSetBillingAddressCustomTypeActionImpl.class)
public interface StagedOrderSetBillingAddressCustomTypeAction extends StagedOrderUpdateAction {

    String SET_BILLING_ADDRESS_CUSTOM_TYPE = "setBillingAddressCustomType";

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static StagedOrderSetBillingAddressCustomTypeAction of() {
        return new StagedOrderSetBillingAddressCustomTypeActionImpl();
    }

    public static StagedOrderSetBillingAddressCustomTypeAction of(
            final StagedOrderSetBillingAddressCustomTypeAction template) {
        StagedOrderSetBillingAddressCustomTypeActionImpl instance = new StagedOrderSetBillingAddressCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static StagedOrderSetBillingAddressCustomTypeActionBuilder builder() {
        return StagedOrderSetBillingAddressCustomTypeActionBuilder.of();
    }

    public static StagedOrderSetBillingAddressCustomTypeActionBuilder builder(
            final StagedOrderSetBillingAddressCustomTypeAction template) {
        return StagedOrderSetBillingAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetBillingAddressCustomTypeAction(
            Function<StagedOrderSetBillingAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
