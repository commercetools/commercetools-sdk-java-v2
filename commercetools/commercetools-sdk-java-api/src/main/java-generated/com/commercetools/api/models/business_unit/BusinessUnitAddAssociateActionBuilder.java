
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAddAssociateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddAssociateAction businessUnitAddAssociateAction = BusinessUnitAddAssociateAction.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddAssociateActionBuilder implements Builder<BusinessUnitAddAssociateAction> {

    private com.commercetools.api.models.business_unit.AssociateDraft associate;

    /**
     *  <p>The Associate to add.</p>
     * @param builder function to build the associate value
     * @return Builder
     */

    public BusinessUnitAddAssociateActionBuilder associate(
            Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraftBuilder> builder) {
        this.associate = builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Associate to add.</p>
     * @param builder function to build the associate value
     * @return Builder
     */

    public BusinessUnitAddAssociateActionBuilder withAssociate(
            Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraft> builder) {
        this.associate = builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of());
        return this;
    }

    /**
     *  <p>The Associate to add.</p>
     * @param associate value to be set
     * @return Builder
     */

    public BusinessUnitAddAssociateActionBuilder associate(
            final com.commercetools.api.models.business_unit.AssociateDraft associate) {
        this.associate = associate;
        return this;
    }

    /**
     *  <p>The Associate to add.</p>
     * @return associate
     */

    public com.commercetools.api.models.business_unit.AssociateDraft getAssociate() {
        return this.associate;
    }

    /**
     * builds BusinessUnitAddAssociateAction with checking for non-null required values
     * @return BusinessUnitAddAssociateAction
     */
    public BusinessUnitAddAssociateAction build() {
        Objects.requireNonNull(associate, BusinessUnitAddAssociateAction.class + ": associate is missing");
        return new BusinessUnitAddAssociateActionImpl(associate);
    }

    /**
     * builds BusinessUnitAddAssociateAction without checking for non-null required values
     * @return BusinessUnitAddAssociateAction
     */
    public BusinessUnitAddAssociateAction buildUnchecked() {
        return new BusinessUnitAddAssociateActionImpl(associate);
    }

    /**
     * factory method for an instance of BusinessUnitAddAssociateActionBuilder
     * @return builder
     */
    public static BusinessUnitAddAssociateActionBuilder of() {
        return new BusinessUnitAddAssociateActionBuilder();
    }

    /**
     * create builder for BusinessUnitAddAssociateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddAssociateActionBuilder of(final BusinessUnitAddAssociateAction template) {
        BusinessUnitAddAssociateActionBuilder builder = new BusinessUnitAddAssociateActionBuilder();
        builder.associate = template.getAssociate();
        return builder;
    }

}
