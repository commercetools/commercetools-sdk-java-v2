
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DeliveryItemBuilder {

    private String id;

    private Long quantity;

    public DeliveryItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public DeliveryItemBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public DeliveryItem build() {
        return new DeliveryItemImpl(id, quantity);
    }

    public static DeliveryItemBuilder of() {
        return new DeliveryItemBuilder();
    }

    public static DeliveryItemBuilder of(final DeliveryItem template) {
        DeliveryItemBuilder builder = new DeliveryItemBuilder();
        builder.id = template.getId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
