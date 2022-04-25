
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelUpdateImpl.class)
public interface ChannelUpdate
        extends com.commercetools.api.models.ResourceUpdate<ChannelUpdate, ChannelUpdateAction, ChannelUpdateBuilder> {

    /**
    *  <p>Expected version of the Channel on which the changes should be applied. If the expected version does not match the actual version, a <a href="/../api/errors#409-conflict">409 Conflict</a> error will be returned.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>Update actions to be performed on the Channel.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ChannelUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final ChannelUpdateAction... actions);

    public void setActions(final List<ChannelUpdateAction> actions);

    public static ChannelUpdate of() {
        return new ChannelUpdateImpl();
    }

    public static ChannelUpdate of(final ChannelUpdate template) {
        ChannelUpdateImpl instance = new ChannelUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static ChannelUpdateBuilder builder() {
        return ChannelUpdateBuilder.of();
    }

    public static ChannelUpdateBuilder builder(final ChannelUpdate template) {
        return ChannelUpdateBuilder.of(template);
    }

    default <T> T withChannelUpdate(Function<ChannelUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChannelUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelUpdate>";
            }
        };
    }
}
