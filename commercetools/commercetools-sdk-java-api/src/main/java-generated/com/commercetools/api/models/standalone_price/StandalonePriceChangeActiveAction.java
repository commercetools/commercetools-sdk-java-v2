
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updating the value of a StandalonePrice produces the StandalonePriceActiveChangedMessage.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceChangeActiveAction standalonePriceChangeActiveAction = StandalonePriceChangeActiveAction.builder()
 *             .active(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceChangeActiveActionImpl.class)
public interface StandalonePriceChangeActiveAction extends StandalonePriceUpdateAction {

    String CHANGE_ACTIVE = "changeActive";

    /**
     *  <p>New value to set for the <code>active</code> field of the StandalonePrice.</p>
     * @return active
     */
    @NotNull
    @JsonProperty("active")
    public Boolean getActive();

    public void setActive(final Boolean active);

    public static StandalonePriceChangeActiveAction of() {
        return new StandalonePriceChangeActiveActionImpl();
    }

    public static StandalonePriceChangeActiveAction of(final StandalonePriceChangeActiveAction template) {
        StandalonePriceChangeActiveActionImpl instance = new StandalonePriceChangeActiveActionImpl();
        instance.setActive(template.getActive());
        return instance;
    }

    public static StandalonePriceChangeActiveActionBuilder builder() {
        return StandalonePriceChangeActiveActionBuilder.of();
    }

    public static StandalonePriceChangeActiveActionBuilder builder(final StandalonePriceChangeActiveAction template) {
        return StandalonePriceChangeActiveActionBuilder.of(template);
    }

    default <T> T withStandalonePriceChangeActiveAction(Function<StandalonePriceChangeActiveAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceChangeActiveAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceChangeActiveAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceChangeActiveAction>";
            }
        };
    }
}
