
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitReference businessUnitReference = BusinessUnitReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitReferenceBuilder implements Builder<BusinessUnitReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnit obj;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public BusinessUnitReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded BusinessUnit. Only present in responses to requests with <span>Reference Expansion</span> for BusinessUnit.</p>
     * @param obj value to be set
     * @return Builder
     */

    public BusinessUnitReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnit obj) {
        this.obj = obj;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded BusinessUnit. Only present in responses to requests with <span>Reference Expansion</span> for BusinessUnit.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public BusinessUnitReferenceBuilder obj(
            Function<com.commercetools.api.models.business_unit.BusinessUnitBuilder, Builder<? extends com.commercetools.api.models.business_unit.BusinessUnit>> builder) {
        this.obj = builder.apply(com.commercetools.api.models.business_unit.BusinessUnitBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Contains the representation of the expanded BusinessUnit. Only present in responses to requests with <span>Reference Expansion</span> for BusinessUnit.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnit getObj() {
        return this.obj;
    }

    /**
     * builds BusinessUnitReference with checking for non-null required values
     * @return BusinessUnitReference
     */
    public BusinessUnitReference build() {
        Objects.requireNonNull(id, BusinessUnitReference.class + ": id is missing");
        return new BusinessUnitReferenceImpl(id, obj);
    }

    /**
     * builds BusinessUnitReference without checking for non-null required values
     * @return BusinessUnitReference
     */
    public BusinessUnitReference buildUnchecked() {
        return new BusinessUnitReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of BusinessUnitReferenceBuilder
     * @return builder
     */
    public static BusinessUnitReferenceBuilder of() {
        return new BusinessUnitReferenceBuilder();
    }

    /**
     * create builder for BusinessUnitReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitReferenceBuilder of(final BusinessUnitReference template) {
        BusinessUnitReferenceBuilder builder = new BusinessUnitReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
