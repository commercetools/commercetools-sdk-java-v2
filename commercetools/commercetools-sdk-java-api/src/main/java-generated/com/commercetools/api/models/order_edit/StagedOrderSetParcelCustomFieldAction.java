
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetParcelCustomFieldActionImpl.class)
public interface StagedOrderSetParcelCustomFieldAction extends StagedOrderUpdateAction {

    String SET_PARCEL_CUSTOM_FIELD = "setParcelCustomField";

    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    /**
    *  <p>Name of the <a href="/../api/projects/custom-fields">Custom Field</a>.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists.
    *  Trying to remove a field that does not exist will fail with an <a href="/../api/errors#general-400-invalid-operation">InvalidOperation</a> error.
    *  If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
    */

    @JsonProperty("value")
    public Object getValue();

    public void setParcelId(final String parcelId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static StagedOrderSetParcelCustomFieldAction of() {
        return new StagedOrderSetParcelCustomFieldActionImpl();
    }

    public static StagedOrderSetParcelCustomFieldAction of(final StagedOrderSetParcelCustomFieldAction template) {
        StagedOrderSetParcelCustomFieldActionImpl instance = new StagedOrderSetParcelCustomFieldActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static StagedOrderSetParcelCustomFieldActionBuilder builder() {
        return StagedOrderSetParcelCustomFieldActionBuilder.of();
    }

    public static StagedOrderSetParcelCustomFieldActionBuilder builder(
            final StagedOrderSetParcelCustomFieldAction template) {
        return StagedOrderSetParcelCustomFieldActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetParcelCustomFieldAction(Function<StagedOrderSetParcelCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetParcelCustomFieldAction>";
            }
        };
    }
}
