
package com.commercetools.ml.models.image_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.ml.models.common.ProductVariant;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>An image URL and the product variants it is contained in. If no matching images are found, ResultItem is not present.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ResultItemImpl.class)
public interface ResultItem {

    /**
    *  <p>The URL of the image.</p>
    */
    @NotNull
    @JsonProperty("imageUrl")
    public String getImageUrl();

    /**
    *  <p>An array of product variants containing the image URL.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("productVariants")
    public List<ProductVariant> getProductVariants();

    public void setImageUrl(final String imageUrl);

    @JsonIgnore
    public void setProductVariants(final ProductVariant... productVariants);

    public void setProductVariants(final List<ProductVariant> productVariants);

    public static ResultItem of() {
        return new ResultItemImpl();
    }

    public static ResultItem of(final ResultItem template) {
        ResultItemImpl instance = new ResultItemImpl();
        instance.setImageUrl(template.getImageUrl());
        instance.setProductVariants(template.getProductVariants());
        return instance;
    }

    public static ResultItemBuilder builder() {
        return ResultItemBuilder.of();
    }

    public static ResultItemBuilder builder(final ResultItem template) {
        return ResultItemBuilder.of(template);
    }

    default <T> T withResultItem(Function<ResultItem, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ResultItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ResultItem>() {
            @Override
            public String toString() {
                return "TypeReference<ResultItem>";
            }
        };
    }
}
