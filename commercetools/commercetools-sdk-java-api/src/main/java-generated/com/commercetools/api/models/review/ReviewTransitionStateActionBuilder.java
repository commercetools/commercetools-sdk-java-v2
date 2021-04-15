
package com.commercetools.api.models.review;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewTransitionStateActionBuilder {

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    @Nullable
    private Boolean force;

    public ReviewTransitionStateActionBuilder state(
            final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    public ReviewTransitionStateActionBuilder force(@Nullable final Boolean force) {
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

    public ReviewTransitionStateAction build() {
        return new ReviewTransitionStateActionImpl(state, force);
    }

    public static ReviewTransitionStateActionBuilder of() {
        return new ReviewTransitionStateActionBuilder();
    }

    public static ReviewTransitionStateActionBuilder of(final ReviewTransitionStateAction template) {
        ReviewTransitionStateActionBuilder builder = new ReviewTransitionStateActionBuilder();
        builder.state = template.getState();
        builder.force = template.getForce();
        return builder;
    }

}
