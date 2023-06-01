package com.commercetools.api.models.message;

import com.commercetools.api.models.business_unit.Associate;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAssociateRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociateRemovedMessagePayload businessUnitAssociateRemovedMessagePayload = BusinessUnitAssociateRemovedMessagePayload.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitAssociateRemovedMessagePayloadBuilder implements Builder<BusinessUnitAssociateRemovedMessagePayload> {

    
    
    private com.commercetools.api.models.business_unit.Associate associate;

    
    /**
     *  <p>The Associate that was removed from the Business Unit.</p>
     * @param builder function to build the associate value
     * @return Builder
     */
    
    public BusinessUnitAssociateRemovedMessagePayloadBuilder associate(Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.AssociateBuilder> builder) {
        this.associate = builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The Associate that was removed from the Business Unit.</p>
     * @param builder function to build the associate value
     * @return Builder
     */
    
    public BusinessUnitAssociateRemovedMessagePayloadBuilder withAssociate(Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.Associate> builder) {
        this.associate = builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The Associate that was removed from the Business Unit.</p>
     * @param associate value to be set
     * @return Builder
     */
    
    public BusinessUnitAssociateRemovedMessagePayloadBuilder associate( final com.commercetools.api.models.business_unit.Associate associate) {
        this.associate = associate;
        return this;
    }
    
    

    /**
     *  <p>The Associate that was removed from the Business Unit.</p>
     * @return associate
     */
    
    
    public com.commercetools.api.models.business_unit.Associate getAssociate(){
        return this.associate;
    }

    /**
     * builds BusinessUnitAssociateRemovedMessagePayload with checking for non-null required values
     * @return BusinessUnitAssociateRemovedMessagePayload
     */
    public BusinessUnitAssociateRemovedMessagePayload build() {
        Objects.requireNonNull(associate, BusinessUnitAssociateRemovedMessagePayload.class + ": associate is missing");
        return new BusinessUnitAssociateRemovedMessagePayloadImpl(associate);
    }
    
    /**
     * builds BusinessUnitAssociateRemovedMessagePayload without checking for non-null required values
     * @return BusinessUnitAssociateRemovedMessagePayload
     */
    public BusinessUnitAssociateRemovedMessagePayload buildUnchecked() {
        return new BusinessUnitAssociateRemovedMessagePayloadImpl(associate);
    }

    /**
     * factory method for an instance of BusinessUnitAssociateRemovedMessagePayloadBuilder
     * @return builder 
     */
    public static BusinessUnitAssociateRemovedMessagePayloadBuilder of() {
        return new BusinessUnitAssociateRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitAssociateRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAssociateRemovedMessagePayloadBuilder of(final BusinessUnitAssociateRemovedMessagePayload template) {
        BusinessUnitAssociateRemovedMessagePayloadBuilder builder = new BusinessUnitAssociateRemovedMessagePayloadBuilder();
        builder.associate = template.getAssociate();
        return builder;
    }

}
