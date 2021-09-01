
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PublishChangeBuilder implements Builder<PublishChange> {

    private String change;

    public PublishChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public PublishChange build() {
        Objects.requireNonNull(change, PublishChange.class + ": change is missing");
        return new PublishChangeImpl(change);
    }

    /**
     * builds PublishChange without checking for non null required values
     */
    public PublishChange buildUnchecked() {
        return new PublishChangeImpl(change);
    }

    public static PublishChangeBuilder of() {
        return new PublishChangeBuilder();
    }

    public static PublishChangeBuilder of(final PublishChange template) {
        PublishChangeBuilder builder = new PublishChangeBuilder();
        builder.change = template.getChange();
        return builder;
    }

}
