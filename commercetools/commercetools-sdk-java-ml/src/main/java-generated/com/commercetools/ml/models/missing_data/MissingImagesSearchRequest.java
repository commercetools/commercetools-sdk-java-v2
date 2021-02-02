
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MissingImagesSearchRequestImpl.class)
public interface MissingImagesSearchRequest {

    @JsonProperty("limit")
    public Long getLimit();

    @JsonProperty("offset")
    public Long getOffset();

    /**
    *  <p>If true, searches data from staged products in addition to published products.</p>
    */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
    *  <p>Maximum number of products to scan.</p>
    */

    @JsonProperty("productSetLimit")
    public Long getProductSetLimit();

    /**
    *  <p>If true, searches all product variants. If false, only searches master variants.</p>
    */

    @JsonProperty("includeVariants")
    public Boolean getIncludeVariants();

    /**
    *  <p>If true, uses the median number of images per product variant as a threshold value.</p>
    */

    @JsonProperty("autoThreshold")
    public Boolean getAutoThreshold();

    /**
    *  <p>The minimum number of images a product variant must have. Anything below this value is considered a product variant with missing images.</p>
    */

    @JsonProperty("threshold")
    public Long getThreshold();

    /**
    *  <p>Filters results by the provided Product IDs. Cannot be applied in combination with any other filter.</p>
    */

    @JsonProperty("productIds")
    public List<String> getProductIds();

    /**
    *  <p>Filters results by the provided product type IDs. It cannot be applied in combination with any other filter.</p>
    */

    @JsonProperty("productTypeIds")
    public List<String> getProductTypeIds();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setStaged(final Boolean staged);

    public void setProductSetLimit(final Long productSetLimit);

    public void setIncludeVariants(final Boolean includeVariants);

    public void setAutoThreshold(final Boolean autoThreshold);

    public void setThreshold(final Long threshold);

    @JsonIgnore
    public void setProductIds(final String... productIds);

    public void setProductIds(final List<String> productIds);

    @JsonIgnore
    public void setProductTypeIds(final String... productTypeIds);

    public void setProductTypeIds(final List<String> productTypeIds);

    public static MissingImagesSearchRequest of() {
        return new MissingImagesSearchRequestImpl();
    }

    public static MissingImagesSearchRequest of(final MissingImagesSearchRequest template) {
        MissingImagesSearchRequestImpl instance = new MissingImagesSearchRequestImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setStaged(template.getStaged());
        instance.setProductSetLimit(template.getProductSetLimit());
        instance.setIncludeVariants(template.getIncludeVariants());
        instance.setAutoThreshold(template.getAutoThreshold());
        instance.setThreshold(template.getThreshold());
        instance.setProductIds(template.getProductIds());
        instance.setProductTypeIds(template.getProductTypeIds());
        return instance;
    }

    public static MissingImagesSearchRequestBuilder builder() {
        return MissingImagesSearchRequestBuilder.of();
    }

    public static MissingImagesSearchRequestBuilder builder(final MissingImagesSearchRequest template) {
        return MissingImagesSearchRequestBuilder.of(template);
    }

    default <T> T withMissingImagesSearchRequest(Function<MissingImagesSearchRequest, T> helper) {
        return helper.apply(this);
    }
}
