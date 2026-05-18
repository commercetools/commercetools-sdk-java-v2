
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetProductAttributeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetProductAttributeChange setProductAttributeChange = SetProductAttributeChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetProductAttributeChangeBuilder implements Builder<SetProductAttributeChange> {

    private String change;

    private String catalogData;

    private com.commercetools.history.models.common.Attribute previousValue;

    private com.commercetools.history.models.common.Attribute nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetProductAttributeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Product data that was updated.</p>
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @param catalogData value to be set
     * @return Builder
     */

    public SetProductAttributeChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetProductAttributeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AttributeBuilder, com.commercetools.history.models.common.AttributeBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AttributeBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetProductAttributeChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.AttributeBuilder, com.commercetools.history.models.common.Attribute> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AttributeBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetProductAttributeChangeBuilder previousValue(
            final com.commercetools.history.models.common.Attribute previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetProductAttributeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AttributeBuilder, com.commercetools.history.models.common.AttributeBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AttributeBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetProductAttributeChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.AttributeBuilder, com.commercetools.history.models.common.Attribute> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AttributeBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetProductAttributeChangeBuilder nextValue(
            final com.commercetools.history.models.common.Attribute nextValue) {
        this.nextValue = nextValue;
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
     *  <p>Product data that was updated.</p>
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @return catalogData
     */

    public String getCatalogData() {
        return this.catalogData;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.Attribute getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Attribute getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetProductAttributeChange with checking for non-null required values
     * @return SetProductAttributeChange
     */
    public SetProductAttributeChange build() {
        Objects.requireNonNull(change, SetProductAttributeChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetProductAttributeChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, SetProductAttributeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetProductAttributeChange.class + ": nextValue is missing");
        return new SetProductAttributeChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * builds SetProductAttributeChange without checking for non-null required values
     * @return SetProductAttributeChange
     */
    public SetProductAttributeChange buildUnchecked() {
        return new SetProductAttributeChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetProductAttributeChangeBuilder
     * @return builder
     */
    public static SetProductAttributeChangeBuilder of() {
        return new SetProductAttributeChangeBuilder();
    }

    /**
     * create builder for SetProductAttributeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetProductAttributeChangeBuilder of(final SetProductAttributeChange template) {
        SetProductAttributeChangeBuilder builder = new SetProductAttributeChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
