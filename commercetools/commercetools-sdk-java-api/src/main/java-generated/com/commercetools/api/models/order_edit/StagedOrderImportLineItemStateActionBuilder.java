
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderImportLineItemStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderImportLineItemStateAction stagedOrderImportLineItemStateAction = StagedOrderImportLineItemStateAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .plusState(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderImportLineItemStateActionBuilder implements Builder<StagedOrderImportLineItemStateAction> {

    private String lineItemId;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    /**
     *
     * @param lineItemId value to be set
     * @return Builder
     */

    public StagedOrderImportLineItemStateActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *
     * @param state value to be set
     * @return Builder
     */

    public StagedOrderImportLineItemStateActionBuilder state(
            final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    /**
     *
     * @param state value to be set
     * @return Builder
     */

    public StagedOrderImportLineItemStateActionBuilder state(
            final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }

    /**
     *
     * @param state value to be set
     * @return Builder
     */

    public StagedOrderImportLineItemStateActionBuilder plusState(
            final com.commercetools.api.models.order.ItemState... state) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.addAll(Arrays.asList(state));
        return this;
    }

    /**
     *
     * @param builder function to build the state value
     * @return Builder
     */

    public StagedOrderImportLineItemStateActionBuilder plusState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param builder function to build the state value
     * @return Builder
     */

    public StagedOrderImportLineItemStateActionBuilder withState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    /**
     * builds StagedOrderImportLineItemStateAction with checking for non-null required values
     * @return StagedOrderImportLineItemStateAction
     */
    public StagedOrderImportLineItemStateAction build() {
        Objects.requireNonNull(lineItemId, StagedOrderImportLineItemStateAction.class + ": lineItemId is missing");
        Objects.requireNonNull(state, StagedOrderImportLineItemStateAction.class + ": state is missing");
        return new StagedOrderImportLineItemStateActionImpl(lineItemId, state);
    }

    /**
     * builds StagedOrderImportLineItemStateAction without checking for non-null required values
     * @return StagedOrderImportLineItemStateAction
     */
    public StagedOrderImportLineItemStateAction buildUnchecked() {
        return new StagedOrderImportLineItemStateActionImpl(lineItemId, state);
    }

    public static StagedOrderImportLineItemStateActionBuilder of() {
        return new StagedOrderImportLineItemStateActionBuilder();
    }

    public static StagedOrderImportLineItemStateActionBuilder of(final StagedOrderImportLineItemStateAction template) {
        StagedOrderImportLineItemStateActionBuilder builder = new StagedOrderImportLineItemStateActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.state = template.getState();
        return builder;
    }

}
