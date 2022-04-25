
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderRemoveDiscountCodeActionImpl.class)
public interface StagedOrderRemoveDiscountCodeAction extends StagedOrderUpdateAction {

    String REMOVE_DISCOUNT_CODE = "removeDiscountCode";

    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();

    public void setDiscountCode(final DiscountCodeReference discountCode);

    public static StagedOrderRemoveDiscountCodeAction of() {
        return new StagedOrderRemoveDiscountCodeActionImpl();
    }

    public static StagedOrderRemoveDiscountCodeAction of(final StagedOrderRemoveDiscountCodeAction template) {
        StagedOrderRemoveDiscountCodeActionImpl instance = new StagedOrderRemoveDiscountCodeActionImpl();
        instance.setDiscountCode(template.getDiscountCode());
        return instance;
    }

    public static StagedOrderRemoveDiscountCodeActionBuilder builder() {
        return StagedOrderRemoveDiscountCodeActionBuilder.of();
    }

    public static StagedOrderRemoveDiscountCodeActionBuilder builder(
            final StagedOrderRemoveDiscountCodeAction template) {
        return StagedOrderRemoveDiscountCodeActionBuilder.of(template);
    }

    default <T> T withStagedOrderRemoveDiscountCodeAction(Function<StagedOrderRemoveDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveDiscountCodeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveDiscountCodeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderRemoveDiscountCodeAction>";
            }
        };
    }
}
