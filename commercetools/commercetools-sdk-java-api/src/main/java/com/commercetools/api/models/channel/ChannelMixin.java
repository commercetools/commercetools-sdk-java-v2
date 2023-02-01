
package com.commercetools.api.models.channel;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

public interface ChannelMixin extends Referencable<Channel>, ResourceIdentifiable<Channel> {
    @Override
    public default ChannelResourceIdentifier toResourceIdentifier() {
        return ChannelResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default ChannelReference toReference() {
        return ChannelReference.builder().id(getId()).build();
    }
}
