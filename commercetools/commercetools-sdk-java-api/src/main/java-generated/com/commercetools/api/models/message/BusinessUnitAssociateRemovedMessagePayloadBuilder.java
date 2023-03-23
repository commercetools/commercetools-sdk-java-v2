
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAssociateRemovedMessagePayloadBuilder
        implements Builder<BusinessUnitAssociateRemovedMessagePayload> {

    private com.commercetools.api.models.business_unit.Associate associate;

    /**
     *  <p>The Associate that was removed from the Business Unit.</p>
     * @return Builder
     */

    public BusinessUnitAssociateRemovedMessagePayloadBuilder associate(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.AssociateBuilder> builder) {
        this.associate = builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Associate that was removed from the Business Unit.</p>
     * @param associate
     * @return Builder
     */

    public BusinessUnitAssociateRemovedMessagePayloadBuilder associate(
            final com.commercetools.api.models.business_unit.Associate associate) {
        this.associate = associate;
        return this;
    }

    public com.commercetools.api.models.business_unit.Associate getAssociate() {
        return this.associate;
    }

    public BusinessUnitAssociateRemovedMessagePayload build() {
        Objects.requireNonNull(associate, BusinessUnitAssociateRemovedMessagePayload.class + ": associate is missing");
        return new BusinessUnitAssociateRemovedMessagePayloadImpl(associate);
    }

    /**
     * builds BusinessUnitAssociateRemovedMessagePayload without checking for non null required values
     */
    public BusinessUnitAssociateRemovedMessagePayload buildUnchecked() {
        return new BusinessUnitAssociateRemovedMessagePayloadImpl(associate);
    }

    public static BusinessUnitAssociateRemovedMessagePayloadBuilder of() {
        return new BusinessUnitAssociateRemovedMessagePayloadBuilder();
    }

    public static BusinessUnitAssociateRemovedMessagePayloadBuilder of(
            final BusinessUnitAssociateRemovedMessagePayload template) {
        BusinessUnitAssociateRemovedMessagePayloadBuilder builder = new BusinessUnitAssociateRemovedMessagePayloadBuilder();
        builder.associate = template.getAssociate();
        return builder;
    }

}
