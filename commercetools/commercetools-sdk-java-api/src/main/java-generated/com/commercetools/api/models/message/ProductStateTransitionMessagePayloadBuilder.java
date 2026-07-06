
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
     *  <p>Product <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public ProductStateTransitionMessagePayloadBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Product <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public ProductStateTransitionMessagePayloadBuilder withState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Product <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @param state value to be set
     * @return Builder
     */

    public ProductStateTransitionMessagePayloadBuilder state(
            final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Whether <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> transition validations were turned off during the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @param force value to be set
     * @return Builder
     */

    public ProductStateTransitionMessagePayloadBuilder force(final Boolean force) {
        this.force = force;
        return this;
    }

    /**
     *  <p>Product <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @return state
     */

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p>Whether <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> transition validations were turned off during the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @return force
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * builds ProductStateTransitionMessagePayload with checking for non-null required values
     * @return ProductStateTransitionMessagePayload
     */
    public ProductStateTransitionMessagePayload build() {
        Objects.requireNonNull(state, ProductStateTransitionMessagePayload.class + ": state is missing");
        Objects.requireNonNull(force, ProductStateTransitionMessagePayload.class + ": force is missing");
        return new ProductStateTransitionMessagePayloadImpl(state, force);
    }

    /**
     * builds ProductStateTransitionMessagePayload without checking for non-null required values
     * @return ProductStateTransitionMessagePayload
     */
    public ProductStateTransitionMessagePayload buildUnchecked() {
        return new ProductStateTransitionMessagePayloadImpl(state, force);
    }

    /**
     * factory method for an instance of ProductStateTransitionMessagePayloadBuilder
     * @return builder
     */
    public static ProductStateTransitionMessagePayloadBuilder of() {
        return new ProductStateTransitionMessagePayloadBuilder();
    }

    /**
     * create builder for ProductStateTransitionMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductStateTransitionMessagePayloadBuilder of(final ProductStateTransitionMessagePayload template) {
        ProductStateTransitionMessagePayloadBuilder builder = new ProductStateTransitionMessagePayloadBuilder();
        builder.state = template.getState();
        builder.force = template.getForce();
        return builder;
    }

}
