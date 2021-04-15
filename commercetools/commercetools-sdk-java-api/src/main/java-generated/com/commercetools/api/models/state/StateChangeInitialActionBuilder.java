
package com.commercetools.api.models.state;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StateChangeInitialActionBuilder {

    private Boolean initial;

    public StateChangeInitialActionBuilder initial(final Boolean initial) {
        this.initial = initial;
        return this;
    }

    public Boolean getInitial() {
        return this.initial;
    }

    public StateChangeInitialAction build() {
        return new StateChangeInitialActionImpl(initial);
    }

    public static StateChangeInitialActionBuilder of() {
        return new StateChangeInitialActionBuilder();
    }

    public static StateChangeInitialActionBuilder of(final StateChangeInitialAction template) {
        StateChangeInitialActionBuilder builder = new StateChangeInitialActionBuilder();
        builder.initial = template.getInitial();
        return builder;
    }

}
