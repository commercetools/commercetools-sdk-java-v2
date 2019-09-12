package com.commercetools.models.OrderEdit;

import com.commercetools.models.OrderEdit.OrderEditAddStagedActionAction;
import com.commercetools.models.OrderEdit.OrderEditSetCommentAction;
import com.commercetools.models.OrderEdit.OrderEditSetCustomFieldAction;
import com.commercetools.models.OrderEdit.OrderEditSetCustomTypeAction;
import com.commercetools.models.OrderEdit.OrderEditSetKeyAction;
import com.commercetools.models.OrderEdit.OrderEditSetStagedActionsAction;
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
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.OrderEditAddStagedActionActionImpl.class, name = "addStagedAction"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.OrderEditSetCommentActionImpl.class, name = "setComment"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.OrderEditSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.OrderEditSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.OrderEditSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.OrderEditSetStagedActionsActionImpl.class, name = "setStagedActions")
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