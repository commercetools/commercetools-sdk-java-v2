
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderImportCustomLineItemStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderImportCustomLineItemStateAction stagedOrderImportCustomLineItemStateAction = StagedOrderImportCustomLineItemStateAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .plusState(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderImportCustomLineItemStateActionBuilder
        implements Builder<StagedOrderImportCustomLineItemStateAction> {

    private String customLineItemId;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    /**
     * set the value to the customLineItemId
     * @param customLineItemId value to be set
     * @return Builder
     */

    public StagedOrderImportCustomLineItemStateActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     * set values to the state
     * @param state value to be set
     * @return Builder
     */

    public StagedOrderImportCustomLineItemStateActionBuilder state(
            final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    /**
     * set value to the state
     * @param state value to be set
     * @return Builder
     */

    public StagedOrderImportCustomLineItemStateActionBuilder state(
            final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }

    /**
     * add values to the state
     * @param state value to be set
     * @return Builder
     */

    public StagedOrderImportCustomLineItemStateActionBuilder plusState(
            final com.commercetools.api.models.order.ItemState... state) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.addAll(Arrays.asList(state));
        return this;
    }

    /**
     * add the value to the state using the builder function
     * @param builder function to build the state value
     * @return Builder
     */

    public StagedOrderImportCustomLineItemStateActionBuilder plusState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the state using the builder function
     * @param builder function to build the state value
     * @return Builder
     */

    public StagedOrderImportCustomLineItemStateActionBuilder withState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     * value of customLineItemId}
     * @return customLineItemId
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     * value of state}
     * @return state
     */

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    /**
     * builds StagedOrderImportCustomLineItemStateAction with checking for non-null required values
     * @return StagedOrderImportCustomLineItemStateAction
     */
    public StagedOrderImportCustomLineItemStateAction build() {
        Objects.requireNonNull(customLineItemId,
            StagedOrderImportCustomLineItemStateAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(state, StagedOrderImportCustomLineItemStateAction.class + ": state is missing");
        return new StagedOrderImportCustomLineItemStateActionImpl(customLineItemId, state);
    }

    /**
     * builds StagedOrderImportCustomLineItemStateAction without checking for non-null required values
     * @return StagedOrderImportCustomLineItemStateAction
     */
    public StagedOrderImportCustomLineItemStateAction buildUnchecked() {
        return new StagedOrderImportCustomLineItemStateActionImpl(customLineItemId, state);
    }

    /**
     * factory method for an instance of StagedOrderImportCustomLineItemStateActionBuilder
     * @return builder
     */
    public static StagedOrderImportCustomLineItemStateActionBuilder of() {
        return new StagedOrderImportCustomLineItemStateActionBuilder();
    }

    /**
     * create builder for StagedOrderImportCustomLineItemStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderImportCustomLineItemStateActionBuilder of(
            final StagedOrderImportCustomLineItemStateAction template) {
        StagedOrderImportCustomLineItemStateActionBuilder builder = new StagedOrderImportCustomLineItemStateActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.state = template.getState();
        return builder;
    }

}
