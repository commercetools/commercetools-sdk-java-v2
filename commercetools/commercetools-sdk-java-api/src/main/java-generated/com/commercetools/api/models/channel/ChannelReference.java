
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelReferenceImpl.class)
public interface ChannelReference extends Reference {

    String CHANNEL = "channel";

    @Valid
    @JsonProperty("obj")
    public Channel getObj();

    public void setObj(final Channel obj);

    public static ChannelReference of() {
        return new ChannelReferenceImpl();
    }

    public static ChannelReference of(final ChannelReference template) {
        ChannelReferenceImpl instance = new ChannelReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static ChannelReferenceBuilder builder() {
        return ChannelReferenceBuilder.of();
    }

    public static ChannelReferenceBuilder builder(final ChannelReference template) {
        return ChannelReferenceBuilder.of(template);
    }

    default <T> T withChannelReference(Function<ChannelReference, T> helper) {
        return helper.apply(this);
    }
}
