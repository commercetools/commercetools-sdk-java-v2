
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderImportLineItemStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderImportLineItemStateAction stagedOrderImportLineItemStateAction = StagedOrderImportLineItemStateAction.builder()
 *             .plusState(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderImportLineItemStateActionBuilder implements Builder<StagedOrderImportLineItemStateAction> {

    @Nullable
    private String lineItemId;

    @Nullable
    private String lineItemKey;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public StagedOrderImportLineItemStateActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public StagedOrderImportLineItemStateActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <p>New status of the Line Items.</p>
     * @param state value to be set
     * @return Builder
     */

    public StagedOrderImportLineItemStateActionBuilder state(
            final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    /**
     *  <p>New status of the Line Items.</p>
     * @param state value to be set
     * @return Builder
     */

    public StagedOrderImportLineItemStateActionBuilder state(
            final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>New status of the Line Items.</p>
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
     *  <p>New status of the Line Items.</p>
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
     *  <p>New status of the Line Items.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public StagedOrderImportLineItemStateActionBuilder withState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>New status of the Line Items.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public StagedOrderImportLineItemStateActionBuilder addState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemState> builder) {
        return plusState(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()));
    }

    /**
     *  <p>New status of the Line Items.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public StagedOrderImportLineItemStateActionBuilder setState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemState> builder) {
        return state(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()));
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @Nullable
    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <p>New status of the Line Items.</p>
     * @return state
     */

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    /**
     * builds StagedOrderImportLineItemStateAction with checking for non-null required values
     * @return StagedOrderImportLineItemStateAction
     */
    public StagedOrderImportLineItemStateAction build() {
        Objects.requireNonNull(state, StagedOrderImportLineItemStateAction.class + ": state is missing");
        return new StagedOrderImportLineItemStateActionImpl(lineItemId, lineItemKey, state);
    }

    /**
     * builds StagedOrderImportLineItemStateAction without checking for non-null required values
     * @return StagedOrderImportLineItemStateAction
     */
    public StagedOrderImportLineItemStateAction buildUnchecked() {
        return new StagedOrderImportLineItemStateActionImpl(lineItemId, lineItemKey, state);
    }

    /**
     * factory method for an instance of StagedOrderImportLineItemStateActionBuilder
     * @return builder
     */
    public static StagedOrderImportLineItemStateActionBuilder of() {
        return new StagedOrderImportLineItemStateActionBuilder();
    }

    /**
     * create builder for StagedOrderImportLineItemStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderImportLineItemStateActionBuilder of(final StagedOrderImportLineItemStateAction template) {
        StagedOrderImportLineItemStateActionBuilder builder = new StagedOrderImportLineItemStateActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.state = template.getState();
        return builder;
    }

}
