
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingRoleOnChannelErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingRoleOnChannelError missingRoleOnChannelError = MissingRoleOnChannelError.builder()
 *             .message("{message}")
 *             .missingRole(ChannelRoleEnum.INVENTORY_SUPPLY)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MissingRoleOnChannelErrorBuilder implements Builder<MissingRoleOnChannelError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    private com.commercetools.api.models.channel.ChannelRoleEnum missingRole;

    /**
     <>
     */

    public MissingRoleOnChannelErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     <>
     */

    public MissingRoleOnChannelErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     <>
     */

    public MissingRoleOnChannelErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     <*  <p>ResourceIdentifier to a Channel.</p>>
     */

    public MissingRoleOnChannelErrorBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     <*  <p>ResourceIdentifier to a Channel.</p>>
     */

    public MissingRoleOnChannelErrorBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }

    /**
     <*  <p>Describes the purpose and type of the Channel. A Channel can have one or more roles.</p>>
     */

    public MissingRoleOnChannelErrorBuilder missingRole(
            final com.commercetools.api.models.channel.ChannelRoleEnum missingRole) {
        this.missingRole = missingRole;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    public com.commercetools.api.models.channel.ChannelRoleEnum getMissingRole() {
        return this.missingRole;
    }

    public MissingRoleOnChannelError build() {
        Objects.requireNonNull(message, MissingRoleOnChannelError.class + ": message is missing");
        Objects.requireNonNull(values, MissingRoleOnChannelError.class + ": values are missing");
        Objects.requireNonNull(missingRole, MissingRoleOnChannelError.class + ": missingRole is missing");
        return new MissingRoleOnChannelErrorImpl(message, values, channel, missingRole);
    }

    /**
     * builds MissingRoleOnChannelError without checking for non null required values
     */
    public MissingRoleOnChannelError buildUnchecked() {
        return new MissingRoleOnChannelErrorImpl(message, values, channel, missingRole);
    }

    public static MissingRoleOnChannelErrorBuilder of() {
        return new MissingRoleOnChannelErrorBuilder();
    }

    public static MissingRoleOnChannelErrorBuilder of(final MissingRoleOnChannelError template) {
        MissingRoleOnChannelErrorBuilder builder = new MissingRoleOnChannelErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.channel = template.getChannel();
        builder.missingRole = template.getMissingRole();
        return builder;
    }

}
