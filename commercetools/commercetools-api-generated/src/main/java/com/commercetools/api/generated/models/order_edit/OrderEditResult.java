package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order_edit.OrderEditApplied;
import com.commercetools.api.generated.models.order_edit.OrderEditNotProcessed;
import com.commercetools.api.generated.models.order_edit.OrderEditPreviewFailure;
import com.commercetools.api.generated.models.order_edit.OrderEditPreviewSuccess;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.OrderEditAppliedImpl.class, name = "Applied"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.OrderEditNotProcessedImpl.class, name = "NotProcessed"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.OrderEditPreviewFailureImpl.class, name = "PreviewFailure"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.OrderEditPreviewSuccessImpl.class, name = "PreviewSuccess")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface OrderEditResult  {


   


}