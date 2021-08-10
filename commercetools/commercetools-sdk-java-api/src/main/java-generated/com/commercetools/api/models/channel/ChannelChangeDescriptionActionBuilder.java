
package com.commercetools.api.models.channel;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChannelChangeDescriptionActionBuilder implements Builder<ChannelChangeDescriptionAction> {

    private com.commercetools.api.models.common.LocalizedString description;

    public ChannelChangeDescriptionActionBuilder description(
            final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public ChannelChangeDescriptionAction build() {
        Objects.requireNonNull(description);
        return new ChannelChangeDescriptionActionImpl(description);
    }

    /**
     * builds ChannelChangeDescriptionAction without checking for non null required values
     */
    public ChannelChangeDescriptionAction buildUnchecked() {
        return new ChannelChangeDescriptionActionImpl(description);
    }

    public static ChannelChangeDescriptionActionBuilder of() {
        return new ChannelChangeDescriptionActionBuilder();
    }

    public static ChannelChangeDescriptionActionBuilder of(final ChannelChangeDescriptionAction template) {
        ChannelChangeDescriptionActionBuilder builder = new ChannelChangeDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
