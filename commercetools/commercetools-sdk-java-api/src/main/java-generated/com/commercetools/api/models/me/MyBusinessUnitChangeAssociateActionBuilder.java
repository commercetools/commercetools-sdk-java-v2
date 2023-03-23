
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitChangeAssociateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitChangeAssociateAction myBusinessUnitChangeAssociateAction = MyBusinessUnitChangeAssociateAction.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitChangeAssociateActionBuilder implements Builder<MyBusinessUnitChangeAssociateAction> {

    private com.commercetools.api.models.business_unit.AssociateDraft associate;

    /**
     *  <p>The Associate to add.</p>
     * @return Builder
     */

    public MyBusinessUnitChangeAssociateActionBuilder associate(
            Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraftBuilder> builder) {
        this.associate = builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Associate to add.</p>
     * @param associate
     * @return Builder
     */

    public MyBusinessUnitChangeAssociateActionBuilder associate(
            final com.commercetools.api.models.business_unit.AssociateDraft associate) {
        this.associate = associate;
        return this;
    }

    public com.commercetools.api.models.business_unit.AssociateDraft getAssociate() {
        return this.associate;
    }

    public MyBusinessUnitChangeAssociateAction build() {
        Objects.requireNonNull(associate, MyBusinessUnitChangeAssociateAction.class + ": associate is missing");
        return new MyBusinessUnitChangeAssociateActionImpl(associate);
    }

    /**
     * builds MyBusinessUnitChangeAssociateAction without checking for non null required values
     */
    public MyBusinessUnitChangeAssociateAction buildUnchecked() {
        return new MyBusinessUnitChangeAssociateActionImpl(associate);
    }

    public static MyBusinessUnitChangeAssociateActionBuilder of() {
        return new MyBusinessUnitChangeAssociateActionBuilder();
    }

    public static MyBusinessUnitChangeAssociateActionBuilder of(final MyBusinessUnitChangeAssociateAction template) {
        MyBusinessUnitChangeAssociateActionBuilder builder = new MyBusinessUnitChangeAssociateActionBuilder();
        builder.associate = template.getAssociate();
        return builder;
    }

}
