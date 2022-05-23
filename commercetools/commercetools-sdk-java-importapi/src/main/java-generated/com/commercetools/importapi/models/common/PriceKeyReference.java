
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 <p>References a price by key.</p>

 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   PriceKeyReference priceKeyReference = PriceKeyReference.builder()
           .key("{key}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PriceKeyReferenceImpl.class)
public interface PriceKeyReference extends KeyReference {

    String PRICE = "price";

    public static PriceKeyReference of() {
        return new PriceKeyReferenceImpl();
    }

    public static PriceKeyReference of(final PriceKeyReference template) {
        PriceKeyReferenceImpl instance = new PriceKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static PriceKeyReferenceBuilder builder() {
        return PriceKeyReferenceBuilder.of();
    }

    public static PriceKeyReferenceBuilder builder(final PriceKeyReference template) {
        return PriceKeyReferenceBuilder.of(template);
    }

    default <T> T withPriceKeyReference(Function<PriceKeyReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PriceKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PriceKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<PriceKeyReference>";
            }
        };
    }
}
