
package com.commercetools.api.models.channel;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChannelSetCustomFieldActionBuilder implements Builder<ChannelSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public ChannelSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ChannelSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public ChannelSetCustomFieldAction build() {
        Objects.requireNonNull(name, ChannelSetCustomFieldAction.class + ": name is missing");
        return new ChannelSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds ChannelSetCustomFieldAction without checking for non null required values
     */
    public ChannelSetCustomFieldAction buildUnchecked() {
        return new ChannelSetCustomFieldActionImpl(name, value);
    }

    public static ChannelSetCustomFieldActionBuilder of() {
        return new ChannelSetCustomFieldActionBuilder();
    }

    public static ChannelSetCustomFieldActionBuilder of(final ChannelSetCustomFieldAction template) {
        ChannelSetCustomFieldActionBuilder builder = new ChannelSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
