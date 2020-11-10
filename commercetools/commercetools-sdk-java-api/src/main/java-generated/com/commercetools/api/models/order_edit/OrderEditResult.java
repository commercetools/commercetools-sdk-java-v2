package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditApplied;
import com.commercetools.api.models.order_edit.OrderEditNotProcessed;
import com.commercetools.api.models.order_edit.OrderEditPreviewFailure;
import com.commercetools.api.models.order_edit.OrderEditPreviewSuccess;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditPreviewFailureImpl.class, name = "PreviewFailure"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditAppliedImpl.class, name = "Applied"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditPreviewSuccessImpl.class, name = "PreviewSuccess"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditNotProcessedImpl.class, name = "NotProcessed")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = OrderEditResultImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface OrderEditResult  {





    default <T> T withOrderEditResult(Function<OrderEditResult, T> helper) {
        return helper.apply(this);
    }
}
