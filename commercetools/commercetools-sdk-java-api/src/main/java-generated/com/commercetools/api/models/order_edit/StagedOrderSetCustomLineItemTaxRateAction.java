package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxRateActionImpl;

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
@JsonDeserialize(as = StagedOrderSetCustomLineItemTaxRateActionImpl.class)
public interface StagedOrderSetCustomLineItemTaxRateAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();
    
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setCustomLineItemId(final String customLineItemId);
    
    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static StagedOrderSetCustomLineItemTaxRateActionImpl of(){
        return new StagedOrderSetCustomLineItemTaxRateActionImpl();
    }
    

    public static StagedOrderSetCustomLineItemTaxRateActionImpl of(final StagedOrderSetCustomLineItemTaxRateAction template) {
        StagedOrderSetCustomLineItemTaxRateActionImpl instance = new StagedOrderSetCustomLineItemTaxRateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    default <T extends Accessor<StagedOrderSetCustomLineItemTaxRateAction>> T withStagedOrderSetCustomLineItemTaxRateAction(Function<StagedOrderSetCustomLineItemTaxRateAction, T> helper) {
        return helper.apply(this);
    }
}
