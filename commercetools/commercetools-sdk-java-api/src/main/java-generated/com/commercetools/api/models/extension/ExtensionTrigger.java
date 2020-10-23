package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionAction;
import com.commercetools.api.models.extension.ExtensionResourceTypeId;
import com.commercetools.api.models.extension.ExtensionTriggerImpl;

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
@JsonDeserialize(as = ExtensionTriggerImpl.class)
public interface ExtensionTrigger  {

    
    @NotNull
    @JsonProperty("resourceTypeId")
    public ExtensionResourceTypeId getResourceTypeId();
    
    @NotNull
    @JsonProperty("actions")
    public List<ExtensionAction> getActions();

    public void setResourceTypeId(final ExtensionResourceTypeId resourceTypeId);
    
    public void setActions(final List<ExtensionAction> actions);

    public static ExtensionTriggerImpl of(){
        return new ExtensionTriggerImpl();
    }
    

    public static ExtensionTriggerImpl of(final ExtensionTrigger template) {
        ExtensionTriggerImpl instance = new ExtensionTriggerImpl();
        instance.setResourceTypeId(template.getResourceTypeId());
        instance.setActions(template.getActions());
        return instance;
    }

    default <T> T withExtensionTrigger(Function<ExtensionTrigger, T> helper) {
        return helper.apply(this);
    }
}
