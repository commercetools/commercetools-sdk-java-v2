
package com.commercetools.api.models.channel;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChannelSetAddressCustomFieldActionBuilder implements Builder<ChannelSetAddressCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public ChannelSetAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ChannelSetAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public ChannelSetAddressCustomFieldAction build() {
        Objects.requireNonNull(name, ChannelSetAddressCustomFieldAction.class + ": name is missing");
        return new ChannelSetAddressCustomFieldActionImpl(name, value);
    }

    /**
     * builds ChannelSetAddressCustomFieldAction without checking for non null required values
     */
    public ChannelSetAddressCustomFieldAction buildUnchecked() {
        return new ChannelSetAddressCustomFieldActionImpl(name, value);
    }

    public static ChannelSetAddressCustomFieldActionBuilder of() {
        return new ChannelSetAddressCustomFieldActionBuilder();
    }

    public static ChannelSetAddressCustomFieldActionBuilder of(final ChannelSetAddressCustomFieldAction template) {
        ChannelSetAddressCustomFieldActionBuilder builder = new ChannelSetAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
