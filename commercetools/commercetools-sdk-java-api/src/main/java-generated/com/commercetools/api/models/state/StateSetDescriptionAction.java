
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StateSetDescriptionActionImpl.class)
public interface StateSetDescriptionAction extends StateUpdateAction {

    String SET_DESCRIPTION = "setDescription";

    @NotNull
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setDescription(final LocalizedString description);

    public static StateSetDescriptionAction of() {
        return new StateSetDescriptionActionImpl();
    }

    public static StateSetDescriptionAction of(final StateSetDescriptionAction template) {
        StateSetDescriptionActionImpl instance = new StateSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static StateSetDescriptionActionBuilder builder() {
        return StateSetDescriptionActionBuilder.of();
    }

    public static StateSetDescriptionActionBuilder builder(final StateSetDescriptionAction template) {
        return StateSetDescriptionActionBuilder.of(template);
    }

    default <T> T withStateSetDescriptionAction(Function<StateSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
