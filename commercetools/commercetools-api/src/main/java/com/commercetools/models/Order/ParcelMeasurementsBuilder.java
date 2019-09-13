package com.commercetools.models.order;

import java.lang.Integer;
import com.commercetools.models.order.ParcelMeasurements;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ParcelMeasurementsBuilder {
   
   @Nullable
   private java.lang.Integer weightInGram;
   
   @Nullable
   private java.lang.Integer lengthInMillimeter;
   
   @Nullable
   private java.lang.Integer heightInMillimeter;
   
   @Nullable
   private java.lang.Integer widthInMillimeter;
   
   public ParcelMeasurementsBuilder weightInGram(@Nullable final java.lang.Integer weightInGram) {
      this.weightInGram = weightInGram;
      return this;
   }
   
   public ParcelMeasurementsBuilder lengthInMillimeter(@Nullable final java.lang.Integer lengthInMillimeter) {
      this.lengthInMillimeter = lengthInMillimeter;
      return this;
   }
   
   public ParcelMeasurementsBuilder heightInMillimeter(@Nullable final java.lang.Integer heightInMillimeter) {
      this.heightInMillimeter = heightInMillimeter;
      return this;
   }
   
   public ParcelMeasurementsBuilder widthInMillimeter(@Nullable final java.lang.Integer widthInMillimeter) {
      this.widthInMillimeter = widthInMillimeter;
      return this;
   }
   
   @Nullable
   public java.lang.Integer getWeightInGram(){
      return this.weightInGram;
   }
   
   @Nullable
   public java.lang.Integer getLengthInMillimeter(){
      return this.lengthInMillimeter;
   }
   
   @Nullable
   public java.lang.Integer getHeightInMillimeter(){
      return this.heightInMillimeter;
   }
   
   @Nullable
   public java.lang.Integer getWidthInMillimeter(){
      return this.widthInMillimeter;
   }

   public ParcelMeasurements build() {
       return new ParcelMeasurementsImpl(weightInGram, lengthInMillimeter, heightInMillimeter, widthInMillimeter);
   }
   
   public static ParcelMeasurementsBuilder of() {
      return new ParcelMeasurementsBuilder();
   }
   
   public static ParcelMeasurementsBuilder of(final ParcelMeasurements template) {
      ParcelMeasurementsBuilder builder = new ParcelMeasurementsBuilder();
      builder.weightInGram = template.getWeightInGram();
      builder.lengthInMillimeter = template.getLengthInMillimeter();
      builder.heightInMillimeter = template.getHeightInMillimeter();
      builder.widthInMillimeter = template.getWidthInMillimeter();
      return builder;
   }
   
}