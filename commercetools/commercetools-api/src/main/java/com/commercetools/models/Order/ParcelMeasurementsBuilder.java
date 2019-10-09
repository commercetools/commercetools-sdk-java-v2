package com.commercetools.models.order;


import com.commercetools.models.order.ParcelMeasurements;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ParcelMeasurementsBuilder {
   
   @Nullable
   private Integer weightInGram;
   
   @Nullable
   private Integer lengthInMillimeter;
   
   @Nullable
   private Integer heightInMillimeter;
   
   @Nullable
   private Integer widthInMillimeter;
   
   public ParcelMeasurementsBuilder weightInGram(@Nullable final Integer weightInGram) {
      this.weightInGram = weightInGram;
      return this;
   }
   
   public ParcelMeasurementsBuilder lengthInMillimeter(@Nullable final Integer lengthInMillimeter) {
      this.lengthInMillimeter = lengthInMillimeter;
      return this;
   }
   
   public ParcelMeasurementsBuilder heightInMillimeter(@Nullable final Integer heightInMillimeter) {
      this.heightInMillimeter = heightInMillimeter;
      return this;
   }
   
   public ParcelMeasurementsBuilder widthInMillimeter(@Nullable final Integer widthInMillimeter) {
      this.widthInMillimeter = widthInMillimeter;
      return this;
   }
   
   @Nullable
   public Integer getWeightInGram(){
      return this.weightInGram;
   }
   
   @Nullable
   public Integer getLengthInMillimeter(){
      return this.lengthInMillimeter;
   }
   
   @Nullable
   public Integer getHeightInMillimeter(){
      return this.heightInMillimeter;
   }
   
   @Nullable
   public Integer getWidthInMillimeter(){
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