
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAssociateChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociateChangedMessagePayload businessUnitAssociateChangedMessagePayload = BusinessUnitAssociateChangedMessagePayload.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAssociateChangedMessagePayloadBuilder
        implements Builder<BusinessUnitAssociateChangedMessagePayload> {

    private com.commercetools.api.models.business_unit.Associate associate;

    /**
     *  <p>The Associate that was updated.</p>
     * @return Builder
     */

    public BusinessUnitAssociateChangedMessagePayloadBuilder associate(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.AssociateBuilder> builder) {
        this.associate = builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Associate that was updated.</p>
     * @param associate
     * @return Builder
     */

    public BusinessUnitAssociateChangedMessagePayloadBuilder associate(
            final com.commercetools.api.models.business_unit.Associate associate) {
        this.associate = associate;
        return this;
    }

    public com.commercetools.api.models.business_unit.Associate getAssociate() {
        return this.associate;
    }

    public BusinessUnitAssociateChangedMessagePayload build() {
        Objects.requireNonNull(associate, BusinessUnitAssociateChangedMessagePayload.class + ": associate is missing");
        return new BusinessUnitAssociateChangedMessagePayloadImpl(associate);
    }

    /**
     * builds BusinessUnitAssociateChangedMessagePayload without checking for non null required values
     */
    public BusinessUnitAssociateChangedMessagePayload buildUnchecked() {
        return new BusinessUnitAssociateChangedMessagePayloadImpl(associate);
    }

    public static BusinessUnitAssociateChangedMessagePayloadBuilder of() {
        return new BusinessUnitAssociateChangedMessagePayloadBuilder();
    }

    public static BusinessUnitAssociateChangedMessagePayloadBuilder of(
            final BusinessUnitAssociateChangedMessagePayload template) {
        BusinessUnitAssociateChangedMessagePayloadBuilder builder = new BusinessUnitAssociateChangedMessagePayloadBuilder();
        builder.associate = template.getAssociate();
        return builder;
    }

}
