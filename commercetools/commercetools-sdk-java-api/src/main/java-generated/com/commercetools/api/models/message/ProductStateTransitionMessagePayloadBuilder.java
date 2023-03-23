
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductStateTransitionMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductStateTransitionMessagePayload productStateTransitionMessagePayload = ProductStateTransitionMessagePayload.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductStateTransitionMessagePayloadBuilder implements Builder<ProductStateTransitionMessagePayload> {

    private com.commercetools.api.models.state.StateReference state;

    private Boolean force;

    /**
     *  <p>Product State after the Transition State update action.</p>
     * @return Builder
     */

    public ProductStateTransitionMessagePayloadBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Product State after the Transition State update action.</p>
     * @param state
     * @return Builder
     */

    public ProductStateTransitionMessagePayloadBuilder state(
            final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     * @param force
     * @return Builder
     */

    public ProductStateTransitionMessagePayloadBuilder force(final Boolean force) {
        this.force = force;
        return this;
    }

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    public Boolean getForce() {
        return this.force;
    }

    public ProductStateTransitionMessagePayload build() {
        Objects.requireNonNull(state, ProductStateTransitionMessagePayload.class + ": state is missing");
        Objects.requireNonNull(force, ProductStateTransitionMessagePayload.class + ": force is missing");
        return new ProductStateTransitionMessagePayloadImpl(state, force);
    }

    /**
     * builds ProductStateTransitionMessagePayload without checking for non null required values
     */
    public ProductStateTransitionMessagePayload buildUnchecked() {
        return new ProductStateTransitionMessagePayloadImpl(state, force);
    }

    public static ProductStateTransitionMessagePayloadBuilder of() {
        return new ProductStateTransitionMessagePayloadBuilder();
    }

    public static ProductStateTransitionMessagePayloadBuilder of(final ProductStateTransitionMessagePayload template) {
        ProductStateTransitionMessagePayloadBuilder builder = new ProductStateTransitionMessagePayloadBuilder();
        builder.state = template.getState();
        builder.force = template.getForce();
        return builder;
    }

}
