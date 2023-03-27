
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartClassificationTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartClassificationType cartClassificationType = CartClassificationType.builder()
 *             .plusValues(valuesBuilder -> valuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartClassificationTypeBuilder implements Builder<CartClassificationType> {

    private java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> values;

    /**
     *  <p>The classification items that can be used for specifying any ShippingRatePriceTier.</p>
     * @param values value to be set
     * @return Builder
     */

    public CartClassificationTypeBuilder values(
            final com.commercetools.api.models.type.CustomFieldLocalizedEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    /**
     *  <p>The classification items that can be used for specifying any ShippingRatePriceTier.</p>
     * @param values value to be set
     * @return Builder
     */

    public CartClassificationTypeBuilder values(
            final java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>The classification items that can be used for specifying any ShippingRatePriceTier.</p>
     * @param values value to be set
     * @return Builder
     */

    public CartClassificationTypeBuilder plusValues(
            final com.commercetools.api.models.type.CustomFieldLocalizedEnumValue... values) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.addAll(Arrays.asList(values));
        return this;
    }

    /**
     *  <p>The classification items that can be used for specifying any ShippingRatePriceTier.</p>
     * @param builder function to build the values value
     * @return Builder
     */

    public CartClassificationTypeBuilder plusValues(
            Function<com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder, com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder> builder) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(
            builder.apply(com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The classification items that can be used for specifying any ShippingRatePriceTier.</p>
     * @param builder function to build the values value
     * @return Builder
     */

    public CartClassificationTypeBuilder withValues(
            Function<com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder, com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder> builder) {
        this.values = new ArrayList<>();
        this.values.add(
            builder.apply(com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The classification items that can be used for specifying any ShippingRatePriceTier.</p>
     * @return values
     */

    public java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> getValues() {
        return this.values;
    }

    /**
     * builds CartClassificationType with checking for non-null required values
     * @return CartClassificationType
     */
    public CartClassificationType build() {
        Objects.requireNonNull(values, CartClassificationType.class + ": values is missing");
        return new CartClassificationTypeImpl(values);
    }

    /**
     * builds CartClassificationType without checking for non-null required values
     * @return CartClassificationType
     */
    public CartClassificationType buildUnchecked() {
        return new CartClassificationTypeImpl(values);
    }

    /**
     * factory method for an instance of CartClassificationTypeBuilder
     * @return builder
     */
    public static CartClassificationTypeBuilder of() {
        return new CartClassificationTypeBuilder();
    }

    /**
     * create builder for CartClassificationType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartClassificationTypeBuilder of(final CartClassificationType template) {
        CartClassificationTypeBuilder builder = new CartClassificationTypeBuilder();
        builder.values = template.getValues();
        return builder;
    }

}
