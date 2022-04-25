
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ItemShippingTarget;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl.class)
public interface MyCartApplyDeltaToLineItemShippingDetailsTargetsAction extends MyCartUpdateAction {

    String APPLY_DELTA_TO_LINE_ITEM_SHIPPING_DETAILS_TARGETS = "applyDeltaToLineItemShippingDetailsTargets";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @NotNull
    @Valid
    @JsonProperty("targetsDelta")
    public List<ItemShippingTarget> getTargetsDelta();

    public void setLineItemId(final String lineItemId);

    @JsonIgnore
    public void setTargetsDelta(final ItemShippingTarget... targetsDelta);

    public void setTargetsDelta(final List<ItemShippingTarget> targetsDelta);

    public static MyCartApplyDeltaToLineItemShippingDetailsTargetsAction of() {
        return new MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl();
    }

    public static MyCartApplyDeltaToLineItemShippingDetailsTargetsAction of(
            final MyCartApplyDeltaToLineItemShippingDetailsTargetsAction template) {
        MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl instance = new MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setTargetsDelta(template.getTargetsDelta());
        return instance;
    }

    public static MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder builder() {
        return MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder.of();
    }

    public static MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder builder(
            final MyCartApplyDeltaToLineItemShippingDetailsTargetsAction template) {
        return MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder.of(template);
    }

    default <T> T withMyCartApplyDeltaToLineItemShippingDetailsTargetsAction(
            Function<MyCartApplyDeltaToLineItemShippingDetailsTargetsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartApplyDeltaToLineItemShippingDetailsTargetsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartApplyDeltaToLineItemShippingDetailsTargetsAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartApplyDeltaToLineItemShippingDetailsTargetsAction>";
            }
        };
    }
}
