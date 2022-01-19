
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetParcelCustomTypeActionImpl.class)
public interface StagedOrderSetParcelCustomTypeAction extends StagedOrderUpdateAction {

    String SET_PARCEL_CUSTOM_TYPE = "setParcelCustomType";

    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    /**
    *  <p>If set, the custom type is set to this new value.
    *  If absent, the custom type and any existing custom fields are removed.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>If set, the custom fields are set to this new value.</p>
    */
    @Valid
    @JsonProperty("fields")
    public Object getFields();

    public void setParcelId(final String parcelId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final Object fields);

    public static StagedOrderSetParcelCustomTypeAction of() {
        return new StagedOrderSetParcelCustomTypeActionImpl();
    }

    public static StagedOrderSetParcelCustomTypeAction of(final StagedOrderSetParcelCustomTypeAction template) {
        StagedOrderSetParcelCustomTypeActionImpl instance = new StagedOrderSetParcelCustomTypeActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static StagedOrderSetParcelCustomTypeActionBuilder builder() {
        return StagedOrderSetParcelCustomTypeActionBuilder.of();
    }

    public static StagedOrderSetParcelCustomTypeActionBuilder builder(
            final StagedOrderSetParcelCustomTypeAction template) {
        return StagedOrderSetParcelCustomTypeActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetParcelCustomTypeAction(Function<StagedOrderSetParcelCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
