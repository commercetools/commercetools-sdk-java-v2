
package com.commercetools.checkout.models.application;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetApplicationAgreementTypeUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetApplicationAgreementTypeUpdateAction setApplicationAgreementTypeUpdateAction = SetApplicationAgreementTypeUpdateAction.builder()
 *             .agreementId("{agreementId}")
 *             .type(ApplicationAgreementType.TEXT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetApplicationAgreementTypeUpdateActionBuilder
        implements Builder<SetApplicationAgreementTypeUpdateAction> {

    private String agreementId;

    private com.commercetools.checkout.models.application.ApplicationAgreementType type;

    /**
     *  <p>ID of the agreement to update.</p>
     * @param agreementId value to be set
     * @return Builder
     */

    public SetApplicationAgreementTypeUpdateActionBuilder agreementId(final String agreementId) {
        this.agreementId = agreementId;
        return this;
    }

    /**
     *  <p>New type for the agreement.</p>
     * @param type value to be set
     * @return Builder
     */

    public SetApplicationAgreementTypeUpdateActionBuilder type(
            final com.commercetools.checkout.models.application.ApplicationAgreementType type) {
        this.type = type;
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
     *  <p>New type for the agreement.</p>
     * @return type
     */

    public com.commercetools.checkout.models.application.ApplicationAgreementType getType() {
        return this.type;
    }

    /**
     * builds SetApplicationAgreementTypeUpdateAction with checking for non-null required values
     * @return SetApplicationAgreementTypeUpdateAction
     */
    public SetApplicationAgreementTypeUpdateAction build() {
        Objects.requireNonNull(agreementId, SetApplicationAgreementTypeUpdateAction.class + ": agreementId is missing");
        Objects.requireNonNull(type, SetApplicationAgreementTypeUpdateAction.class + ": type is missing");
        return new SetApplicationAgreementTypeUpdateActionImpl(agreementId, type);
    }

    /**
     * builds SetApplicationAgreementTypeUpdateAction without checking for non-null required values
     * @return SetApplicationAgreementTypeUpdateAction
     */
    public SetApplicationAgreementTypeUpdateAction buildUnchecked() {
        return new SetApplicationAgreementTypeUpdateActionImpl(agreementId, type);
    }

    /**
     * factory method for an instance of SetApplicationAgreementTypeUpdateActionBuilder
     * @return builder
     */
    public static SetApplicationAgreementTypeUpdateActionBuilder of() {
        return new SetApplicationAgreementTypeUpdateActionBuilder();
    }

    /**
     * create builder for SetApplicationAgreementTypeUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetApplicationAgreementTypeUpdateActionBuilder of(
            final SetApplicationAgreementTypeUpdateAction template) {
        SetApplicationAgreementTypeUpdateActionBuilder builder = new SetApplicationAgreementTypeUpdateActionBuilder();
        builder.agreementId = template.getAgreementId();
        builder.type = template.getType();
        return builder;
    }

}
