
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ItemStateBuilder implements Builder<ItemState> {

    private Integer quantity;

    private com.commercetools.history.models.common.Reference state;

    public ItemStateBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public ItemStateBuilder state(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public ItemStateBuilder state(final com.commercetools.history.models.common.Reference state) {
        this.state = state;
        return this;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public com.commercetools.history.models.common.Reference getState() {
        return this.state;
    }

    public ItemState build() {
        Objects.requireNonNull(quantity, ItemState.class + ": quantity is missing");
        Objects.requireNonNull(state, ItemState.class + ": state is missing");
        return new ItemStateImpl(quantity, state);
    }

    /**
     * builds ItemState without checking for non null required values
     */
    public ItemState buildUnchecked() {
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
