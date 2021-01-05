package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditAddStagedActionAction;
import com.commercetools.api.models.order_edit.OrderEditSetCommentAction;
import com.commercetools.api.models.order_edit.OrderEditSetCustomFieldAction;
import com.commercetools.api.models.order_edit.OrderEditSetCustomTypeAction;
import com.commercetools.api.models.order_edit.OrderEditSetKeyAction;
import com.commercetools.api.models.order_edit.OrderEditSetStagedActionsAction;


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
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditAddStagedActionActionImpl.class, name = "addStagedAction"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetCommentActionImpl.class, name = "setComment"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetStagedActionsActionImpl.class, name = "setStagedActions")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = OrderEditUpdateActionImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface OrderEditUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<OrderEditUpdateAction> {

    
    @NotNull
    @JsonProperty("action")
    public String getAction();





    default <T> T withOrderEditUpdateAction(Function<OrderEditUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
