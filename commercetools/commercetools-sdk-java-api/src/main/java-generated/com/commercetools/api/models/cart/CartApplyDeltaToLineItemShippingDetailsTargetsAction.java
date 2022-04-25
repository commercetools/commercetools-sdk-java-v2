
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl.class)
public interface CartApplyDeltaToLineItemShippingDetailsTargetsAction extends CartUpdateAction {

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

    public static CartApplyDeltaToLineItemShippingDetailsTargetsAction of() {
        return new CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl();
    }

    public static CartApplyDeltaToLineItemShippingDetailsTargetsAction of(
            final CartApplyDeltaToLineItemShippingDetailsTargetsAction template) {
        CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl instance = new CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setTargetsDelta(template.getTargetsDelta());
        return instance;
    }

    public static CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder builder() {
        return CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder.of();
    }

    public static CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder builder(
            final CartApplyDeltaToLineItemShippingDetailsTargetsAction template) {
        return CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder.of(template);
    }

    default <T> T withCartApplyDeltaToLineItemShippingDetailsTargetsAction(
            Function<CartApplyDeltaToLineItemShippingDetailsTargetsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartApplyDeltaToLineItemShippingDetailsTargetsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartApplyDeltaToLineItemShippingDetailsTargetsAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartApplyDeltaToLineItemShippingDetailsTargetsAction>";
            }
        };
    }
}
