
package com.commercetools.checkout.models.application;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddApplicationAgreementUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddApplicationAgreementUpdateAction addApplicationAgreementUpdateAction = AddApplicationAgreementUpdateAction.builder()
 *             .agreement(agreementBuilder -> agreementBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddApplicationAgreementUpdateActionBuilder implements Builder<AddApplicationAgreementUpdateAction> {

    private com.commercetools.checkout.models.application.ApplicationAgreementDraft agreement;

    /**
     *  <p>Agreement to add to the Application.</p>
     * @param builder function to build the agreement value
     * @return Builder
     */

    public AddApplicationAgreementUpdateActionBuilder agreement(
            Function<com.commercetools.checkout.models.application.ApplicationAgreementDraftBuilder, com.commercetools.checkout.models.application.ApplicationAgreementDraftBuilder> builder) {
        this.agreement = builder
                .apply(com.commercetools.checkout.models.application.ApplicationAgreementDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Agreement to add to the Application.</p>
     * @param builder function to build the agreement value
     * @return Builder
     */

    public AddApplicationAgreementUpdateActionBuilder withAgreement(
            Function<com.commercetools.checkout.models.application.ApplicationAgreementDraftBuilder, com.commercetools.checkout.models.application.ApplicationAgreementDraft> builder) {
        this.agreement = builder
                .apply(com.commercetools.checkout.models.application.ApplicationAgreementDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Agreement to add to the Application.</p>
     * @param agreement value to be set
     * @return Builder
     */

    public AddApplicationAgreementUpdateActionBuilder agreement(
            final com.commercetools.checkout.models.application.ApplicationAgreementDraft agreement) {
        this.agreement = agreement;
        return this;
    }

    /**
     *  <p>Agreement to add to the Application.</p>
     * @return agreement
     */

    public com.commercetools.checkout.models.application.ApplicationAgreementDraft getAgreement() {
        return this.agreement;
    }

    /**
     * builds AddApplicationAgreementUpdateAction with checking for non-null required values
     * @return AddApplicationAgreementUpdateAction
     */
    public AddApplicationAgreementUpdateAction build() {
        Objects.requireNonNull(agreement, AddApplicationAgreementUpdateAction.class + ": agreement is missing");
        return new AddApplicationAgreementUpdateActionImpl(agreement);
    }

    /**
     * builds AddApplicationAgreementUpdateAction without checking for non-null required values
     * @return AddApplicationAgreementUpdateAction
     */
    public AddApplicationAgreementUpdateAction buildUnchecked() {
        return new AddApplicationAgreementUpdateActionImpl(agreement);
    }

    /**
     * factory method for an instance of AddApplicationAgreementUpdateActionBuilder
     * @return builder
     */
    public static AddApplicationAgreementUpdateActionBuilder of() {
        return new AddApplicationAgreementUpdateActionBuilder();
    }

    /**
     * create builder for AddApplicationAgreementUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddApplicationAgreementUpdateActionBuilder of(final AddApplicationAgreementUpdateAction template) {
        AddApplicationAgreementUpdateActionBuilder builder = new AddApplicationAgreementUpdateActionBuilder();
        builder.agreement = template.getAgreement();
        return builder;
    }

}
