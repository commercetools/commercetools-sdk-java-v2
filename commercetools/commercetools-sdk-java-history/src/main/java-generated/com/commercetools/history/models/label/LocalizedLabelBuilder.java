
package com.commercetools.history.models.label;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LocalizedLabelBuilder implements Builder<LocalizedLabel> {

    private com.commercetools.history.models.common.LocalizedString value;

    public LocalizedLabelBuilder value(final com.commercetools.history.models.common.LocalizedString value) {
        this.value = value;
        return this;
    }

    public com.commercetools.history.models.common.LocalizedString getValue() {
        return this.value;
    }

    public LocalizedLabel build() {
        Objects.requireNonNull(value);
        return new LocalizedLabelImpl(value);
    }

    /**
     * builds LocalizedLabel without checking for non null required values
     */
    public LocalizedLabel buildUnchecked() {
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
