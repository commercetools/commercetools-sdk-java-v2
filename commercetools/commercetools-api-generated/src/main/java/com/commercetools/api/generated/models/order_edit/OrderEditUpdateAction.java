package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order_edit.OrderEditAddStagedActionAction;
import com.commercetools.api.generated.models.order_edit.OrderEditSetCommentAction;
import com.commercetools.api.generated.models.order_edit.OrderEditSetCustomFieldAction;
import com.commercetools.api.generated.models.order_edit.OrderEditSetCustomTypeAction;
import com.commercetools.api.generated.models.order_edit.OrderEditSetKeyAction;
import com.commercetools.api.generated.models.order_edit.OrderEditSetStagedActionsAction;


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
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.OrderEditAddStagedActionActionImpl.class, name = "addStagedAction"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.OrderEditSetCommentActionImpl.class, name = "setComment"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.OrderEditSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.OrderEditSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.OrderEditSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.OrderEditSetStagedActionsActionImpl.class, name = "setStagedActions")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface OrderEditUpdateAction  {


   


}