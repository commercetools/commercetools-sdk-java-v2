package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionDestination;
import com.commercetools.api.models.extension.ExtensionUpdateAction;
import com.commercetools.api.models.extension.ExtensionChangeDestinationActionImpl;

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
@JsonDeserialize(as = ExtensionChangeDestinationActionImpl.class)
public interface ExtensionChangeDestinationAction extends ExtensionUpdateAction {

    String CHANGE_DESTINATION = "changeDestination";

    
    @NotNull
    @Valid
    @JsonProperty("destination")
    public ExtensionDestination getDestination();

    
    public void setDestination(final ExtensionDestination destination);
    

    public static ExtensionChangeDestinationAction of(){
        return new ExtensionChangeDestinationActionImpl();
    }
    

    public static ExtensionChangeDestinationAction of(final ExtensionChangeDestinationAction template) {
        ExtensionChangeDestinationActionImpl instance = new ExtensionChangeDestinationActionImpl();
        instance.setDestination(template.getDestination());
        return instance;
    }

    public static ExtensionChangeDestinationActionBuilder builder(){
        return ExtensionChangeDestinationActionBuilder.of();
    }
    
    public static ExtensionChangeDestinationActionBuilder builder(final ExtensionChangeDestinationAction template){
        return ExtensionChangeDestinationActionBuilder.of(template);
    }
    

    default <T> T withExtensionChangeDestinationAction(Function<ExtensionChangeDestinationAction, T> helper) {
        return helper.apply(this);
    }
}
