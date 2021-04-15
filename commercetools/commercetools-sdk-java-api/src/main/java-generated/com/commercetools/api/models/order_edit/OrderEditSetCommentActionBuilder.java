package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.models.order_edit.OrderEditSetCommentAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditSetCommentActionBuilder {

    
    @Nullable
    private String comment;

    
    public OrderEditSetCommentActionBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }

    
    @Nullable
    public String getComment(){
        return this.comment;
    }

    public OrderEditSetCommentAction build() {
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
