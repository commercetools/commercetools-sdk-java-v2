
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAssociateAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociateAddedMessagePayload businessUnitAssociateAddedMessagePayload = BusinessUnitAssociateAddedMessagePayload.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAssociateAddedMessagePayloadBuilder
        implements Builder<BusinessUnitAssociateAddedMessagePayload> {

    private com.commercetools.api.models.business_unit.Associate associate;

    /**
     *  <p>The Associate that was added to the Business Unit.</p>
     * @param builder function to build the associate value
     * @return Builder
     */

    public BusinessUnitAssociateAddedMessagePayloadBuilder associate(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.AssociateBuilder> builder) {
        this.associate = builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Associate that was added to the Business Unit.</p>
     * @param builder function to build the associate value
     * @return Builder
     */

    public BusinessUnitAssociateAddedMessagePayloadBuilder withAssociate(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.Associate> builder) {
        this.associate = builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of());
        return this;
    }

    /**
     *  <p>The Associate that was added to the Business Unit.</p>
     * @param associate value to be set
     * @return Builder
     */

    public BusinessUnitAssociateAddedMessagePayloadBuilder associate(
            final com.commercetools.api.models.business_unit.Associate associate) {
        this.associate = associate;
        return this;
    }

    /**
     *  <p>The Associate that was added to the Business Unit.</p>
     * @return associate
     */

    public com.commercetools.api.models.business_unit.Associate getAssociate() {
        return this.associate;
    }

    /**
     * builds BusinessUnitAssociateAddedMessagePayload with checking for non-null required values
     * @return BusinessUnitAssociateAddedMessagePayload
     */
    public BusinessUnitAssociateAddedMessagePayload build() {
        Objects.requireNonNull(associate, BusinessUnitAssociateAddedMessagePayload.class + ": associate is missing");
        return new BusinessUnitAssociateAddedMessagePayloadImpl(associate);
    }

    /**
     * builds BusinessUnitAssociateAddedMessagePayload without checking for non-null required values
     * @return BusinessUnitAssociateAddedMessagePayload
     */
    public BusinessUnitAssociateAddedMessagePayload buildUnchecked() {
        return new BusinessUnitAssociateAddedMessagePayloadImpl(associate);
    }

    /**
     * factory method for an instance of BusinessUnitAssociateAddedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitAssociateAddedMessagePayloadBuilder of() {
        return new BusinessUnitAssociateAddedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitAssociateAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAssociateAddedMessagePayloadBuilder of(
            final BusinessUnitAssociateAddedMessagePayload template) {
        BusinessUnitAssociateAddedMessagePayloadBuilder builder = new BusinessUnitAssociateAddedMessagePayloadBuilder();
        builder.associate = template.getAssociate();
        return builder;
    }

}
