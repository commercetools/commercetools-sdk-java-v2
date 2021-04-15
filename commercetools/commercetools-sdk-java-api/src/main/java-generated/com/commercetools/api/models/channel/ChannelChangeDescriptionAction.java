
package com.commercetools.api.models.channel;

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
@JsonDeserialize(as = ChannelChangeDescriptionActionImpl.class)
public interface ChannelChangeDescriptionAction extends ChannelUpdateAction {

    String CHANGE_DESCRIPTION = "changeDescription";

    @NotNull
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setDescription(final LocalizedString description);

    public static ChannelChangeDescriptionAction of() {
        return new ChannelChangeDescriptionActionImpl();
    }

    public static ChannelChangeDescriptionAction of(final ChannelChangeDescriptionAction template) {
        ChannelChangeDescriptionActionImpl instance = new ChannelChangeDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static ChannelChangeDescriptionActionBuilder builder() {
        return ChannelChangeDescriptionActionBuilder.of();
    }

    public static ChannelChangeDescriptionActionBuilder builder(final ChannelChangeDescriptionAction template) {
        return ChannelChangeDescriptionActionBuilder.of(template);
    }

    default <T> T withChannelChangeDescriptionAction(Function<ChannelChangeDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
