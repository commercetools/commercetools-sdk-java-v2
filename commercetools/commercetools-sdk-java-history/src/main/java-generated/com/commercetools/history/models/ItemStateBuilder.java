
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ItemStateBuilder {

    private Integer quantity;

    private com.commercetools.history.models.Reference state;

    public ItemStateBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public ItemStateBuilder state(final com.commercetools.history.models.Reference state) {
        this.state = state;
        return this;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public com.commercetools.history.models.Reference getState() {
        return this.state;
    }

    public ItemState build() {
        return new ItemStateImpl(quantity, state);
    }

    public static ItemStateBuilder of() {
        return new ItemStateBuilder();
    }

    public static ItemStateBuilder of(final ItemState template) {
        ItemStateBuilder builder = new ItemStateBuilder();
        builder.quantity = template.getQuantity();
        builder.state = template.getState();
        return builder;
    }

}
