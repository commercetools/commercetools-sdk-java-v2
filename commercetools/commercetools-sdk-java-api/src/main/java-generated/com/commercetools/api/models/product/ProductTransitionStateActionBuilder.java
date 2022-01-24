
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductTransitionStateActionBuilder implements Builder<ProductTransitionStateAction> {

    @Nullable
    private com.commercetools.api.models.state.StateResourceIdentifier state;

    @Nullable
    private Boolean force;

    public ProductTransitionStateActionBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    public ProductTransitionStateActionBuilder state(
            @Nullable final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

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

    public ProductTransitionStateAction build() {
        return new ProductTransitionStateActionImpl(state, force);
    }

    /**
     * builds ProductTransitionStateAction without checking for non null required values
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
