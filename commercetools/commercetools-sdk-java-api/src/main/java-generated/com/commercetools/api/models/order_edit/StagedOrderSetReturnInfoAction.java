
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.order.ReturnInfoDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetReturnInfoActionImpl.class)
public interface StagedOrderSetReturnInfoAction extends StagedOrderUpdateAction {

    String SET_RETURN_INFO = "setReturnInfo";

    @Valid
    @JsonProperty("items")
    public List<ReturnInfoDraft> getItems();

    @JsonIgnore
    public void setItems(final ReturnInfoDraft... items);

    public void setItems(final List<ReturnInfoDraft> items);

    public static StagedOrderSetReturnInfoAction of() {
        return new StagedOrderSetReturnInfoActionImpl();
    }

    public static StagedOrderSetReturnInfoAction of(final StagedOrderSetReturnInfoAction template) {
        StagedOrderSetReturnInfoActionImpl instance = new StagedOrderSetReturnInfoActionImpl();
        instance.setItems(template.getItems());
        return instance;
    }

    public static StagedOrderSetReturnInfoActionBuilder builder() {
        return StagedOrderSetReturnInfoActionBuilder.of();
    }

    public static StagedOrderSetReturnInfoActionBuilder builder(final StagedOrderSetReturnInfoAction template) {
        return StagedOrderSetReturnInfoActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetReturnInfoAction(Function<StagedOrderSetReturnInfoAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetReturnInfoAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetReturnInfoAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetReturnInfoAction>";
            }
        };
    }
}
