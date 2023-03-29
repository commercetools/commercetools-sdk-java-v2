
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a ProductType.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeResourceIdentifier productTypeResourceIdentifier = ProductTypeResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeResourceIdentifierImpl.class)
public interface ProductTypeResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<ProductType> {

    /**
     * discriminator value for ProductTypeResourceIdentifier
     */
    String PRODUCT_TYPE = "product-type";

    /**
     *  <p>Unique identifier of the referenced ProductType. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced ProductType. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced ProductType. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced ProductType. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ProductTypeResourceIdentifier
     */
    public static ProductTypeResourceIdentifier of() {
        return new ProductTypeResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy ProductTypeResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeResourceIdentifier of(final ProductTypeResourceIdentifier template) {
        ProductTypeResourceIdentifierImpl instance = new ProductTypeResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTypeResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeResourceIdentifier deepCopy(@Nullable final ProductTypeResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        ProductTypeResourceIdentifierImpl instance = new ProductTypeResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ProductTypeResourceIdentifier
     * @return builder
     */
    public static ProductTypeResourceIdentifierBuilder builder() {
        return ProductTypeResourceIdentifierBuilder.of();
    }

    /**
     * create builder for ProductTypeResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeResourceIdentifierBuilder builder(final ProductTypeResourceIdentifier template) {
        return ProductTypeResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeResourceIdentifier(Function<ProductTypeResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeResourceIdentifier>";
            }
        };
    }
}
