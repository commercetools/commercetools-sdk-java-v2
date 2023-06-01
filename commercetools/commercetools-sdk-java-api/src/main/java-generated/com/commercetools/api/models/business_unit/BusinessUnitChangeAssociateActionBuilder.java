package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.business_unit.AssociateDraft;
import com.commercetools.api.models.business_unit.BusinessUnitUpdateAction;
import com.commercetools.api.models.business_unit.BusinessUnitChangeAssociateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitChangeAssociateActionBuilder implements Builder<BusinessUnitChangeAssociateAction> {

    
    
    private com.commercetools.api.models.business_unit.AssociateDraft associate;

    
    /**
     *  <p>New version of an existing Associate.</p>
     * @param builder function to build the associate value
     * @return Builder
     */
    
    public BusinessUnitChangeAssociateActionBuilder associate(Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraftBuilder> builder) {
        this.associate = builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>New version of an existing Associate.</p>
     * @param builder function to build the associate value
     * @return Builder
     */
    
    public BusinessUnitChangeAssociateActionBuilder withAssociate(Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraft> builder) {
        this.associate = builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>New version of an existing Associate.</p>
     * @param associate value to be set
     * @return Builder
     */
    
    public BusinessUnitChangeAssociateActionBuilder associate( final com.commercetools.api.models.business_unit.AssociateDraft associate) {
        this.associate = associate;
        return this;
    }
    
    

    /**
     *  <p>New version of an existing Associate.</p>
     * @return associate
     */
    
    
    public com.commercetools.api.models.business_unit.AssociateDraft getAssociate(){
        return this.associate;
    }

    /**
     * builds BusinessUnitChangeAssociateAction with checking for non-null required values
     * @return BusinessUnitChangeAssociateAction
     */
    public BusinessUnitChangeAssociateAction build() {
        Objects.requireNonNull(associate, BusinessUnitChangeAssociateAction.class + ": associate is missing");
        return new BusinessUnitChangeAssociateActionImpl(associate);
    }
    
    /**
     * builds BusinessUnitChangeAssociateAction without checking for non-null required values
     * @return BusinessUnitChangeAssociateAction
     */
    public BusinessUnitChangeAssociateAction buildUnchecked() {
        return new BusinessUnitChangeAssociateActionImpl(associate);
    }

    /**
     * factory method for an instance of BusinessUnitChangeAssociateActionBuilder
     * @return builder 
     */
    public static BusinessUnitChangeAssociateActionBuilder of() {
        return new BusinessUnitChangeAssociateActionBuilder();
    }

    /**
     * create builder for BusinessUnitChangeAssociateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitChangeAssociateActionBuilder of(final BusinessUnitChangeAssociateAction template) {
        BusinessUnitChangeAssociateActionBuilder builder = new BusinessUnitChangeAssociateActionBuilder();
        builder.associate = template.getAssociate();
        return builder;
    }

}
