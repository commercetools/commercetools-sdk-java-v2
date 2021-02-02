
package com.commercetools.api.json;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

public interface ReviewMixin {

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "typeId", visible = true)
    @JsonSubTypes({ @JsonSubTypes.Type(value = ProductReference.class, name = "product"),
            @JsonSubTypes.Type(value = ChannelReference.class, name = "channel") })
    public Object getTarget();

}
