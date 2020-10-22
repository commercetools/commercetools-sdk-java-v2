package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderAddDiscountCodeActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderAddDiscountCodeActionImpl.class)
public interface StagedOrderAddDiscountCodeAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("code")
    public String getCode();

    public void setCode(final String code);

    public static StagedOrderAddDiscountCodeActionImpl of(){
        return new StagedOrderAddDiscountCodeActionImpl();
    }
    

    public static StagedOrderAddDiscountCodeActionImpl of(final StagedOrderAddDiscountCodeAction template) {
        StagedOrderAddDiscountCodeActionImpl instance = new StagedOrderAddDiscountCodeActionImpl();
        instance.setCode(template.getCode());
        return instance;
    }

    default <T extends Accessor<StagedOrderAddDiscountCodeAction>> T withStagedOrderAddDiscountCodeAction(Function<StagedOrderAddDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }
}
