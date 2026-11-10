
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeSavedToLineItemChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeSavedToLineItemChange changeSavedToLineItemChange = ChangeSavedToLineItemChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .attributeName("{attributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeSavedToLineItemChangeBuilder implements Builder<ChangeSavedToLineItemChange> {

    private String change;

    private Boolean previousValue;

    private Boolean nextValue;

    private String attributeName;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeSavedToLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeSavedToLineItemChangeBuilder previousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeSavedToLineItemChangeBuilder nextValue(final Boolean nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public ChangeSavedToLineItemChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
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

    public Boolean getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public Boolean getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @return attributeName
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * builds ChangeSavedToLineItemChange with checking for non-null required values
     * @return ChangeSavedToLineItemChange
     */
    public ChangeSavedToLineItemChange build() {
        Objects.requireNonNull(change, ChangeSavedToLineItemChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeSavedToLineItemChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeSavedToLineItemChange.class + ": nextValue is missing");
        Objects.requireNonNull(attributeName, ChangeSavedToLineItemChange.class + ": attributeName is missing");
        return new ChangeSavedToLineItemChangeImpl(change, previousValue, nextValue, attributeName);
    }

    /**
     * builds ChangeSavedToLineItemChange without checking for non-null required values
     * @return ChangeSavedToLineItemChange
     */
    public ChangeSavedToLineItemChange buildUnchecked() {
        return new ChangeSavedToLineItemChangeImpl(change, previousValue, nextValue, attributeName);
    }

    /**
     * factory method for an instance of ChangeSavedToLineItemChangeBuilder
     * @return builder
     */
    public static ChangeSavedToLineItemChangeBuilder of() {
        return new ChangeSavedToLineItemChangeBuilder();
    }

    /**
     * create builder for ChangeSavedToLineItemChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeSavedToLineItemChangeBuilder of(final ChangeSavedToLineItemChange template) {
        ChangeSavedToLineItemChangeBuilder builder = new ChangeSavedToLineItemChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.attributeName = template.getAttributeName();
        return builder;
    }

}
