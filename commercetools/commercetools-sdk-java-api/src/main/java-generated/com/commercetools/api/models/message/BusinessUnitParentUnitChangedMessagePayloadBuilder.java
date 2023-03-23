
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
     * @param oldParentUnit
     * @return Builder
     */

    public BusinessUnitParentUnitChangedMessagePayloadBuilder oldParentUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldParentUnit) {
        this.oldParentUnit = oldParentUnit;
        return this;
    }

    /**
     *  <p>Parent unit of the Business Unit after the Change Parent Unit update action.</p>
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
     * @param newParentUnit
     * @return Builder
     */

    public BusinessUnitParentUnitChangedMessagePayloadBuilder newParentUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference newParentUnit) {
        this.newParentUnit = newParentUnit;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getOldParentUnit() {
        return this.oldParentUnit;
    }

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getNewParentUnit() {
        return this.newParentUnit;
    }

    public BusinessUnitParentUnitChangedMessagePayload build() {
        return new BusinessUnitParentUnitChangedMessagePayloadImpl(oldParentUnit, newParentUnit);
    }

    /**
     * builds BusinessUnitParentUnitChangedMessagePayload without checking for non null required values
     */
    public BusinessUnitParentUnitChangedMessagePayload buildUnchecked() {
        return new BusinessUnitParentUnitChangedMessagePayloadImpl(oldParentUnit, newParentUnit);
    }

    public static BusinessUnitParentUnitChangedMessagePayloadBuilder of() {
        return new BusinessUnitParentUnitChangedMessagePayloadBuilder();
    }

    public static BusinessUnitParentUnitChangedMessagePayloadBuilder of(
            final BusinessUnitParentUnitChangedMessagePayload template) {
        BusinessUnitParentUnitChangedMessagePayloadBuilder builder = new BusinessUnitParentUnitChangedMessagePayloadBuilder();
        builder.oldParentUnit = template.getOldParentUnit();
        builder.newParentUnit = template.getNewParentUnit();
        return builder;
    }

}
