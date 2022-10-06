
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
     */

    public BusinessUnitCreatedMessagePayloadBuilder businessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnit businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>The Business Unit that was created.</p>
     */

    public BusinessUnitCreatedMessagePayloadBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitBuilder, Builder<? extends com.commercetools.api.models.business_unit.BusinessUnit>> builder) {
        this.businessUnit = builder.apply(com.commercetools.api.models.business_unit.BusinessUnitBuilder.of()).build();
        return this;
    }

    public com.commercetools.api.models.business_unit.BusinessUnit getBusinessUnit() {
        return this.businessUnit;
    }

    public BusinessUnitCreatedMessagePayload build() {
        Objects.requireNonNull(businessUnit, BusinessUnitCreatedMessagePayload.class + ": businessUnit is missing");
        return new BusinessUnitCreatedMessagePayloadImpl(businessUnit);
    }

    /**
     * builds BusinessUnitCreatedMessagePayload without checking for non null required values
     */
    public BusinessUnitCreatedMessagePayload buildUnchecked() {
        return new BusinessUnitCreatedMessagePayloadImpl(businessUnit);
    }

    public static BusinessUnitCreatedMessagePayloadBuilder of() {
        return new BusinessUnitCreatedMessagePayloadBuilder();
    }

    public static BusinessUnitCreatedMessagePayloadBuilder of(final BusinessUnitCreatedMessagePayload template) {
        BusinessUnitCreatedMessagePayloadBuilder builder = new BusinessUnitCreatedMessagePayloadBuilder();
        builder.businessUnit = template.getBusinessUnit();
        return builder;
    }

}
