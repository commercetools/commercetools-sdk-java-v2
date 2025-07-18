
package com.commercetools.api.models.discount_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a DiscountGroup. Either <code>id</code> or <code>key</code> is required. If both are set, an InvalidJsonInput error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupResourceIdentifier discountGroupResourceIdentifier = DiscountGroupResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("discount-group")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupResourceIdentifierImpl.class)
public interface DiscountGroupResourceIdentifier extends ResourceIdentifier {

    /**
     * discriminator value for DiscountGroupResourceIdentifier
     */
    String DISCOUNT_GROUP = "discount-group";

    /**
     *  <p>Unique identifier of the referenced DiscountGroup. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced DiscountGroup. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced DiscountGroup. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced DiscountGroup. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of DiscountGroupResourceIdentifier
     */
    public static DiscountGroupResourceIdentifier of() {
        return new DiscountGroupResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroupResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroupResourceIdentifier of(final DiscountGroupResourceIdentifier template) {
        DiscountGroupResourceIdentifierImpl instance = new DiscountGroupResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public DiscountGroupResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupResourceIdentifier deepCopy(@Nullable final DiscountGroupResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        DiscountGroupResourceIdentifierImpl instance = new DiscountGroupResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for DiscountGroupResourceIdentifier
     * @return builder
     */
    public static DiscountGroupResourceIdentifierBuilder builder() {
        return DiscountGroupResourceIdentifierBuilder.of();
    }

    /**
     * create builder for DiscountGroupResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupResourceIdentifierBuilder builder(final DiscountGroupResourceIdentifier template) {
        return DiscountGroupResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupResourceIdentifier(Function<DiscountGroupResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupResourceIdentifier>";
            }
        };
    }
}
