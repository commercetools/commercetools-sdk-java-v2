
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
@JsonDeserialize(as = StagedOrderSetDeliveryCustomFieldActionImpl.class)
public interface StagedOrderSetDeliveryCustomFieldAction extends StagedOrderUpdateAction {

    String SET_DELIVERY_CUSTOM_FIELD = "setDeliveryCustomField";

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static StagedOrderSetDeliveryCustomFieldAction of() {
        return new StagedOrderSetDeliveryCustomFieldActionImpl();
    }

    public static StagedOrderSetDeliveryCustomFieldAction of(final StagedOrderSetDeliveryCustomFieldAction template) {
        StagedOrderSetDeliveryCustomFieldActionImpl instance = new StagedOrderSetDeliveryCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static StagedOrderSetDeliveryCustomFieldActionBuilder builder() {
        return StagedOrderSetDeliveryCustomFieldActionBuilder.of();
    }

    public static StagedOrderSetDeliveryCustomFieldActionBuilder builder(
            final StagedOrderSetDeliveryCustomFieldAction template) {
        return StagedOrderSetDeliveryCustomFieldActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetDeliveryCustomFieldAction(
            Function<StagedOrderSetDeliveryCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
