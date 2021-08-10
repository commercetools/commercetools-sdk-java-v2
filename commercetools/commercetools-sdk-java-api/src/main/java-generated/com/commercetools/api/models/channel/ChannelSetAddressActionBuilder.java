
package com.commercetools.api.models.channel;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChannelSetAddressActionBuilder implements Builder<ChannelSetAddressAction> {

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    public ChannelSetAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public ChannelSetAddressAction build() {
        return new ChannelSetAddressActionImpl(address);
    }

    /**
     * builds ChannelSetAddressAction without checking for non null required values
     */
    public ChannelSetAddressAction buildUnchecked() {
        return new ChannelSetAddressActionImpl(address);
    }

    public static ChannelSetAddressActionBuilder of() {
        return new ChannelSetAddressActionBuilder();
    }

    public static ChannelSetAddressActionBuilder of(final ChannelSetAddressAction template) {
        ChannelSetAddressActionBuilder builder = new ChannelSetAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
