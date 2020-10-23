package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomFieldActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetCustomFieldActionImpl.class)
public interface StagedOrderSetCustomFieldAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public JsonNode getValue();

    public void setName(final String name);
    
    public void setValue(final JsonNode value);

    public static StagedOrderSetCustomFieldActionImpl of(){
        return new StagedOrderSetCustomFieldActionImpl();
    }
    

    public static StagedOrderSetCustomFieldActionImpl of(final StagedOrderSetCustomFieldAction template) {
        StagedOrderSetCustomFieldActionImpl instance = new StagedOrderSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    default <T> T withStagedOrderSetCustomFieldAction(Function<StagedOrderSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
