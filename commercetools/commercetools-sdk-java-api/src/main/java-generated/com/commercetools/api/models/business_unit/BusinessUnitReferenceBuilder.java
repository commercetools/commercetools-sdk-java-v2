
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
     *  <p>Unique identifier of the referenced BusinessUnit.</p>
     * @param id
     * @return Builder
     */

    public BusinessUnitReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded BusinessUnit. Only present in responses to requests with Reference Expansion for BusinessUnit.</p>
     * @param obj
     * @return Builder
     */

    public BusinessUnitReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnit obj) {
        this.obj = obj;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded BusinessUnit. Only present in responses to requests with Reference Expansion for BusinessUnit.</p>
     * @return Builder
     */

    public BusinessUnitReferenceBuilder obj(
            Function<com.commercetools.api.models.business_unit.BusinessUnitBuilder, Builder<? extends com.commercetools.api.models.business_unit.BusinessUnit>> builder) {
        this.obj = builder.apply(com.commercetools.api.models.business_unit.BusinessUnitBuilder.of()).build();
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnit getObj() {
        return this.obj;
    }

    public BusinessUnitReference build() {
        Objects.requireNonNull(id, BusinessUnitReference.class + ": id is missing");
        return new BusinessUnitReferenceImpl(id, obj);
    }

    /**
     * builds BusinessUnitReference without checking for non null required values
     */
    public BusinessUnitReference buildUnchecked() {
        return new BusinessUnitReferenceImpl(id, obj);
    }

    public static BusinessUnitReferenceBuilder of() {
        return new BusinessUnitReferenceBuilder();
    }

    public static BusinessUnitReferenceBuilder of(final BusinessUnitReference template) {
        BusinessUnitReferenceBuilder builder = new BusinessUnitReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
