
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetParcelCustomTypeActionImpl.class)
public interface OrderSetParcelCustomTypeAction extends OrderUpdateAction {

    String SET_PARCEL_CUSTOM_TYPE = "setParcelCustomType";

    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setParcelId(final String parcelId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static OrderSetParcelCustomTypeAction of() {
        return new OrderSetParcelCustomTypeActionImpl();
    }

    public static OrderSetParcelCustomTypeAction of(final OrderSetParcelCustomTypeAction template) {
        OrderSetParcelCustomTypeActionImpl instance = new OrderSetParcelCustomTypeActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static OrderSetParcelCustomTypeActionBuilder builder() {
        return OrderSetParcelCustomTypeActionBuilder.of();
    }

    public static OrderSetParcelCustomTypeActionBuilder builder(final OrderSetParcelCustomTypeAction template) {
        return OrderSetParcelCustomTypeActionBuilder.of(template);
    }

    default <T> T withOrderSetParcelCustomTypeAction(Function<OrderSetParcelCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}