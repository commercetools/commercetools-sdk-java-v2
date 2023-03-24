
package com.commercetools.api.models.channel;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelSetCustomFieldAction channelSetCustomFieldAction = ChannelSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChannelSetCustomFieldActionBuilder implements Builder<ChannelSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public ChannelSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

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

    /**
     * builds ChannelSetCustomFieldAction with checking for non-null required values
     * @return ChannelSetCustomFieldAction
     */
    public ChannelSetCustomFieldAction build() {
        Objects.requireNonNull(name, ChannelSetCustomFieldAction.class + ": name is missing");
        return new ChannelSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds ChannelSetCustomFieldAction without checking for non-null required values
     * @return ChannelSetCustomFieldAction
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
