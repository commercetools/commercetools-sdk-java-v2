
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

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetLineItemCustomFieldAction>";
            }
        };
    }
}
