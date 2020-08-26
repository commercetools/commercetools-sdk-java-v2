package com.commercetools.ml.models.image_search;

import com.commercetools.ml.models.image_search.ResultItem;
import com.commercetools.ml.models.image_search.ImageSearchResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImageSearchResponseBuilder {


   private Integer count;


   private Integer offset;


   private Integer total;


   private java.util.List<com.commercetools.ml.models.image_search.ResultItem> results;

   public ImageSearchResponseBuilder count( final Integer count) {
      this.count = count;
      return this;
   }

   public ImageSearchResponseBuilder offset( final Integer offset) {
      this.offset = offset;
      return this;
   }

   public ImageSearchResponseBuilder total( final Integer total) {
      this.total = total;
      return this;
   }

   public ImageSearchResponseBuilder results( final java.util.List<com.commercetools.ml.models.image_search.ResultItem> results) {
      this.results = results;
      return this;
   }


   public Integer getCount(){
      return this.count;
   }


   public Integer getOffset(){
      return this.offset;
   }


   public Integer getTotal(){
      return this.total;
   }


   public java.util.List<com.commercetools.ml.models.image_search.ResultItem> getResults(){
      return this.results;
   }

   public ImageSearchResponse build() {
       return new ImageSearchResponseImpl(count, offset, total, results);
   }

   public static ImageSearchResponseBuilder of() {
      return new ImageSearchResponseBuilder();
   }

   public static ImageSearchResponseBuilder of(final ImageSearchResponse template) {
      ImageSearchResponseBuilder builder = new ImageSearchResponseBuilder();
      builder.count = template.getCount();
      builder.offset = template.getOffset();
      builder.total = template.getTotal();
      builder.results = template.getResults();
      return builder;
   }

}
