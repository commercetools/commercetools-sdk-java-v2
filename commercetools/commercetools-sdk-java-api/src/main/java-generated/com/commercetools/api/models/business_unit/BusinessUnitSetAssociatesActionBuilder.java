
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitSetAssociatesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetAssociatesAction businessUnitSetAssociatesAction = BusinessUnitSetAssociatesAction.builder()
 *             .plusAssociates(associatesBuilder -> associatesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSetAssociatesActionBuilder implements Builder<BusinessUnitSetAssociatesAction> {

    private java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> associates;

    /**
     *  <p>The new list of Associates. If empty, existing values will be removed.</p>
     * @param associates value to be set
     * @return Builder
     */

    public BusinessUnitSetAssociatesActionBuilder associates(
            final com.commercetools.api.models.business_unit.AssociateDraft... associates) {
        this.associates = new ArrayList<>(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>The new list of Associates. If empty, existing values will be removed.</p>
     * @param associates value to be set
     * @return Builder
     */

    public BusinessUnitSetAssociatesActionBuilder associates(
            final java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> associates) {
        this.associates = associates;
        return this;
    }

    /**
     *  <p>The new list of Associates. If empty, existing values will be removed.</p>
     * @param associates value to be set
     * @return Builder
     */

    public BusinessUnitSetAssociatesActionBuilder plusAssociates(
            final com.commercetools.api.models.business_unit.AssociateDraft... associates) {
        if (this.associates == null) {
            this.associates = new ArrayList<>();
        }
        this.associates.addAll(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>The new list of Associates. If empty, existing values will be removed.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public BusinessUnitSetAssociatesActionBuilder plusAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraftBuilder> builder) {
        if (this.associates == null) {
            this.associates = new ArrayList<>();
        }
        this.associates
                .add(builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The new list of Associates. If empty, existing values will be removed.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public BusinessUnitSetAssociatesActionBuilder withAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraftBuilder> builder) {
        this.associates = new ArrayList<>();
        this.associates
                .add(builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The new list of Associates. If empty, existing values will be removed.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public BusinessUnitSetAssociatesActionBuilder addAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraft> builder) {
        return plusAssociates(builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of()));
    }

    /**
     *  <p>The new list of Associates. If empty, existing values will be removed.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public BusinessUnitSetAssociatesActionBuilder setAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraft> builder) {
        return associates(builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of()));
    }

    /**
     *  <p>The new list of Associates. If empty, existing values will be removed.</p>
     * @return associates
     */

    public java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> getAssociates() {
        return this.associates;
    }

    /**
     * builds BusinessUnitSetAssociatesAction with checking for non-null required values
     * @return BusinessUnitSetAssociatesAction
     */
    public BusinessUnitSetAssociatesAction build() {
        Objects.requireNonNull(associates, BusinessUnitSetAssociatesAction.class + ": associates is missing");
        return new BusinessUnitSetAssociatesActionImpl(associates);
    }

    /**
     * builds BusinessUnitSetAssociatesAction without checking for non-null required values
     * @return BusinessUnitSetAssociatesAction
     */
    public BusinessUnitSetAssociatesAction buildUnchecked() {
        return new BusinessUnitSetAssociatesActionImpl(associates);
    }

    /**
     * factory method for an instance of BusinessUnitSetAssociatesActionBuilder
     * @return builder
     */
    public static BusinessUnitSetAssociatesActionBuilder of() {
        return new BusinessUnitSetAssociatesActionBuilder();
    }

    /**
     * create builder for BusinessUnitSetAssociatesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSetAssociatesActionBuilder of(final BusinessUnitSetAssociatesAction template) {
        BusinessUnitSetAssociatesActionBuilder builder = new BusinessUnitSetAssociatesActionBuilder();
        builder.associates = template.getAssociates();
        return builder;
    }

}
