
package com.commercetools.checkout.models.payment_integration;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DisplayInfoBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DisplayInfo displayInfo = DisplayInfo.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DisplayInfoBuilder implements Builder<DisplayInfo> {

    @Nullable
    private com.commercetools.checkout.models.common.LocalizedString label;

    @Nullable
    private com.commercetools.checkout.models.common.LocalizedUrl logoUrl;

    @Nullable
    private com.commercetools.checkout.models.common.LocalizedString description;

    @Nullable
    private com.commercetools.checkout.models.common.LocalizedString payButtonText;

    /**
     *  <p>Label of the payment method displayed in the UI.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public DisplayInfoBuilder label(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Label of the payment method displayed in the UI.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public DisplayInfoBuilder withLabel(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedString> builder) {
        this.label = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Label of the payment method displayed in the UI.</p>
     * @param label value to be set
     * @return Builder
     */

    public DisplayInfoBuilder label(@Nullable final com.commercetools.checkout.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    /**
     *  <p>Logo of the payment method displayed in the UI.</p>
     * @param builder function to build the logoUrl value
     * @return Builder
     */

    public DisplayInfoBuilder logoUrl(
            Function<com.commercetools.checkout.models.common.LocalizedUrlBuilder, com.commercetools.checkout.models.common.LocalizedUrlBuilder> builder) {
        this.logoUrl = builder.apply(com.commercetools.checkout.models.common.LocalizedUrlBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Logo of the payment method displayed in the UI.</p>
     * @param builder function to build the logoUrl value
     * @return Builder
     */

    public DisplayInfoBuilder withLogoUrl(
            Function<com.commercetools.checkout.models.common.LocalizedUrlBuilder, com.commercetools.checkout.models.common.LocalizedUrl> builder) {
        this.logoUrl = builder.apply(com.commercetools.checkout.models.common.LocalizedUrlBuilder.of());
        return this;
    }

    /**
     *  <p>Logo of the payment method displayed in the UI.</p>
     * @param logoUrl value to be set
     * @return Builder
     */

    public DisplayInfoBuilder logoUrl(@Nullable final com.commercetools.checkout.models.common.LocalizedUrl logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    /**
     *  <p>Description of the payment method displayed in the UI.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public DisplayInfoBuilder description(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the payment method displayed in the UI.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public DisplayInfoBuilder withDescription(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the payment method displayed in the UI.</p>
     * @param description value to be set
     * @return Builder
     */

    public DisplayInfoBuilder description(
            @Nullable final com.commercetools.checkout.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Text of the Pay button displayed in the UI when paying with the payment method.</p>
     * @param builder function to build the payButtonText value
     * @return Builder
     */

    public DisplayInfoBuilder payButtonText(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedStringBuilder> builder) {
        this.payButtonText = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Text of the Pay button displayed in the UI when paying with the payment method.</p>
     * @param builder function to build the payButtonText value
     * @return Builder
     */

    public DisplayInfoBuilder withPayButtonText(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedString> builder) {
        this.payButtonText = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Text of the Pay button displayed in the UI when paying with the payment method.</p>
     * @param payButtonText value to be set
     * @return Builder
     */

    public DisplayInfoBuilder payButtonText(
            @Nullable final com.commercetools.checkout.models.common.LocalizedString payButtonText) {
        this.payButtonText = payButtonText;
        return this;
    }

    /**
     *  <p>Label of the payment method displayed in the UI.</p>
     * @return label
     */

    @Nullable
    public com.commercetools.checkout.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
     *  <p>Logo of the payment method displayed in the UI.</p>
     * @return logoUrl
     */

    @Nullable
    public com.commercetools.checkout.models.common.LocalizedUrl getLogoUrl() {
        return this.logoUrl;
    }

    /**
     *  <p>Description of the payment method displayed in the UI.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.checkout.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Text of the Pay button displayed in the UI when paying with the payment method.</p>
     * @return payButtonText
     */

    @Nullable
    public com.commercetools.checkout.models.common.LocalizedString getPayButtonText() {
        return this.payButtonText;
    }

    /**
     * builds DisplayInfo with checking for non-null required values
     * @return DisplayInfo
     */
    public DisplayInfo build() {
        return new DisplayInfoImpl(label, logoUrl, description, payButtonText);
    }

    /**
     * builds DisplayInfo without checking for non-null required values
     * @return DisplayInfo
     */
    public DisplayInfo buildUnchecked() {
        return new DisplayInfoImpl(label, logoUrl, description, payButtonText);
    }

    /**
     * factory method for an instance of DisplayInfoBuilder
     * @return builder
     */
    public static DisplayInfoBuilder of() {
        return new DisplayInfoBuilder();
    }

    /**
     * create builder for DisplayInfo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DisplayInfoBuilder of(final DisplayInfo template) {
        DisplayInfoBuilder builder = new DisplayInfoBuilder();
        builder.label = template.getLabel();
        builder.logoUrl = template.getLogoUrl();
        builder.description = template.getDescription();
        builder.payButtonText = template.getPayButtonText();
        return builder;
    }

}
