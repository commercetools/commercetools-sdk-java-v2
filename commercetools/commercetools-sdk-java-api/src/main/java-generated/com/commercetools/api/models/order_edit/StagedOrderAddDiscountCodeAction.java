
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
@JsonDeserialize(as = StagedOrderAddDiscountCodeActionImpl.class)
public interface StagedOrderAddDiscountCodeAction extends StagedOrderUpdateAction {

    String ADD_DISCOUNT_CODE = "addDiscountCode";

    @NotNull
    @JsonProperty("code")
    public String getCode();

    public void setCode(final String code);

    public static StagedOrderAddDiscountCodeAction of() {
        return new StagedOrderAddDiscountCodeActionImpl();
    }

    public static StagedOrderAddDiscountCodeAction of(final StagedOrderAddDiscountCodeAction template) {
        StagedOrderAddDiscountCodeActionImpl instance = new StagedOrderAddDiscountCodeActionImpl();
        instance.setCode(template.getCode());
        return instance;
    }

    public static StagedOrderAddDiscountCodeActionBuilder builder() {
        return StagedOrderAddDiscountCodeActionBuilder.of();
    }

    public static StagedOrderAddDiscountCodeActionBuilder builder(final StagedOrderAddDiscountCodeAction template) {
        return StagedOrderAddDiscountCodeActionBuilder.of(template);
    }

    default <T> T withStagedOrderAddDiscountCodeAction(Function<StagedOrderAddDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddDiscountCodeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddDiscountCodeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderAddDiscountCodeAction>";
            }
        };
    }
}
