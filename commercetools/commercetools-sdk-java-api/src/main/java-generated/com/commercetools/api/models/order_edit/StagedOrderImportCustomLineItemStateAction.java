
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.ItemState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderImportCustomLineItemStateActionImpl.class)
public interface StagedOrderImportCustomLineItemStateAction extends StagedOrderUpdateAction {

    String IMPORT_CUSTOM_LINE_ITEM_STATE = "importCustomLineItemState";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @NotNull
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    public void setCustomLineItemId(final String customLineItemId);

    @JsonIgnore
    public void setState(final ItemState... state);

    public void setState(final List<ItemState> state);

    public static StagedOrderImportCustomLineItemStateAction of() {
        return new StagedOrderImportCustomLineItemStateActionImpl();
    }

    public static StagedOrderImportCustomLineItemStateAction of(
            final StagedOrderImportCustomLineItemStateAction template) {
        StagedOrderImportCustomLineItemStateActionImpl instance = new StagedOrderImportCustomLineItemStateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setState(template.getState());
        return instance;
    }

    public static StagedOrderImportCustomLineItemStateActionBuilder builder() {
        return StagedOrderImportCustomLineItemStateActionBuilder.of();
    }

    public static StagedOrderImportCustomLineItemStateActionBuilder builder(
            final StagedOrderImportCustomLineItemStateAction template) {
        return StagedOrderImportCustomLineItemStateActionBuilder.of(template);
    }

    default <T> T withStagedOrderImportCustomLineItemStateAction(
            Function<StagedOrderImportCustomLineItemStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderImportCustomLineItemStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderImportCustomLineItemStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderImportCustomLineItemStateAction>";
            }
        };
    }
}
