
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

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the Parcel with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the Parcel.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the Parcel.</p>
    */
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

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetParcelCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetParcelCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetParcelCustomTypeAction>";
            }
        };
    }
}
