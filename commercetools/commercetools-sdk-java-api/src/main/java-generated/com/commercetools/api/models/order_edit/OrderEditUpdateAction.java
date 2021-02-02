
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditAddStagedActionActionImpl.class, name = OrderEditAddStagedActionAction.ADD_STAGED_ACTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetCommentActionImpl.class, name = OrderEditSetCommentAction.SET_COMMENT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetCustomFieldActionImpl.class, name = OrderEditSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetCustomTypeActionImpl.class, name = OrderEditSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetKeyActionImpl.class, name = OrderEditSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetStagedActionsActionImpl.class, name = OrderEditSetStagedActionsAction.SET_STAGED_ACTIONS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = OrderEditUpdateActionImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface OrderEditUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<OrderEditUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    default <T> T withOrderEditUpdateAction(Function<OrderEditUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
