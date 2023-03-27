
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditApplyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditApply orderEditApply = OrderEditApply.builder()
 *             .editVersion(0.3)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditApplyBuilder implements Builder<OrderEditApply> {

    private Long editVersion;

    private Long resourceVersion;

    /**
     * set the value to the editVersion
     * @param editVersion value to be set
     * @return Builder
     */

    public OrderEditApplyBuilder editVersion(final Long editVersion) {
        this.editVersion = editVersion;
        return this;
    }

    /**
     * set the value to the resourceVersion
     * @param resourceVersion value to be set
     * @return Builder
     */

    public OrderEditApplyBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     * value of editVersion}
     * @return editVersion
     */

    public Long getEditVersion() {
        return this.editVersion;
    }

    /**
     * value of resourceVersion}
     * @return resourceVersion
     */

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    /**
     * builds OrderEditApply with checking for non-null required values
     * @return OrderEditApply
     */
    public OrderEditApply build() {
        Objects.requireNonNull(editVersion, OrderEditApply.class + ": editVersion is missing");
        Objects.requireNonNull(resourceVersion, OrderEditApply.class + ": resourceVersion is missing");
        return new OrderEditApplyImpl(editVersion, resourceVersion);
    }

    /**
     * builds OrderEditApply without checking for non-null required values
     * @return OrderEditApply
     */
    public OrderEditApply buildUnchecked() {
        return new OrderEditApplyImpl(editVersion, resourceVersion);
    }

    /**
     * factory method for an instance of OrderEditApplyBuilder
     * @return builder
     */
    public static OrderEditApplyBuilder of() {
        return new OrderEditApplyBuilder();
    }

    /**
     * create builder for OrderEditApply instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditApplyBuilder of(final OrderEditApply template) {
        OrderEditApplyBuilder builder = new OrderEditApplyBuilder();
        builder.editVersion = template.getEditVersion();
        builder.resourceVersion = template.getResourceVersion();
        return builder;
    }

}
