
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:KeyReference" rel="nofollow">KeyReference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreKeyReference storeKeyReference = StoreKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("store")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreKeyReferenceImpl.class)
public interface StoreKeyReference extends KeyReference {

    /**
     * discriminator value for StoreKeyReference
     */
    String STORE = "store";

    /**
     *  <p>Unique and immutable key of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique and immutable key of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of StoreKeyReference
     */
    public static StoreKeyReference of() {
        return new StoreKeyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy StoreKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreKeyReference of(final StoreKeyReference template) {
        StoreKeyReferenceImpl instance = new StoreKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public StoreKeyReference copyDeep();

    /**
     * factory method to create a deep copy of StoreKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreKeyReference deepCopy(@Nullable final StoreKeyReference template) {
        if (template == null) {
            return null;
        }
        StoreKeyReferenceImpl instance = new StoreKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for StoreKeyReference
     * @return builder
     */
    public static StoreKeyReferenceBuilder builder() {
        return StoreKeyReferenceBuilder.of();
    }

    /**
     * create builder for StoreKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreKeyReferenceBuilder builder(final StoreKeyReference template) {
        return StoreKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreKeyReference(Function<StoreKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<StoreKeyReference>";
            }
        };
    }
}
