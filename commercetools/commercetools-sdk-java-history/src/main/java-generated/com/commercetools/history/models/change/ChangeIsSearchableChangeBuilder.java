
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeIsSearchableChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeIsSearchableChange changeIsSearchableChange = ChangeIsSearchableChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .attributeName("{attributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeIsSearchableChangeBuilder implements Builder<ChangeIsSearchableChange> {

    private String change;

    private Boolean previousValue;

    private Boolean nextValue;

    private String attributeName;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeIsSearchableChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeIsSearchableChangeBuilder previousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeIsSearchableChangeBuilder nextValue(final Boolean nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public ChangeIsSearchableChangeBuilder attributeName(final String attributeName) {
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
     * builds ChangeIsSearchableChange with checking for non-null required values
     * @return ChangeIsSearchableChange
     */
    public ChangeIsSearchableChange build() {
        Objects.requireNonNull(change, ChangeIsSearchableChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeIsSearchableChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeIsSearchableChange.class + ": nextValue is missing");
        Objects.requireNonNull(attributeName, ChangeIsSearchableChange.class + ": attributeName is missing");
        return new ChangeIsSearchableChangeImpl(change, previousValue, nextValue, attributeName);
    }

    /**
     * builds ChangeIsSearchableChange without checking for non-null required values
     * @return ChangeIsSearchableChange
     */
    public ChangeIsSearchableChange buildUnchecked() {
        return new ChangeIsSearchableChangeImpl(change, previousValue, nextValue, attributeName);
    }

    /**
     * factory method for an instance of ChangeIsSearchableChangeBuilder
     * @return builder
     */
    public static ChangeIsSearchableChangeBuilder of() {
        return new ChangeIsSearchableChangeBuilder();
    }

    /**
     * create builder for ChangeIsSearchableChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeIsSearchableChangeBuilder of(final ChangeIsSearchableChange template) {
        ChangeIsSearchableChangeBuilder builder = new ChangeIsSearchableChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.attributeName = template.getAttributeName();
        return builder;
    }

}
