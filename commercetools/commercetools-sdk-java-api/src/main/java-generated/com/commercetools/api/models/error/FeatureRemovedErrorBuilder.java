
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class FeatureRemovedErrorBuilder {

    private String message;

    public FeatureRemovedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public FeatureRemovedError build() {
        return new FeatureRemovedErrorImpl(message);
    }

    public static FeatureRemovedErrorBuilder of() {
        return new FeatureRemovedErrorBuilder();
    }

    public static FeatureRemovedErrorBuilder of(final FeatureRemovedError template) {
        FeatureRemovedErrorBuilder builder = new FeatureRemovedErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
