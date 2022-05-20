
package com.commercetools.api.models.channel;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ChannelChangeDescriptionActionBuilder implements Builder<ChannelChangeDescriptionAction> {

    private com.commercetools.api.models.common.LocalizedString description;

    /**
    *  <p>New value to set. Must not be empty.</p>
    */

    public ChannelChangeDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
    *  <p>New value to set. Must not be empty.</p>
    */

    public ChannelChangeDescriptionActionBuilder description(
            final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public ChannelChangeDescriptionAction build() {
        Objects.requireNonNull(description, ChannelChangeDescriptionAction.class + ": description is missing");
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
