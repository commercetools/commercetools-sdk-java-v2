
package com.commercetools.api.models.state;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StateSetNameActionBuilder {

    private com.commercetools.api.models.common.LocalizedString name;

    public StateSetNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public StateSetNameAction build() {
        return new StateSetNameActionImpl(name);
    }

    public static StateSetNameActionBuilder of() {
        return new StateSetNameActionBuilder();
    }

    public static StateSetNameActionBuilder of(final StateSetNameAction template) {
        StateSetNameActionBuilder builder = new StateSetNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
