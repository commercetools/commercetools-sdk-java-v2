
package com.commercetools.checkout.models.application;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetApplicationAgreementTextUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetApplicationAgreementTextUpdateAction setApplicationAgreementTextUpdateAction = SetApplicationAgreementTextUpdateAction.builder()
 *             .agreementId("{agreementId}")
 *             .text(textBuilder -> textBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetApplicationAgreementTextUpdateActionBuilder
        implements Builder<SetApplicationAgreementTextUpdateAction> {

    private String agreementId;

    private com.commercetools.checkout.models.common.LocalizedString text;

    /**
     *  <p>ID of the agreement to update.</p>
     * @param agreementId value to be set
     * @return Builder
     */

    public SetApplicationAgreementTextUpdateActionBuilder agreementId(final String agreementId) {
        this.agreementId = agreementId;
        return this;
    }

    /**
     *  <p>New text for the agreement.</p>
     * @param builder function to build the text value
     * @return Builder
     */

    public SetApplicationAgreementTextUpdateActionBuilder text(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedStringBuilder> builder) {
        this.text = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New text for the agreement.</p>
     * @param builder function to build the text value
     * @return Builder
     */

    public SetApplicationAgreementTextUpdateActionBuilder withText(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedString> builder) {
        this.text = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>New text for the agreement.</p>
     * @param text value to be set
     * @return Builder
     */

    public SetApplicationAgreementTextUpdateActionBuilder text(
            final com.commercetools.checkout.models.common.LocalizedString text) {
        this.text = text;
        return this;
    }

    /**
     *  <p>ID of the agreement to update.</p>
     * @return agreementId
     */

    public String getAgreementId() {
        return this.agreementId;
    }

    /**
     *  <p>New text for the agreement.</p>
     * @return text
     */

    public com.commercetools.checkout.models.common.LocalizedString getText() {
        return this.text;
    }

    /**
     * builds SetApplicationAgreementTextUpdateAction with checking for non-null required values
     * @return SetApplicationAgreementTextUpdateAction
     */
    public SetApplicationAgreementTextUpdateAction build() {
        Objects.requireNonNull(agreementId, SetApplicationAgreementTextUpdateAction.class + ": agreementId is missing");
        Objects.requireNonNull(text, SetApplicationAgreementTextUpdateAction.class + ": text is missing");
        return new SetApplicationAgreementTextUpdateActionImpl(agreementId, text);
    }

    /**
     * builds SetApplicationAgreementTextUpdateAction without checking for non-null required values
     * @return SetApplicationAgreementTextUpdateAction
     */
    public SetApplicationAgreementTextUpdateAction buildUnchecked() {
        return new SetApplicationAgreementTextUpdateActionImpl(agreementId, text);
    }

    /**
     * factory method for an instance of SetApplicationAgreementTextUpdateActionBuilder
     * @return builder
     */
    public static SetApplicationAgreementTextUpdateActionBuilder of() {
        return new SetApplicationAgreementTextUpdateActionBuilder();
    }

    /**
     * create builder for SetApplicationAgreementTextUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetApplicationAgreementTextUpdateActionBuilder of(
            final SetApplicationAgreementTextUpdateAction template) {
        SetApplicationAgreementTextUpdateActionBuilder builder = new SetApplicationAgreementTextUpdateActionBuilder();
        builder.agreementId = template.getAgreementId();
        builder.text = template.getText();
        return builder;
    }

}
