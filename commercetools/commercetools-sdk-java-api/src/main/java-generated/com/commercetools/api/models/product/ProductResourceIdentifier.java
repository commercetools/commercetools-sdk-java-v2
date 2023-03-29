
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a Product. Either <code>id</code> or <code>key</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductResourceIdentifier productResourceIdentifier = ProductResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductResourceIdentifierImpl.class)
public interface ProductResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Product> {

    /**
     * discriminator value for ProductResourceIdentifier
     */
    String PRODUCT = "product";

    /**
     *  <p>Unique identifier of the referenced Product.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced Product.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced Product.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced Product.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ProductResourceIdentifier
     */
    public static ProductResourceIdentifier of() {
        return new ProductResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy ProductResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductResourceIdentifier of(final ProductResourceIdentifier template) {
        ProductResourceIdentifierImpl instance = new ProductResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductResourceIdentifier deepCopy(@Nullable final ProductResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        ProductResourceIdentifierImpl instance = new ProductResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ProductResourceIdentifier
     * @return builder
     */
    public static ProductResourceIdentifierBuilder builder() {
        return ProductResourceIdentifierBuilder.of();
    }

    /**
     * create builder for ProductResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductResourceIdentifierBuilder builder(final ProductResourceIdentifier template) {
        return ProductResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductResourceIdentifier(Function<ProductResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ProductResourceIdentifier>";
            }
        };
    }
}
