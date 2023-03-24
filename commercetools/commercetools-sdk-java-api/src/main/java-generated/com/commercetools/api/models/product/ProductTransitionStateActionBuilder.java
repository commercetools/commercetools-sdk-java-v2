
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTransitionStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTransitionStateAction productTransitionStateAction = ProductTransitionStateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTransitionStateActionBuilder implements Builder<ProductTransitionStateAction> {

    @Nullable
    private com.commercetools.api.models.state.StateResourceIdentifier state;

    @Nullable
    private Boolean force;

    /**
     *  <p>The State to transition to. If there is no existing State, this must be an initial State.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public ProductTransitionStateActionBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The State to transition to. If there is no existing State, this must be an initial State.</p>
     * @param state value to be set
     * @return Builder
     */

    public ProductTransitionStateActionBuilder state(
            @Nullable final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>If <code>true</code>, validations are disabled.</p>
     * @param force value to be set
     * @return Builder
     */

    public ProductTransitionStateActionBuilder force(@Nullable final Boolean force) {
        this.force = force;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    @Nullable
    public Boolean getForce() {
        return this.force;
    }

    /**
     * builds ProductTransitionStateAction with checking for non-null required values
     * @return ProductTransitionStateAction
     */
    public ProductTransitionStateAction build() {
        return new ProductTransitionStateActionImpl(state, force);
    }

    /**
     * builds ProductTransitionStateAction without checking for non-null required values
     * @return ProductTransitionStateAction
     */
    public ProductTransitionStateAction buildUnchecked() {
        return new ProductTransitionStateActionImpl(state, force);
    }

    public static ProductTransitionStateActionBuilder of() {
        return new ProductTransitionStateActionBuilder();
    }

    public static ProductTransitionStateActionBuilder of(final ProductTransitionStateAction template) {
        ProductTransitionStateActionBuilder builder = new ProductTransitionStateActionBuilder();
        builder.state = template.getState();
        builder.force = template.getForce();
        return builder;
    }

}
