
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeCustomLineItemQuantityChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeCustomLineItemQuantityChange changeCustomLineItemQuantityChange = ChangeCustomLineItemQuantityChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .nextValue(1)
 *             .previousValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeCustomLineItemQuantityChangeBuilder implements Builder<ChangeCustomLineItemQuantityChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private String customLineItemId;

    private Integer nextValue;

    private Integer previousValue;

    /**
     *  <p>Update action for <code>changeCustomLineItemQuantity</code></p>
     */

    public ChangeCustomLineItemQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public ChangeCustomLineItemQuantityChangeBuilder customLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public ChangeCustomLineItemQuantityChangeBuilder customLineItem(
            final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    /**
     *
     */

    public ChangeCustomLineItemQuantityChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *
     */

    public ChangeCustomLineItemQuantityChangeBuilder nextValue(final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     */

    public ChangeCustomLineItemQuantityChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getCustomLineItem() {
        return this.customLineItem;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public Integer getNextValue() {
        return this.nextValue;
    }

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    public ChangeCustomLineItemQuantityChange build() {
        Objects.requireNonNull(change, ChangeCustomLineItemQuantityChange.class + ": change is missing");
        Objects.requireNonNull(customLineItem,
            ChangeCustomLineItemQuantityChange.class + ": customLineItem is missing");
        Objects.requireNonNull(customLineItemId,
            ChangeCustomLineItemQuantityChange.class + ": customLineItemId is missing");
        Objects.requireNonNull(nextValue, ChangeCustomLineItemQuantityChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeCustomLineItemQuantityChange.class + ": previousValue is missing");
        return new ChangeCustomLineItemQuantityChangeImpl(change, customLineItem, customLineItemId, nextValue,
            previousValue);
    }

    /**
     * builds ChangeCustomLineItemQuantityChange without checking for non null required values
     */
    public ChangeCustomLineItemQuantityChange buildUnchecked() {
        return new ChangeCustomLineItemQuantityChangeImpl(change, customLineItem, customLineItemId, nextValue,
            previousValue);
    }

    public static ChangeCustomLineItemQuantityChangeBuilder of() {
        return new ChangeCustomLineItemQuantityChangeBuilder();
    }

    public static ChangeCustomLineItemQuantityChangeBuilder of(final ChangeCustomLineItemQuantityChange template) {
        ChangeCustomLineItemQuantityChangeBuilder builder = new ChangeCustomLineItemQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.customLineItem = template.getCustomLineItem();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
