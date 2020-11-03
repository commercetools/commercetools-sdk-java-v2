package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.order_edit.StagedOrderSetLineItemCustomTypeActionImpl;

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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetLineItemCustomTypeActionImpl.class)
public interface StagedOrderSetLineItemCustomTypeAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();
    
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setLineItemId(final String lineItemId);
    
    public void setType(final TypeResourceIdentifier type);
    
    public void setFields(final FieldContainer fields);

    public static StagedOrderSetLineItemCustomTypeActionImpl of(){
        return new StagedOrderSetLineItemCustomTypeActionImpl();
    }
    

    public static StagedOrderSetLineItemCustomTypeActionImpl of(final StagedOrderSetLineItemCustomTypeAction template) {
        StagedOrderSetLineItemCustomTypeActionImpl instance = new StagedOrderSetLineItemCustomTypeActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    default <T> T withStagedOrderSetLineItemCustomTypeAction(Function<StagedOrderSetLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
