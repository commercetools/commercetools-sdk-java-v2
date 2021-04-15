
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomTypeActionImpl.class)
public interface StagedOrderSetCustomTypeAction extends StagedOrderUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static StagedOrderSetCustomTypeAction of() {
        return new StagedOrderSetCustomTypeActionImpl();
    }

    public static StagedOrderSetCustomTypeAction of(final StagedOrderSetCustomTypeAction template) {
        StagedOrderSetCustomTypeActionImpl instance = new StagedOrderSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static StagedOrderSetCustomTypeActionBuilder builder() {
        return StagedOrderSetCustomTypeActionBuilder.of();
    }

    public static StagedOrderSetCustomTypeActionBuilder builder(final StagedOrderSetCustomTypeAction template) {
        return StagedOrderSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetCustomTypeAction(Function<StagedOrderSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
