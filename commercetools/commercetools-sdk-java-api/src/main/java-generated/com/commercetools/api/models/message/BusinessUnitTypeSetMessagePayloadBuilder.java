
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitTypeSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitTypeSetMessagePayload businessUnitTypeSetMessagePayload = BusinessUnitTypeSetMessagePayload.builder()
 *             .unitType(BusinessUnitType.COMPANY)
 *             .oldUnitType(BusinessUnitType.COMPANY)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitTypeSetMessagePayloadBuilder implements Builder<BusinessUnitTypeSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference parentUnit;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldParentUnit;

    private com.commercetools.api.models.business_unit.BusinessUnitType unitType;

    private com.commercetools.api.models.business_unit.BusinessUnitType oldUnitType;

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @param builder function to build the parentUnit value
     * @return Builder
     */

    public BusinessUnitTypeSetMessagePayloadBuilder parentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.parentUnit = builder.apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @param builder function to build the parentUnit value
     * @return Builder
     */

    public BusinessUnitTypeSetMessagePayloadBuilder withParentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.parentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @param parentUnit value to be set
     * @return Builder
     */

    public BusinessUnitTypeSetMessagePayloadBuilder parentUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference parentUnit) {
        this.parentUnit = parentUnit;
        return this;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @param builder function to build the oldParentUnit value
     * @return Builder
     */

    public BusinessUnitTypeSetMessagePayloadBuilder oldParentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.oldParentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @param builder function to build the oldParentUnit value
     * @return Builder
     */

    public BusinessUnitTypeSetMessagePayloadBuilder withOldParentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.oldParentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @param oldParentUnit value to be set
     * @return Builder
     */

    public BusinessUnitTypeSetMessagePayloadBuilder oldParentUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldParentUnit) {
        this.oldParentUnit = oldParentUnit;
        return this;
    }

    /**
     *  <p>Type of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @param unitType value to be set
     * @return Builder
     */

    public BusinessUnitTypeSetMessagePayloadBuilder unitType(
            final com.commercetools.api.models.business_unit.BusinessUnitType unitType) {
        this.unitType = unitType;
        return this;
    }

    /**
     *  <p>Type of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @param oldUnitType value to be set
     * @return Builder
     */

    public BusinessUnitTypeSetMessagePayloadBuilder oldUnitType(
            final com.commercetools.api.models.business_unit.BusinessUnitType oldUnitType) {
        this.oldUnitType = oldUnitType;
        return this;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @return parentUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getParentUnit() {
        return this.parentUnit;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @return oldParentUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getOldParentUnit() {
        return this.oldParentUnit;
    }

    /**
     *  <p>Type of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @return unitType
     */

    public com.commercetools.api.models.business_unit.BusinessUnitType getUnitType() {
        return this.unitType;
    }

    /**
     *  <p>Type of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @return oldUnitType
     */

    public com.commercetools.api.models.business_unit.BusinessUnitType getOldUnitType() {
        return this.oldUnitType;
    }

    /**
     * builds BusinessUnitTypeSetMessagePayload with checking for non-null required values
     * @return BusinessUnitTypeSetMessagePayload
     */
    public BusinessUnitTypeSetMessagePayload build() {
        Objects.requireNonNull(unitType, BusinessUnitTypeSetMessagePayload.class + ": unitType is missing");
        Objects.requireNonNull(oldUnitType, BusinessUnitTypeSetMessagePayload.class + ": oldUnitType is missing");
        return new BusinessUnitTypeSetMessagePayloadImpl(parentUnit, oldParentUnit, unitType, oldUnitType);
    }

    /**
     * builds BusinessUnitTypeSetMessagePayload without checking for non-null required values
     * @return BusinessUnitTypeSetMessagePayload
     */
    public BusinessUnitTypeSetMessagePayload buildUnchecked() {
        return new BusinessUnitTypeSetMessagePayloadImpl(parentUnit, oldParentUnit, unitType, oldUnitType);
    }

    /**
     * factory method for an instance of BusinessUnitTypeSetMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitTypeSetMessagePayloadBuilder of() {
        return new BusinessUnitTypeSetMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitTypeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitTypeSetMessagePayloadBuilder of(final BusinessUnitTypeSetMessagePayload template) {
        BusinessUnitTypeSetMessagePayloadBuilder builder = new BusinessUnitTypeSetMessagePayloadBuilder();
        builder.parentUnit = template.getParentUnit();
        builder.oldParentUnit = template.getOldParentUnit();
        builder.unitType = template.getUnitType();
        builder.oldUnitType = template.getOldUnitType();
        return builder;
    }

}
