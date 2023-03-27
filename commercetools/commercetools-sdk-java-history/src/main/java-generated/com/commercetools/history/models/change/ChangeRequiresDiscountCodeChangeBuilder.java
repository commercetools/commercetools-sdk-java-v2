
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeRequiresDiscountCodeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeRequiresDiscountCodeChange changeRequiresDiscountCodeChange = ChangeRequiresDiscountCodeChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeRequiresDiscountCodeChangeBuilder implements Builder<ChangeRequiresDiscountCodeChange> {

    private String change;

    private Boolean previousValue;

    private Boolean nextValue;

    /**
     *  <p>Shape of the action for <code>changeRequiresDiscountCode</code></p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeRequiresDiscountCodeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeRequiresDiscountCodeChangeBuilder previousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeRequiresDiscountCodeChangeBuilder nextValue(final Boolean nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>changeRequiresDiscountCode</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public Boolean getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public Boolean getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeRequiresDiscountCodeChange with checking for non-null required values
     * @return ChangeRequiresDiscountCodeChange
     */
    public ChangeRequiresDiscountCodeChange build() {
        Objects.requireNonNull(change, ChangeRequiresDiscountCodeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeRequiresDiscountCodeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeRequiresDiscountCodeChange.class + ": nextValue is missing");
        return new ChangeRequiresDiscountCodeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeRequiresDiscountCodeChange without checking for non-null required values
     * @return ChangeRequiresDiscountCodeChange
     */
    public ChangeRequiresDiscountCodeChange buildUnchecked() {
        return new ChangeRequiresDiscountCodeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeRequiresDiscountCodeChangeBuilder
     * @return builder
     */
    public static ChangeRequiresDiscountCodeChangeBuilder of() {
        return new ChangeRequiresDiscountCodeChangeBuilder();
    }

    /**
     * create builder for ChangeRequiresDiscountCodeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeRequiresDiscountCodeChangeBuilder of(final ChangeRequiresDiscountCodeChange template) {
        ChangeRequiresDiscountCodeChangeBuilder builder = new ChangeRequiresDiscountCodeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
