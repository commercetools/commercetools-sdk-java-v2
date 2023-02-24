
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelSetAddressCustomFieldAction
 *
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
@JsonDeserialize(as = ChannelSetAddressCustomFieldActionImpl.class)
public interface ChannelSetAddressCustomFieldAction extends ChannelUpdateAction {

    String SET_ADDRESS_CUSTOM_FIELD = "setAddressCustomField";

    /**
     *  <p>Name of the Custom Field.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Specifies the format of the value of the Custom Field defined by <code>name</code>. If <code>value</code> is absent or <code>null</code>, this field will be removed, if it exists. Removing a field that does not exist returns an InvalidOperation error.</p>
     */

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static ChannelSetAddressCustomFieldAction of() {
        return new ChannelSetAddressCustomFieldActionImpl();
    }

    public static ChannelSetAddressCustomFieldAction of(final ChannelSetAddressCustomFieldAction template) {
        ChannelSetAddressCustomFieldActionImpl instance = new ChannelSetAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static ChannelSetAddressCustomFieldActionBuilder builder() {
        return ChannelSetAddressCustomFieldActionBuilder.of();
    }

    public static ChannelSetAddressCustomFieldActionBuilder builder(final ChannelSetAddressCustomFieldAction template) {
        return ChannelSetAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withChannelSetAddressCustomFieldAction(Function<ChannelSetAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static ChannelSetAddressCustomFieldAction ofUnset(final String name) {
        return ChannelSetAddressCustomFieldActionBuilder.of().name(name).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChannelSetAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelSetAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelSetAddressCustomFieldAction>";
            }
        };
    }
}
