
package com.commercetools.checkout.models.application;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApplicationAgreementBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApplicationAgreement applicationAgreement = ApplicationAgreement.builder()
 *             .id("{id}")
 *             .name("{name}")
 *             .type(ApplicationAgreementType.TEXT)
 *             .status(ApplicationAgreementStatus.ACTIVE)
 *             .text(textBuilder -> textBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApplicationAgreementBuilder implements Builder<ApplicationAgreement> {

    private String id;

    private String name;

    private com.commercetools.checkout.models.application.ApplicationAgreementType type;

    private com.commercetools.checkout.models.application.ApplicationAgreementStatus status;

    private com.commercetools.checkout.models.common.LocalizedString text;

    /**
     *  <p>Unique identifier of the ApplicationAgreement.</p>
     * @param id value to be set
     * @return Builder
     */

    public ApplicationAgreementBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique name identifier for the ApplicationAgreement.</p>
     * @param name value to be set
     * @return Builder
     */

    public ApplicationAgreementBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Type of agreement.</p>
     * @param type value to be set
     * @return Builder
     */

    public ApplicationAgreementBuilder type(
            final com.commercetools.checkout.models.application.ApplicationAgreementType type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Indicates whether the agreement is active or not.</p>
     * @param status value to be set
     * @return Builder
     */

    public ApplicationAgreementBuilder status(
            final com.commercetools.checkout.models.application.ApplicationAgreementStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Text to display in checkout in Markdown format.</p>
     * @param builder function to build the text value
     * @return Builder
     */

    public ApplicationAgreementBuilder text(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedStringBuilder> builder) {
        this.text = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Text to display in checkout in Markdown format.</p>
     * @param builder function to build the text value
     * @return Builder
     */

    public ApplicationAgreementBuilder withText(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedString> builder) {
        this.text = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Text to display in checkout in Markdown format.</p>
     * @param text value to be set
     * @return Builder
     */

    public ApplicationAgreementBuilder text(final com.commercetools.checkout.models.common.LocalizedString text) {
        this.text = text;
        return this;
    }

    /**
     *  <p>Unique identifier of the ApplicationAgreement.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Unique name identifier for the ApplicationAgreement.</p>
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
     * builds ApplicationAgreement with checking for non-null required values
     * @return ApplicationAgreement
     */
    public ApplicationAgreement build() {
        Objects.requireNonNull(id, ApplicationAgreement.class + ": id is missing");
        Objects.requireNonNull(name, ApplicationAgreement.class + ": name is missing");
        Objects.requireNonNull(type, ApplicationAgreement.class + ": type is missing");
        Objects.requireNonNull(status, ApplicationAgreement.class + ": status is missing");
        Objects.requireNonNull(text, ApplicationAgreement.class + ": text is missing");
        return new ApplicationAgreementImpl(id, name, type, status, text);
    }

    /**
     * builds ApplicationAgreement without checking for non-null required values
     * @return ApplicationAgreement
     */
    public ApplicationAgreement buildUnchecked() {
        return new ApplicationAgreementImpl(id, name, type, status, text);
    }

    /**
     * factory method for an instance of ApplicationAgreementBuilder
     * @return builder
     */
    public static ApplicationAgreementBuilder of() {
        return new ApplicationAgreementBuilder();
    }

    /**
     * create builder for ApplicationAgreement instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicationAgreementBuilder of(final ApplicationAgreement template) {
        ApplicationAgreementBuilder builder = new ApplicationAgreementBuilder();
        builder.id = template.getId();
        builder.name = template.getName();
        builder.type = template.getType();
        builder.status = template.getStatus();
        builder.text = template.getText();
        return builder;
    }

}
