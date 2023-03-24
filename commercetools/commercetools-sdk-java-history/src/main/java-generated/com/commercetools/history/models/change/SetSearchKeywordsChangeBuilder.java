
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
 *             .catalogData("{catalogData}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetSearchKeywordsChangeBuilder implements Builder<SetSearchKeywordsChange> {

    private String change;

    private String catalogData;

    private com.commercetools.history.models.common.SearchKeywords previousValue;

    private com.commercetools.history.models.common.SearchKeywords nextValue;

    /**
     *  <p>Update action for <code>setSearchKeywords</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetSearchKeywordsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param catalogData value to be set
     * @return Builder
     */

    public SetSearchKeywordsChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     *
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetSearchKeywordsChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.SearchKeywordsBuilder, com.commercetools.history.models.common.SearchKeywordsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.SearchKeywordsBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public SetSearchKeywordsChangeBuilder previousValue(
            final com.commercetools.history.models.common.SearchKeywords previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetSearchKeywordsChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.SearchKeywordsBuilder, com.commercetools.history.models.common.SearchKeywordsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.SearchKeywordsBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public SetSearchKeywordsChangeBuilder nextValue(
            final com.commercetools.history.models.common.SearchKeywords nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public com.commercetools.history.models.common.SearchKeywords getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.SearchKeywords getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetSearchKeywordsChange with checking for non-null required values
     * @return SetSearchKeywordsChange
     */
    public SetSearchKeywordsChange build() {
        Objects.requireNonNull(change, SetSearchKeywordsChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetSearchKeywordsChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, SetSearchKeywordsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetSearchKeywordsChange.class + ": nextValue is missing");
        return new SetSearchKeywordsChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * builds SetSearchKeywordsChange without checking for non-null required values
     * @return SetSearchKeywordsChange
     */
    public SetSearchKeywordsChange buildUnchecked() {
        return new SetSearchKeywordsChangeImpl(change, catalogData, previousValue, nextValue);
    }

    public static SetSearchKeywordsChangeBuilder of() {
        return new SetSearchKeywordsChangeBuilder();
    }

    public static SetSearchKeywordsChangeBuilder of(final SetSearchKeywordsChange template) {
        SetSearchKeywordsChangeBuilder builder = new SetSearchKeywordsChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
