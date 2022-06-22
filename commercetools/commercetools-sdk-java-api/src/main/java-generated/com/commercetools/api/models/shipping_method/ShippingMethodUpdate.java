
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodUpdate shippingMethodUpdate = ShippingMethodUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodUpdateImpl.class)
public interface ShippingMethodUpdate extends
        com.commercetools.api.models.ResourceUpdate<ShippingMethodUpdate, ShippingMethodUpdateAction, ShippingMethodUpdateBuilder> {

    /**
     *  <p>Expected version of the ShippingMethod on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the ShippingMethod.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ShippingMethodUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final ShippingMethodUpdateAction... actions);

    public void setActions(final List<ShippingMethodUpdateAction> actions);

    public static ShippingMethodUpdate of() {
        return new ShippingMethodUpdateImpl();
    }

    public static ShippingMethodUpdate of(final ShippingMethodUpdate template) {
        ShippingMethodUpdateImpl instance = new ShippingMethodUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static ShippingMethodUpdateBuilder builder() {
        return ShippingMethodUpdateBuilder.of();
    }

    public static ShippingMethodUpdateBuilder builder(final ShippingMethodUpdate template) {
        return ShippingMethodUpdateBuilder.of(template);
    }

    default <T> T withShippingMethodUpdate(Function<ShippingMethodUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodUpdate>";
            }
        };
    }
}
