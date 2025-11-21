
package com.commercetools.checkout.models.application;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetApplicationAgreementsUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetApplicationAgreementsUpdateAction setApplicationAgreementsUpdateAction = SetApplicationAgreementsUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetApplicationAgreementsUpdateActionBuilder implements Builder<SetApplicationAgreementsUpdateAction> {

    @Nullable
    private java.util.List<com.commercetools.checkout.models.application.ApplicationAgreementDraft> agreements;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param agreements value to be set
     * @return Builder
     */

    public SetApplicationAgreementsUpdateActionBuilder agreements(
            @Nullable final com.commercetools.checkout.models.application.ApplicationAgreementDraft... agreements) {
        this.agreements = new ArrayList<>(Arrays.asList(agreements));
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param agreements value to be set
     * @return Builder
     */

    public SetApplicationAgreementsUpdateActionBuilder agreements(
            @Nullable final java.util.List<com.commercetools.checkout.models.application.ApplicationAgreementDraft> agreements) {
        this.agreements = agreements;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param agreements value to be set
     * @return Builder
     */

    public SetApplicationAgreementsUpdateActionBuilder plusAgreements(
            @Nullable final com.commercetools.checkout.models.application.ApplicationAgreementDraft... agreements) {
        if (this.agreements == null) {
            this.agreements = new ArrayList<>();
        }
        this.agreements.addAll(Arrays.asList(agreements));
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the agreements value
     * @return Builder
     */

    public SetApplicationAgreementsUpdateActionBuilder plusAgreements(
            Function<com.commercetools.checkout.models.application.ApplicationAgreementDraftBuilder, com.commercetools.checkout.models.application.ApplicationAgreementDraftBuilder> builder) {
        if (this.agreements == null) {
            this.agreements = new ArrayList<>();
        }
        this.agreements.add(
            builder.apply(com.commercetools.checkout.models.application.ApplicationAgreementDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the agreements value
     * @return Builder
     */

    public SetApplicationAgreementsUpdateActionBuilder withAgreements(
            Function<com.commercetools.checkout.models.application.ApplicationAgreementDraftBuilder, com.commercetools.checkout.models.application.ApplicationAgreementDraftBuilder> builder) {
        this.agreements = new ArrayList<>();
        this.agreements.add(
            builder.apply(com.commercetools.checkout.models.application.ApplicationAgreementDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the agreements value
     * @return Builder
     */

    public SetApplicationAgreementsUpdateActionBuilder addAgreements(
            Function<com.commercetools.checkout.models.application.ApplicationAgreementDraftBuilder, com.commercetools.checkout.models.application.ApplicationAgreementDraft> builder) {
        return plusAgreements(
            builder.apply(com.commercetools.checkout.models.application.ApplicationAgreementDraftBuilder.of()));
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the agreements value
     * @return Builder
     */

    public SetApplicationAgreementsUpdateActionBuilder setAgreements(
            Function<com.commercetools.checkout.models.application.ApplicationAgreementDraftBuilder, com.commercetools.checkout.models.application.ApplicationAgreementDraft> builder) {
        return agreements(
            builder.apply(com.commercetools.checkout.models.application.ApplicationAgreementDraftBuilder.of()));
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return agreements
     */

    @Nullable
    public java.util.List<com.commercetools.checkout.models.application.ApplicationAgreementDraft> getAgreements() {
        return this.agreements;
    }

    /**
     * builds SetApplicationAgreementsUpdateAction with checking for non-null required values
     * @return SetApplicationAgreementsUpdateAction
     */
    public SetApplicationAgreementsUpdateAction build() {
        return new SetApplicationAgreementsUpdateActionImpl(agreements);
    }

    /**
     * builds SetApplicationAgreementsUpdateAction without checking for non-null required values
     * @return SetApplicationAgreementsUpdateAction
     */
    public SetApplicationAgreementsUpdateAction buildUnchecked() {
        return new SetApplicationAgreementsUpdateActionImpl(agreements);
    }

    /**
     * factory method for an instance of SetApplicationAgreementsUpdateActionBuilder
     * @return builder
     */
    public static SetApplicationAgreementsUpdateActionBuilder of() {
        return new SetApplicationAgreementsUpdateActionBuilder();
    }

    /**
     * create builder for SetApplicationAgreementsUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetApplicationAgreementsUpdateActionBuilder of(final SetApplicationAgreementsUpdateAction template) {
        SetApplicationAgreementsUpdateActionBuilder builder = new SetApplicationAgreementsUpdateActionBuilder();
        builder.agreements = template.getAgreements();
        return builder;
    }

}
