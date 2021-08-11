
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReferenceSetFieldBuilder implements Builder<ReferenceSetField> {

    private java.util.List<com.commercetools.importapi.models.common.KeyReference> value;

    public ReferenceSetFieldBuilder value(final com.commercetools.importapi.models.common.KeyReference... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public ReferenceSetFieldBuilder value(
            final java.util.List<com.commercetools.importapi.models.common.KeyReference> value) {
        this.value = value;
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.common.KeyReference> getValue() {
        return this.value;
    }

    public ReferenceSetField build() {
        Objects.requireNonNull(value, ReferenceSetField.class + ": value is missing");
        return new ReferenceSetFieldImpl(value);
    }

    /**
     * builds ReferenceSetField without checking for non null required values
     */
    public ReferenceSetField buildUnchecked() {
        return new ReferenceSetFieldImpl(value);
    }

    public static ReferenceSetFieldBuilder of() {
        return new ReferenceSetFieldBuilder();
    }

    public static ReferenceSetFieldBuilder of(final ReferenceSetField template) {
        ReferenceSetFieldBuilder builder = new ReferenceSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
