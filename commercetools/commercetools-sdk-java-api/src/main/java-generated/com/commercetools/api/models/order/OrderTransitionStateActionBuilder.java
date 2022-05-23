
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderTransitionStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderTransitionStateAction orderTransitionStateAction = OrderTransitionStateAction.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderTransitionStateActionBuilder implements Builder<OrderTransitionStateAction> {

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    @Nullable
    private Boolean force;

    /**
     <*  <p>ResourceIdentifier to a State.</p>>
     */

    public OrderTransitionStateActionBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>ResourceIdentifier to a State.</p>>
     */

    public OrderTransitionStateActionBuilder state(
            final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    /**
     <>
     */

    public OrderTransitionStateActionBuilder force(@Nullable final Boolean force) {
        this.force = force;
        return this;
    }

    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    @Nullable
    public Boolean getForce() {
        return this.force;
    }

    public OrderTransitionStateAction build() {
        Objects.requireNonNull(state, OrderTransitionStateAction.class + ": state is missing");
        return new OrderTransitionStateActionImpl(state, force);
    }

    /**
     * builds OrderTransitionStateAction without checking for non null required values
     */
    public OrderTransitionStateAction buildUnchecked() {
        return new OrderTransitionStateActionImpl(state, force);
    }

    public static OrderTransitionStateActionBuilder of() {
        return new OrderTransitionStateActionBuilder();
    }

    public static OrderTransitionStateActionBuilder of(final OrderTransitionStateAction template) {
        OrderTransitionStateActionBuilder builder = new OrderTransitionStateActionBuilder();
        builder.state = template.getState();
        builder.force = template.getForce();
        return builder;
    }

}
