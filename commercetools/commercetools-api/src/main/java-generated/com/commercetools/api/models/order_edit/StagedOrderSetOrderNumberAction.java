package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetOrderNumberActionImpl;

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
@JsonDeserialize(as = StagedOrderSetOrderNumberActionImpl.class)
public interface StagedOrderSetOrderNumberAction extends StagedOrderUpdateAction {

    
    
    @JsonProperty("orderNumber")
    public String getOrderNumber();

    public void setOrderNumber(final String orderNumber);

    public static StagedOrderSetOrderNumberActionImpl of(){
        return new StagedOrderSetOrderNumberActionImpl();
    }
    

    public static StagedOrderSetOrderNumberActionImpl of(final StagedOrderSetOrderNumberAction template) {
        StagedOrderSetOrderNumberActionImpl instance = new StagedOrderSetOrderNumberActionImpl();
        instance.setOrderNumber(template.getOrderNumber());
        return instance;
    }

}
