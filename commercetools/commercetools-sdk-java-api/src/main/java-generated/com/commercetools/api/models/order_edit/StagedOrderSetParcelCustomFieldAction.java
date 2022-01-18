
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

    @NotNull
    @JsonProperty("name")
    public String getName();

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
}
