
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets the key on a Standalone Price. Produces the StandalonePriceKeySet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetKeyAction standalonePriceSetKeyAction = StandalonePriceSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceSetKeyActionImpl.class)
public interface StandalonePriceSetKeyAction extends StandalonePriceUpdateAction {

    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static StandalonePriceSetKeyAction of() {
        return new StandalonePriceSetKeyActionImpl();
    }

    public static StandalonePriceSetKeyAction of(final StandalonePriceSetKeyAction template) {
        StandalonePriceSetKeyActionImpl instance = new StandalonePriceSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static StandalonePriceSetKeyActionBuilder builder() {
        return StandalonePriceSetKeyActionBuilder.of();
    }

    public static StandalonePriceSetKeyActionBuilder builder(final StandalonePriceSetKeyAction template) {
        return StandalonePriceSetKeyActionBuilder.of(template);
    }

    default <T> T withStandalonePriceSetKeyAction(Function<StandalonePriceSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceSetKeyAction>";
            }
        };
    }
}
