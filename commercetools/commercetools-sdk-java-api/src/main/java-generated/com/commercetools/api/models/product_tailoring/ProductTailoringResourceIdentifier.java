
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a ProductTailoring.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringResourceIdentifier productTailoringResourceIdentifier = ProductTailoringResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("product-tailoring")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringResourceIdentifierImpl.class)
public interface ProductTailoringResourceIdentifier extends ResourceIdentifier {

    /**
     * discriminator value for ProductTailoringResourceIdentifier
     */
    String PRODUCT_TAILORING = "product-tailoring";

    /**
     *  <p>Unique identifier of the referenced ProductTailoring. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced ProductTailoring. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced ProductTailoring. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced ProductTailoring. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ProductTailoringResourceIdentifier
     */
    public static ProductTailoringResourceIdentifier of() {
        return new ProductTailoringResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringResourceIdentifier of(final ProductTailoringResourceIdentifier template) {
        ProductTailoringResourceIdentifierImpl instance = new ProductTailoringResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public ProductTailoringResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringResourceIdentifier deepCopy(
            @Nullable final ProductTailoringResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        ProductTailoringResourceIdentifierImpl instance = new ProductTailoringResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringResourceIdentifier
     * @return builder
     */
    public static ProductTailoringResourceIdentifierBuilder builder() {
        return ProductTailoringResourceIdentifierBuilder.of();
    }

    /**
     * create builder for ProductTailoringResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringResourceIdentifierBuilder builder(final ProductTailoringResourceIdentifier template) {
        return ProductTailoringResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringResourceIdentifier(Function<ProductTailoringResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringResourceIdentifier>";
            }
        };
    }
}
