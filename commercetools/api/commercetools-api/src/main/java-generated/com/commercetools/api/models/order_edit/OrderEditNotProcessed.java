package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditResult;
import com.commercetools.api.models.order_edit.OrderEditNotProcessedImpl;

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
@JsonDeserialize(as = OrderEditNotProcessedImpl.class)
public interface OrderEditNotProcessed extends OrderEditResult {



    public static OrderEditNotProcessedImpl of(){
        return new OrderEditNotProcessedImpl();
    }
    

    public static OrderEditNotProcessedImpl of(final OrderEditNotProcessed template) {
        OrderEditNotProcessedImpl instance = new OrderEditNotProcessedImpl();
        return instance;
    }

}
