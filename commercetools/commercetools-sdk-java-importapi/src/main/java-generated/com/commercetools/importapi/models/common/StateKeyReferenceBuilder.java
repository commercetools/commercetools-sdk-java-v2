
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StateKeyReferenceBuilder implements Builder<StateKeyReference> {

    private String key;

    public StateKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public StateKeyReference build() {
        Objects.requireNonNull(key, StateKeyReference.class + ": key is missing");
        return new StateKeyReferenceImpl(key);
    }

    /**
     * builds StateKeyReference without checking for non null required values
     */
    public StateKeyReference buildUnchecked() {
        return new StateKeyReferenceImpl(key);
    }

    public static StateKeyReferenceBuilder of() {
        return new StateKeyReferenceBuilder();
    }

    public static StateKeyReferenceBuilder of(final StateKeyReference template) {
        StateKeyReferenceBuilder builder = new StateKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
