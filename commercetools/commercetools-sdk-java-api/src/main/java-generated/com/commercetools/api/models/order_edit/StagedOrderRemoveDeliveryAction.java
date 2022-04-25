
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
@JsonDeserialize(as = StagedOrderRemoveDeliveryActionImpl.class)
public interface StagedOrderRemoveDeliveryAction extends StagedOrderUpdateAction {

    String REMOVE_DELIVERY = "removeDelivery";

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    public void setDeliveryId(final String deliveryId);

    public static StagedOrderRemoveDeliveryAction of() {
        return new StagedOrderRemoveDeliveryActionImpl();
    }

    public static StagedOrderRemoveDeliveryAction of(final StagedOrderRemoveDeliveryAction template) {
        StagedOrderRemoveDeliveryActionImpl instance = new StagedOrderRemoveDeliveryActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    public static StagedOrderRemoveDeliveryActionBuilder builder() {
        return StagedOrderRemoveDeliveryActionBuilder.of();
    }

    public static StagedOrderRemoveDeliveryActionBuilder builder(final StagedOrderRemoveDeliveryAction template) {
        return StagedOrderRemoveDeliveryActionBuilder.of(template);
    }

    default <T> T withStagedOrderRemoveDeliveryAction(Function<StagedOrderRemoveDeliveryAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveDeliveryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderRemoveDeliveryAction>";
            }
        };
    }
}
