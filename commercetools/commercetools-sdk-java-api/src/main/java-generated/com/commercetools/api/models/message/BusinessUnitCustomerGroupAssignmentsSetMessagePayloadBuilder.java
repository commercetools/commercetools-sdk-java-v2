
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomerGroupAssignmentsSetMessagePayload businessUnitCustomerGroupAssignmentsSetMessagePayload = BusinessUnitCustomerGroupAssignmentsSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder
        implements Builder<BusinessUnitCustomerGroupAssignmentsSetMessagePayload> {

    @Nullable
    private java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments;

    @Nullable
    private java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> oldCustomerGroupAssignments;

    /**
     *  <p>Customer Groups assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder customerGroupAssignments(
            @Nullable final com.commercetools.api.models.customer.CustomerGroupAssignment... customerGroupAssignments) {
        this.customerGroupAssignments = new ArrayList<>(Arrays.asList(customerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder customerGroupAssignments(
            @Nullable final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments) {
        this.customerGroupAssignments = customerGroupAssignments;
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder plusCustomerGroupAssignments(
            @Nullable final com.commercetools.api.models.customer.CustomerGroupAssignment... customerGroupAssignments) {
        if (this.customerGroupAssignments == null) {
            this.customerGroupAssignments = new ArrayList<>();
        }
        this.customerGroupAssignments.addAll(Arrays.asList(customerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder plusCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder> builder) {
        if (this.customerGroupAssignments == null) {
            this.customerGroupAssignments = new ArrayList<>();
        }
        this.customerGroupAssignments
                .add(builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder withCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder> builder) {
        this.customerGroupAssignments = new ArrayList<>();
        this.customerGroupAssignments
                .add(builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder addCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignment> builder) {
        return plusCustomerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder setCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignment> builder) {
        return customerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param oldCustomerGroupAssignments value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder oldCustomerGroupAssignments(
            @Nullable final com.commercetools.api.models.customer.CustomerGroupAssignment... oldCustomerGroupAssignments) {
        this.oldCustomerGroupAssignments = new ArrayList<>(Arrays.asList(oldCustomerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param oldCustomerGroupAssignments value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder oldCustomerGroupAssignments(
            @Nullable final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> oldCustomerGroupAssignments) {
        this.oldCustomerGroupAssignments = oldCustomerGroupAssignments;
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param oldCustomerGroupAssignments value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder plusOldCustomerGroupAssignments(
            @Nullable final com.commercetools.api.models.customer.CustomerGroupAssignment... oldCustomerGroupAssignments) {
        if (this.oldCustomerGroupAssignments == null) {
            this.oldCustomerGroupAssignments = new ArrayList<>();
        }
        this.oldCustomerGroupAssignments.addAll(Arrays.asList(oldCustomerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the oldCustomerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder plusOldCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder> builder) {
        if (this.oldCustomerGroupAssignments == null) {
            this.oldCustomerGroupAssignments = new ArrayList<>();
        }
        this.oldCustomerGroupAssignments
                .add(builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the oldCustomerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder withOldCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder> builder) {
        this.oldCustomerGroupAssignments = new ArrayList<>();
        this.oldCustomerGroupAssignments
                .add(builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the oldCustomerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder addOldCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignment> builder) {
        return plusOldCustomerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the oldCustomerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder setOldCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignment> builder) {
        return oldCustomerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @return customerGroupAssignments
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> getCustomerGroupAssignments() {
        return this.customerGroupAssignments;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @return oldCustomerGroupAssignments
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> getOldCustomerGroupAssignments() {
        return this.oldCustomerGroupAssignments;
    }

    /**
     * builds BusinessUnitCustomerGroupAssignmentsSetMessagePayload with checking for non-null required values
     * @return BusinessUnitCustomerGroupAssignmentsSetMessagePayload
     */
    public BusinessUnitCustomerGroupAssignmentsSetMessagePayload build() {
        return new BusinessUnitCustomerGroupAssignmentsSetMessagePayloadImpl(customerGroupAssignments,
            oldCustomerGroupAssignments);
    }

    /**
     * builds BusinessUnitCustomerGroupAssignmentsSetMessagePayload without checking for non-null required values
     * @return BusinessUnitCustomerGroupAssignmentsSetMessagePayload
     */
    public BusinessUnitCustomerGroupAssignmentsSetMessagePayload buildUnchecked() {
        return new BusinessUnitCustomerGroupAssignmentsSetMessagePayloadImpl(customerGroupAssignments,
            oldCustomerGroupAssignments);
    }

    /**
     * factory method for an instance of BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder of() {
        return new BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitCustomerGroupAssignmentsSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder of(
            final BusinessUnitCustomerGroupAssignmentsSetMessagePayload template) {
        BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder builder = new BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder();
        builder.customerGroupAssignments = template.getCustomerGroupAssignments();
        builder.oldCustomerGroupAssignments = template.getOldCustomerGroupAssignments();
        return builder;
    }

}
