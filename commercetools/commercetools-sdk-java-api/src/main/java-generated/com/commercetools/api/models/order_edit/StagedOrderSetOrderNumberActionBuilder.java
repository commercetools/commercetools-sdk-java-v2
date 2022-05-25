
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetOrderNumberActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetOrderNumberAction stagedOrderSetOrderNumberAction = StagedOrderSetOrderNumberAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetOrderNumberActionBuilder implements Builder<StagedOrderSetOrderNumberAction> {

    @Nullable
    private String orderNumber;

    /**
     *
     */

    public StagedOrderSetOrderNumberActionBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    @Nullable
    public String getOrderNumber() {
        return this.orderNumber;
    }

    public StagedOrderSetOrderNumberAction build() {
        return new StagedOrderSetOrderNumberActionImpl(orderNumber);
    }

    /**
     * builds StagedOrderSetOrderNumberAction without checking for non null required values
     */
    public StagedOrderSetOrderNumberAction buildUnchecked() {
        return new StagedOrderSetOrderNumberActionImpl(orderNumber);
    }

    public static StagedOrderSetOrderNumberActionBuilder of() {
        return new StagedOrderSetOrderNumberActionBuilder();
    }

    public static StagedOrderSetOrderNumberActionBuilder of(final StagedOrderSetOrderNumberAction template) {
        StagedOrderSetOrderNumberActionBuilder builder = new StagedOrderSetOrderNumberActionBuilder();
        builder.orderNumber = template.getOrderNumber();
        return builder;
    }

}
