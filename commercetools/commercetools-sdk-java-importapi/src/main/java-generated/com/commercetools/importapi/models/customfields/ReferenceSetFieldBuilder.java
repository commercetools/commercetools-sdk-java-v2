
package com.commercetools.importapi.models.customfields;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ReferenceSetFieldBuilder implements Builder<ReferenceSetField> {

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

    public ReferenceSetFieldBuilder plusValue(final com.commercetools.importapi.models.common.KeyReference... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    public ReferenceSetFieldBuilder plusValue(
            Function<com.commercetools.importapi.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.importapi.models.common.KeyReference>> builder) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(builder.apply(com.commercetools.importapi.models.common.KeyReferenceBuilder.of()).build());
        return this;
    }

    public ReferenceSetFieldBuilder withValue(
            Function<com.commercetools.importapi.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.importapi.models.common.KeyReference>> builder) {
        this.value = new ArrayList<>();
        this.value.add(builder.apply(com.commercetools.importapi.models.common.KeyReferenceBuilder.of()).build());
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
