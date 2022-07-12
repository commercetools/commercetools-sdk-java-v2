
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.KeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to a Store by its key.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreKeyReferenceImpl.class)
public interface StoreKeyReference extends KeyReference {

    String STORE = "store";

    /**
     *  <p>Unique and immutable key of the referenced Store.</p>
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static StoreKeyReference of() {
        return new StoreKeyReferenceImpl();
    }

    public static StoreKeyReference of(final StoreKeyReference template) {
        StoreKeyReferenceImpl instance = new StoreKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static StoreKeyReferenceBuilder builder() {
        return StoreKeyReferenceBuilder.of();
    }

    public static StoreKeyReferenceBuilder builder(final StoreKeyReference template) {
        return StoreKeyReferenceBuilder.of(template);
    }

    default <T> T withStoreKeyReference(Function<StoreKeyReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<StoreKeyReference>";
            }
        };
    }
}
