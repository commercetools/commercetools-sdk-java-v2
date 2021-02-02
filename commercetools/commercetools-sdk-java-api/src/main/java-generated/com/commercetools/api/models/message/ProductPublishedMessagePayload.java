
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ProductPublishScope;
import com.commercetools.api.models.product.ProductProjection;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductPublishedMessagePayloadImpl.class)
public interface ProductPublishedMessagePayload extends MessagePayload {

    String PRODUCT_PUBLISHED = "ProductPublished";

    @NotNull
    @JsonProperty("removedImageUrls")
    public List<String> getRemovedImageUrls();

    @NotNull
    @Valid
    @JsonProperty("productProjection")
    public ProductProjection getProductProjection();

    @NotNull
    @JsonProperty("scope")
    public ProductPublishScope getScope();

    @JsonIgnore
    public void setRemovedImageUrls(final String... removedImageUrls);

    public void setRemovedImageUrls(final List<String> removedImageUrls);

    public void setProductProjection(final ProductProjection productProjection);

    public void setScope(final ProductPublishScope scope);

    public static ProductPublishedMessagePayload of() {
        return new ProductPublishedMessagePayloadImpl();
    }

    public static ProductPublishedMessagePayload of(final ProductPublishedMessagePayload template) {
        ProductPublishedMessagePayloadImpl instance = new ProductPublishedMessagePayloadImpl();
        instance.setRemovedImageUrls(template.getRemovedImageUrls());
        instance.setProductProjection(template.getProductProjection());
        instance.setScope(template.getScope());
        return instance;
    }

    public static ProductPublishedMessagePayloadBuilder builder() {
        return ProductPublishedMessagePayloadBuilder.of();
    }

    public static ProductPublishedMessagePayloadBuilder builder(final ProductPublishedMessagePayload template) {
        return ProductPublishedMessagePayloadBuilder.of(template);
    }

    default <T> T withProductPublishedMessagePayload(Function<ProductPublishedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
