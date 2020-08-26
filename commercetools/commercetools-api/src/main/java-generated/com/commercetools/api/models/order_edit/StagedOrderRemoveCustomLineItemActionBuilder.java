package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveCustomLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderRemoveCustomLineItemActionBuilder {

    
    private String customLineItemId;

    public StagedOrderRemoveCustomLineItemActionBuilder customLineItemId( final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }

    public StagedOrderRemoveCustomLineItemAction build() {
        return new StagedOrderRemoveCustomLineItemActionImpl(customLineItemId);
    }

    public static StagedOrderRemoveCustomLineItemActionBuilder of() {
        return new StagedOrderRemoveCustomLineItemActionBuilder();
    }

    public static StagedOrderRemoveCustomLineItemActionBuilder of(final StagedOrderRemoveCustomLineItemAction template) {
        StagedOrderRemoveCustomLineItemActionBuilder builder = new StagedOrderRemoveCustomLineItemActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        return builder;
    }

}
