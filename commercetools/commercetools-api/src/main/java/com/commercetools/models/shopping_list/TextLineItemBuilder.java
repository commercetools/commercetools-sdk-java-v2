package com.commercetools.models.shopping_list;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.models.shopping_list.TextLineItem;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TextLineItemBuilder {
   
   
   private java.time.ZonedDateTime addedAt;
   
   
   private Integer quantity;
   
   @Nullable
   private com.commercetools.models.type.CustomFields custom;
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString description;
   
   
   private String id;
   
   public TextLineItemBuilder addedAt( final java.time.ZonedDateTime addedAt) {
      this.addedAt = addedAt;
      return this;
   }
   
   public TextLineItemBuilder quantity( final Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public TextLineItemBuilder custom(@Nullable final com.commercetools.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public TextLineItemBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public TextLineItemBuilder description(@Nullable final com.commercetools.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public TextLineItemBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   
   public java.time.ZonedDateTime getAddedAt(){
      return this.addedAt;
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public String getId(){
      return this.id;
   }

   public TextLineItem build() {
       return new TextLineItemImpl(addedAt, quantity, custom, name, description, id);
   }
   
   public static TextLineItemBuilder of() {
      return new TextLineItemBuilder();
   }
   
   public static TextLineItemBuilder of(final TextLineItem template) {
      TextLineItemBuilder builder = new TextLineItemBuilder();
      builder.addedAt = template.getAddedAt();
      builder.quantity = template.getQuantity();
      builder.custom = template.getCustom();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.id = template.getId();
      return builder;
   }
   
}