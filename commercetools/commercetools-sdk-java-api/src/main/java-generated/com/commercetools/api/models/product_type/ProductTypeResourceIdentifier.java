
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    public void setId(final String id);

    public void setKey(final String key);

    public static ProductTypeResourceIdentifier of() {
        return new ProductTypeResourceIdentifierImpl();
    }

    public static ProductTypeResourceIdentifier of(final ProductTypeResourceIdentifier template) {
        ProductTypeResourceIdentifierImpl instance = new ProductTypeResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductTypeResourceIdentifierBuilder builder() {
        return ProductTypeResourceIdentifierBuilder.of();
    }

    public static ProductTypeResourceIdentifierBuilder builder(final ProductTypeResourceIdentifier template) {
        return ProductTypeResourceIdentifierBuilder.of(template);
    }

    default <T> T withProductTypeResourceIdentifier(Function<ProductTypeResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeResourceIdentifier>";
            }
        };
    }
}
