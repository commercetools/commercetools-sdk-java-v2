
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
@JsonDeserialize(as = StagedOrderSetBillingAddressCustomFieldActionImpl.class)
public interface StagedOrderSetBillingAddressCustomFieldAction extends StagedOrderUpdateAction {

    String SET_BILLING_ADDRESS_CUSTOM_FIELD = "setBillingAddressCustomField";

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static StagedOrderSetBillingAddressCustomFieldAction of() {
        return new StagedOrderSetBillingAddressCustomFieldActionImpl();
    }

    public static StagedOrderSetBillingAddressCustomFieldAction of(
            final StagedOrderSetBillingAddressCustomFieldAction template) {
        StagedOrderSetBillingAddressCustomFieldActionImpl instance = new StagedOrderSetBillingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static StagedOrderSetBillingAddressCustomFieldActionBuilder builder() {
        return StagedOrderSetBillingAddressCustomFieldActionBuilder.of();
    }

    public static StagedOrderSetBillingAddressCustomFieldActionBuilder builder(
            final StagedOrderSetBillingAddressCustomFieldAction template) {
        return StagedOrderSetBillingAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetBillingAddressCustomFieldAction(
            Function<StagedOrderSetBillingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
