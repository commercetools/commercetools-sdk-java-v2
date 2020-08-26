package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetLineItemTaxRateActionBuilder {

    
    private String lineItemId;
    
    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    public StagedOrderSetLineItemTaxRateActionBuilder lineItemId( final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }
    
    public StagedOrderSetLineItemTaxRateActionBuilder externalTaxRate(@Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
        return this.externalTaxRate;
    }

    public StagedOrderSetLineItemTaxRateAction build() {
        return new StagedOrderSetLineItemTaxRateActionImpl(lineItemId, externalTaxRate);
    }

    public static StagedOrderSetLineItemTaxRateActionBuilder of() {
        return new StagedOrderSetLineItemTaxRateActionBuilder();
    }

    public static StagedOrderSetLineItemTaxRateActionBuilder of(final StagedOrderSetLineItemTaxRateAction template) {
        StagedOrderSetLineItemTaxRateActionBuilder builder = new StagedOrderSetLineItemTaxRateActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
