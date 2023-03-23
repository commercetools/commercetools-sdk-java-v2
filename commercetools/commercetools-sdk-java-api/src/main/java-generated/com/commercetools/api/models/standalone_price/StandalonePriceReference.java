
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to a StandalonePrice.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceReference standalonePriceReference = StandalonePriceReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceReferenceImpl.class)
public interface StandalonePriceReference extends Reference {

    String STANDALONE_PRICE = "standalone-price";

    /**
     *  <p>Contains the representation of the expanded StandalonePrice. Only present in responses to requests with Reference Expansion for StandalonePrice.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public StandalonePrice getObj();

    public void setObj(final StandalonePrice obj);

    public static StandalonePriceReference of() {
        return new StandalonePriceReferenceImpl();
    }

    public static StandalonePriceReference of(final StandalonePriceReference template) {
        StandalonePriceReferenceImpl instance = new StandalonePriceReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static StandalonePriceReferenceBuilder builder() {
        return StandalonePriceReferenceBuilder.of();
    }

    public static StandalonePriceReferenceBuilder builder(final StandalonePriceReference template) {
        return StandalonePriceReferenceBuilder.of(template);
    }

    default <T> T withStandalonePriceReference(Function<StandalonePriceReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceReference>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceReference>";
            }
        };
    }
}
