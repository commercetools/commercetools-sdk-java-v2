
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a ProductDiscount.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountResourceIdentifier productDiscountResourceIdentifier = ProductDiscountResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountResourceIdentifierImpl.class)
public interface ProductDiscountResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<ProductDiscount> {

    String PRODUCT_DISCOUNT = "product-discount";

    /**
     <*  <p>Unique identifier of the referenced ProductDiscount. Either <code>id</code> or <code>key</code> is required.</p>>
     */

    @JsonProperty("id")
    public String getId();

    /**
     <*  <p>User-defined unique identifier of the referenced ProductDiscount. Either <code>id</code> or <code>key</code> is required.</p>>
     */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static ProductDiscountResourceIdentifier of() {
        return new ProductDiscountResourceIdentifierImpl();
    }

    public static ProductDiscountResourceIdentifier of(final ProductDiscountResourceIdentifier template) {
        ProductDiscountResourceIdentifierImpl instance = new ProductDiscountResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductDiscountResourceIdentifierBuilder builder() {
        return ProductDiscountResourceIdentifierBuilder.of();
    }

    public static ProductDiscountResourceIdentifierBuilder builder(final ProductDiscountResourceIdentifier template) {
        return ProductDiscountResourceIdentifierBuilder.of(template);
    }

    default <T> T withProductDiscountResourceIdentifier(Function<ProductDiscountResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountResourceIdentifier>";
            }
        };
    }
}
