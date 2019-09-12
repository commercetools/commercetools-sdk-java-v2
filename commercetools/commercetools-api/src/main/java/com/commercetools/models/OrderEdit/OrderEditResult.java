package com.commercetools.models.OrderEdit;

import com.commercetools.models.OrderEdit.OrderEditApplied;
import com.commercetools.models.OrderEdit.OrderEditNotProcessed;
import com.commercetools.models.OrderEdit.OrderEditPreviewFailure;
import com.commercetools.models.OrderEdit.OrderEditPreviewSuccess;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.OrderEditAppliedImpl.class, name = "Applied"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.OrderEditNotProcessedImpl.class, name = "NotProcessed"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.OrderEditPreviewFailureImpl.class, name = "PreviewFailure"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.OrderEditPreviewSuccessImpl.class, name = "PreviewSuccess")
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