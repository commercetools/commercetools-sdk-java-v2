
package com.commercetools.history.models.label;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LocalizedLabelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizedLabel localizedLabel = LocalizedLabel.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LocalizedLabelBuilder implements Builder<LocalizedLabel> {

    private com.commercetools.history.models.common.LocalizedString value;

    /**
     <>
     */

    public LocalizedLabelBuilder value(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.value = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     <>
     */

    public LocalizedLabelBuilder value(final com.commercetools.history.models.common.LocalizedString value) {
        this.value = value;
        return this;
    }

    public com.commercetools.history.models.common.LocalizedString getValue() {
        return this.value;
    }

    public LocalizedLabel build() {
        Objects.requireNonNull(value, LocalizedLabel.class + ": value is missing");
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
