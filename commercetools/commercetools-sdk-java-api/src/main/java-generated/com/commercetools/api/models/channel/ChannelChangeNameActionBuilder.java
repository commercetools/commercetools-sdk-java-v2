
package com.commercetools.api.models.channel;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelChangeNameAction channelChangeNameAction = ChannelChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChannelChangeNameActionBuilder implements Builder<ChannelChangeNameAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ChannelChangeNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ChannelChangeNameActionBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     * @return Builder
     */

    public ChannelChangeNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds ChannelChangeNameAction with checking for non-null required values
     * @return ChannelChangeNameAction
     */
    public ChannelChangeNameAction build() {
        Objects.requireNonNull(name, ChannelChangeNameAction.class + ": name is missing");
        return new ChannelChangeNameActionImpl(name);
    }

    /**
     * builds ChannelChangeNameAction without checking for non-null required values
     * @return ChannelChangeNameAction
     */
    public ChannelChangeNameAction buildUnchecked() {
        return new ChannelChangeNameActionImpl(name);
    }

    /**
     * factory method for an instance of ChannelChangeNameActionBuilder
     * @return builder
     */
    public static ChannelChangeNameActionBuilder of() {
        return new ChannelChangeNameActionBuilder();
    }

    /**
     * create builder for ChannelChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelChangeNameActionBuilder of(final ChannelChangeNameAction template) {
        ChannelChangeNameActionBuilder builder = new ChannelChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
