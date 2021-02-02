
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ExtensionChangeTriggersActionImpl.class)
public interface ExtensionChangeTriggersAction extends ExtensionUpdateAction {

    String CHANGE_TRIGGERS = "changeTriggers";

    @NotNull
    @Valid
    @JsonProperty("triggers")
    public List<ExtensionTrigger> getTriggers();

    @JsonIgnore
    public void setTriggers(final ExtensionTrigger... triggers);

    public void setTriggers(final List<ExtensionTrigger> triggers);

    public static ExtensionChangeTriggersAction of() {
        return new ExtensionChangeTriggersActionImpl();
    }

    public static ExtensionChangeTriggersAction of(final ExtensionChangeTriggersAction template) {
        ExtensionChangeTriggersActionImpl instance = new ExtensionChangeTriggersActionImpl();
        instance.setTriggers(template.getTriggers());
        return instance;
    }

    public static ExtensionChangeTriggersActionBuilder builder() {
        return ExtensionChangeTriggersActionBuilder.of();
    }

    public static ExtensionChangeTriggersActionBuilder builder(final ExtensionChangeTriggersAction template) {
        return ExtensionChangeTriggersActionBuilder.of(template);
    }

    default <T> T withExtensionChangeTriggersAction(Function<ExtensionChangeTriggersAction, T> helper) {
        return helper.apply(this);
    }
}
