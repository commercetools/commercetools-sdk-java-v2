
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
     *  <p>JSON array of references, each referencing an existing resource by key. The order of items in the array is not fixed.</p>
     * @param value value to be set
     * @return Builder
     */

    public ReferenceSetFieldBuilder value(final com.commercetools.importapi.models.common.KeyReference... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *  <p>JSON array of references, each referencing an existing resource by key. The order of items in the array is not fixed.</p>
     * @param value value to be set
     * @return Builder
     */

    public ReferenceSetFieldBuilder value(
            final java.util.List<com.commercetools.importapi.models.common.KeyReference> value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>JSON array of references, each referencing an existing resource by key. The order of items in the array is not fixed.</p>
     * @param value value to be set
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
     *  <p>JSON array of references, each referencing an existing resource by key. The order of items in the array is not fixed.</p>
     * @param builder function to build the value value
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
     *  <p>JSON array of references, each referencing an existing resource by key. The order of items in the array is not fixed.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public ReferenceSetFieldBuilder withValue(
            Function<com.commercetools.importapi.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.importapi.models.common.KeyReference>> builder) {
        this.value = new ArrayList<>();
        this.value.add(builder.apply(com.commercetools.importapi.models.common.KeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>JSON array of references, each referencing an existing resource by key. The order of items in the array is not fixed.</p>
     * @return value
     */

    public java.util.List<com.commercetools.importapi.models.common.KeyReference> getValue() {
        return this.value;
    }

    /**
     * builds ReferenceSetField with checking for non-null required values
     * @return ReferenceSetField
     */
    public ReferenceSetField build() {
        Objects.requireNonNull(value, ReferenceSetField.class + ": value is missing");
        return new ReferenceSetFieldImpl(value);
    }

    /**
     * builds ReferenceSetField without checking for non-null required values
     * @return ReferenceSetField
     */
    public ReferenceSetField buildUnchecked() {
        return new ReferenceSetFieldImpl(value);
    }

    /**
     * factory method for an instance of ReferenceSetFieldBuilder
     * @return builder
     */
    public static ReferenceSetFieldBuilder of() {
        return new ReferenceSetFieldBuilder();
    }

    /**
     * create builder for ReferenceSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReferenceSetFieldBuilder of(final ReferenceSetField template) {
        ReferenceSetFieldBuilder builder = new ReferenceSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
