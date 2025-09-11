
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

    private Long quantity;

    private com.commercetools.importapi.models.common.StateKeyReference state;

    /**
     *  <p>Number of Line Items or Custom Line Items in this State.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public ItemStateBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>State of the Line Items or Custom Line Items in a custom workflow. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced State is created.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public ItemStateBuilder state(
            Function<com.commercetools.importapi.models.common.StateKeyReferenceBuilder, com.commercetools.importapi.models.common.StateKeyReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.importapi.models.common.StateKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Line Items or Custom Line Items in a custom workflow. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced State is created.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public ItemStateBuilder withState(
            Function<com.commercetools.importapi.models.common.StateKeyReferenceBuilder, com.commercetools.importapi.models.common.StateKeyReference> builder) {
        this.state = builder.apply(com.commercetools.importapi.models.common.StateKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>State of the Line Items or Custom Line Items in a custom workflow. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced State is created.</p>
     * @param state value to be set
     * @return Builder
     */

    public ItemStateBuilder state(final com.commercetools.importapi.models.common.StateKeyReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Number of Line Items or Custom Line Items in this State.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>State of the Line Items or Custom Line Items in a custom workflow. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced State is created.</p>
     * @return state
     */

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

    /**
     * factory method for an instance of ItemStateBuilder
     * @return builder
     */
    public static ItemStateBuilder of() {
        return new ItemStateBuilder();
    }

    /**
     * create builder for ItemState instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ItemStateBuilder of(final ItemState template) {
        ItemStateBuilder builder = new ItemStateBuilder();
        builder.quantity = template.getQuantity();
        builder.state = template.getState();
        return builder;
    }

}
