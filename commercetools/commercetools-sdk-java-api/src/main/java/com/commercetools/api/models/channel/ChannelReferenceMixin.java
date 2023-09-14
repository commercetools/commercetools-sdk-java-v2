
package com.commercetools.api.models.channel;

import com.commercetools.api.models.common.ReferenceMixin;

public interface ChannelReferenceMixin extends ReferenceMixin {
    public String getId();

    public default ChannelResourceIdentifier toResourceIdentifier() {
        return ChannelResourceIdentifier.builder().id(this.getId()).build();
    }
}
