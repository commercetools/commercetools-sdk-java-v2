
package com.commercetools.checkout.models.payment_integration;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetSortingInfoUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetSortingInfoUpdateAction setSortingInfoUpdateAction = SetSortingInfoUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetSortingInfoUpdateActionBuilder implements Builder<SetSortingInfoUpdateAction> {

    @Nullable
    private com.commercetools.checkout.models.payment_integration.SortingInfo sortingInfo;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the sortingInfo value
     * @return Builder
     */

    public SetSortingInfoUpdateActionBuilder sortingInfo(
            Function<com.commercetools.checkout.models.payment_integration.SortingInfoBuilder, com.commercetools.checkout.models.payment_integration.SortingInfoBuilder> builder) {
        this.sortingInfo = builder.apply(com.commercetools.checkout.models.payment_integration.SortingInfoBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the sortingInfo value
     * @return Builder
     */

    public SetSortingInfoUpdateActionBuilder withSortingInfo(
            Function<com.commercetools.checkout.models.payment_integration.SortingInfoBuilder, com.commercetools.checkout.models.payment_integration.SortingInfo> builder) {
        this.sortingInfo = builder.apply(com.commercetools.checkout.models.payment_integration.SortingInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param sortingInfo value to be set
     * @return Builder
     */

    public SetSortingInfoUpdateActionBuilder sortingInfo(
            @Nullable final com.commercetools.checkout.models.payment_integration.SortingInfo sortingInfo) {
        this.sortingInfo = sortingInfo;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return sortingInfo
     */

    @Nullable
    public com.commercetools.checkout.models.payment_integration.SortingInfo getSortingInfo() {
        return this.sortingInfo;
    }

    /**
     * builds SetSortingInfoUpdateAction with checking for non-null required values
     * @return SetSortingInfoUpdateAction
     */
    public SetSortingInfoUpdateAction build() {
        return new SetSortingInfoUpdateActionImpl(sortingInfo);
    }

    /**
     * builds SetSortingInfoUpdateAction without checking for non-null required values
     * @return SetSortingInfoUpdateAction
     */
    public SetSortingInfoUpdateAction buildUnchecked() {
        return new SetSortingInfoUpdateActionImpl(sortingInfo);
    }

    /**
     * factory method for an instance of SetSortingInfoUpdateActionBuilder
     * @return builder
     */
    public static SetSortingInfoUpdateActionBuilder of() {
        return new SetSortingInfoUpdateActionBuilder();
    }

    /**
     * create builder for SetSortingInfoUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetSortingInfoUpdateActionBuilder of(final SetSortingInfoUpdateAction template) {
        SetSortingInfoUpdateActionBuilder builder = new SetSortingInfoUpdateActionBuilder();
        builder.sortingInfo = template.getSortingInfo();
        return builder;
    }

}
