
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditSetCommentActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditSetCommentAction orderEditSetCommentAction = OrderEditSetCommentAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditSetCommentActionBuilder implements Builder<OrderEditSetCommentAction> {

    @Nullable
    private String comment;

    /**
     *
     * @param comment value to be set
     * @return Builder
     */

    public OrderEditSetCommentActionBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }

    @Nullable
    public String getComment() {
        return this.comment;
    }

    /**
     * builds OrderEditSetCommentAction with checking for non-null required values
     * @return OrderEditSetCommentAction
     */
    public OrderEditSetCommentAction build() {
        return new OrderEditSetCommentActionImpl(comment);
    }

    /**
     * builds OrderEditSetCommentAction without checking for non-null required values
     * @return OrderEditSetCommentAction
     */
    public OrderEditSetCommentAction buildUnchecked() {
        return new OrderEditSetCommentActionImpl(comment);
    }

    public static OrderEditSetCommentActionBuilder of() {
        return new OrderEditSetCommentActionBuilder();
    }

    public static OrderEditSetCommentActionBuilder of(final OrderEditSetCommentAction template) {
        OrderEditSetCommentActionBuilder builder = new OrderEditSetCommentActionBuilder();
        builder.comment = template.getComment();
        return builder;
    }

}
