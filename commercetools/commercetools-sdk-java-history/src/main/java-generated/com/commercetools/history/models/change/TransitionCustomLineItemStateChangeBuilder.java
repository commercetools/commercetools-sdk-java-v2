
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransitionCustomLineItemStateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransitionCustomLineItemStateChange transitionCustomLineItemStateChange = TransitionCustomLineItemStateChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .lineItemId("{lineItemId}")
 *             .stateId("{stateId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransitionCustomLineItemStateChangeBuilder implements Builder<TransitionCustomLineItemStateChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.ItemState> previousValue;

    private java.util.List<com.commercetools.history.models.common.ItemState> nextValue;

    private String lineItemId;

    private String stateId;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public TransitionCustomLineItemStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public TransitionCustomLineItemStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.ItemState... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public TransitionCustomLineItemStateChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.ItemState> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public TransitionCustomLineItemStateChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.ItemState... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public TransitionCustomLineItemStateChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemStateBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public TransitionCustomLineItemStateChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemStateBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public TransitionCustomLineItemStateChangeBuilder addPreviousValue(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemState> builder) {
        return plusPreviousValue(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public TransitionCustomLineItemStateChangeBuilder setPreviousValue(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemState> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public TransitionCustomLineItemStateChangeBuilder nextValue(
            final com.commercetools.history.models.common.ItemState... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public TransitionCustomLineItemStateChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.ItemState> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public TransitionCustomLineItemStateChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.ItemState... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public TransitionCustomLineItemStateChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemStateBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public TransitionCustomLineItemStateChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemStateBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public TransitionCustomLineItemStateChangeBuilder addNextValue(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemState> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public TransitionCustomLineItemStateChangeBuilder setNextValue(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemState> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()));
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public TransitionCustomLineItemStateChangeBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> involved in the transition.</p>
     * @param stateId value to be set
     * @return Builder
     */

    public TransitionCustomLineItemStateChangeBuilder stateId(final String stateId) {
        this.stateId = stateId;
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public java.util.List<com.commercetools.history.models.common.ItemState> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.ItemState> getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> involved in the transition.</p>
     * @return stateId
     */

    public String getStateId() {
        return this.stateId;
    }

    /**
     * builds TransitionCustomLineItemStateChange with checking for non-null required values
     * @return TransitionCustomLineItemStateChange
     */
    public TransitionCustomLineItemStateChange build() {
        Objects.requireNonNull(change, TransitionCustomLineItemStateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, TransitionCustomLineItemStateChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, TransitionCustomLineItemStateChange.class + ": nextValue is missing");
        Objects.requireNonNull(lineItemId, TransitionCustomLineItemStateChange.class + ": lineItemId is missing");
        Objects.requireNonNull(stateId, TransitionCustomLineItemStateChange.class + ": stateId is missing");
        return new TransitionCustomLineItemStateChangeImpl(change, previousValue, nextValue, lineItemId, stateId);
    }

    /**
     * builds TransitionCustomLineItemStateChange without checking for non-null required values
     * @return TransitionCustomLineItemStateChange
     */
    public TransitionCustomLineItemStateChange buildUnchecked() {
        return new TransitionCustomLineItemStateChangeImpl(change, previousValue, nextValue, lineItemId, stateId);
    }

    /**
     * factory method for an instance of TransitionCustomLineItemStateChangeBuilder
     * @return builder
     */
    public static TransitionCustomLineItemStateChangeBuilder of() {
        return new TransitionCustomLineItemStateChangeBuilder();
    }

    /**
     * create builder for TransitionCustomLineItemStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransitionCustomLineItemStateChangeBuilder of(final TransitionCustomLineItemStateChange template) {
        TransitionCustomLineItemStateChangeBuilder builder = new TransitionCustomLineItemStateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.lineItemId = template.getLineItemId();
        builder.stateId = template.getStateId();
        return builder;
    }

}
