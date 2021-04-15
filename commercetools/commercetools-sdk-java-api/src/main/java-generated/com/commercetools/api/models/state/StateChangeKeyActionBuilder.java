
package com.commercetools.api.models.state;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StateChangeKeyActionBuilder {

    private String key;

    public StateChangeKeyActionBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public StateChangeKeyAction build() {
        return new StateChangeKeyActionImpl(key);
    }

    public static StateChangeKeyActionBuilder of() {
        return new StateChangeKeyActionBuilder();
    }

    public static StateChangeKeyActionBuilder of(final StateChangeKeyAction template) {
        StateChangeKeyActionBuilder builder = new StateChangeKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
