
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitParentChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitParentChangedMessagePayload businessUnitParentChangedMessagePayload = BusinessUnitParentChangedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitParentChangedMessagePayloadBuilder
        implements Builder<BusinessUnitParentChangedMessagePayload> {

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldParentUnit;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference newParentUnit;

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeParentUnitAction" rel="nofollow">Change Parent Unit</a> update action.</p>
     * @param builder function to build the oldParentUnit value
     * @return Builder
     */

    public BusinessUnitParentChangedMessagePayloadBuilder oldParentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.oldParentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeParentUnitAction" rel="nofollow">Change Parent Unit</a> update action.</p>
     * @param builder function to build the oldParentUnit value
     * @return Builder
     */

    public BusinessUnitParentChangedMessagePayloadBuilder withOldParentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.oldParentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeParentUnitAction" rel="nofollow">Change Parent Unit</a> update action.</p>
     * @param oldParentUnit value to be set
     * @return Builder
     */

    public BusinessUnitParentChangedMessagePayloadBuilder oldParentUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldParentUnit) {
        this.oldParentUnit = oldParentUnit;
        return this;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeParentUnitAction" rel="nofollow">Change Parent Unit</a> update action.</p>
     * @param builder function to build the newParentUnit value
     * @return Builder
     */

    public BusinessUnitParentChangedMessagePayloadBuilder newParentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.newParentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeParentUnitAction" rel="nofollow">Change Parent Unit</a> update action.</p>
     * @param builder function to build the newParentUnit value
     * @return Builder
     */

    public BusinessUnitParentChangedMessagePayloadBuilder withNewParentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.newParentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeParentUnitAction" rel="nofollow">Change Parent Unit</a> update action.</p>
     * @param newParentUnit value to be set
     * @return Builder
     */

    public BusinessUnitParentChangedMessagePayloadBuilder newParentUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference newParentUnit) {
        this.newParentUnit = newParentUnit;
        return this;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeParentUnitAction" rel="nofollow">Change Parent Unit</a> update action.</p>
     * @return oldParentUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getOldParentUnit() {
        return this.oldParentUnit;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeParentUnitAction" rel="nofollow">Change Parent Unit</a> update action.</p>
     * @return newParentUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getNewParentUnit() {
        return this.newParentUnit;
    }

    /**
     * builds BusinessUnitParentChangedMessagePayload with checking for non-null required values
     * @return BusinessUnitParentChangedMessagePayload
     */
    public BusinessUnitParentChangedMessagePayload build() {
        return new BusinessUnitParentChangedMessagePayloadImpl(oldParentUnit, newParentUnit);
    }

    /**
     * builds BusinessUnitParentChangedMessagePayload without checking for non-null required values
     * @return BusinessUnitParentChangedMessagePayload
     */
    public BusinessUnitParentChangedMessagePayload buildUnchecked() {
        return new BusinessUnitParentChangedMessagePayloadImpl(oldParentUnit, newParentUnit);
    }

    /**
     * factory method for an instance of BusinessUnitParentChangedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitParentChangedMessagePayloadBuilder of() {
        return new BusinessUnitParentChangedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitParentChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitParentChangedMessagePayloadBuilder of(
            final BusinessUnitParentChangedMessagePayload template) {
        BusinessUnitParentChangedMessagePayloadBuilder builder = new BusinessUnitParentChangedMessagePayloadBuilder();
        builder.oldParentUnit = template.getOldParentUnit();
        builder.newParentUnit = template.getNewParentUnit();
        return builder;
    }

}
