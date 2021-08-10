
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditSetCommentActionBuilder implements Builder<OrderEditSetCommentAction> {

    @Nullable
    private String comment;

    public OrderEditSetCommentActionBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }

    @Nullable
    public String getComment() {
        return this.comment;
    }

    public OrderEditSetCommentAction build() {
        return new OrderEditSetCommentActionImpl(comment);
    }

    /**
     * builds OrderEditSetCommentAction without checking for non null required values
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
