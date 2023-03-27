
package com.commercetools.api.models.channel;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelSetAddressCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelSetAddressCustomFieldAction channelSetAddressCustomFieldAction = ChannelSetAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChannelSetAddressCustomFieldActionBuilder implements Builder<ChannelSetAddressCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public ChannelSetAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Specifies the format of the value of the Custom Field defined by <code>name</code>. If <code>value</code> is absent or <code>null</code>, this field will be removed, if it exists. Removing a field that does not exist returns an InvalidOperation error.</p>
     * @param value value to be set
     * @return Builder
     */

    public ChannelSetAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Specifies the format of the value of the Custom Field defined by <code>name</code>. If <code>value</code> is absent or <code>null</code>, this field will be removed, if it exists. Removing a field that does not exist returns an InvalidOperation error.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds ChannelSetAddressCustomFieldAction with checking for non-null required values
     * @return ChannelSetAddressCustomFieldAction
     */
    public ChannelSetAddressCustomFieldAction build() {
        Objects.requireNonNull(name, ChannelSetAddressCustomFieldAction.class + ": name is missing");
        return new ChannelSetAddressCustomFieldActionImpl(name, value);
    }

    /**
     * builds ChannelSetAddressCustomFieldAction without checking for non-null required values
     * @return ChannelSetAddressCustomFieldAction
     */
    public ChannelSetAddressCustomFieldAction buildUnchecked() {
        return new ChannelSetAddressCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of ChannelSetAddressCustomFieldActionBuilder
     * @return builder
     */
    public static ChannelSetAddressCustomFieldActionBuilder of() {
        return new ChannelSetAddressCustomFieldActionBuilder();
    }

    /**
     * create builder for ChannelSetAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelSetAddressCustomFieldActionBuilder of(final ChannelSetAddressCustomFieldAction template) {
        ChannelSetAddressCustomFieldActionBuilder builder = new ChannelSetAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
