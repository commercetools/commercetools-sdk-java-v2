
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitParentUnitChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitParentUnitChangedMessagePayload businessUnitParentUnitChangedMessagePayload = BusinessUnitParentUnitChangedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitParentUnitChangedMessagePayloadBuilder
        implements Builder<BusinessUnitParentUnitChangedMessagePayload> {

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldParentUnit;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference newParentUnit;

    /**
     *  <p>Parent unit of the Business Unit before the Change Parent Unit update action.</p>
     * @param builder function to build the oldParentUnit value
     * @return Builder
     */

    public BusinessUnitParentUnitChangedMessagePayloadBuilder oldParentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.oldParentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Parent unit of the Business Unit before the Change Parent Unit update action.</p>
     * @param oldParentUnit value to be set
     * @return Builder
     */

    public BusinessUnitParentUnitChangedMessagePayloadBuilder oldParentUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldParentUnit) {
        this.oldParentUnit = oldParentUnit;
        return this;
    }

    /**
     *  <p>Parent unit of the Business Unit after the Change Parent Unit update action.</p>
     * @param builder function to build the newParentUnit value
     * @return Builder
     */

    public BusinessUnitParentUnitChangedMessagePayloadBuilder newParentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.newParentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Parent unit of the Business Unit after the Change Parent Unit update action.</p>
     * @param newParentUnit value to be set
     * @return Builder
     */

    public BusinessUnitParentUnitChangedMessagePayloadBuilder newParentUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference newParentUnit) {
        this.newParentUnit = newParentUnit;
        return this;
    }

    /**
     *  <p>Parent unit of the Business Unit before the Change Parent Unit update action.</p>
     * @return oldParentUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getOldParentUnit() {
        return this.oldParentUnit;
    }

    /**
     *  <p>Parent unit of the Business Unit after the Change Parent Unit update action.</p>
     * @return newParentUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getNewParentUnit() {
        return this.newParentUnit;
    }

    /**
     * builds BusinessUnitParentUnitChangedMessagePayload with checking for non-null required values
     * @return BusinessUnitParentUnitChangedMessagePayload
     */
    public BusinessUnitParentUnitChangedMessagePayload build() {
        return new BusinessUnitParentUnitChangedMessagePayloadImpl(oldParentUnit, newParentUnit);
    }

    /**
     * builds BusinessUnitParentUnitChangedMessagePayload without checking for non-null required values
     * @return BusinessUnitParentUnitChangedMessagePayload
     */
    public BusinessUnitParentUnitChangedMessagePayload buildUnchecked() {
        return new BusinessUnitParentUnitChangedMessagePayloadImpl(oldParentUnit, newParentUnit);
    }

    /**
     * factory method for an instance of BusinessUnitParentUnitChangedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitParentUnitChangedMessagePayloadBuilder of() {
        return new BusinessUnitParentUnitChangedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitParentUnitChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitParentUnitChangedMessagePayloadBuilder of(
            final BusinessUnitParentUnitChangedMessagePayload template) {
        BusinessUnitParentUnitChangedMessagePayloadBuilder builder = new BusinessUnitParentUnitChangedMessagePayloadBuilder();
        builder.oldParentUnit = template.getOldParentUnit();
        builder.newParentUnit = template.getNewParentUnit();
        return builder;
    }

}
