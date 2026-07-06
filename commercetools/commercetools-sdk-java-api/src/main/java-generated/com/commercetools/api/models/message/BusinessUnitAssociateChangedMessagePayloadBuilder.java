
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
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> that was updated.</p>
     * @param builder function to build the associate value
     * @return Builder
     */

    public BusinessUnitAssociateChangedMessagePayloadBuilder associate(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.AssociateBuilder> builder) {
        this.associate = builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> that was updated.</p>
     * @param builder function to build the associate value
     * @return Builder
     */

    public BusinessUnitAssociateChangedMessagePayloadBuilder withAssociate(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.Associate> builder) {
        this.associate = builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> that was updated.</p>
     * @param associate value to be set
     * @return Builder
     */

    public BusinessUnitAssociateChangedMessagePayloadBuilder associate(
            final com.commercetools.api.models.business_unit.Associate associate) {
        this.associate = associate;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> that was updated.</p>
     * @return associate
     */

    public com.commercetools.api.models.business_unit.Associate getAssociate() {
        return this.associate;
    }

    /**
     * builds BusinessUnitAssociateChangedMessagePayload with checking for non-null required values
     * @return BusinessUnitAssociateChangedMessagePayload
     */
    public BusinessUnitAssociateChangedMessagePayload build() {
        Objects.requireNonNull(associate, BusinessUnitAssociateChangedMessagePayload.class + ": associate is missing");
        return new BusinessUnitAssociateChangedMessagePayloadImpl(associate);
    }

    /**
     * builds BusinessUnitAssociateChangedMessagePayload without checking for non-null required values
     * @return BusinessUnitAssociateChangedMessagePayload
     */
    public BusinessUnitAssociateChangedMessagePayload buildUnchecked() {
        return new BusinessUnitAssociateChangedMessagePayloadImpl(associate);
    }

    /**
     * factory method for an instance of BusinessUnitAssociateChangedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitAssociateChangedMessagePayloadBuilder of() {
        return new BusinessUnitAssociateChangedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitAssociateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAssociateChangedMessagePayloadBuilder of(
            final BusinessUnitAssociateChangedMessagePayload template) {
        BusinessUnitAssociateChangedMessagePayloadBuilder builder = new BusinessUnitAssociateChangedMessagePayloadBuilder();
        builder.associate = template.getAssociate();
        return builder;
    }

}
