
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LocalizedLabelBuilder {

    private com.commercetools.history.models.LocalizedString value;

    public LocalizedLabelBuilder value(final com.commercetools.history.models.LocalizedString value) {
        this.value = value;
        return this;
    }

    public com.commercetools.history.models.LocalizedString getValue() {
        return this.value;
    }

    public LocalizedLabel build() {
        return new LocalizedLabelImpl(value);
    }

    public static LocalizedLabelBuilder of() {
        return new LocalizedLabelBuilder();
    }

    public static LocalizedLabelBuilder of(final LocalizedLabel template) {
        LocalizedLabelBuilder builder = new LocalizedLabelBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
