
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:StandalonePrice">StandalonePrice</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StandalonePriceResourceIdentifierImpl.class)
public interface StandalonePriceResourceIdentifier extends ResourceIdentifier {

    String STANDALONE_PRICE = "standalone-price";

    public static StandalonePriceResourceIdentifier of() {
        return new StandalonePriceResourceIdentifierImpl();
    }

    public static StandalonePriceResourceIdentifier of(final StandalonePriceResourceIdentifier template) {
        StandalonePriceResourceIdentifierImpl instance = new StandalonePriceResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static StandalonePriceResourceIdentifierBuilder builder() {
        return StandalonePriceResourceIdentifierBuilder.of();
    }

    public static StandalonePriceResourceIdentifierBuilder builder(final StandalonePriceResourceIdentifier template) {
        return StandalonePriceResourceIdentifierBuilder.of(template);
    }

    default <T> T withStandalonePriceResourceIdentifier(Function<StandalonePriceResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceResourceIdentifier>";
            }
        };
    }
}
