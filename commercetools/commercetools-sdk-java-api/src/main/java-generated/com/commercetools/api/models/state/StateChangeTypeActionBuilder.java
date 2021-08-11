
package com.commercetools.api.models.state;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StateChangeTypeActionBuilder implements Builder<StateChangeTypeAction> {

    private com.commercetools.api.models.state.StateTypeEnum type;

    public StateChangeTypeActionBuilder type(final com.commercetools.api.models.state.StateTypeEnum type) {
        this.type = type;
        return this;
    }

    public com.commercetools.api.models.state.StateTypeEnum getType() {
        return this.type;
    }

    public StateChangeTypeAction build() {
        Objects.requireNonNull(type, StateChangeTypeAction.class + ": type is missing");
        return new StateChangeTypeActionImpl(type);
    }

    /**
     * builds StateChangeTypeAction without checking for non null required values
     */
    public StateChangeTypeAction buildUnchecked() {
        return new StateChangeTypeActionImpl(type);
    }

    public static StateChangeTypeActionBuilder of() {
        return new StateChangeTypeActionBuilder();
    }

    public static StateChangeTypeActionBuilder of(final StateChangeTypeAction template) {
        StateChangeTypeActionBuilder builder = new StateChangeTypeActionBuilder();
        builder.type = template.getType();
        return builder;
    }

}
