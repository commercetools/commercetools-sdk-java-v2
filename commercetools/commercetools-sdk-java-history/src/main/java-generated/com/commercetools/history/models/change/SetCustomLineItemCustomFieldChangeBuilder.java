
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomLineItemCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomLineItemCustomFieldChange setCustomLineItemCustomFieldChange = SetCustomLineItemCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomLineItemCustomFieldChangeBuilder implements Builder<SetCustomLineItemCustomFieldChange> {

    private String change;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    private String name;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private String customLineItemId;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetCustomLineItemCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCustomLineItemCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCustomLineItemCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetCustomLineItemCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param builder function to build the customLineItem value
     * @return Builder
     */

    public SetCustomLineItemCustomFieldChangeBuilder customLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param builder function to build the customLineItem value
     * @return Builder
     */

    public SetCustomLineItemCustomFieldChangeBuilder withCustomLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItem value to be set
     * @return Builder
     */

    public SetCustomLineItemCustomFieldChangeBuilder customLineItem(
            final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public SetCustomLineItemCustomFieldChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
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

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @return customLineItem
     */

    public com.commercetools.history.models.common.LocalizedString getCustomLineItem() {
        return this.customLineItem;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @return customLineItemId
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     * builds SetCustomLineItemCustomFieldChange with checking for non-null required values
     * @return SetCustomLineItemCustomFieldChange
     */
    public SetCustomLineItemCustomFieldChange build() {
        Objects.requireNonNull(change, SetCustomLineItemCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetCustomLineItemCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCustomLineItemCustomFieldChange.class + ": nextValue is missing");
        Objects.requireNonNull(name, SetCustomLineItemCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customLineItem,
            SetCustomLineItemCustomFieldChange.class + ": customLineItem is missing");
        Objects.requireNonNull(customLineItemId,
            SetCustomLineItemCustomFieldChange.class + ": customLineItemId is missing");
        return new SetCustomLineItemCustomFieldChangeImpl(change, previousValue, nextValue, name, customLineItem,
            customLineItemId);
    }

    /**
     * builds SetCustomLineItemCustomFieldChange without checking for non-null required values
     * @return SetCustomLineItemCustomFieldChange
     */
    public SetCustomLineItemCustomFieldChange buildUnchecked() {
        return new SetCustomLineItemCustomFieldChangeImpl(change, previousValue, nextValue, name, customLineItem,
            customLineItemId);
    }

    /**
     * factory method for an instance of SetCustomLineItemCustomFieldChangeBuilder
     * @return builder
     */
    public static SetCustomLineItemCustomFieldChangeBuilder of() {
        return new SetCustomLineItemCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetCustomLineItemCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomLineItemCustomFieldChangeBuilder of(final SetCustomLineItemCustomFieldChange template) {
        SetCustomLineItemCustomFieldChangeBuilder builder = new SetCustomLineItemCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.name = template.getName();
        builder.customLineItem = template.getCustomLineItem();
        builder.customLineItemId = template.getCustomLineItemId();
        return builder;
    }

}
