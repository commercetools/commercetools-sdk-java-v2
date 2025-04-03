
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitTopLevelUnitSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitTopLevelUnitSetMessagePayload businessUnitTopLevelUnitSetMessagePayload = BusinessUnitTopLevelUnitSetMessagePayload.builder()
 *             .topLevelUnit(topLevelUnitBuilder -> topLevelUnitBuilder)
 *             .oldTopLevelUnit(oldTopLevelUnitBuilder -> oldTopLevelUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitTopLevelUnitSetMessagePayloadBuilder
        implements Builder<BusinessUnitTopLevelUnitSetMessagePayload> {

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference topLevelUnit;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldTopLevelUnit;

    /**
     *  <p>Top-level unit of the Business Unit after the Set Unit Type or Change Parent Unit update action.</p>
     * @param builder function to build the topLevelUnit value
     * @return Builder
     */

    public BusinessUnitTopLevelUnitSetMessagePayloadBuilder topLevelUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.topLevelUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Top-level unit of the Business Unit after the Set Unit Type or Change Parent Unit update action.</p>
     * @param builder function to build the topLevelUnit value
     * @return Builder
     */

    public BusinessUnitTopLevelUnitSetMessagePayloadBuilder withTopLevelUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.topLevelUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Top-level unit of the Business Unit after the Set Unit Type or Change Parent Unit update action.</p>
     * @param topLevelUnit value to be set
     * @return Builder
     */

    public BusinessUnitTopLevelUnitSetMessagePayloadBuilder topLevelUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference topLevelUnit) {
        this.topLevelUnit = topLevelUnit;
        return this;
    }

    /**
     *  <p>Top-level unit of the Business Unit before the Set Unit Type or Change Parent Unit update action.</p>
     * @param builder function to build the oldTopLevelUnit value
     * @return Builder
     */

    public BusinessUnitTopLevelUnitSetMessagePayloadBuilder oldTopLevelUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.oldTopLevelUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Top-level unit of the Business Unit before the Set Unit Type or Change Parent Unit update action.</p>
     * @param builder function to build the oldTopLevelUnit value
     * @return Builder
     */

    public BusinessUnitTopLevelUnitSetMessagePayloadBuilder withOldTopLevelUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.oldTopLevelUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Top-level unit of the Business Unit before the Set Unit Type or Change Parent Unit update action.</p>
     * @param oldTopLevelUnit value to be set
     * @return Builder
     */

    public BusinessUnitTopLevelUnitSetMessagePayloadBuilder oldTopLevelUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldTopLevelUnit) {
        this.oldTopLevelUnit = oldTopLevelUnit;
        return this;
    }

    /**
     *  <p>Top-level unit of the Business Unit after the Set Unit Type or Change Parent Unit update action.</p>
     * @return topLevelUnit
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getTopLevelUnit() {
        return this.topLevelUnit;
    }

    /**
     *  <p>Top-level unit of the Business Unit before the Set Unit Type or Change Parent Unit update action.</p>
     * @return oldTopLevelUnit
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getOldTopLevelUnit() {
        return this.oldTopLevelUnit;
    }

    /**
     * builds BusinessUnitTopLevelUnitSetMessagePayload with checking for non-null required values
     * @return BusinessUnitTopLevelUnitSetMessagePayload
     */
    public BusinessUnitTopLevelUnitSetMessagePayload build() {
        Objects.requireNonNull(topLevelUnit,
            BusinessUnitTopLevelUnitSetMessagePayload.class + ": topLevelUnit is missing");
        Objects.requireNonNull(oldTopLevelUnit,
            BusinessUnitTopLevelUnitSetMessagePayload.class + ": oldTopLevelUnit is missing");
        return new BusinessUnitTopLevelUnitSetMessagePayloadImpl(topLevelUnit, oldTopLevelUnit);
    }

    /**
     * builds BusinessUnitTopLevelUnitSetMessagePayload without checking for non-null required values
     * @return BusinessUnitTopLevelUnitSetMessagePayload
     */
    public BusinessUnitTopLevelUnitSetMessagePayload buildUnchecked() {
        return new BusinessUnitTopLevelUnitSetMessagePayloadImpl(topLevelUnit, oldTopLevelUnit);
    }

    /**
     * factory method for an instance of BusinessUnitTopLevelUnitSetMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitTopLevelUnitSetMessagePayloadBuilder of() {
        return new BusinessUnitTopLevelUnitSetMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitTopLevelUnitSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitTopLevelUnitSetMessagePayloadBuilder of(
            final BusinessUnitTopLevelUnitSetMessagePayload template) {
        BusinessUnitTopLevelUnitSetMessagePayloadBuilder builder = new BusinessUnitTopLevelUnitSetMessagePayloadBuilder();
        builder.topLevelUnit = template.getTopLevelUnit();
        builder.oldTopLevelUnit = template.getOldTopLevelUnit();
        return builder;
    }

}
