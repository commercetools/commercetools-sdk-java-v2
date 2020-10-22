package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.me.MyCartSetLineItemCustomFieldActionImpl;

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
@JsonDeserialize(as = MyCartSetLineItemCustomFieldActionImpl.class)
public interface MyCartSetLineItemCustomFieldAction extends MyCartUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public JsonNode getValue();

    public void setLineItemId(final String lineItemId);
    
    public void setName(final String name);
    
    public void setValue(final JsonNode value);

    public static MyCartSetLineItemCustomFieldActionImpl of(){
        return new MyCartSetLineItemCustomFieldActionImpl();
    }
    

    public static MyCartSetLineItemCustomFieldActionImpl of(final MyCartSetLineItemCustomFieldAction template) {
        MyCartSetLineItemCustomFieldActionImpl instance = new MyCartSetLineItemCustomFieldActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    default <T extends Accessor<MyCartSetLineItemCustomFieldAction>> T withMyCartSetLineItemCustomFieldAction(Function<MyCartSetLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
