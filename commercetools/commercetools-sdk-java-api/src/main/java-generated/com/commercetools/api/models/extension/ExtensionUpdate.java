package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionUpdateAction;
import com.commercetools.api.models.extension.ExtensionUpdateImpl;

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
@JsonDeserialize(as = ExtensionUpdateImpl.class)
public interface ExtensionUpdate  {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ExtensionUpdateAction> getActions();

    public void setVersion(final Long version);
    
    @JsonIgnore
    public void setActions(final ExtensionUpdateAction ...actions);
    public void setActions(final List<ExtensionUpdateAction> actions);

    public static ExtensionUpdateImpl of(){
        return new ExtensionUpdateImpl();
    }
    

    public static ExtensionUpdateImpl of(final ExtensionUpdate template) {
        ExtensionUpdateImpl instance = new ExtensionUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    default <T> T withExtensionUpdate(Function<ExtensionUpdate, T> helper) {
        return helper.apply(this);
    }
}
