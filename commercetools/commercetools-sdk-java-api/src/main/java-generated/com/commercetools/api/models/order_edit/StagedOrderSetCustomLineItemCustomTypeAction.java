
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomLineItemCustomTypeActionImpl.class)
public interface StagedOrderSetCustomLineItemCustomTypeAction extends StagedOrderUpdateAction {

    String SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE = "setCustomLineItemCustomType";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setCustomLineItemId(final String customLineItemId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static StagedOrderSetCustomLineItemCustomTypeAction of() {
        return new StagedOrderSetCustomLineItemCustomTypeActionImpl();
    }

    public static StagedOrderSetCustomLineItemCustomTypeAction of(
            final StagedOrderSetCustomLineItemCustomTypeAction template) {
        StagedOrderSetCustomLineItemCustomTypeActionImpl instance = new StagedOrderSetCustomLineItemCustomTypeActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static StagedOrderSetCustomLineItemCustomTypeActionBuilder builder() {
        return StagedOrderSetCustomLineItemCustomTypeActionBuilder.of();
    }

    public static StagedOrderSetCustomLineItemCustomTypeActionBuilder builder(
            final StagedOrderSetCustomLineItemCustomTypeAction template) {
        return StagedOrderSetCustomLineItemCustomTypeActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetCustomLineItemCustomTypeAction(
            Function<StagedOrderSetCustomLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
