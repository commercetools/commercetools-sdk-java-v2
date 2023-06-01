package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.channel.ChannelChangeDescriptionAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelChangeDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelChangeDescriptionAction channelChangeDescriptionAction = ChannelChangeDescriptionAction.builder()
 *             .description(descriptionBuilder -> descriptionBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChannelChangeDescriptionActionBuilder implements Builder<ChannelChangeDescriptionAction> {

    
    
    private com.commercetools.api.models.common.LocalizedString description;

    
    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public ChannelChangeDescriptionActionBuilder description(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public ChannelChangeDescriptionActionBuilder withDescription(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param description value to be set
     * @return Builder
     */
    
    public ChannelChangeDescriptionActionBuilder description( final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }
    
    

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return description
     */
    
    
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }

    /**
     * builds ChannelChangeDescriptionAction with checking for non-null required values
     * @return ChannelChangeDescriptionAction
     */
    public ChannelChangeDescriptionAction build() {
        Objects.requireNonNull(description, ChannelChangeDescriptionAction.class + ": description is missing");
        return new ChannelChangeDescriptionActionImpl(description);
    }
    
    /**
     * builds ChannelChangeDescriptionAction without checking for non-null required values
     * @return ChannelChangeDescriptionAction
     */
    public ChannelChangeDescriptionAction buildUnchecked() {
        return new ChannelChangeDescriptionActionImpl(description);
    }

    /**
     * factory method for an instance of ChannelChangeDescriptionActionBuilder
     * @return builder 
     */
    public static ChannelChangeDescriptionActionBuilder of() {
        return new ChannelChangeDescriptionActionBuilder();
    }

    /**
     * create builder for ChannelChangeDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelChangeDescriptionActionBuilder of(final ChannelChangeDescriptionAction template) {
        ChannelChangeDescriptionActionBuilder builder = new ChannelChangeDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
