
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetSearchKeywordsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetSearchKeywordsChange setSearchKeywordsChange = SetSearchKeywordsChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .catalogData("{catalogData}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetSearchKeywordsChangeBuilder implements Builder<SetSearchKeywordsChange> {

    private String change;

    private com.commercetools.history.models.common.SearchKeywords previousValue;

    private com.commercetools.history.models.common.SearchKeywords nextValue;

    private String catalogData;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetSearchKeywordsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetSearchKeywordsChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.SearchKeywordsBuilder, com.commercetools.history.models.common.SearchKeywordsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.SearchKeywordsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetSearchKeywordsChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.SearchKeywordsBuilder, com.commercetools.history.models.common.SearchKeywords> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.SearchKeywordsBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetSearchKeywordsChangeBuilder previousValue(
            final com.commercetools.history.models.common.SearchKeywords previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetSearchKeywordsChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.SearchKeywordsBuilder, com.commercetools.history.models.common.SearchKeywordsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.SearchKeywordsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetSearchKeywordsChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.SearchKeywordsBuilder, com.commercetools.history.models.common.SearchKeywords> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.SearchKeywordsBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetSearchKeywordsChangeBuilder nextValue(
            final com.commercetools.history.models.common.SearchKeywords nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @param catalogData value to be set
     * @return Builder
     */

    public SetSearchKeywordsChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
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

    public com.commercetools.history.models.common.SearchKeywords getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.SearchKeywords getNextValue() {
        return this.nextValue;
    }

    /**
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
     * builds SetSearchKeywordsChange with checking for non-null required values
     * @return SetSearchKeywordsChange
     */
    public SetSearchKeywordsChange build() {
        Objects.requireNonNull(change, SetSearchKeywordsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetSearchKeywordsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetSearchKeywordsChange.class + ": nextValue is missing");
        Objects.requireNonNull(catalogData, SetSearchKeywordsChange.class + ": catalogData is missing");
        return new SetSearchKeywordsChangeImpl(change, previousValue, nextValue, catalogData);
    }

    /**
     * builds SetSearchKeywordsChange without checking for non-null required values
     * @return SetSearchKeywordsChange
     */
    public SetSearchKeywordsChange buildUnchecked() {
        return new SetSearchKeywordsChangeImpl(change, previousValue, nextValue, catalogData);
    }

    /**
     * factory method for an instance of SetSearchKeywordsChangeBuilder
     * @return builder
     */
    public static SetSearchKeywordsChangeBuilder of() {
        return new SetSearchKeywordsChangeBuilder();
    }

    /**
     * create builder for SetSearchKeywordsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetSearchKeywordsChangeBuilder of(final SetSearchKeywordsChange template) {
        SetSearchKeywordsChangeBuilder builder = new SetSearchKeywordsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.catalogData = template.getCatalogData();
        return builder;
    }

}
