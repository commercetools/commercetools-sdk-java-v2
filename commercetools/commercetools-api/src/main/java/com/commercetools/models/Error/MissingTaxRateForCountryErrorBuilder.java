package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.String;
import com.commercetools.models.Error.MissingTaxRateForCountryError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MissingTaxRateForCountryErrorBuilder {
   
   
   private java.lang.String message;
   
   @Nullable
   private java.lang.String country;
   
   @Nullable
   private java.lang.String state;
   
   
   private java.lang.String taxCategoryId;
   
   public MissingTaxRateForCountryErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   public MissingTaxRateForCountryErrorBuilder country(@Nullable final java.lang.String country) {
      this.country = country;
      return this;
   }
   
   public MissingTaxRateForCountryErrorBuilder state(@Nullable final java.lang.String state) {
      this.state = state;
      return this;
   }
   
   public MissingTaxRateForCountryErrorBuilder taxCategoryId( final java.lang.String taxCategoryId) {
      this.taxCategoryId = taxCategoryId;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   @Nullable
   public java.lang.String getCountry(){
      return this.country;
   }
   
   @Nullable
   public java.lang.String getState(){
      return this.state;
   }
   
   
   public java.lang.String getTaxCategoryId(){
      return this.taxCategoryId;
   }

   public MissingTaxRateForCountryError build() {
       return new MissingTaxRateForCountryErrorImpl(message, country, state, taxCategoryId);
   }
   
   public static MissingTaxRateForCountryErrorBuilder of() {
      return new MissingTaxRateForCountryErrorBuilder();
   }
   
   public static MissingTaxRateForCountryErrorBuilder of(final MissingTaxRateForCountryError template) {
      MissingTaxRateForCountryErrorBuilder builder = new MissingTaxRateForCountryErrorBuilder();
      builder.message = template.getMessage();
      builder.country = template.getCountry();
      builder.state = template.getState();
      builder.taxCategoryId = template.getTaxCategoryId();
      return builder;
   }
   
}