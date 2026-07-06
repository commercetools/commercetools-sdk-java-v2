
package com.commercetools.checkout.models.application;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetApplicationAgreementNameUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetApplicationAgreementNameUpdateAction setApplicationAgreementNameUpdateAction = SetApplicationAgreementNameUpdateAction.builder()
 *             .agreementId("{agreementId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetApplicationAgreementNameUpdateActionBuilder
        implements Builder<SetApplicationAgreementNameUpdateAction> {

    private String agreementId;

    private String name;

    /**
     *  <p>ID of the agreement to update.</p>
     * @param agreementId value to be set
     * @return Builder
     */

    public SetApplicationAgreementNameUpdateActionBuilder agreementId(final String agreementId) {
        this.agreementId = agreementId;
        return this;
    }

    /**
     *  <p>New name for the agreement.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetApplicationAgreementNameUpdateActionBuilder name(final String name) {
        this.name = name;
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
     *  <p>New name for the agreement.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds SetApplicationAgreementNameUpdateAction with checking for non-null required values
     * @return SetApplicationAgreementNameUpdateAction
     */
    public SetApplicationAgreementNameUpdateAction build() {
        Objects.requireNonNull(agreementId, SetApplicationAgreementNameUpdateAction.class + ": agreementId is missing");
        Objects.requireNonNull(name, SetApplicationAgreementNameUpdateAction.class + ": name is missing");
        return new SetApplicationAgreementNameUpdateActionImpl(agreementId, name);
    }

    /**
     * builds SetApplicationAgreementNameUpdateAction without checking for non-null required values
     * @return SetApplicationAgreementNameUpdateAction
     */
    public SetApplicationAgreementNameUpdateAction buildUnchecked() {
        return new SetApplicationAgreementNameUpdateActionImpl(agreementId, name);
    }

    /**
     * factory method for an instance of SetApplicationAgreementNameUpdateActionBuilder
     * @return builder
     */
    public static SetApplicationAgreementNameUpdateActionBuilder of() {
        return new SetApplicationAgreementNameUpdateActionBuilder();
    }

    /**
     * create builder for SetApplicationAgreementNameUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetApplicationAgreementNameUpdateActionBuilder of(
            final SetApplicationAgreementNameUpdateAction template) {
        SetApplicationAgreementNameUpdateActionBuilder builder = new SetApplicationAgreementNameUpdateActionBuilder();
        builder.agreementId = template.getAgreementId();
        builder.name = template.getName();
        return builder;
    }

}
