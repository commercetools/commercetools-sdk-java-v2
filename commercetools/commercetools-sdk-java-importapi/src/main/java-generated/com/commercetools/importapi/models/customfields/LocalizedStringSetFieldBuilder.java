
package com.commercetools.importapi.models.customfields;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LocalizedStringSetFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizedStringSetField localizedStringSetField = LocalizedStringSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LocalizedStringSetFieldBuilder implements Builder<LocalizedStringSetField> {

    private java.util.List<com.commercetools.importapi.models.common.LocalizedString> value;

    /**
     *
     * @param value value to be set
     * @return Builder
     */

    public LocalizedStringSetFieldBuilder value(
            final com.commercetools.importapi.models.common.LocalizedString... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *
     * @param value value to be set
     * @return Builder
     */

    public LocalizedStringSetFieldBuilder value(
            final java.util.List<com.commercetools.importapi.models.common.LocalizedString> value) {
        this.value = value;
        return this;
    }

    /**
     *
     * @param value value to be set
     * @return Builder
     */

    public LocalizedStringSetFieldBuilder plusValue(
            final com.commercetools.importapi.models.common.LocalizedString... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    /**
     *
     * @param builder function to build the value value
     * @return Builder
     */

    public LocalizedStringSetFieldBuilder plusValue(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param builder function to build the value value
     * @return Builder
     */

    public LocalizedStringSetFieldBuilder withValue(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.value = new ArrayList<>();
        this.value.add(builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.common.LocalizedString> getValue() {
        return this.value;
    }

    /**
     * builds LocalizedStringSetField with checking for non-null required values
     * @return LocalizedStringSetField
     */
    public LocalizedStringSetField build() {
        Objects.requireNonNull(value, LocalizedStringSetField.class + ": value is missing");
        return new LocalizedStringSetFieldImpl(value);
    }

    /**
     * builds LocalizedStringSetField without checking for non-null required values
     * @return LocalizedStringSetField
     */
    public LocalizedStringSetField buildUnchecked() {
        return new LocalizedStringSetFieldImpl(value);
    }

    public static LocalizedStringSetFieldBuilder of() {
        return new LocalizedStringSetFieldBuilder();
    }

    public static LocalizedStringSetFieldBuilder of(final LocalizedStringSetField template) {
        LocalizedStringSetFieldBuilder builder = new LocalizedStringSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
