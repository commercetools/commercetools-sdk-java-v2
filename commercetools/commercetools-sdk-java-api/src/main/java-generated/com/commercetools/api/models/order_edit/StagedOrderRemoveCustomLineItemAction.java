
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
@JsonDeserialize(as = StagedOrderRemoveCustomLineItemActionImpl.class)
public interface StagedOrderRemoveCustomLineItemAction extends StagedOrderUpdateAction {

    String REMOVE_CUSTOM_LINE_ITEM = "removeCustomLineItem";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    public void setCustomLineItemId(final String customLineItemId);

    public static StagedOrderRemoveCustomLineItemAction of() {
        return new StagedOrderRemoveCustomLineItemActionImpl();
    }

    public static StagedOrderRemoveCustomLineItemAction of(final StagedOrderRemoveCustomLineItemAction template) {
        StagedOrderRemoveCustomLineItemActionImpl instance = new StagedOrderRemoveCustomLineItemActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        return instance;
    }

    public static StagedOrderRemoveCustomLineItemActionBuilder builder() {
        return StagedOrderRemoveCustomLineItemActionBuilder.of();
    }

    public static StagedOrderRemoveCustomLineItemActionBuilder builder(
            final StagedOrderRemoveCustomLineItemAction template) {
        return StagedOrderRemoveCustomLineItemActionBuilder.of(template);
    }

    default <T> T withStagedOrderRemoveCustomLineItemAction(Function<StagedOrderRemoveCustomLineItemAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveCustomLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveCustomLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderRemoveCustomLineItemAction>";
            }
        };
    }
}
