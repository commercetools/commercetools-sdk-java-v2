
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   StandalonePriceUpdate standalonePriceUpdate = StandalonePriceUpdate.builder()
           .version(0.3)
           .plusActions(actionsBuilder -> actionsBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceUpdateImpl.class)
public interface StandalonePriceUpdate extends
        com.commercetools.api.models.ResourceUpdate<StandalonePriceUpdate, StandalonePriceUpdateAction, StandalonePriceUpdateBuilder> {

    /**
     *  <p>Expected version of the StandalonePrice on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the StandalonePrice.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<StandalonePriceUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final StandalonePriceUpdateAction... actions);

    public void setActions(final List<StandalonePriceUpdateAction> actions);

    public static StandalonePriceUpdate of() {
        return new StandalonePriceUpdateImpl();
    }

    public static StandalonePriceUpdate of(final StandalonePriceUpdate template) {
        StandalonePriceUpdateImpl instance = new StandalonePriceUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static StandalonePriceUpdateBuilder builder() {
        return StandalonePriceUpdateBuilder.of();
    }

    public static StandalonePriceUpdateBuilder builder(final StandalonePriceUpdate template) {
        return StandalonePriceUpdateBuilder.of(template);
    }

    default <T> T withStandalonePriceUpdate(Function<StandalonePriceUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceUpdate>";
            }
        };
    }
}
