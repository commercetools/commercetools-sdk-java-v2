
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
@JsonDeserialize(as = StagedOrderSetLineItemCustomFieldActionImpl.class)
public interface StagedOrderSetLineItemCustomFieldAction extends StagedOrderUpdateAction {

    String SET_LINE_ITEM_CUSTOM_FIELD = "setLineItemCustomField";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setLineItemId(final String lineItemId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static StagedOrderSetLineItemCustomFieldAction of() {
        return new StagedOrderSetLineItemCustomFieldActionImpl();
    }

    public static StagedOrderSetLineItemCustomFieldAction of(final StagedOrderSetLineItemCustomFieldAction template) {
        StagedOrderSetLineItemCustomFieldActionImpl instance = new StagedOrderSetLineItemCustomFieldActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static StagedOrderSetLineItemCustomFieldActionBuilder builder() {
        return StagedOrderSetLineItemCustomFieldActionBuilder.of();
    }

    public static StagedOrderSetLineItemCustomFieldActionBuilder builder(
            final StagedOrderSetLineItemCustomFieldAction template) {
        return StagedOrderSetLineItemCustomFieldActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetLineItemCustomFieldAction(
            Function<StagedOrderSetLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
