package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.models.order_edit.OrderEditSetCommentActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderEditSetCommentActionImpl.class)
public interface OrderEditSetCommentAction extends OrderEditUpdateAction {

    
    
    @JsonProperty("comment")
    public String getComment();

    public void setComment(final String comment);

    public static OrderEditSetCommentAction of(){
        return new OrderEditSetCommentActionImpl();
    }
    

    public static OrderEditSetCommentAction of(final OrderEditSetCommentAction template) {
        OrderEditSetCommentActionImpl instance = new OrderEditSetCommentActionImpl();
        instance.setComment(template.getComment());
        return instance;
    }

    public static OrderEditSetCommentActionBuilder builder(){
        return OrderEditSetCommentActionBuilder.of();
    }
    
    public static OrderEditSetCommentActionBuilder builder(final OrderEditSetCommentAction template){
        return OrderEditSetCommentActionBuilder.of(template);
    }
    

    default <T> T withOrderEditSetCommentAction(Function<OrderEditSetCommentAction, T> helper) {
        return helper.apply(this);
    }
}
