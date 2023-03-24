
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ItemStateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ItemState itemState = ItemState.builder()
 *             .quantity(0.3)
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ItemStateBuilder implements Builder<ItemState> {

    private Double quantity;

    private com.commercetools.importapi.models.common.StateKeyReference state;

    /**
     *
     * @param quantity value to be set
     * @return Builder
     */

    public ItemStateBuilder quantity(final Double quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Maps to <code>ItemState.state</code>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public ItemStateBuilder state(
            Function<com.commercetools.importapi.models.common.StateKeyReferenceBuilder, com.commercetools.importapi.models.common.StateKeyReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.importapi.models.common.StateKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>ItemState.state</code>.</p>
     * @param state value to be set
     * @return Builder
     */

    public ItemStateBuilder state(final com.commercetools.importapi.models.common.StateKeyReference state) {
        this.state = state;
        return this;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public com.commercetools.importapi.models.common.StateKeyReference getState() {
        return this.state;
    }

    /**
     * builds ItemState with checking for non-null required values
     * @return ItemState
     */
    public ItemState build() {
        Objects.requireNonNull(quantity, ItemState.class + ": quantity is missing");
        Objects.requireNonNull(state, ItemState.class + ": state is missing");
        return new ItemStateImpl(quantity, state);
    }

    /**
     * builds ItemState without checking for non-null required values
     * @return ItemState
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
