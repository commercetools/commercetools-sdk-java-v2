
package com.commercetools.api.models.channel;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChannelSetAddressCustomTypeActionBuilder {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public ChannelSetAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public ChannelSetAddressCustomTypeActionBuilder fields(
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

    public ChannelSetAddressCustomTypeAction build() {
        return new ChannelSetAddressCustomTypeActionImpl(type, fields);
    }

    public static ChannelSetAddressCustomTypeActionBuilder of() {
        return new ChannelSetAddressCustomTypeActionBuilder();
    }

    public static ChannelSetAddressCustomTypeActionBuilder of(final ChannelSetAddressCustomTypeAction template) {
        ChannelSetAddressCustomTypeActionBuilder builder = new ChannelSetAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
