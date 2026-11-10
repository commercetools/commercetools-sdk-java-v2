
package com.commercetools.checkout.models.application;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReorderApplicationAgreementUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReorderApplicationAgreementUpdateAction reorderApplicationAgreementUpdateAction = ReorderApplicationAgreementUpdateAction.builder()
 *             .plusAgreementIds(agreementIdsBuilder -> agreementIdsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReorderApplicationAgreementUpdateActionBuilder
        implements Builder<ReorderApplicationAgreementUpdateAction> {

    private java.util.List<String> agreementIds;

    /**
     *  <p>Array of agreement IDs.</p>
     * @param agreementIds value to be set
     * @return Builder
     */

    public ReorderApplicationAgreementUpdateActionBuilder agreementIds(final String... agreementIds) {
        this.agreementIds = new ArrayList<>(Arrays.asList(agreementIds));
        return this;
    }

    /**
     *  <p>Array of agreement IDs.</p>
     * @param agreementIds value to be set
     * @return Builder
     */

    public ReorderApplicationAgreementUpdateActionBuilder agreementIds(final java.util.List<String> agreementIds) {
        this.agreementIds = agreementIds;
        return this;
    }

    /**
     *  <p>Array of agreement IDs.</p>
     * @param agreementIds value to be set
     * @return Builder
     */

    public ReorderApplicationAgreementUpdateActionBuilder plusAgreementIds(final String... agreementIds) {
        if (this.agreementIds == null) {
            this.agreementIds = new ArrayList<>();
        }
        this.agreementIds.addAll(Arrays.asList(agreementIds));
        return this;
    }

    /**
     *  <p>Array of agreement IDs.</p>
     * @return agreementIds
     */

    public java.util.List<String> getAgreementIds() {
        return this.agreementIds;
    }

    /**
     * builds ReorderApplicationAgreementUpdateAction with checking for non-null required values
     * @return ReorderApplicationAgreementUpdateAction
     */
    public ReorderApplicationAgreementUpdateAction build() {
        Objects.requireNonNull(agreementIds,
            ReorderApplicationAgreementUpdateAction.class + ": agreementIds is missing");
        return new ReorderApplicationAgreementUpdateActionImpl(agreementIds);
    }

    /**
     * builds ReorderApplicationAgreementUpdateAction without checking for non-null required values
     * @return ReorderApplicationAgreementUpdateAction
     */
    public ReorderApplicationAgreementUpdateAction buildUnchecked() {
        return new ReorderApplicationAgreementUpdateActionImpl(agreementIds);
    }

    /**
     * factory method for an instance of ReorderApplicationAgreementUpdateActionBuilder
     * @return builder
     */
    public static ReorderApplicationAgreementUpdateActionBuilder of() {
        return new ReorderApplicationAgreementUpdateActionBuilder();
    }

    /**
     * create builder for ReorderApplicationAgreementUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReorderApplicationAgreementUpdateActionBuilder of(
            final ReorderApplicationAgreementUpdateAction template) {
        ReorderApplicationAgreementUpdateActionBuilder builder = new ReorderApplicationAgreementUpdateActionBuilder();
        builder.agreementIds = template.getAgreementIds();
        return builder;
    }

}
