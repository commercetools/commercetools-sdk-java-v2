
package com.commercetools.api.models.channel;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelSetCustomTypeAction channelSetCustomTypeAction = ChannelSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChannelSetCustomTypeActionBuilder implements Builder<ChannelSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the Channel with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Channel.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public ChannelSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Channel with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Channel.</p>
     * @param type value to be set
     * @return Builder
     */

    public ChannelSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Channel.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public ChannelSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Channel.</p>
     * @param fields value to be set
     * @return Builder
     */

    public ChannelSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds ChannelSetCustomTypeAction with checking for non-null required values
     * @return ChannelSetCustomTypeAction
     */
    public ChannelSetCustomTypeAction build() {
        return new ChannelSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds ChannelSetCustomTypeAction without checking for non-null required values
     * @return ChannelSetCustomTypeAction
     */
    public ChannelSetCustomTypeAction buildUnchecked() {
        return new ChannelSetCustomTypeActionImpl(type, fields);
    }

    public static ChannelSetCustomTypeActionBuilder of() {
        return new ChannelSetCustomTypeActionBuilder();
    }

    public static ChannelSetCustomTypeActionBuilder of(final ChannelSetCustomTypeAction template) {
        ChannelSetCustomTypeActionBuilder builder = new ChannelSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
