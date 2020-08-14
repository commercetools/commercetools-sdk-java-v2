package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxRateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetShippingMethodTaxRateActionImpl.class)
public interface StagedOrderSetShippingMethodTaxRateAction extends StagedOrderUpdateAction {

    
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static StagedOrderSetShippingMethodTaxRateActionImpl of(){
        return new StagedOrderSetShippingMethodTaxRateActionImpl();
    }
    

    public static StagedOrderSetShippingMethodTaxRateActionImpl of(final StagedOrderSetShippingMethodTaxRateAction template) {
        StagedOrderSetShippingMethodTaxRateActionImpl instance = new StagedOrderSetShippingMethodTaxRateActionImpl();
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

}
