
package com.commercetools.api.models.discount_group;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountGroupReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupReference discountGroupReference = DiscountGroupReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupReferenceBuilder implements Builder<DiscountGroupReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.discount_group.DiscountGroup obj;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public DiscountGroupReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded DiscountGroup. Only present in responses to requests with <span>Reference Expansion</span> for DiscountGroups.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public DiscountGroupReferenceBuilder obj(
            Function<com.commercetools.api.models.discount_group.DiscountGroupBuilder, com.commercetools.api.models.discount_group.DiscountGroupBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.discount_group.DiscountGroupBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded DiscountGroup. Only present in responses to requests with <span>Reference Expansion</span> for DiscountGroups.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public DiscountGroupReferenceBuilder withObj(
            Function<com.commercetools.api.models.discount_group.DiscountGroupBuilder, com.commercetools.api.models.discount_group.DiscountGroup> builder) {
        this.obj = builder.apply(com.commercetools.api.models.discount_group.DiscountGroupBuilder.of());
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded DiscountGroup. Only present in responses to requests with <span>Reference Expansion</span> for DiscountGroups.</p>
     * @param obj value to be set
     * @return Builder
     */

    public DiscountGroupReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.discount_group.DiscountGroup obj) {
        this.obj = obj;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Contains the representation of the expanded DiscountGroup. Only present in responses to requests with <span>Reference Expansion</span> for DiscountGroups.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.discount_group.DiscountGroup getObj() {
        return this.obj;
    }

    /**
     * builds DiscountGroupReference with checking for non-null required values
     * @return DiscountGroupReference
     */
    public DiscountGroupReference build() {
        Objects.requireNonNull(id, DiscountGroupReference.class + ": id is missing");
        return new DiscountGroupReferenceImpl(id, obj);
    }

    /**
     * builds DiscountGroupReference without checking for non-null required values
     * @return DiscountGroupReference
     */
    public DiscountGroupReference buildUnchecked() {
        return new DiscountGroupReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of DiscountGroupReferenceBuilder
     * @return builder
     */
    public static DiscountGroupReferenceBuilder of() {
        return new DiscountGroupReferenceBuilder();
    }

    /**
     * create builder for DiscountGroupReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupReferenceBuilder of(final DiscountGroupReference template) {
        DiscountGroupReferenceBuilder builder = new DiscountGroupReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
