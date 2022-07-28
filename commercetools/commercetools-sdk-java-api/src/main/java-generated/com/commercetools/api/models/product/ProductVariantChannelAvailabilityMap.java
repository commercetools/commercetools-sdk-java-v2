
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>JSON object where the key is a supply Channel <code>id</code> and the value is the ProductVariantChannelAvailability of the InventoryEntry.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantChannelAvailabilityMap productVariantChannelAvailabilityMap = ProductVariantChannelAvailabilityMap.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantChannelAvailabilityMapImpl.class)
public interface ProductVariantChannelAvailabilityMap {

    public static ProductVariantChannelAvailabilityMap of() {
        return new ProductVariantChannelAvailabilityMapImpl();
    }

    public static ProductVariantChannelAvailabilityMap of(final ProductVariantChannelAvailabilityMap template) {
        ProductVariantChannelAvailabilityMapImpl instance = new ProductVariantChannelAvailabilityMapImpl();
        return instance;
    }

    public static ProductVariantChannelAvailabilityMapBuilder builder() {
        return ProductVariantChannelAvailabilityMapBuilder.of();
    }

    public static ProductVariantChannelAvailabilityMapBuilder builder(
            final ProductVariantChannelAvailabilityMap template) {
        return ProductVariantChannelAvailabilityMapBuilder.of(template);
    }

    default <T> T withProductVariantChannelAvailabilityMap(Function<ProductVariantChannelAvailabilityMap, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantChannelAvailabilityMap> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantChannelAvailabilityMap>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantChannelAvailabilityMap>";
            }
        };
    }
}
