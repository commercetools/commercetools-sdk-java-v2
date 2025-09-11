
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderImportCustomLineItemStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderImportCustomLineItemStateAction stagedOrderImportCustomLineItemStateAction = StagedOrderImportCustomLineItemStateAction.builder()
 *             .plusState(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderImportCustomLineItemStateActionBuilder
        implements Builder<StagedOrderImportCustomLineItemStateAction> {

    @Nullable
    private String customLineItemId;

    @Nullable
    private String customLineItemKey;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public StagedOrderImportCustomLineItemStateActionBuilder customLineItemId(@Nullable final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     * @return Builder
     */

    public StagedOrderImportCustomLineItemStateActionBuilder customLineItemKey(
            @Nullable final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
        return this;
    }

    /**
     *  <p>New status of the Custom Line Items.</p>
     * @param state value to be set
     * @return Builder
     */

    public StagedOrderImportCustomLineItemStateActionBuilder state(
            final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    /**
     *  <p>New status of the Custom Line Items.</p>
     * @param state value to be set
     * @return Builder
     */

    public StagedOrderImportCustomLineItemStateActionBuilder state(
            final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>New status of the Custom Line Items.</p>
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
     *  <p>New status of the Custom Line Items.</p>
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
     *  <p>New status of the Custom Line Items.</p>
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
     *  <p>New status of the Custom Line Items.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public StagedOrderImportCustomLineItemStateActionBuilder addState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemState> builder) {
        return plusState(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()));
    }

    /**
     *  <p>New status of the Custom Line Items.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public StagedOrderImportCustomLineItemStateActionBuilder setState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemState> builder) {
        return state(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()));
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @Nullable
    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemKey
     */

    @Nullable
    public String getCustomLineItemKey() {
        return this.customLineItemKey;
    }

    /**
     *  <p>New status of the Custom Line Items.</p>
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
        Objects.requireNonNull(state, StagedOrderImportCustomLineItemStateAction.class + ": state is missing");
        return new StagedOrderImportCustomLineItemStateActionImpl(customLineItemId, customLineItemKey, state);
    }

    /**
     * builds StagedOrderImportCustomLineItemStateAction without checking for non-null required values
     * @return StagedOrderImportCustomLineItemStateAction
     */
    public StagedOrderImportCustomLineItemStateAction buildUnchecked() {
        return new StagedOrderImportCustomLineItemStateActionImpl(customLineItemId, customLineItemKey, state);
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
        builder.customLineItemKey = template.getCustomLineItemKey();
        builder.state = template.getState();
        return builder;
    }

}
