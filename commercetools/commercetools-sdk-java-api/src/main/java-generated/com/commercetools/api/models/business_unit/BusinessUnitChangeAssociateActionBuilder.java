
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitChangeAssociateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitChangeAssociateAction businessUnitChangeAssociateAction = BusinessUnitChangeAssociateAction.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitChangeAssociateActionBuilder implements Builder<BusinessUnitChangeAssociateAction> {

    private com.commercetools.api.models.business_unit.AssociateDraft associate;

    /**
     *  <p>New version of an existing Associate.</p>
     * @return Builder
     */

    public BusinessUnitChangeAssociateActionBuilder associate(
            Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraftBuilder> builder) {
        this.associate = builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New version of an existing Associate.</p>
     * @param associate
     * @return Builder
     */

    public BusinessUnitChangeAssociateActionBuilder associate(
            final com.commercetools.api.models.business_unit.AssociateDraft associate) {
        this.associate = associate;
        return this;
    }

    public com.commercetools.api.models.business_unit.AssociateDraft getAssociate() {
        return this.associate;
    }

    public BusinessUnitChangeAssociateAction build() {
        Objects.requireNonNull(associate, BusinessUnitChangeAssociateAction.class + ": associate is missing");
        return new BusinessUnitChangeAssociateActionImpl(associate);
    }

    /**
     * builds BusinessUnitChangeAssociateAction without checking for non null required values
     */
    public BusinessUnitChangeAssociateAction buildUnchecked() {
        return new BusinessUnitChangeAssociateActionImpl(associate);
    }

    public static BusinessUnitChangeAssociateActionBuilder of() {
        return new BusinessUnitChangeAssociateActionBuilder();
    }

    public static BusinessUnitChangeAssociateActionBuilder of(final BusinessUnitChangeAssociateAction template) {
        BusinessUnitChangeAssociateActionBuilder builder = new BusinessUnitChangeAssociateActionBuilder();
        builder.associate = template.getAssociate();
        return builder;
    }

}
