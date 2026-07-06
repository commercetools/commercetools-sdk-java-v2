
package com.commercetools.checkout.models.application;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetApplicationAgreementStatusUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetApplicationAgreementStatusUpdateAction setApplicationAgreementStatusUpdateAction = SetApplicationAgreementStatusUpdateAction.builder()
 *             .agreementId("{agreementId}")
 *             .status(ApplicationAgreementStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetApplicationAgreementStatusUpdateActionBuilder
        implements Builder<SetApplicationAgreementStatusUpdateAction> {

    private String agreementId;

    private com.commercetools.checkout.models.application.ApplicationAgreementStatus status;

    /**
     *  <p>ID of the agreement to update.</p>
     * @param agreementId value to be set
     * @return Builder
     */

    public SetApplicationAgreementStatusUpdateActionBuilder agreementId(final String agreementId) {
        this.agreementId = agreementId;
        return this;
    }

    /**
     *  <p>New status for the agreement.</p>
     * @param status value to be set
     * @return Builder
     */

    public SetApplicationAgreementStatusUpdateActionBuilder status(
            final com.commercetools.checkout.models.application.ApplicationAgreementStatus status) {
        this.status = status;
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
     *  <p>New status for the agreement.</p>
     * @return status
     */

    public com.commercetools.checkout.models.application.ApplicationAgreementStatus getStatus() {
        return this.status;
    }

    /**
     * builds SetApplicationAgreementStatusUpdateAction with checking for non-null required values
     * @return SetApplicationAgreementStatusUpdateAction
     */
    public SetApplicationAgreementStatusUpdateAction build() {
        Objects.requireNonNull(agreementId,
            SetApplicationAgreementStatusUpdateAction.class + ": agreementId is missing");
        Objects.requireNonNull(status, SetApplicationAgreementStatusUpdateAction.class + ": status is missing");
        return new SetApplicationAgreementStatusUpdateActionImpl(agreementId, status);
    }

    /**
     * builds SetApplicationAgreementStatusUpdateAction without checking for non-null required values
     * @return SetApplicationAgreementStatusUpdateAction
     */
    public SetApplicationAgreementStatusUpdateAction buildUnchecked() {
        return new SetApplicationAgreementStatusUpdateActionImpl(agreementId, status);
    }

    /**
     * factory method for an instance of SetApplicationAgreementStatusUpdateActionBuilder
     * @return builder
     */
    public static SetApplicationAgreementStatusUpdateActionBuilder of() {
        return new SetApplicationAgreementStatusUpdateActionBuilder();
    }

    /**
     * create builder for SetApplicationAgreementStatusUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetApplicationAgreementStatusUpdateActionBuilder of(
            final SetApplicationAgreementStatusUpdateAction template) {
        SetApplicationAgreementStatusUpdateActionBuilder builder = new SetApplicationAgreementStatusUpdateActionBuilder();
        builder.agreementId = template.getAgreementId();
        builder.status = template.getStatus();
        return builder;
    }

}
