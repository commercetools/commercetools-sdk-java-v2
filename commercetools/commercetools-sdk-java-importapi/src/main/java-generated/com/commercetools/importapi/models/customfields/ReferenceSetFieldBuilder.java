
package com.commercetools.importapi.models.customfields;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReferenceSetFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReferenceSetField referenceSetField = ReferenceSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReferenceSetFieldBuilder implements Builder<ReferenceSetField> {

    private java.util.List<com.commercetools.importapi.models.common.KeyReference> value;

    /**
     *
     * @param value
     * @return Builder
     */

    public ReferenceSetFieldBuilder value(final com.commercetools.importapi.models.common.KeyReference... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *
     * @param value
     * @return Builder
     */

    public ReferenceSetFieldBuilder value(
            final java.util.List<com.commercetools.importapi.models.common.KeyReference> value) {
        this.value = value;
        return this;
    }

    /**
     *
     * @param value
     * @return Builder
     */

    public ReferenceSetFieldBuilder plusValue(final com.commercetools.importapi.models.common.KeyReference... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    /**
     *
     * @return Builder
     */

    public ReferenceSetFieldBuilder plusValue(
            Function<com.commercetools.importapi.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.importapi.models.common.KeyReference>> builder) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(builder.apply(com.commercetools.importapi.models.common.KeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *
     * @return Builder
     */

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
