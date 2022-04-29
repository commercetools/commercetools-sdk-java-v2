
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
@JsonDeserialize(as = StagedOrderSetParcelCustomTypeActionImpl.class)
public interface StagedOrderSetParcelCustomTypeAction extends StagedOrderUpdateAction {

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

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetParcelCustomTypeAction>";
            }
        };
    }
}
