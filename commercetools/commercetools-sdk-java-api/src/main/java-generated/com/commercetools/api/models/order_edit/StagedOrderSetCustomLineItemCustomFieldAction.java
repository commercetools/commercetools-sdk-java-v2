
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
@JsonDeserialize(as = StagedOrderSetCustomLineItemCustomFieldActionImpl.class)
public interface StagedOrderSetCustomLineItemCustomFieldAction extends StagedOrderUpdateAction {

    String SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD = "setCustomLineItemCustomField";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setCustomLineItemId(final String customLineItemId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static StagedOrderSetCustomLineItemCustomFieldAction of() {
        return new StagedOrderSetCustomLineItemCustomFieldActionImpl();
    }

    public static StagedOrderSetCustomLineItemCustomFieldAction of(
            final StagedOrderSetCustomLineItemCustomFieldAction template) {
        StagedOrderSetCustomLineItemCustomFieldActionImpl instance = new StagedOrderSetCustomLineItemCustomFieldActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static StagedOrderSetCustomLineItemCustomFieldActionBuilder builder() {
        return StagedOrderSetCustomLineItemCustomFieldActionBuilder.of();
    }

    public static StagedOrderSetCustomLineItemCustomFieldActionBuilder builder(
            final StagedOrderSetCustomLineItemCustomFieldAction template) {
        return StagedOrderSetCustomLineItemCustomFieldActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetCustomLineItemCustomFieldAction(
            Function<StagedOrderSetCustomLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
