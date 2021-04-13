
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class UnpublishChangeBuilder {

    private String change;

    public UnpublishChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public UnpublishChange build() {
        return new UnpublishChangeImpl(change);
    }

    public static UnpublishChangeBuilder of() {
        return new UnpublishChangeBuilder();
    }

    public static UnpublishChangeBuilder of(final UnpublishChange template) {
        UnpublishChangeBuilder builder = new UnpublishChangeBuilder();
        builder.change = template.getChange();
        return builder;
    }

}
