
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to a Store.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreReference storeReference = StoreReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreReferenceImpl.class)
public interface StoreReference extends Reference, com.commercetools.api.models.Identifiable<Store> {

    /**
     * discriminator value for StoreReference
     */
    String STORE = "store";

    /**
     *  <p>Contains the representation of the expanded Store. Only present in responses to requests with Reference Expansion for Stores.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public Store getObj();

    /**
     *  <p>Unique ID of the referenced Store.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded Store. Only present in responses to requests with Reference Expansion for Stores.</p>
     * @param obj value to be set
     */

    public void setObj(final Store obj);

    /**
     *  <p>Unique ID of the referenced Store.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of StoreReference
     */
    public static StoreReference of() {
        return new StoreReferenceImpl();
    }

    /**
     * factory method to create a shallow copy StoreReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreReference of(final StoreReference template) {
        StoreReferenceImpl instance = new StoreReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    /**
     * factory method to create a deep copy of StoreReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreReference deepCopy(@Nullable final StoreReference template) {
        if (template == null) {
            return null;
        }
        StoreReferenceImpl instance = new StoreReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(Optional.ofNullable(template.getObj())
                .map(com.commercetools.api.models.store.Store::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StoreReference
     * @return builder
     */
    public static StoreReferenceBuilder builder() {
        return StoreReferenceBuilder.of();
    }

    /**
     * create builder for StoreReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreReferenceBuilder builder(final StoreReference template) {
        return StoreReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreReference(Function<StoreReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreReference>() {
            @Override
            public String toString() {
                return "TypeReference<StoreReference>";
            }
        };
    }
}
