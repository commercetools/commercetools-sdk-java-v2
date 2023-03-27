
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCreatedMessagePayload businessUnitCreatedMessagePayload = BusinessUnitCreatedMessagePayload.builder()
 *             .businessUnit(businessUnitBuilder -> businessUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitCreatedMessagePayloadBuilder implements Builder<BusinessUnitCreatedMessagePayload> {

    private com.commercetools.api.models.business_unit.BusinessUnit businessUnit;

    /**
     *  <p>The Business Unit that was created.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public BusinessUnitCreatedMessagePayloadBuilder businessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnit businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>The Business Unit that was created.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public BusinessUnitCreatedMessagePayloadBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitBuilder, Builder<? extends com.commercetools.api.models.business_unit.BusinessUnit>> builder) {
        this.businessUnit = builder.apply(com.commercetools.api.models.business_unit.BusinessUnitBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Business Unit that was created.</p>
     * @return businessUnit
     */

    public com.commercetools.api.models.business_unit.BusinessUnit getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     * builds BusinessUnitCreatedMessagePayload with checking for non-null required values
     * @return BusinessUnitCreatedMessagePayload
     */
    public BusinessUnitCreatedMessagePayload build() {
        Objects.requireNonNull(businessUnit, BusinessUnitCreatedMessagePayload.class + ": businessUnit is missing");
        return new BusinessUnitCreatedMessagePayloadImpl(businessUnit);
    }

    /**
     * builds BusinessUnitCreatedMessagePayload without checking for non-null required values
     * @return BusinessUnitCreatedMessagePayload
     */
    public BusinessUnitCreatedMessagePayload buildUnchecked() {
        return new BusinessUnitCreatedMessagePayloadImpl(businessUnit);
    }

    /**
     * factory method for an instance of BusinessUnitCreatedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitCreatedMessagePayloadBuilder of() {
        return new BusinessUnitCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCreatedMessagePayloadBuilder of(final BusinessUnitCreatedMessagePayload template) {
        BusinessUnitCreatedMessagePayloadBuilder builder = new BusinessUnitCreatedMessagePayloadBuilder();
        builder.businessUnit = template.getBusinessUnit();
        return builder;
    }

}
