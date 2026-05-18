
package com.commercetools.checkout.models.application;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApplicationAgreementDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApplicationAgreementDraft applicationAgreementDraft = ApplicationAgreementDraft.builder()
 *             .name("{name}")
 *             .type(ApplicationAgreementType.TEXT)
 *             .status(ApplicationAgreementStatus.ACTIVE)
 *             .text(textBuilder -> textBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApplicationAgreementDraftBuilder implements Builder<ApplicationAgreementDraft> {

    private String name;

    private com.commercetools.checkout.models.application.ApplicationAgreementType type;

    private com.commercetools.checkout.models.application.ApplicationAgreementStatus status;

    private com.commercetools.checkout.models.common.LocalizedString text;

    /**
     *  <p>Unique name for identifying the agreement.</p>
     * @param name value to be set
     * @return Builder
     */

    public ApplicationAgreementDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Type of agreement.</p>
     * @param type value to be set
     * @return Builder
     */

    public ApplicationAgreementDraftBuilder type(
            final com.commercetools.checkout.models.application.ApplicationAgreementType type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Indicates whether the agreement is active or not.</p>
     * @param status value to be set
     * @return Builder
     */

    public ApplicationAgreementDraftBuilder status(
            final com.commercetools.checkout.models.application.ApplicationAgreementStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Text to display in checkout in Markdown format.</p>
     * @param builder function to build the text value
     * @return Builder
     */

    public ApplicationAgreementDraftBuilder text(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedStringBuilder> builder) {
        this.text = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Text to display in checkout in Markdown format.</p>
     * @param builder function to build the text value
     * @return Builder
     */

    public ApplicationAgreementDraftBuilder withText(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedString> builder) {
        this.text = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Text to display in checkout in Markdown format.</p>
     * @param text value to be set
     * @return Builder
     */

    public ApplicationAgreementDraftBuilder text(final com.commercetools.checkout.models.common.LocalizedString text) {
        this.text = text;
        return this;
    }

    /**
     *  <p>Unique name for identifying the agreement.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Type of agreement.</p>
     * @return type
     */

    public com.commercetools.checkout.models.application.ApplicationAgreementType getType() {
        return this.type;
    }

    /**
     *  <p>Indicates whether the agreement is active or not.</p>
     * @return status
     */

    public com.commercetools.checkout.models.application.ApplicationAgreementStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Text to display in checkout in Markdown format.</p>
     * @return text
     */

    public com.commercetools.checkout.models.common.LocalizedString getText() {
        return this.text;
    }

    /**
     * builds ApplicationAgreementDraft with checking for non-null required values
     * @return ApplicationAgreementDraft
     */
    public ApplicationAgreementDraft build() {
        Objects.requireNonNull(name, ApplicationAgreementDraft.class + ": name is missing");
        Objects.requireNonNull(type, ApplicationAgreementDraft.class + ": type is missing");
        Objects.requireNonNull(status, ApplicationAgreementDraft.class + ": status is missing");
        Objects.requireNonNull(text, ApplicationAgreementDraft.class + ": text is missing");
        return new ApplicationAgreementDraftImpl(name, type, status, text);
    }

    /**
     * builds ApplicationAgreementDraft without checking for non-null required values
     * @return ApplicationAgreementDraft
     */
    public ApplicationAgreementDraft buildUnchecked() {
        return new ApplicationAgreementDraftImpl(name, type, status, text);
    }

    /**
     * factory method for an instance of ApplicationAgreementDraftBuilder
     * @return builder
     */
    public static ApplicationAgreementDraftBuilder of() {
        return new ApplicationAgreementDraftBuilder();
    }

    /**
     * create builder for ApplicationAgreementDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicationAgreementDraftBuilder of(final ApplicationAgreementDraft template) {
        ApplicationAgreementDraftBuilder builder = new ApplicationAgreementDraftBuilder();
        builder.name = template.getName();
        builder.type = template.getType();
        builder.status = template.getStatus();
        builder.text = template.getText();
        return builder;
    }

}
