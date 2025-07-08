
package com.commercetools.api.models.recurring_order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderReference recurringOrderReference = RecurringOrderReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderReferenceBuilder implements Builder<RecurringOrderReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.recurring_order.RecurringOrder obj;

    /**
     *  <p>Unique identifier of the referenced RecurringOrder.</p>
     * @param id value to be set
     * @return Builder
     */

    public RecurringOrderReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded RecurringOrder. Only present in responses to requests with Reference Expansion for RecurringOrders.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public RecurringOrderReferenceBuilder obj(
            Function<com.commercetools.api.models.recurring_order.RecurringOrderBuilder, com.commercetools.api.models.recurring_order.RecurringOrderBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.recurring_order.RecurringOrderBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded RecurringOrder. Only present in responses to requests with Reference Expansion for RecurringOrders.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public RecurringOrderReferenceBuilder withObj(
            Function<com.commercetools.api.models.recurring_order.RecurringOrderBuilder, com.commercetools.api.models.recurring_order.RecurringOrder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.recurring_order.RecurringOrderBuilder.of());
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded RecurringOrder. Only present in responses to requests with Reference Expansion for RecurringOrders.</p>
     * @param obj value to be set
     * @return Builder
     */

    public RecurringOrderReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.recurring_order.RecurringOrder obj) {
        this.obj = obj;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced RecurringOrder.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Contains the representation of the expanded RecurringOrder. Only present in responses to requests with Reference Expansion for RecurringOrders.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.recurring_order.RecurringOrder getObj() {
        return this.obj;
    }

    /**
     * builds RecurringOrderReference with checking for non-null required values
     * @return RecurringOrderReference
     */
    public RecurringOrderReference build() {
        Objects.requireNonNull(id, RecurringOrderReference.class + ": id is missing");
        return new RecurringOrderReferenceImpl(id, obj);
    }

    /**
     * builds RecurringOrderReference without checking for non-null required values
     * @return RecurringOrderReference
     */
    public RecurringOrderReference buildUnchecked() {
        return new RecurringOrderReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of RecurringOrderReferenceBuilder
     * @return builder
     */
    public static RecurringOrderReferenceBuilder of() {
        return new RecurringOrderReferenceBuilder();
    }

    /**
     * create builder for RecurringOrderReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderReferenceBuilder of(final RecurringOrderReference template) {
        RecurringOrderReferenceBuilder builder = new RecurringOrderReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
