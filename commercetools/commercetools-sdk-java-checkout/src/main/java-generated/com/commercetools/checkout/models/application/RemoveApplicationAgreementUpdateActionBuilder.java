
package com.commercetools.checkout.models.application;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveApplicationAgreementUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveApplicationAgreementUpdateAction removeApplicationAgreementUpdateAction = RemoveApplicationAgreementUpdateAction.builder()
 *             .agreementId("{agreementId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveApplicationAgreementUpdateActionBuilder implements Builder<RemoveApplicationAgreementUpdateAction> {

    private String agreementId;

    /**
     *  <p>ID of the agreement to remove from the Application.</p>
     * @param agreementId value to be set
     * @return Builder
     */

    public RemoveApplicationAgreementUpdateActionBuilder agreementId(final String agreementId) {
        this.agreementId = agreementId;
        return this;
    }

    /**
     *  <p>ID of the agreement to remove from the Application.</p>
     * @return agreementId
     */

    public String getAgreementId() {
        return this.agreementId;
    }

    /**
     * builds RemoveApplicationAgreementUpdateAction with checking for non-null required values
     * @return RemoveApplicationAgreementUpdateAction
     */
    public RemoveApplicationAgreementUpdateAction build() {
        Objects.requireNonNull(agreementId, RemoveApplicationAgreementUpdateAction.class + ": agreementId is missing");
        return new RemoveApplicationAgreementUpdateActionImpl(agreementId);
    }

    /**
     * builds RemoveApplicationAgreementUpdateAction without checking for non-null required values
     * @return RemoveApplicationAgreementUpdateAction
     */
    public RemoveApplicationAgreementUpdateAction buildUnchecked() {
        return new RemoveApplicationAgreementUpdateActionImpl(agreementId);
    }

    /**
     * factory method for an instance of RemoveApplicationAgreementUpdateActionBuilder
     * @return builder
     */
    public static RemoveApplicationAgreementUpdateActionBuilder of() {
        return new RemoveApplicationAgreementUpdateActionBuilder();
    }

    /**
     * create builder for RemoveApplicationAgreementUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveApplicationAgreementUpdateActionBuilder of(
            final RemoveApplicationAgreementUpdateAction template) {
        RemoveApplicationAgreementUpdateActionBuilder builder = new RemoveApplicationAgreementUpdateActionBuilder();
        builder.agreementId = template.getAgreementId();
        return builder;
    }

}
