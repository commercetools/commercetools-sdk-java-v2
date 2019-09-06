package com.commercetools.models.OrderEdit;

import com.commercetools.models.OrderEdit.OrderEditUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.OrderEditSetCommentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditSetCommentActionBuilder {
   
   @Nullable
   private java.lang.String comment;
   
   public OrderEditSetCommentActionBuilder comment(@Nullable final java.lang.String comment) {
      this.comment = comment;
      return this;
   }
   
   @Nullable
   public java.lang.String getComment(){
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