
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAssociatesSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociatesSetMessagePayload businessUnitAssociatesSetMessagePayload = BusinessUnitAssociatesSetMessagePayload.builder()
 *             .plusAssociates(associatesBuilder -> associatesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAssociatesSetMessagePayloadBuilder
        implements Builder<BusinessUnitAssociatesSetMessagePayload> {

    private java.util.List<com.commercetools.api.models.business_unit.Associate> associates;

    /**
     *  <p>The list of Associates that was updated on the Business Unit.</p>
     * @param associates value to be set
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessagePayloadBuilder associates(
            final com.commercetools.api.models.business_unit.Associate... associates) {
        this.associates = new ArrayList<>(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>The list of Associates that was updated on the Business Unit.</p>
     * @param associates value to be set
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessagePayloadBuilder associates(
            final java.util.List<com.commercetools.api.models.business_unit.Associate> associates) {
        this.associates = associates;
        return this;
    }

    /**
     *  <p>The list of Associates that was updated on the Business Unit.</p>
     * @param associates value to be set
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessagePayloadBuilder plusAssociates(
            final com.commercetools.api.models.business_unit.Associate... associates) {
        if (this.associates == null) {
            this.associates = new ArrayList<>();
        }
        this.associates.addAll(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>The list of Associates that was updated on the Business Unit.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessagePayloadBuilder plusAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.AssociateBuilder> builder) {
        if (this.associates == null) {
            this.associates = new ArrayList<>();
        }
        this.associates.add(builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The list of Associates that was updated on the Business Unit.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessagePayloadBuilder withAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.AssociateBuilder> builder) {
        this.associates = new ArrayList<>();
        this.associates.add(builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.business_unit.Associate> getAssociates() {
        return this.associates;
    }

    /**
     * builds BusinessUnitAssociatesSetMessagePayload with checking for non-null required values
     * @return BusinessUnitAssociatesSetMessagePayload
     */
    public BusinessUnitAssociatesSetMessagePayload build() {
        Objects.requireNonNull(associates, BusinessUnitAssociatesSetMessagePayload.class + ": associates is missing");
        return new BusinessUnitAssociatesSetMessagePayloadImpl(associates);
    }

    /**
     * builds BusinessUnitAssociatesSetMessagePayload without checking for non-null required values
     * @return BusinessUnitAssociatesSetMessagePayload
     */
    public BusinessUnitAssociatesSetMessagePayload buildUnchecked() {
        return new BusinessUnitAssociatesSetMessagePayloadImpl(associates);
    }

    public static BusinessUnitAssociatesSetMessagePayloadBuilder of() {
        return new BusinessUnitAssociatesSetMessagePayloadBuilder();
    }

    public static BusinessUnitAssociatesSetMessagePayloadBuilder of(
            final BusinessUnitAssociatesSetMessagePayload template) {
        BusinessUnitAssociatesSetMessagePayloadBuilder builder = new BusinessUnitAssociatesSetMessagePayloadBuilder();
        builder.associates = template.getAssociates();
        return builder;
    }

}
