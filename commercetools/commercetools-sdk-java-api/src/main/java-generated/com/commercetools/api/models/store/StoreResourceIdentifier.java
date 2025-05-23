
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a Store. Either <code>id</code> or <code>key</code> is required. If both are set, an InvalidJsonInput error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreResourceIdentifier storeResourceIdentifier = StoreResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("store")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreResourceIdentifierImpl.class)
public interface StoreResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Store> {

    /**
     * discriminator value for StoreResourceIdentifier
     */
    String STORE = "store";

    /**
     *  <p>Unique ID of the referenced Store. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique key of the referenced Store. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique ID of the referenced Store. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Unique key of the referenced Store. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of StoreResourceIdentifier
     */
    public static StoreResourceIdentifier of() {
        return new StoreResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy StoreResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreResourceIdentifier of(final StoreResourceIdentifier template) {
        StoreResourceIdentifierImpl instance = new StoreResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public StoreResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of StoreResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreResourceIdentifier deepCopy(@Nullable final StoreResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        StoreResourceIdentifierImpl instance = new StoreResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for StoreResourceIdentifier
     * @return builder
     */
    public static StoreResourceIdentifierBuilder builder() {
        return StoreResourceIdentifierBuilder.of();
    }

    /**
     * create builder for StoreResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreResourceIdentifierBuilder builder(final StoreResourceIdentifier template) {
        return StoreResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreResourceIdentifier(Function<StoreResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<StoreResourceIdentifier>";
            }
        };
    }
}
