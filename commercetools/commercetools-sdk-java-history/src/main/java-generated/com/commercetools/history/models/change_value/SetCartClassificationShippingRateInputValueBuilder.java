
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCartClassificationShippingRateInputValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCartClassificationShippingRateInputValue setCartClassificationShippingRateInputValue = SetCartClassificationShippingRateInputValue.builder()
 *             .type("{type}")
 *             .key("{key}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCartClassificationShippingRateInputValueBuilder
        implements Builder<SetCartClassificationShippingRateInputValue> {

    private String type;

    private String key;

    private com.commercetools.history.models.common.LocalizedString label;

    /**
     *
     * @param type value to be set
     * @return Builder
     */

    public SetCartClassificationShippingRateInputValueBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @param key value to be set
     * @return Builder
     */

    public SetCartClassificationShippingRateInputValueBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *
     * @param builder function to build the label value
     * @return Builder
     */

    public SetCartClassificationShippingRateInputValueBuilder label(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param label value to be set
     * @return Builder
     */

    public SetCartClassificationShippingRateInputValueBuilder label(
            final com.commercetools.history.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.history.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
     * builds SetCartClassificationShippingRateInputValue with checking for non-null required values
     * @return SetCartClassificationShippingRateInputValue
     */
    public SetCartClassificationShippingRateInputValue build() {
        Objects.requireNonNull(type, SetCartClassificationShippingRateInputValue.class + ": type is missing");
        Objects.requireNonNull(key, SetCartClassificationShippingRateInputValue.class + ": key is missing");
        Objects.requireNonNull(label, SetCartClassificationShippingRateInputValue.class + ": label is missing");
        return new SetCartClassificationShippingRateInputValueImpl(type, key, label);
    }

    /**
     * builds SetCartClassificationShippingRateInputValue without checking for non-null required values
     * @return SetCartClassificationShippingRateInputValue
     */
    public SetCartClassificationShippingRateInputValue buildUnchecked() {
        return new SetCartClassificationShippingRateInputValueImpl(type, key, label);
    }

    public static SetCartClassificationShippingRateInputValueBuilder of() {
        return new SetCartClassificationShippingRateInputValueBuilder();
    }

    public static SetCartClassificationShippingRateInputValueBuilder of(
            final SetCartClassificationShippingRateInputValue template) {
        SetCartClassificationShippingRateInputValueBuilder builder = new SetCartClassificationShippingRateInputValueBuilder();
        builder.type = template.getType();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
